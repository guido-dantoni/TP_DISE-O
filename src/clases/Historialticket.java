package clases;
// Generated 31/10/2018 20:58:36 by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Historialticket generated by hbm2java
 */
public class Historialticket  implements java.io.Serializable {


     private int idHistorialTicket;
     private Ticket ticket;
     private Usuario usuario;
     private Date fechainicio;
     private Date fechafin;
     private Date horainicio;
     private Date horafin;
     private String estado;

    public Historialticket() {
    }

    public Historialticket(int idHistorialTicket, Ticket ticket, Usuario usuario, Date fechainicio, Date fechafin, Date horainicio, Date horafin, String estado) {
       this.idHistorialTicket = idHistorialTicket;
       this.ticket = ticket;
       this.usuario = usuario;
       this.fechainicio = fechainicio;
       this.fechafin = fechafin;
       this.horainicio = horainicio;
       this.horafin = horafin;
       this.estado = estado;
    }
   
    public int getIdHistorialTicket() {
        return this.idHistorialTicket;
    }
    
    public void setIdHistorialTicket(int idHistorialTicket) {
        this.idHistorialTicket = idHistorialTicket;
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
    public String getEstado() {
        return this.estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }




}


