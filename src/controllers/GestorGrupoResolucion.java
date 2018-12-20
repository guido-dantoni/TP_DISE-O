
package controllers;

import Dao.EmpleadoDao;
import Dao.GrupoResolucionDao;
import clases.Empleado;
import clases.Gruporesolucion;
import clases.Usuario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Guido D'Antoni guidodantoni2335@gmail.com
 */
public class GestorGrupoResolucion {

    public List<String> obtenerNombreGrupos() {
            
                
        List<String> lista = new ArrayList();
        List<Gruporesolucion> grupoResolucion;
        GrupoResolucionDao grupoResolucionDao= new GrupoResolucionDao();
        grupoResolucion = grupoResolucionDao.getGruposResolucion();
        
        for(int i=0; i<grupoResolucion.size();i++){
            
            lista.add(grupoResolucion.get(i).getNombregrupo());
        }
        
        lista.sort((o1, o2) -> o1.compareTo(o2)); // ordena alfabeticamente la lista ascendentemente
        return lista;
    }

    public List<Gruporesolucion> obtenerGrupos() {
            GrupoResolucionDao gr = new GrupoResolucionDao();
            return gr.getGruposResolucion();
    }

    Gruporesolucion obtenerUnGrupo(String grupo) {
            GrupoResolucionDao g = new GrupoResolucionDao();
            
            return g.getUnGrupo(grupo);
    }

    public String obtenerGrupoLogueado() {
        GestorSesion gestorSesion = new GestorSesion();
        Usuario usuarioLogueado = gestorSesion.getUsuarioLogueado();
        EmpleadoDao empleadoDao = new EmpleadoDao();
        Empleado emp = new Empleado();
        
        emp = empleadoDao.getEmpleadoLogueado(usuarioLogueado);
        
        return emp.getGruporesolucion().getNombregrupo();
    }
    
}
