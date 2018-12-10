
package controllers;

import Dao.ClasificacionDao;
import java.util.List;
import clases.Clasificacion;
import java.util.ArrayList;
import java.util.Collections;
import org.hibernate.Criteria;
import org.hibernate.mapping.Collection;

/**
 *
 * @author Usuario
 */
public class GestorClasificacion {

    public List<String> obtenerNombresClasificaciones() {
        
        
        List<String> lista = new ArrayList();
        List<Clasificacion> clasificaciones;
        ClasificacionDao clasificacionDao= new ClasificacionDao();
        clasificaciones = clasificacionDao.getClasificaciones();
        
        for(int i=0; i<clasificaciones.size();i++){
            
            lista.add(clasificaciones.get(i).getNombreclasificacion());
        }
        
        lista.sort((o1, o2) -> o1.compareTo(o2)); // ordena alfabeticamente la lista ascendentemente
        return lista;
    }

    public Clasificacion obtenerClasificacion(String nombreClasificacion) {
        
        Clasificacion c;
       
        ClasificacionDao clasificacionDao = new ClasificacionDao();
        c=clasificacionDao.getClasificacion(nombreClasificacion);
        
         return c;
    }

    public List<Clasificacion> obtenerClasificaciones() {
        ClasificacionDao c = new ClasificacionDao();
        
        return c.getClasificaciones();
    }
    
}
