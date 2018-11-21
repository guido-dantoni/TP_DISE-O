
package Dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import clases.Clasificacion;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Guido D'Antoni guidodantoni2335@gmail.com
 */
public class ClasificacionDao {
    
    /*
     private int codigo;
     private String descripcion;
     private String nombreclasificacion;
     */
     private SessionFactory sesionFactory;
     private Session session;
     private Transaction tx;
     
     public List<Clasificacion> getClasificacion(){
         
         sesionFactory = NewHibernateUtil.getSessionFactory();
         session = sesionFactory.openSession();
         tx = session.beginTransaction();
         
         Criteria cr = session.createCriteria(Clasificacion.class);
         List<Clasificacion> c = cr.list();
         
         tx.commit();
         session.close();
         return c;
     }
     
     
       public Clasificacion getClasificacion(String nombreClasificacion) {
           
           Clasificacion c= new Clasificacion();
         sesionFactory = NewHibernateUtil.getSessionFactory();
         session = sesionFactory.openSession();
         tx = session.beginTransaction();
         
         Criteria cr = session.createCriteria(Clasificacion.class);
         cr.add(Restrictions.eq("nombreclasificacion", nombreClasificacion));
                 
         c= (Clasificacion) cr.uniqueResult();
         tx.commit();
         session.close();
         return c;
           
    }
}
