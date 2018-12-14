
package controllers;

import Dao.EmpleadoDao;
import Dao.UsuarioDao;
import clases.Empleado;
import clases.Usuario;
import java.util.List;

/**
 *
 * @author Guido D'Antoni guidodantoni2335@gmail.com
 */
public class GestorEmpleado {

    public String obtenerNombre(Integer numeroLegajo) {
        
        String nombreEmpleado, apellidoEmpleado;
        Empleado e;
        
        EmpleadoDao empleadoDao = new EmpleadoDao();
        e = empleadoDao.getEmpleado(numeroLegajo);
        nombreEmpleado = e.getNombre();
        apellidoEmpleado = e.getApellido();
        
        return (nombreEmpleado + " " + apellidoEmpleado);
    }

    public Empleado obtenerEmpleado(Integer numeroLegajo) {
        
        EmpleadoDao empleadoDao = new EmpleadoDao();
        
        return empleadoDao.getEmpleado(numeroLegajo);
    }

//    String BuscarEmpleadoAbrioTicket(int nroTicket) {
//         EmpleadoDao eDao = new EmpleadoDao();
//         String nom ;
//
//         nom = eDao.getEmpleadoAbrioTicket(nroTicket).get(0).toString();
//         return nom;
//    }

    //#######################################################################################################3
    Usuario obtenerEmpleadoUsuario(int legajousuario) {
        
        UsuarioDao usuario = new UsuarioDao();
        
        return usuario.getUsuario(legajousuario);
        
    }

    public List<Empleado> obtenerEmpleados() {
            
        EmpleadoDao e = new EmpleadoDao();
        

        List<Empleado> listaEmp = e.getEmpleados();
        for (int i = 0; i < listaEmp.size() ; i++) {
            listaEmp.get(i).getUsuario();
        }
                
        return e.getEmpleados();
    }
    
     
}
