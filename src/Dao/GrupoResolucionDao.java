
package Dao;

import clases.Gruporesolucion;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Guido D'Antoni guidodantoni2335@gmail.com
 */
public class GrupoResolucionDao {

     private SessionFactory sesionFactory;
     private Session session;
     private Transaction tx;
    
    public List<Gruporesolucion> getGruposResolucion() {
        
                  List<Gruporesolucion> g = null;

        try {       
            sesionFactory = NewHibernateUtil.getSessionFactory();
            session = sesionFactory.openSession();
            tx = session.beginTransaction();
         
            Criteria cr = session.createCriteria(Gruporesolucion.class);
            g = cr.list();
         
            tx.commit();
            session.close();
           
       } catch (HibernateException e) {
                 System.out.println(e);
            }
            return g;
    }

    public Gruporesolucion getUnGrupo(String grupo) {
            
            Gruporesolucion g = new Gruporesolucion();
        try {    
                sesionFactory = NewHibernateUtil.getSessionFactory();
                session = sesionFactory.openSession();
                tx = session.beginTransaction();
         
                Criteria cr = session.createCriteria(Gruporesolucion.class);
                cr.add(Restrictions.eq("nombregrupo", grupo));
            
                g = (Gruporesolucion) cr.uniqueResult();
               
                tx.commit();
                session.close();

        } catch (HibernateException e) {
            System.out.println(e);
            }

        return g;
    }
    
}
