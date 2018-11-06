
package controllers;

import Dao.ClasificacionDao;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class GestorClasificacion {

    public List<String> obtenerNombresClasificaciones() {
        ClasificacionDao clasificacionDao= new ClasificacionDao();
        
        return clasificacionDao.getClasificacion();
    }
    
}
