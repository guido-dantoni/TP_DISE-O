
package controllers;

import Dao.ClasificacionDao;
import Dao.EmpleadoDao;
import Dao.TicketDao;
import clases.Clasificacion;
import clases.Empleado;
import clases.Historialclasificacion;
import clases.Historialticket;
import clases.Ticket;
import clases.TicketDTO;
import clases.Usuario;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.swing.JOptionPane;
import ventanas.Caso_de_uso_01_Observaciones;

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
    private static Usuario userLogueado;

    public GestorTicket(){
        
    }
    
    public void RegistrarTicket(Integer numeroLegajo, String nombreClasificacion, String descripcion) {
        
        // obtengo la clasificacion cuyo nombre es el que paso como parametro que es el del combobox     
       GestorClasificacion gestorClasificacion = new GestorClasificacion();
       clasificacion = gestorClasificacion.obtenerClasificacion(nombreClasificacion);
       
       
       GestorSesion gestorSesion = new GestorSesion();
       this.userLogueado = gestorSesion.getUsuarioLogueado();
       
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
        ticket.setLegajousuario(this.userLogueado.getLegajoUsuario());
        
        //seteo los valores de historialClasificacion
        Historialticket historialTicket= new Historialticket();
        
        historialTicket.setFechainicio(fechaApertura);
        historialTicket.setHorainicio(fechaApertura);
        historialTicket.setEstado(estado);
        historialTicket.setTicket(ticket);
        historialTicket.setUsuario(this.userLogueado);
        
        Historialclasificacion historialClasificacion = new Historialclasificacion();
        
        
        historialClasificacion.setFechainicio(fechaApertura);
        historialClasificacion.setHorainicio(fechaApertura);
        historialClasificacion.setClasificacion(clasificacion);
        historialClasificacion.setTicket(ticket);
        historialClasificacion.setUsuario(this.userLogueado);
                
        
        HashSet<Historialticket> hashHistorialTicket = new HashSet<>();
        HashSet<Historialclasificacion> hashClasificaciones = new HashSet<>();
        hashClasificaciones.add(historialClasificacion);
        
        
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
               
        //Recuperamos el historialTicket con esos 2 estados posibles porque son los unicos que pueden pasar a cerrado
        //Ver maquina de estadoTicket
        if( ticketParaCerrar.getEstadoactual().equals(Enum_EstadoTicket.ABIERTO_MESA_AYUDA.toString()) ||
                ticketParaCerrar.getEstadoactual().equals(Enum_EstadoTicket.SOLUCIONADO_ESPERA_OK.toString()) )
          {
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
                
                
                
          }
        else {
            JOptionPane.showMessageDialog(null, "Imposibilidad para cerrar éste Ticket, se encuentra en estado: " + ticketParaCerrar.getEstadoactual());
        }

    }

    public List<TicketDTO> buscarCriterios(Integer nroTicket, Integer nroLegajoEmpleado, Date fechaApertura, Date fechaUltimoCambioEstado, String estadoActual, String ultimoGrupo, String clasificacionActual) {
        
        TicketDao ticketDao = new TicketDao();
        List<Ticket> tickets = ticketDao.getTicketsFiltrados(nroTicket, nroLegajoEmpleado, fechaApertura, fechaUltimoCambioEstado, estadoActual, ultimoGrupo, clasificacionActual);
        
             
        List<TicketDTO> ticketsFiltrados = new ArrayList<TicketDTO>();
        
        ClasificacionDao cl = new ClasificacionDao();
        Clasificacion clasificacion;
       
        GestorEmpleado gestorEmpleado = new GestorEmpleado();
        Usuario u = new Usuario();
           
        
        for (int i=0; i < tickets.size(); i++){
            
            TicketDTO ticket = new TicketDTO();
            clasificacion = cl.getClasificacion(tickets.get(i).getClasificacion().getCodigo());
            u=gestorEmpleado.obtenerEmpleadoUsuario(tickets.get(i).getLegajousuario());
            List<Empleado> list = new ArrayList<Empleado>(u.getEmpleados());
            
            ticket.setNroTicket(tickets.get(i).getNroTicket() );
            ticket.setNroLegajoempleado(tickets.get(i).getEmpleado().getLegajoEmpleado() );
            ticket.setFechaapertura(tickets.get(i).getFecahapertura() );
            ticket.setEstadoactual(tickets.get(i).getEstadoactual() );
            ticket.setHoraapertura(tickets.get(i).getHoraapertura() );
            
           // e = ge.BuscarEmpleadoAbrioTicket(tickets.get(i).getNroTicket());
            ticket.setOperador(list.get(0).getNombre()+ " " + list.get(0).getApellido());
            ticket.setClasificacionactual(clasificacion.getNombreclasificacion());
           // ticket.setOperador(e);
            ticket.setFechaultimocambioestado(tickets.get(i).getFechaultimoestado() );
            ticket.setGrupoactual("Comunicaciones");
                               
            ticketsFiltrados.add(ticket);
        }
       
        return ticketsFiltrados;
    }

    public List<Historialticket> obtenerHistorialesTicket(int nroTicket) {
        
        TicketDao t = new TicketDao();
        return t.getHistorialesTicket(nroTicket);
    }
    
}
