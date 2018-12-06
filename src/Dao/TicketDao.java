
package Dao;

import clases.Clasificacion;
import clases.Empleado;
import clases.Historialticket;
import clases.Ticket;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import clases.Historialclasificacion;
import clases.TicketDTO;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import org.hibernate.FetchMode;
import org.hibernate.Hibernate;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.Subqueries;
/**
 *
 * @author Guido D'Antoni guidodantoni2335@gmail.com
 */
public class TicketDao {

    public static void buscarCriterios(Integer nroTicket, Integer nroLegajoEmpleado, Date fechaApertura, Date fechaUltimoCambioEstado, String estadoActual, String ultimoGrupo, String clasificacionActual) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

     private SessionFactory sesionFactory;
     private Session session;
     private Transaction tx;
    
    public void insertTicket(Ticket ticket, Historialticket historialTicket, Historialclasificacion historialClasificacion) {
         
    try {    
         sesionFactory = NewHibernateUtil.getSessionFactory();
         session = sesionFactory.openSession();
         tx = session.beginTransaction();
         // ver tema de cascade para hacer el insert solo con ticket
         //insert into Ticket ticket
         session.save(ticket);
         //insert into historialTicket historialTicket   
         session.save(historialTicket);
         //insert into historialClasificacion historialClasificacion
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
    
    public Historialticket getHistorialTicket(Ticket ticket, String estado) {
        
        Historialticket historialticket = new Historialticket();   
        
          try {    
         sesionFactory = NewHibernateUtil.getSessionFactory();
         session = sesionFactory.openSession();
         tx = session.beginTransaction();
         
         //select * from historialTicket ht where (ht.nroticket=nroTicket AND  ht.horaFin='null' AND ht.fechaFin='null')
         Criteria cr = session.createCriteria(Historialticket.class);
         cr.add(Restrictions.eq("ticket", ticket)).add(Restrictions.eq("estado", estado))
            .add(Restrictions.isNull("fechafin")).add(Restrictions.isNull("horafin"));
       
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
        
    public void insertHistorialTicket(Historialticket ht) {
        
        
          try {    
                     sesionFactory = NewHibernateUtil.getSessionFactory();
                     session = sesionFactory.openSession();
                     tx = session.beginTransaction();
             
                    //insert into HistorialTicket ht;
                    session.save(ht);
                          
                    tx.commit();
                    session.close();

         } catch (HibernateException e) {
                    System.out.println(e);
            }
       
      }

    public void updateTicket(Ticket ticketParaCerrar) {
 
                
        try {    
         sesionFactory = NewHibernateUtil.getSessionFactory();
         session = sesionFactory.openSession();
         tx = session.beginTransaction();
        
         //update de historialTicket
         session.merge(ticketParaCerrar);
                         
         tx.commit();
         session.close();

    } catch (HibernateException e) {
        System.out.println(e);
        }
        
     }   

    public Historialclasificacion getHistorialClasificacion(Ticket ticket, int codigo) {
            
                Historialclasificacion historialClasificacion = new Historialclasificacion();   
        
       try {    
            sesionFactory = NewHibernateUtil.getSessionFactory();
            session = sesionFactory.openSession();
            tx = session.beginTransaction();
         
             //select * from historialTicket ht where (ht.nroticket=nroTicket AND  ht.horaFin='null' AND ht.fechaFin='null')
            Criteria cr = session.createCriteria(Historialclasificacion.class);
            cr.add(Restrictions.eq("ticket", ticket))//.add(Restrictions.eq("codigo_clasificacion", codigo))
            .add(Restrictions.isNull("fechafin")).add(Restrictions.isNull("horafin"));
       
            historialClasificacion = (Historialclasificacion) cr.uniqueResult();
                          
         tx.commit();
         session.close();

    } catch (HibernateException e) {
            System.out.println(e);
        }
          
        return historialClasificacion; 
    }

    public void updateHistorialClasificacion(Historialclasificacion historialClasificacion) {
                
        try {    
                sesionFactory = NewHibernateUtil.getSessionFactory();
                session = sesionFactory.openSession();
                tx = session.beginTransaction();
        
                    //update de historialClasificacion
                session.merge(historialClasificacion);
                         
                tx.commit();
                session.close();

        } catch (HibernateException e) {
            System.out.println(e);
            }
    }
    //ESTA ES LA FUNCION EN LA QUE TENEMOS PROBLEMAS ACA DEBERIA RECUPERAR UNA LISTA DE TIPO TicketDTO Y RETORNARLA
    //tenemos problemas con los join, no sabemos si se hacen asi o no
    //nosotros pudimos retornar una lista (es el codigo que esta comentado casi al final del metodo)
    //pero no podiamos acceder a los atributos, como que la lista tenia que ser casteada, otro problema que nos tiraba era una 
    //NULL POINTER EXCEPTION que no sabemos de que es
    public List<Ticket> getTicketsFiltrados(Integer nroTicket, Integer nroLegajoEmpleado, Date fechaApertura, Date fechaUltimoCambioEstado, String estadoActual, String ultimoGrupo, String clasificacionActual) {
        
        try {    
            
                List result;
            sesionFactory = NewHibernateUtil.getSessionFactory();
            session = sesionFactory.openSession();
            tx = session.beginTransaction();
            
            Criteria ticketCriteria = session.createCriteria(Ticket.class, "t");
            
            if(nroTicket!=null){
                ticketCriteria.add(Restrictions.eq("nroTicket", nroTicket));
            }

             if(fechaApertura!=null){
                ticketCriteria.add(Restrictions.eq("fecahapertura", fechaApertura));
            }

              if(!estadoActual.equals("Todos")){
                ticketCriteria.add(Restrictions.eq("estadoactual", estadoActual));
            }
              
              
            if(nroLegajoEmpleado!=null){
                
                ticketCriteria.createCriteria("empleado").add(Restrictions.eq("legajoEmpleado", nroLegajoEmpleado));  
            }
            
            if(fechaUltimoCambioEstado!=null){
                   
                    ticketCriteria.add(Restrictions.eq("fechaultimoestado" ,fechaUltimoCambioEstado));
             
            }
            
            if(!clasificacionActual.equals("Todas")){
                               
                ticketCriteria.createCriteria("clasificacion").add(Restrictions.eq("nombreclasificacion", clasificacionActual));
            }
            
            if(!ultimoGrupo.equals("Todos")){
            
                ticketCriteria.createAlias("intervencions", "i")
                              .createAlias("i.gruporesolucion", "gr")
                              .createAlias("i.historialintervencions", "ht"); //SEGUIR
                
//                ticketCriteria.createCriteria("interventions", "i").setFetchMode("i.gruporesolucion", FetchMode.JOIN)
//                .addOrder(Order.desc("fechafin")).setFirstResult(1).setProjection(Projections.groupProperty("nroTicket"));
            }
            //docs.jboss.com
            result = ticketCriteria.list();
            
//            for (Iterator iter = result.iterator(); iter.hasNext();) {
//                Ticket ti = (Ticket) iter.next();
//                Hibernate.initialize(ti.getHistorialtickets());
//            
//                for (Iterator iter2 = ti.getHistorialtickets().iterator(); iter2.hasNext();) {
//                    Historialticket Hti = (Historialticket) iter2.next();
//                    Hibernate.initialize(Hti.getTicket());
//                }
//            }
            
 //         List result = session.createSQLQuery("Select t.nro_ticket, t.estadoactual, ")
            
            tx.commit();
            session.close();
            
            return result;
            
    } catch (HibernateException e) {
            System.out.println(e);
        }
        
        return null;
   }
    
        public List<Historialticket> getHistorialesTicket(Ticket t) {
        
        List<Historialticket> historiales = null ;   
        
          try {    
         sesionFactory = NewHibernateUtil.getSessionFactory();
         session = sesionFactory.openSession();
         tx = session.beginTransaction();
         
         Criteria cr = session.createCriteria(Historialticket.class).add(Restrictions.eq("ticket", t));
         historiales = cr.list();
         
         tx.commit();
         session.close();

    } catch (HibernateException e) {
        System.out.println(e);
        }
          
        return historiales; 
        
    }
        
}
       
    

   
