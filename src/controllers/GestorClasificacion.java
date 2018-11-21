
package controllers;

import Dao.ClasificacionDao;
import java.util.List;
import clases.Clasificacion;
import java.util.ArrayList;
import org.hibernate.Criteria;

/**
 *
 * @author Usuario
 */
public class GestorClasificacion {

    public List<String> obtenerNombresClasificaciones() {
        
        
        List<String> lista = new ArrayList();
        List<Clasificacion> clasificaciones;
        ClasificacionDao clasificacionDao= new ClasificacionDao();
        clasificaciones = clasificacionDao.getClasificacion();
        
        for(int i=0; i<clasificaciones.size();i++){
            
            lista.add(clasificaciones.get(i).getNombreclasificacion());
        }
        
        return lista;
    }

    public Clasificacion obtenerClasificacion(String nombreClasificacion) {
        
        Clasificacion c;
       
        ClasificacionDao clasificacionDao = new ClasificacionDao();
        c=clasificacionDao.getClasificacion(nombreClasificacion);
        
         return c;
    }
    
}
