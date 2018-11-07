
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
        
        HashSet<Historialticket> hashHistorialTicket = new HashSet<>();
        HashSet<Historialclasificacion> hashClasificaciones = new HashSet<>();
        hashClasificaciones.add(historialClasificacion);
        
        
        ticket.setHistorialtickets(hashHistorialTicket );
        ticket.setHistorialclasificacions(hashClasificaciones);
        
        
        // ahora insertamos todo en la bd
        
        TicketDao ticketDao = new TicketDao();
        ticketDao.insertTicket(ticket, historialTicket, historialClasificacion);
        
    }

    public void obtenerNroUltimoTiket() {
        
            TicketDao ticketDao = new TicketDao();
            //CREAR UN TICKET E IGUALARLO AL RETORNO DE ticketDao.getUltimoTicket()
           //MOSTRAR PANTALLA EMMERGENTE Y CARGAR EL JTEXTFIELD DE LA PANTALLA DE CU1
           
           // System.out.println(ticketDao.getUltimoTicket().getNroTicket());
    }
    
    
    
}
