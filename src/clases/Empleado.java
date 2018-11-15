package clases;
// Generated 14/11/2018 14:32:51 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Empleado generated by hbm2java
 */
public class Empleado  implements java.io.Serializable {


     private int legajoEmpleado;
     private Usuario usuario;
     private String email;
     private String nombre;
     private String apellido;
     private Set tickets = new HashSet(0);

    public Empleado() {
    }

	
    public Empleado(int legajoEmpleado, String email, String nombre, String apellido) {
        this.legajoEmpleado = legajoEmpleado;
        this.email = email;
        this.nombre = nombre;
        this.apellido = apellido;
    }
    public Empleado(int legajoEmpleado, Usuario usuario, String email, String nombre, String apellido, Set tickets) {
       this.legajoEmpleado = legajoEmpleado;
       this.usuario = usuario;
       this.email = email;
       this.nombre = nombre;
       this.apellido = apellido;
       this.tickets = tickets;
    }
   
    public int getLegajoEmpleado() {
        return this.legajoEmpleado;
    }
    
    public void setLegajoEmpleado(int legajoEmpleado) {
        this.legajoEmpleado = legajoEmpleado;
    }
    public Usuario getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return this.apellido;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public Set getTickets() {
        return this.tickets;
    }
    
    public void setTickets(Set tickets) {
        this.tickets = tickets;
    }




}


