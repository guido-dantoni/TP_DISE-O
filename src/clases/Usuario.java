package clases;
// Generated 01/11/2018 17:49:23 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Usuario generated by hbm2java
 */
public class Usuario  implements java.io.Serializable {


     private int legajoUsuario;
     private String tipo;
     private Set<Historialclasificacion> historialclasificacions = new HashSet<Historialclasificacion>(0);
     private Set<Empleado> empleados = new HashSet<Empleado>(0);
     private Set<Historialticket> historialtickets = new HashSet<Historialticket>(0);
     private Set<Historialintervencion> historialintervencions = new HashSet<Historialintervencion>(0);

    public Usuario() {
    }

	
    public Usuario(int legajoUsuario, String tipo) {
        this.legajoUsuario = legajoUsuario;
        this.tipo = tipo;
    }
    public Usuario(int legajoUsuario, String tipo, Set<Historialclasificacion> historialclasificacions, Set<Empleado> empleados, Set<Historialticket> historialtickets, Set<Historialintervencion> historialintervencions) {
       this.legajoUsuario = legajoUsuario;
       this.tipo = tipo;
       this.historialclasificacions = historialclasificacions;
       this.empleados = empleados;
       this.historialtickets = historialtickets;
       this.historialintervencions = historialintervencions;
    }
   
    public int getLegajoUsuario() {
        return this.legajoUsuario;
    }
    
    public void setLegajoUsuario(int legajoUsuario) {
        this.legajoUsuario = legajoUsuario;
    }
    public String getTipo() {
        return this.tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public Set<Historialclasificacion> getHistorialclasificacions() {
        return this.historialclasificacions;
    }
    
    public void setHistorialclasificacions(Set<Historialclasificacion> historialclasificacions) {
        this.historialclasificacions = historialclasificacions;
    }
    public Set<Empleado> getEmpleados() {
        return this.empleados;
    }
    
    public void setEmpleados(Set<Empleado> empleados) {
        this.empleados = empleados;
    }
    public Set<Historialticket> getHistorialtickets() {
        return this.historialtickets;
    }
    
    public void setHistorialtickets(Set<Historialticket> historialtickets) {
        this.historialtickets = historialtickets;
    }
    public Set<Historialintervencion> getHistorialintervencions() {
        return this.historialintervencions;
    }
    
    public void setHistorialintervencions(Set<Historialintervencion> historialintervencions) {
        this.historialintervencions = historialintervencions;
    }




}


