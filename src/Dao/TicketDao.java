
package Dao;

import clases.Clasificacion;
import clases.Historialticket;
import clases.Ticket;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import clases.Historialclasificacion;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
/**
 *
 * @author Guido D'Antoni guidodantoni2335@gmail.com
 */
public class TicketDao {

     private SessionFactory sesionFactory;
     private Session session;
     private Transaction tx;
    
    public void insertTicket(Ticket ticket, Historialticket historialTicket, Historialclasificacion historialClasificacion) {
         
    try {    
         sesionFactory = NewHibernateUtil.getSessionFactory();
         session = sesionFactory.openSession();
         tx = session.beginTransaction();
         
         session.save(ticket);
         session.save(historialTicket);
         session.save(historialClasificacion);
                 
         tx.commit();
         session.close();

    } catch (HibernateException e) {
        System.out.println(e);
        }
     
    }

    public Ticket getUltimoTicket() {
     
        Ticket ultimoTicket = new Ticket();
        
   try {    
         sesionFactory = NewHibernateUtil.getSessionFactory();
         session = sesionFactory.openSession();
         tx = session.beginTransaction();
         
        Criteria c = session.createCriteria(Ticket.class);
        c.addOrder(Order.desc("id"));
        c.setMaxResults(1);
        ultimoTicket = (Ticket) c.uniqueResult();
               
         tx.commit();
         session.close();

    } catch (HibernateException e) {
        System.out.println(e);
        }
       
        return ultimoTicket;
    }

    public Ticket getTicket(int nroTicket) {
        
        Ticket ticket = new Ticket();   
        
          try {    
         sesionFactory = NewHibernateUtil.getSessionFactory();
         session = sesionFactory.openSession();
         tx = session.beginTransaction();
         
         //select * from Ticket t where (t.nro_ticket=nroTicket) 
         ticket = (Ticket) session.get(Ticket.class, nroTicket);
                 
         tx.commit();
         session.close();

    } catch (HibernateException e) {
        System.out.println(e);
        }
       
        return ticket;  
    }
    
        public Historialticket getHistorialTicket(int nroTicket, String estado) {
        
        Historialticket historialticket = new Historialticket();   
        
          try {    
         sesionFactory = NewHibernateUtil.getSessionFactory();
         session = sesionFactory.openSession();
         tx = session.beginTransaction();
         
         //select * from historialTicket ht where (ht.nroticket=nroTicket AND  ht.horaFin='null' AND ht.fechaFin='null')
         Criteria cr = session.createCriteria(Historialclasificacion.class);
         cr.add(Restrictions.eq("nroticket", nroTicket)).add(Restrictions.eq("estado", estado))
            .add(Restrictions.eq("fechafin", null)).add(Restrictions.eq("horafin", null));
       
         historialticket = (Historialticket) cr.uniqueResult();
                          
         tx.commit();
         session.close();

    } catch (HibernateException e) {
        System.out.println(e);
        }
       
        return historialticket;  
    }

    public void updateHistorialTicket(Historialticket historialTicket) {
        
        try {    
         sesionFactory = NewHibernateUtil.getSessionFactory();
         session = sesionFactory.openSession();
         tx = session.beginTransaction();
        
         //update de historialTicket
         session.merge(historialTicket);
                         
         tx.commit();
         session.close();

    } catch (HibernateException e) {
        System.out.println(e);
        }
        
    }
       
    
}
   
