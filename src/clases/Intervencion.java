package clases;
// Generated 04/12/2018 15:54:45 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Intervencion generated by hbm2java
 */
public class Intervencion  implements java.io.Serializable {


     private int idIntervencion;
     private Gruporesolucion gruporesolucion;
     private Ticket ticket;
     private String observacion;
     private String estadoactual;
     private Set historialintervencions = new HashSet(0);

    public Intervencion() {
    }

	
    public Intervencion(int idIntervencion, Gruporesolucion gruporesolucion, Ticket ticket, String observacion, String estadoactual) {
        this.idIntervencion = idIntervencion;
        this.gruporesolucion = gruporesolucion;
        this.ticket = ticket;
        this.observacion = observacion;
        this.estadoactual = estadoactual;
    }
    public Intervencion(int idIntervencion, Gruporesolucion gruporesolucion, Ticket ticket, String observacion, String estadoactual, Set historialintervencions) {
       this.idIntervencion = idIntervencion;
       this.gruporesolucion = gruporesolucion;
       this.ticket = ticket;
       this.observacion = observacion;
       this.estadoactual = estadoactual;
       this.historialintervencions = historialintervencions;
    }
   
    public int getIdIntervencion() {
        return this.idIntervencion;
    }
    
    public void setIdIntervencion(int idIntervencion) {
        this.idIntervencion = idIntervencion;
    }
    public Gruporesolucion getGruporesolucion() {
        return this.gruporesolucion;
    }
    
    public void setGruporesolucion(Gruporesolucion gruporesolucion) {
        this.gruporesolucion = gruporesolucion;
    }
    public Ticket getTicket() {
        return this.ticket;
    }
    
    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }
    public String getObservacion() {
        return this.observacion;
    }
    
    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }
    public String getEstadoactual() {
        return this.estadoactual;
    }
    
    public void setEstadoactual(String estadoactual) {
        this.estadoactual = estadoactual;
    }
    public Set getHistorialintervencions() {
        return this.historialintervencions;
    }
    
    public void setHistorialintervencions(Set historialintervencions) {
        this.historialintervencions = historialintervencions;
    }




}


