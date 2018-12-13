
package controllers;

import Dao.ClasificacionDao;
import Dao.TicketDao;
import clases.Clasificacion;
import clases.Empleado;
import clases.Gruporesolucion;
import clases.Historialclasificacion;
import clases.Historialticket;
import clases.Intervencion;
import clases.Ticket;
import clases.TicketDTO;
import clases.Usuario;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Guido D'Antoni guidodantoni2335@gmail.com
 */
public class GestorTicket {
    
   /* private Integer legajo;
    private String nombreClasificacion;
    private String descripcion;
    */
    private static Clasificacion clasificacion;
   // private static Usuario userLogueado;

    public GestorTicket(){
        
    }
    
    public void RegistrarTicket(Integer numeroLegajo, String nombreClasificacion, String descripcion) {
        
        // obtengo la clasificacion cuyo nombre es el que paso como parametro que es el del combobox     
       GestorClasificacion gestorClasificacion = new GestorClasificacion();
       clasificacion = gestorClasificacion.obtenerClasificacion(nombreClasificacion);
       
        Usuario userLogueado;
        GestorSesion gestorSesion = new GestorSesion();
        userLogueado = gestorSesion.getUsuarioLogueado();
       
        Empleado empleado= new Empleado(); 
        GestorEmpleado gestorEmpleado = new GestorEmpleado();
        empleado = gestorEmpleado.obtenerEmpleado(numeroLegajo);
        
       
        Ticket ticket = new Ticket(); 
        String estado;
        
        GestorFecha gestorFecha = new GestorFecha();
        Date fechaApertura = new Date();
        
        //recupero la fecha y la hora
        fechaApertura = gestorFecha.obtenerFecha();
               
        estado = Enum_EstadoTicket.ABIERTO_MESA_AYUDA.toString();
        
       
        //seteo todo los valor del ticket
        ticket.setFecahapertura(fechaApertura);
        ticket.setHoraapertura(fechaApertura);
        ticket.setEstadoactual(estado);
        ticket.setEmpleado(empleado);
        ticket.setClasificacion(clasificacion);
        ticket.setDescripcion(descripcion);
        ticket.setFechaultimoestado(fechaApertura);
        ticket.setLegajousuario(userLogueado.getLegajoUsuario());
        
        //seteo los valores de historialClasificacion
        Historialticket historialTicket= new Historialticket();
        
        historialTicket.setFechainicio(fechaApertura);
        historialTicket.setHorainicio(fechaApertura);
        historialTicket.setEstado(estado);
        historialTicket.setTicket(ticket);
        historialTicket.setUsuario(userLogueado);
        
        Historialclasificacion historialClasificacion = new Historialclasificacion();
        
        
        historialClasificacion.setFechainicio(fechaApertura);
        historialClasificacion.setHorainicio(fechaApertura);
        historialClasificacion.setClasificacion(clasificacion);
        historialClasificacion.setTicket(ticket);
        historialClasificacion.setUsuario(userLogueado);
                
        
        HashSet<Historialticket> hashHistorialTicket = new HashSet<>();
        HashSet<Historialclasificacion> hashClasificaciones = new HashSet<>();
        hashClasificaciones.add(historialClasificacion);
        hashHistorialTicket.add(historialTicket);
        
        
        ticket.setHistorialtickets(hashHistorialTicket );
        ticket.setHistorialclasificacions(hashClasificaciones);
        
        
        // aca insertamos todo en la bd
        
        TicketDao ticketDao = new TicketDao();
        ticketDao.insertTicket(ticket, historialTicket, historialClasificacion);
        
    }

    public Ticket obtenerNroUltimoTiket() {
        
            TicketDao ticketDao = new TicketDao();
            Ticket ticket = new Ticket();
            ticket = ticketDao.getUltimoTicket();
            
         
           
       return ticket ;
    }

    public void cerrarTicket(String observacion, int nroTicket) {
        
        Ticket ticketParaCerrar = new Ticket(); 
        TicketDao ticketDao = new TicketDao();
        ticketParaCerrar = ticketDao.getTicket(nroTicket);
              
        GestorFecha gestorFecha = new GestorFecha();
        Date fechaCierre = new Date();     
        fechaCierre = gestorFecha.obtenerFecha();
        
       
        GestorIntervencion gestorIntervencion = new GestorIntervencion();
        Boolean tienePendientes = gestorIntervencion.tieneIntervencionesPendientes(ticketParaCerrar);
                     
                
        //Recuperamos el historialTicket con esos 2 estados posibles porque son los unicos que pueden pasar a cerrado
        //Ver maquina de estadoTicket
        if( ticketParaCerrar.getEstadoactual().equals(Enum_EstadoTicket.ABIERTO_MESA_AYUDA.toString()) ||
            ticketParaCerrar.getEstadoactual().equals(Enum_EstadoTicket.SOLUCIONADO_ESPERA_OK.toString()) )
            
            //vemos que la intervencion este cerrada y que no tiene pendientes
            { if(!tienePendientes){
                
                Historialticket historialTicket = new Historialticket();
                //Actualizamos los valores del historial de ticket recupreado para hacer un update
              
                historialTicket = ticketDao.getHistorialTicket(ticketParaCerrar, ticketParaCerrar.getEstadoactual());
                
                             
                historialTicket.setFechafin(fechaCierre);
                historialTicket.setHorafin(fechaCierre);
                historialTicket.setObservaciones(observacion);
                
                //Actualizamos los valores del historial de clasificacion
                Historialclasificacion historialClasificacion = new Historialclasificacion();
                
                               
                historialClasificacion = ticketDao.getHistorialClasificacion(ticketParaCerrar, ticketParaCerrar.getClasificacion().getCodigo());
                
                historialClasificacion.setFechafin(fechaCierre);
                historialClasificacion.setHorafin(fechaCierre);
                
                ticketParaCerrar.setEstadoactual(Enum_EstadoTicket.CERRADO.toString());
                ticketParaCerrar.setFechaultimoestado(fechaCierre);
                
                ticketDao.updateTicket(ticketParaCerrar);
                ticketDao.updateHistorialTicket(historialTicket);
                ticketDao.updateHistorialClasificacion(historialClasificacion);
                
                //Aca creo un nuevo historialTicket para setearlo como el historial del ticket cerrado
                Historialticket historialTicket2 = new Historialticket();
                Usuario user = new GestorSesion().getUsuarioLogueado();

                //en horaInicio, FechaInicio, horaFin, fechaFin se utilizan fechaCierre
                //porque es la misma fecha y hora
                
                historialTicket2.setTicket(ticketParaCerrar);
                historialTicket2.setHorainicio(fechaCierre);
                historialTicket2.setFechainicio(fechaCierre);
                historialTicket2.setHorafin(fechaCierre);
                historialTicket2.setFechafin(fechaCierre);
                historialTicket2.setObservaciones(observacion);
                historialTicket2.setEstado(Enum_EstadoTicket.CERRADO.toString());
                historialTicket2.setUsuario(user);
                
                
                ticketDao.insertHistorialTicket(historialTicket2);
                
                }else{
                    JOptionPane.showMessageDialog(null, "Imposibilidad para cerrar éste Ticket, tiene intervenciones pendientes");

          }    
                
          }
        else {
            JOptionPane.showMessageDialog(null, "Imposibilidad para cerrar éste Ticket, se encuentra en estado: " + ticketParaCerrar.getEstadoactual());
        }

    }

    public List<TicketDTO> buscarCriterios(Integer nroTicket, Integer nroLegajoEmpleado, Date fechaApertura, Date fechaUltimoCambioEstado, String estadoActual, String ultimoGrupo, String clasificacionActual) {
        
        TicketDao ticketDao = new TicketDao();
        List<Ticket> tickets = ticketDao.getTicketsFiltrados(nroTicket, nroLegajoEmpleado, fechaApertura, fechaUltimoCambioEstado, estadoActual, ultimoGrupo, clasificacionActual);
               
        List<TicketDTO> ticketsFiltrados = new ArrayList<>();
        
       
        int tamanioL;
        GestorEmpleado gestorEmpleado = new GestorEmpleado();
        Usuario u = new Usuario();
        
        for (int i=0; i < tickets.size(); i++){
            
            TicketDTO ticket = new TicketDTO();
           
            u=gestorEmpleado.obtenerEmpleadoUsuario(tickets.get(i).getLegajousuario());
            List<Empleado> list = new ArrayList<>(u.getEmpleados());
            
            ticket.setNroTicket(tickets.get(i).getNroTicket() );
            ticket.setNroLegajoempleado(tickets.get(i).getEmpleado().getLegajoEmpleado() );
            ticket.setFechaapertura(tickets.get(i).getFecahapertura() );
            ticket.setEstadoactual(tickets.get(i).getEstadoactual() );
            ticket.setHoraapertura(tickets.get(i).getHoraapertura() );
            
            ticket.setOperador(list.get(0).getNombre()+ " " + list.get(0).getApellido());
            ticket.setClasificacionactual(tickets.get(i).getClasificacion().getNombreclasificacion());
            ticket.setFechaultimocambioestado(tickets.get(i).getFechaultimoestado() );
            
                         
            List<Intervencion> l = new ArrayList<>(tickets.get(i).getIntervencions());
            tamanioL = l.size()-1;
            
            if(tamanioL == -1){
                    ticket.setGrupoactual("Mesa de ayuda");
            }else{
                    ticket.setGrupoactual(l.get(tamanioL).getGruporesolucion().getNombregrupo());
            }
            ticketsFiltrados.add(ticket);
        }
       
        return ticketsFiltrados;
    }

    public List<Historialticket> obtenerHistorialesTicket(int nroTicket) {
        
        TicketDao ticketDao = new TicketDao();
        Ticket ticket = new Ticket();
        ticket = ticketDao.getTicket(nroTicket);
        return ticketDao.getHistorialesTicket(ticket);
    }

    public List<Historialclasificacion> obtenerHistorialesClasificacion(int nroTicket) {
            
        TicketDao ticketDao = new TicketDao();
        Ticket ticket = new Ticket();
        ticket = ticketDao.getTicket(nroTicket);
        return ticketDao.getHistorialesClasificacion(ticket);
    }

    public Ticket obtenerTicket(int nroTicket) {
        
        TicketDao t =  new TicketDao();
        
        return t.getTicket(nroTicket);
    }       

    public Historialticket obtenerHistorialTicket(Ticket ticket, String estadoactual) {
           TicketDao t = new TicketDao();
           
           return t.getHistorialTicket(ticket, estadoactual);
        }

    
    public void derivarTicket(Ticket ticket, String observacionDerivacion, String nuevaClasificacion, String grupo, String primeraObservacion) {
                    
      
         //Recuperamos el historialTicket con esos 2 estados posibles porque son los unicos que pueden pasar a cerrado
        //Ver maquina de estadoTicket
        TicketDao ticketDao = new TicketDao();
        if( ticket.getEstadoactual().equals(Enum_EstadoTicket.ABIERTO_MESA_AYUDA.toString()) ||
                ticket.getEstadoactual().equals(Enum_EstadoTicket.SOLUCIONADO_ESPERA_OK.toString()) ){
            
             GestorFecha gestorF = new GestorFecha();
             Date fechaActual = new Date();
             fechaActual = gestorF.obtenerFecha();
            
                Historialticket historialTicket = new Historialticket();
                //Actualizamos los valores del historial de ticket recupreado para hacer un update
              
                historialTicket = ticketDao.getHistorialTicket(ticket, ticket.getEstadoactual());
                
                             
                historialTicket.setFechafin(fechaActual);
                historialTicket.setHorafin(fechaActual);
                historialTicket.setObservaciones(primeraObservacion);
                
                //Actualizamos los valores del historial de clasificacion
                Historialclasificacion historialClasificacion = new Historialclasificacion();
                
                               
                historialClasificacion = ticketDao.getHistorialClasificacion(ticket, ticket.getClasificacion().getCodigo());
                
                historialClasificacion.setFechafin(fechaActual);
                historialClasificacion.setHorafin(fechaActual);
              
                ticketDao.updateHistorialTicket(historialTicket);
                ticketDao.updateHistorialClasificacion(historialClasificacion);
                
            // ↑↑↑ HASTA ACA HACEMOS UN UPDATE DE LOS HISTORIALES VIEJOS (QUE TIENE ESTADO EN ABIERTO_MESA_AYUDA ) ↑↑↑↑↑↑↑↑    
           
            // ACA EMPEZAMOS A CREAR LOS NUEVOS HISTORIALES Y ACTUALIZAR EL TICKET ↓↓↓↓↓↓
                GestorSesion gestorSesion = new GestorSesion();
                Usuario usuarioLogueado = new Usuario();
        
                usuarioLogueado = gestorSesion.getUsuarioLogueado();
        
                GestorClasificacion gestorClasificacion = new GestorClasificacion();
                Clasificacion clasificacion = new Clasificacion();
        
                clasificacion =  gestorClasificacion.obtenerClasificacion(nuevaClasificacion);
            
                GestorGrupoResolucion gestorGrupoResolucion = new GestorGrupoResolucion();
                Gruporesolucion grupoResolucion = new Gruporesolucion();
        
                grupoResolucion = gestorGrupoResolucion.obtenerUnGrupo(grupo);
                
                ticket.setEstadoactual(Enum_EstadoTicket.ABIERTO_DERIVADO.toString());
                ticket.setFechaultimoestado(fechaActual);
                ticket.setClasificacion(clasificacion);
        
                Historialticket ht = new Historialticket();
                
                ht.setTicket(ticket);
                ht.setHorainicio(fechaActual);
                ht.setFechainicio(fechaActual);
                ht.setUsuario(usuarioLogueado);
                ht.setEstado(Enum_EstadoTicket.ABIERTO_DERIVADO.toString());
                
        
                
                Historialclasificacion hc = new Historialclasificacion();
                hc.setTicket(ticket);
                hc.setClasificacion(clasificacion);
                hc.setUsuario(usuarioLogueado);
                hc.setFechainicio(fechaActual);
                hc.setHorainicio(fechaActual);
                
                ticketDao.updateTicket(ticket);
                ticketDao.insertHistorialTicket(ht);
                ticketDao.insertHistorialClasificacion(hc);
                
                GestorIntervencion gestorIntervencion = new GestorIntervencion();
               
                gestorIntervencion.tieneIntervencion(ticket, grupoResolucion, usuarioLogueado, observacionDerivacion);
                
            
        }
        
        
        
    }

    public void actualizarEstadoTicket(Intervencion i, String estado, String clasificacion) {

        TicketDao ticketDao = new TicketDao();
        ClasificacionDao clasificacionDao = new ClasificacionDao();
        Ticket nuevoTicket = new Ticket();
        Ticket viejoTicket = new Ticket();
        Clasificacion nuevaClasificacion = new Clasificacion();
        
        viejoTicket = i.getTicket();
        nuevoTicket = i.getTicket();
        
        GestorFecha gestorFecha = new GestorFecha();
        Date fechaActual = gestorFecha.obtenerFecha();
        String nuevoEstadoTicket;
        GestorSesion gestorSesion = new GestorSesion();
        Usuario usuarioLogueado = gestorSesion.getUsuarioLogueado();
        
        
        switch (estado) {
               case "Cerrada":
                   nuevoEstadoTicket = Enum_EstadoTicket.SOLUCIONADO_ESPERA_OK.toString();
                   break;
                default:
                   nuevoEstadoTicket = Enum_EstadoTicket.ABIERTO_MESA_AYUDA.toString();
                   break;
           }
        
        
        nuevaClasificacion = clasificacionDao.getClasificacion(clasificacion);               
        nuevoTicket.setEstadoactual(nuevoEstadoTicket);
        ticketDao.updateTicket(nuevoTicket);         
        
        //actualizamos viejo historialTicket
        Historialticket ht = new Historialticket();
        
        ht = ticketDao.getHistorialTicket(viejoTicket, estado);
        
        String observacion = ht.getObservaciones(); //aca recupero la observacion  del viejo historial para setearsela al nuevo
        
        ht.setFechafin(fechaActual);
        ht.setHorafin(fechaActual);
        ticketDao.updateHistorialTicket(ht);
       
        //nuevo historialTicket        
        Historialticket historialTicket = new Historialticket();
        
        historialTicket.setEstado(nuevoEstadoTicket);
        historialTicket.setTicket(nuevoTicket);
        historialTicket.setObservaciones(observacion);
        historialTicket.setFechainicio(fechaActual);
        historialTicket.setHorainicio(fechaActual);
        historialTicket.setUsuario(usuarioLogueado);
        
        HashSet<Historialticket> hashHistorialTicket = new HashSet<>();
        hashHistorialTicket.add(historialTicket);
        nuevoTicket.setHistorialtickets(hashHistorialTicket );
        
        ticketDao.insertHistorialTicket(historialTicket);
        
        if(!viejoTicket.getClasificacion().equals(nuevaClasificacion)){
           
            //recuperamos el viejo historialClasificacion
            Historialclasificacion hc = new Historialclasificacion();
            
            hc = ticketDao.getHistorialClasificacion(viejoTicket, viejoTicket.getClasificacion().getCodigo());
            
            hc.setFechafin(fechaActual);
            hc.setHorafin(fechaActual);
            ticketDao.updateHistorialClasificacion(hc);
            
            //nuevoTicket.setClasificacion(cl);
            
            Historialclasificacion historialClasificacion = new Historialclasificacion();
            
            historialClasificacion.setFechainicio(fechaActual);
            historialClasificacion.setHorainicio(fechaActual);
            historialClasificacion.setClasificacion(nuevaClasificacion);
            historialClasificacion.setTicket(nuevoTicket);
            historialClasificacion.setUsuario(usuarioLogueado);
        
            HashSet<Historialclasificacion> hashClasificaciones = new HashSet<>();
            hashClasificaciones.add(historialClasificacion);
            nuevoTicket.setHistorialclasificacions(hashClasificaciones);
            
            ticketDao.insertHistorialClasificacion(historialClasificacion);
            
        }
        

        
    }
    
}
