package clases;
// Generated 01/11/2018 17:49:23 by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Historialintervencion generated by hbm2java
 */
public class Historialintervencion  implements java.io.Serializable {


     private int idHistorialIntervencion;
     private Intervencion intervencion;
     private Usuario usuario;
     private String estado;
     private Date fechainicio;
     private Date fechafin;
     private Date horainicio;
     private Date horafin;

    public Historialintervencion() {
    }

    public Historialintervencion(int idHistorialIntervencion, Intervencion intervencion, Usuario usuario, String estado, Date fechainicio, Date fechafin, Date horainicio, Date horafin) {
       this.idHistorialIntervencion = idHistorialIntervencion;
       this.intervencion = intervencion;
       this.usuario = usuario;
       this.estado = estado;
       this.fechainicio = fechainicio;
       this.fechafin = fechafin;
       this.horainicio = horainicio;
       this.horafin = horafin;
    }
   
    public int getIdHistorialIntervencion() {
        return this.idHistorialIntervencion;
    }
    
    public void setIdHistorialIntervencion(int idHistorialIntervencion) {
        this.idHistorialIntervencion = idHistorialIntervencion;
    }
    public Intervencion getIntervencion() {
        return this.intervencion;
    }
    
    public void setIntervencion(Intervencion intervencion) {
        this.intervencion = intervencion;
    }
    public Usuario getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public String getEstado() {
        return this.estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
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


