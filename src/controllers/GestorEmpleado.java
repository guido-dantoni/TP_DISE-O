
package controllers;

import Dao.EmpleadoDao;
import clases.Empleado;

/**
 *
 * @author Guido D'Antoni guidodantoni2335@gmail.com
 */
public class GestorEmpleado {

    public String obtenerNombre(Integer numeroLegajo) {
        
        String nombreEmpleado, apellidoEmpleado;
        Empleado e;
        
        EmpleadoDao empleadoDao = new EmpleadoDao();
        e = empleadoDao.getNombre(numeroLegajo);
        nombreEmpleado = e.getNombre();
        apellidoEmpleado = e.getApellido();
        
        return (nombreEmpleado + " " + apellidoEmpleado);
    }
    
}
