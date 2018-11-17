
package controllers;

import Dao.TicketDao;
import clases.Clasificacion;
import clases.Empleado;
import clases.Historialclasificacion;
import clases.Historialticket;
import clases.Ticket;
import clases.Usuario;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;
import ventanas.Caso_de_uso_01_Observaciones;

/**
 *
 * @author Usuario
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
        Date horaApertura = new Date();
        
        //recupero la fecha y la hora
        fechaApertura = gestorFecha.obtenerFecha();
        horaApertura = gestorFecha.obtenerHora();
        
        estado = Enum_EstadoTicket.ABIERTO_MESA_AYUDA.toString();
        
       
        //seteo todo los valor del ticket
        
        ticket.setFecahapertura(fechaApertura);
        ticket.setHoraapertura(horaApertura);
        ticket.setEstadoactual(estado);
        ticket.setEmpleado(empleado);
        ticket.setClasificacion(clasificacion);
        ticket.setDescripcion(descripcion);
        
        //seteo los valores de historialClasificacion
        Historialticket historialTicket= new Historialticket();
        
        historialTicket.setFechainicio(fechaApertura);
        historialTicket.setHorainicio(horaApertura);
        historialTicket.setEstado(estado);
        historialTicket.setTicket(ticket);
        historialTicket.setUsuario(this.userLogueado);
        
        Historialclasificacion historialClasificacion = new Historialclasificacion();
        
        
        historialClasificacion.setFechainicio(fechaApertura);
        historialClasificacion.setHorainicio(horaApertura);
        historialClasificacion.setClasificacion(clasificacion);
        historialClasificacion.setTicket(ticket);
        historialClasificacion.setUsuario(this.userLogueado);
        //historialClasificacion.setFechafin(fechaApertura);
        //historialClasificacion.setHorafin(horaApertura);
        
        
        HashSet<Historialticket> hashHistorialTicket = new HashSet<>();
        HashSet<Historialclasificacion> hashClasificaciones = new HashSet<>();
        hashClasificaciones.add(historialClasificacion);
        
        
        ticket.setHistorialtickets(hashHistorialTicket );
        ticket.setHistorialclasificacions(hashClasificaciones);
        
        
        // ahora insertamos todo en la bd
        
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
        Date horaCierre = new Date();
         
        fechaCierre = gestorFecha.obtenerFecha();
        horaCierre = gestorFecha.obtenerHora();
       
        //Recuperamos el historialTicket con esos 2 estados posibles porque son los unicos que pueden pasar a cerrado
        //Ver maquina de estadoTicket
        if( ticketParaCerrar.getEstadoactual().equals(Enum_EstadoTicket.ABIERTO_MESA_AYUDA.toString()) ||
                ticketParaCerrar.getEstadoactual().equals(Enum_EstadoTicket.SOLUCIONADO_ESPERA_OK.toString()) )
          {
                Historialticket historialTicket = new Historialticket();
                //Actualizamos los valores del historial de ticket recupreado para hacer un update
              
                historialTicket = ticketDao.getHistorialTicket(ticketParaCerrar, ticketParaCerrar.getEstadoactual());
             
                historialTicket.setFechafin(fechaCierre);
                historialTicket.setHorafin(horaCierre);
                historialTicket.setObservaciones(observacion);
                
                //Actualizamos los valores del historial de clasificacion
                Historialclasificacion historialClasificacion = new Historialclasificacion();
                
                historialClasificacion = ticketDao.getHistorialClasificacion(ticketParaCerrar, ticketParaCerrar.getClasificacion().getCodigo());
                
                historialClasificacion.setFechafin(fechaCierre);
                historialClasificacion.setHorafin(horaCierre);
                
                ticketParaCerrar.setEstadoactual(Enum_EstadoTicket.CERRADO.toString());
                ticketDao.updateTicket(ticketParaCerrar);
                ticketDao.updateHistorialTicket(historialTicket);
                ticketDao.updateHistorialClasificacion(historialClasificacion);
                
                //Aca creo un nuevo historialTicket para setearlo como el historial del ticket cerrado
                Historialticket historialTicket2 = new Historialticket();
                Usuario user = new GestorSesion().getUsuarioLogueado();

                //en horaInicio, FechaInicio, horaFin, fechaFin se utilizan fechaCierre y horaCierre
                //porque es la misma fecha y hora
                
                historialTicket2.setTicket(ticketParaCerrar);
                historialTicket2.setHorainicio(horaCierre);
                historialTicket2.setFechainicio(fechaCierre);
                historialTicket2.setHorafin(horaCierre);
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
    
}
