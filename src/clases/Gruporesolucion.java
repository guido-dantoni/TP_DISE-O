package clases;
// Generated 04/12/2018 15:54:45 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Gruporesolucion generated by hbm2java
 */
public class Gruporesolucion  implements java.io.Serializable {


     private int codigoGrupoResolucion;
     private String nombregrupo;
     private Set intervencions = new HashSet(0);
     private Set clasificacions = new HashSet(0);

    public Gruporesolucion() {
    }

	
    public Gruporesolucion(int codigoGrupoResolucion, String nombregrupo) {
        this.codigoGrupoResolucion = codigoGrupoResolucion;
        this.nombregrupo = nombregrupo;
    }
    public Gruporesolucion(int codigoGrupoResolucion, String nombregrupo, Set intervencions, Set clasificacions) {
       this.codigoGrupoResolucion = codigoGrupoResolucion;
       this.nombregrupo = nombregrupo;
       this.intervencions = intervencions;
       this.clasificacions = clasificacions;
    }
   
    public int getCodigoGrupoResolucion() {
        return this.codigoGrupoResolucion;
    }
    
    public void setCodigoGrupoResolucion(int codigoGrupoResolucion) {
        this.codigoGrupoResolucion = codigoGrupoResolucion;
    }
    public String getNombregrupo() {
        return this.nombregrupo;
    }
    
    public void setNombregrupo(String nombregrupo) {
        this.nombregrupo = nombregrupo;
    }
    public Set getIntervencions() {
        return this.intervencions;
    }
    
    public void setIntervencions(Set intervencions) {
        this.intervencions = intervencions;
    }
    public Set getClasificacions() {
        return this.clasificacions;
    }
    
    public void setClasificacions(Set clasificacions) {
        this.clasificacions = clasificacions;
    }




}


