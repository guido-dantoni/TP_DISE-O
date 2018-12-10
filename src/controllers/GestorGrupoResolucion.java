
package controllers;

import Dao.ClasificacionDao;
import Dao.GrupoResolucionDao;
import clases.Clasificacion;
import clases.Gruporesolucion;
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
    
}
