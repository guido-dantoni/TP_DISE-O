package clases;
// Generated 06/12/2018 15:40:09 by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Historialclasificacion generated by hbm2java
 */
public class Historialclasificacion  implements java.io.Serializable {


     private int idHistorialclasificacion;
     private Clasificacion clasificacion;
     private Ticket ticket;
     private Usuario usuario;
     private Date fechainicio;
     private Date fechafin;
     private Date horainicio;
     private Date horafin;

    public Historialclasificacion() {
    }

	
    public Historialclasificacion(int idHistorialclasificacion, Clasificacion clasificacion, Ticket ticket, Usuario usuario, Date fechainicio, Date horainicio) {
        this.idHistorialclasificacion = idHistorialclasificacion;
        this.clasificacion = clasificacion;
        this.ticket = ticket;
        this.usuario = usuario;
        this.fechainicio = fechainicio;
        this.horainicio = horainicio;
    }
    public Historialclasificacion(int idHistorialclasificacion, Clasificacion clasificacion, Ticket ticket, Usuario usuario, Date fechainicio, Date fechafin, Date horainicio, Date horafin) {
       this.idHistorialclasificacion = idHistorialclasificacion;
       this.clasificacion = clasificacion;
       this.ticket = ticket;
       this.usuario = usuario;
       this.fechainicio = fechainicio;
       this.fechafin = fechafin;
       this.horainicio = horainicio;
       this.horafin = horafin;
    }
   
    public int getIdHistorialclasificacion() {
        return this.idHistorialclasificacion;
    }
    
    public void setIdHistorialclasificacion(int idHistorialclasificacion) {
        this.idHistorialclasificacion = idHistorialclasificacion;
    }
    public Clasificacion getClasificacion() {
        return this.clasificacion;
    }
    
    public void setClasificacion(Clasificacion clasificacion) {
        this.clasificacion = clasificacion;
    }
    public Ticket getTicket() {
        return this.ticket;
    }
    
    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }
    public Usuario getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public Date getFechainicio() {
        return this.fechainicio;
    }
    
    public void setFechainicio(Date fechainicio) {
        this.fechainicio = fechainicio;
    }
    public Date getFechafin() {
        return this.fechafin;
    }
    
    public void setFechafin(Date fechafin) {
        this.fechafin = fechafin;
    }
    public Date getHorainicio() {
        return this.horainicio;
    }
    
    public void setHorainicio(Date horainicio) {
        this.horainicio = horainicio;
    }
    public Date getHorafin() {
        return this.horafin;
    }
    
    public void setHorafin(Date horafin) {
        this.horafin = horafin;
    }




}


