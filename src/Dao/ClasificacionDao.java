
package Dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import clases.Clasificacion;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Guido D'Antoni guidodantoni2335@gmail.com
 */
public class ClasificacionDao {
    
 
     private SessionFactory sesionFactory;
     private Session session;
     private Transaction tx;
     
     public List<Clasificacion> getClasificaciones(){
         
         sesionFactory = NewHibernateUtil.getSessionFactory();
         session = sesionFactory.openSession();
         tx = session.beginTransaction();
         
         Criteria cr = session.createCriteria(Clasificacion.class);
         List<Clasificacion> c = cr.list();
         
         tx.commit();
         session.close();
         return c;
     }
     
     public Clasificacion getClasificacion(Integer codigo){
        
         Clasificacion cl = new Clasificacion();
         try{
            sesionFactory = NewHibernateUtil.getSessionFactory();
            session = sesionFactory.openSession();
            tx = session.beginTransaction();
         
             cl = (Clasificacion) session.get(Clasificacion.class, codigo);
         
            tx.commit();
            session.close();
         
        }catch (HibernateException e) {
                 System.out.println(e);
        }
         return cl;
     }
     
     
       public Clasificacion getClasificacion(String nombreClasificacion) {
           
         Clasificacion c= new Clasificacion();
        try{ 
            sesionFactory = NewHibernateUtil.getSessionFactory();
            session = sesionFactory.openSession();
            tx = session.beginTransaction();
         
            Criteria cr = session.createCriteria(Clasificacion.class);
            cr.add(Restrictions.eq("nombreclasificacion", nombreClasificacion));
                 
            c= (Clasificacion) cr.uniqueResult();
            tx.commit();
            session.close();
         
        }catch (HibernateException e) {
                 System.out.println(e);
        }
         return c;
           
    }

}
