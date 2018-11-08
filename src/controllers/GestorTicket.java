
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
    
        //Todo esto es para setear la fecha y hora de apertura
        Date fechaApertura = new Date();
        Date horaApertura = new Date();
        String estado; 
        Calendar c = new GregorianCalendar(); 
        //c.setTime(fechaApertura);

        int dia, mes, anio, hora, minutos, segundos;

        dia = c.get(Calendar.DATE);
        mes = c.get((Calendar.MONTH)+1);
        anio = c.get(Calendar.YEAR);
        hora = c.get(Calendar.HOUR_OF_DAY);
        minutos = c.get(Calendar.MINUTE);
        segundos = c.get(Calendar.SECOND);
                
        fechaApertura.setYear(anio);
        fechaApertura.setMonth(mes);
        fechaApertura.setDate(dia);
        horaApertura.setHours(hora);
        horaApertura.setMinutes(minutos);
        horaApertura.setSeconds(segundos);
        
        estado = Enum_EstadoTicket.ABIERTO_MESA_AYUDA.toString();
        
       
        //seteo todo los valor del ticket
        
        ticket.setFecahapertura(fechaApertura);
        ticket.setHoraapertura(horaApertura);
        ticket.setEstadoactual(estado);
        ticket.setEmpleado(empleado);
        ticket.setClasificacion(clasificacion);
        ticket.setDescripcion(descripcion);
        
        
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
        historialClasificacion.setFechafin(fechaApertura);
        historialClasificacion.setHorafin(horaApertura);
        
        
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
        
         Date fechaCierre = new Date();
        Date horaCierre = new Date();
        String estado; 
        Calendar c = new GregorianCalendar(); 
        
        int dia, mes, anio, hora, minutos, segundos;

        dia = c.get(Calendar.DATE);
        mes = c.get((Calendar.MONTH)+1);
        anio = c.get(Calendar.YEAR);
        hora = c.get(Calendar.HOUR_OF_DAY);
        minutos = c.get(Calendar.MINUTE);
        segundos = c.get(Calendar.SECOND);
                
        fechaCierre.setYear(anio);
        fechaCierre.setMonth(mes);
        fechaCierre.setDate(dia);
        horaCierre.setHours(hora);
        horaCierre.setMinutes(minutos);
        horaCierre.setSeconds(segundos);
        
        //Recuperamos el historialTicket con esos 2 estados posibles porque son los unicos que pueden pasar a cerrado
        //Ver maquina de estadoTicket
        if( ticketParaCerrar.getEstadoactual().equals(Enum_EstadoTicket.ABIERTO_MESA_AYUDA.toString()) ||
                ticketParaCerrar.getEstadoactual().equals(Enum_EstadoTicket.SOLUCIONADO_ESPERA_OK.toString()) )
          {
                Historialticket historialTicket = new Historialticket();
                //Actualizamos los valores del historial de ticket recupreado para hacer un update
                
                historialTicket = ticketDao.getHistorialTicket(ticketParaCerrar.getNroTicket(), ticketParaCerrar.getEstadoactual());
                historialTicket.setFechafin(fechaCierre);
                historialTicket.setHorafin(horaCierre);
                historialTicket.setObservarciones(observacion);
                
                ticketDao.updateHistorialTicket(historialTicket);
                
                //Aca creo un nuevo historialTicket para setearlo como el historial del ticket cerrado
                Historialticket historialTicket2 = new Historialticket();
                Usuario user = new GestorSesion().getUsuarioLogueado();
                
                historialTicket2.setHorainicio(horaCierre);
                historialTicket2.setFechainicio(fechaCierre);
                historialTicket2.setHorafin(horaCierre);
                historialTicket2.setFechafin(fechaCierre);
                historialTicket2.setObservarciones(observacion);
                historialTicket2.setEstado(Enum_EstadoTicket.CERRADO.toString());
                historialTicket2.setUsuario(user);
                
                ticketDao.setHistorialTicket(historialTicket2);
                
                
                
          }
        else {
            JOptionPane.showMessageDialog(null, "Imposibilidad para cerrar éste Ticket, se encuentra en estado: " + ticketParaCerrar.getEstadoactual());
        }

    }
    
}
