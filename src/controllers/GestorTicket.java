
package controllers;

import clases.Clasificacion;
import clases.Usuario;

/**
 *
 * @author Usuario
 */
public class GestorTicket {
    
   /* private Integer legajo;
    private String nombreClasificacion;
    private String descripcion;
    */
    private Clasificacion clasificacion;
    private Usuario user;

    public GestorTicket(){
        
    }
    
    public void RegistrarTicket(Integer numeroLegajo, String nombreClasificacion, String descripcion) {
        
              
       GestorClasificacion gestorClasificacion = new GestorClasificacion();
       clasificacion = gestorClasificacion.obtenerClasificacion(nombreClasificacion);
       
       GestorSesion gestorSesion = new GestorSesion();
       user = gestorSesion.getUsuarioLogueado();
    }
    
}
