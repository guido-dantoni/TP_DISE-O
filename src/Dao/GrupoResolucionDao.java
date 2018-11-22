
package Dao;

import clases.Gruporesolucion;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Guido D'Antoni guidodantoni2335@gmail.com
 */
public class GrupoResolucionDao {

     private SessionFactory sesionFactory;
     private Session session;
     private Transaction tx;
    
    public List<Gruporesolucion> getGrupoResolucion() {

         sesionFactory = NewHibernateUtil.getSessionFactory();
         session = sesionFactory.openSession();
         tx = session.beginTransaction();
         
         Criteria cr = session.createCriteria(Gruporesolucion.class);
         List<Gruporesolucion> g = cr.list();
         
         tx.commit();
         session.close();
         return g;
    }
    
}
