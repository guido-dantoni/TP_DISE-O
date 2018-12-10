
package Dao;

import clases.Gruporesolucion;
import clases.Historialintervencion;
import clases.Intervencion;
import clases.Ticket;
import org.apache.derby.vti.Restriction;
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
public class IntervencionDao {
    
     private SessionFactory sesionFactory;
     private Session session;
     private Transaction tx;

    public Intervencion getIntervencion(Ticket t, Gruporesolucion grupoR) {

         sesionFactory = NewHibernateUtil.getSessionFactory();
         session = sesionFactory.openSession();
         tx = session.beginTransaction();
         
          Criteria cr = session.createCriteria(Intervencion.class);
          cr.add(Restrictions.eq("ticket", t)).add(Restrictions.eq("gruporesolucion", grupoR));
          Intervencion i = (Intervencion) cr.uniqueResult();
         
         tx.commit();
         session.close();
         
         
         return i;
    }

    public void updateIntervecnion(Intervencion intervencion) {
        try {    
         sesionFactory = NewHibernateUtil.getSessionFactory();
         session = sesionFactory.openSession();
         tx = session.beginTransaction();
        
         //update de historialTicket
         session.merge(intervencion);
                         
         tx.commit();
         session.close();

         } catch (HibernateException e) {
                System.out.println(e);
            }  
    }

    public void insertIntervencion(Intervencion nuevaIntervencion, Historialintervencion hi) {
               
        try {    
            sesionFactory = NewHibernateUtil.getSessionFactory();
            session = sesionFactory.openSession();
            tx = session.beginTransaction();
        
            //insert into intervencion (nuevaIntervencion)
            session.save(nuevaIntervencion);
            //*************************************************
            session.save(hi);
                    
            tx.commit();
            session.close();

            } catch (HibernateException e) {
                   System.out.println(e);
               }  
        }
     
}


