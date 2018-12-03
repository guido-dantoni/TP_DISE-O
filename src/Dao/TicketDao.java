
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
import java.util.Date;
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
    public List<TicketDTO> getTicketsFiltrados(Integer nroTicket, Integer nroLegajoEmpleado, Date fechaApertura, Date fechaUltimoCambioEstado, String estadoActual, String ultimoGrupo, String clasificacionActual) {
        
        
        List<TicketDTO> results=null;
                
        try {    
            sesionFactory = NewHibernateUtil.getSessionFactory();
            session = sesionFactory.openSession();
            tx = session.beginTransaction();
         
            Criteria empleadoCriteria = session.createCriteria(Empleado.class, "e");       
            Criteria ticketCriteria = empleadoCriteria.createCriteria("tickets", "t");
            Criteria historialTicketCriteria = ticketCriteria.createCriteria("historialtickets", "ht");
            Criteria historialClasificacionCriteria = ticketCriteria.createCriteria("historialclasificacions","hc");
            Criteria clasificacionCriteria = historialClasificacionCriteria.createCriteria("clasificacion", "cl");
            //Criteria intervencionCriteria = ticketCriteria.createCriteria()
            
            if(nroTicket!=null){
                ticketCriteria.add(Restrictions.eq("nroTicket", nroTicket));
            }
            
            if(nroLegajoEmpleado!=null){
                ticketCriteria.add(Restrictions.eq("empleado", nroLegajoEmpleado));
            }
            
             if(fechaApertura!=null){
                ticketCriteria.add(Restrictions.eq("fecahapertura", fechaApertura));
            }
             
              if(estadoActual.equals("Todos")){
                ticketCriteria.add(Restrictions.eq("estadoactual", estadoActual));
            }
              //agregar para ultimo grupo, clasificacion actual, fecha ultimo cambio estado, jugar con las fechas ordenarlas de mayor a menor
              //y tomar el primer elemento
               if(fechaUltimoCambioEstado!=null){
                   
                   Criteria c = session.createCriteria(Historialticket.class);
                   c.addOrder(Order.desc("fechafin"));
                   c.setMaxResults(1).uniqueResult();
                   
                   historialTicketCriteria.add(Restrictions.eq(c.toString(),fechaUltimoCambioEstado));
                   
                
            }
               
                if(clasificacionActual!=null){
                    
                   Criteria c = session.createCriteria(Historialclasificacion.class);
                   c.addOrder(Order.desc("fechafin"));
                   c.setMaxResults(1).uniqueResult();
            }
                
                
             
              
              List<Empleado> emp = empleadoCriteria.list();
              List<Ticket> tickets = ticketCriteria.list();
              List<Historialticket> historialTicket = historialClasificacionCriteria.list();
              List<Historialclasificacion> historilClasificacion = historialClasificacionCriteria.list();
          
              for(int i=0; i<tickets.size(); i++){
                  
                  results.get(i).setNroTicket(tickets.get(i).getNroTicket());
                  results.get(i).setNroLegajoempleado(emp.get(i).getLegajoEmpleado());
                  results.get(i).setEstadoactual(tickets.get(i).getEstadoactual());
                  results.get(i).setFechaapertura(tickets.get(i).getFecahapertura());
                  results.get(i).setHoraapertura(tickets.get(i).getHoraapertura());
                  results.get(i).setFechaultimocambioestado(historialTicket.get(i).getFechafin());
                  results.get(i).setOperador("joinear");
                  results.get(i).setClasificacionactual(historilClasificacion.get(i).getClasificacion().getNombreclasificacion());
                  
              }
              
             /*results = ticketCriteria.setProjection(Projections.projectionList()
            .add(Projections.property("t.nroTicket"))
            .add(Projections.property("t.empleado"))
            .add(Projections.property("t.fecahapertura"))
            .add(Projections.property("t.estadoactual"))         
            .add(Projections.property("t.horaapertura"))            
            .add(Projections.property("cl.nombreclasificacion"))
            .add(Projections.property("ht.usuario"))
            .add(Projections.property("ht.fechafin"))).list();
             */
            
            tx.commit();
            session.close();

    } catch (HibernateException e) {
            System.out.println(e);
        }
        
        return results;
    }
        
}
       
    

   
