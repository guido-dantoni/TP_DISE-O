package clases;
// Generated 06/12/2018 15:40:09 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Clasificacion generated by hbm2java
 */
public class Clasificacion  implements java.io.Serializable {


     private int codigo;
     private String descripcion;
     private String nombreclasificacion;
     private Set tickets = new HashSet(0);
     private Set historialclasificacions = new HashSet(0);
     private Set gruporesolucions = new HashSet(0);

    public Clasificacion() {
    }

	
    public Clasificacion(int codigo, String descripcion, String nombreclasificacion) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.nombreclasificacion = nombreclasificacion;
    }
    public Clasificacion(int codigo, String descripcion, String nombreclasificacion, Set tickets, Set historialclasificacions, Set gruporesolucions) {
       this.codigo = codigo;
       this.descripcion = descripcion;
       this.nombreclasificacion = nombreclasificacion;
       this.tickets = tickets;
       this.historialclasificacions = historialclasificacions;
       this.gruporesolucions = gruporesolucions;
    }
   
    public int getCodigo() {
        return this.codigo;
    }
    
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getNombreclasificacion() {
        return this.nombreclasificacion;
    }
    
    public void setNombreclasificacion(String nombreclasificacion) {
        this.nombreclasificacion = nombreclasificacion;
    }
    public Set getTickets() {
        return this.tickets;
    }
    
    public void setTickets(Set tickets) {
        this.tickets = tickets;
    }
    public Set getHistorialclasificacions() {
        return this.historialclasificacions;
    }
    
    public void setHistorialclasificacions(Set historialclasificacions) {
        this.historialclasificacions = historialclasificacions;
    }
    public Set getGruporesolucions() {
        return this.gruporesolucions;
    }
    
    public void setGruporesolucions(Set gruporesolucions) {
        this.gruporesolucions = gruporesolucions;
    }




}


