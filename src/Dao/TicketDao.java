
package Dao;

import clases.Historialticket;
import clases.Ticket;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import clases.Historialclasificacion;
import clases.Historialintervencion;
import java.util.Date;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Order;
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

    public void updateTicket(Ticket ticket) {
 
                
        try {    
         sesionFactory = NewHibernateUtil.getSessionFactory();
         session = sesionFactory.openSession();
         tx = session.beginTransaction();
        
         //update de historialTicket
         session.merge(ticket);
                         
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
    
        public Historialticket getHistorialTicket(Ticket ticket) {
        
        Historialticket historialticket = new Historialticket();   
        
          try {    
         sesionFactory = NewHibernateUtil.getSessionFactory();
         session = sesionFactory.openSession();
         tx = session.beginTransaction();
         
         //select * from historialTicket ht where (ht.nroticket=nroTicket AND  ht.horaFin='null' AND ht.fechaFin='null')
         Criteria cr = session.createCriteria(Historialticket.class);
         cr.add(Restrictions.eq("ticket", ticket)).add(Restrictions.isNull("fechafin"))
                                                  .add(Restrictions.isNull("horafin"));
       
         historialticket = (Historialticket) cr.uniqueResult();
                          
         tx.commit();
         session.close();

    } catch (HibernateException e) {
        System.out.println(e);
        }
          
        return historialticket; 
        
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

    
    public List<Ticket> getTicketsFiltrados(Integer nroTicket, Integer nroLegajoEmpleado, Date fechaApertura, Date fechaUltimoCambioEstado, String estadoActual, String ultimoGrupo, String clasificacionActual) {
        
        List result = null;
        try {    
            
            
            sesionFactory = NewHibernateUtil.getSessionFactory();
            session = sesionFactory.openSession();
            tx = session.beginTransaction();
                       
            Criteria ticketCriteria = session.createCriteria(Ticket.class, "t")
                                             .createAlias("intervencions", "i")
                                             .createAlias("i.gruporesolucion", "gr")
                                             .createAlias("i.historialintervencions", "hi")
                                             .createAlias("empleado", "e")
                                             .createAlias("clasificacion", "c")
                                             .add(Restrictions.isNull("hi.fechafin"))
                                             .setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
                                             
            
            if(nroTicket!=null){
                ticketCriteria.add(Restrictions.eq("t.nroTicket", nroTicket));
            }

             if(fechaApertura!=null){
                ticketCriteria.add(Restrictions.eq("t.fecahapertura", fechaApertura));
            }
               
             if(!estadoActual.equals("Todos")){
                   ticketCriteria.add(Restrictions.eq("t.estadoactual", estadoActual));
            }
              
              
            if(nroLegajoEmpleado!=null){
                
                ticketCriteria.add(Restrictions.eq("e.legajoEmpleado", nroLegajoEmpleado));  
            }
            
            if(fechaUltimoCambioEstado!=null){
                   
                    ticketCriteria.add(Restrictions.eq("t.fechaultimoestado" ,fechaUltimoCambioEstado));
             
            }
            
            if(!clasificacionActual.equals("Todas")){
                               
                ticketCriteria.add(Restrictions.eq("c.nombreclasificacion", clasificacionActual));
            }
            
            if(!ultimoGrupo.equals("Todos")){

                DetachedCriteria maxFfin= DetachedCriteria.forClass(Historialintervencion.class )
                                                      .setProjection( Projections.max("fechafin"));  
                 
                Date fechaMaxima =(Date) maxFfin.getExecutableCriteria(session).uniqueResult(); 

                ticketCriteria.add(Restrictions.eq("gr.nombregrupo", ultimoGrupo))
                                                .add(Restrictions.or(Restrictions.isNull("hi.fechafin"),
                                                   Restrictions.eq("hi.fechafin",fechaMaxima))); //SEGUIR
                
         }
            
            result = ticketCriteria.list();
     
            tx.commit();
            session.close();
            
    } catch (HibernateException e) {
            System.out.println(e);
        }
        
        return result;
   }
    
    public List<Historialticket> getHistorialesTicket(Ticket ti) {
        
        List<Historialticket> historiales = null ;   
        
          try {    
                sesionFactory = NewHibernateUtil.getSessionFactory();
                session = sesionFactory.openSession();
                tx = session.beginTransaction();
         
                Criteria cr = session.createCriteria(Historialticket.class)
                              .createAlias("ticket", "t")
                              .createAlias("t.intervencions", "i")
                              .add(Restrictions.eq("ticket", ti))
                              //.add(Restrictions.isNotNull("fechafin"))
                              .addOrder(Order.desc("fechafin"))
                              .setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
        
                historiales = cr.list();
         
         tx.commit();
         session.close();

    } catch (HibernateException e) {
        System.out.println(e);
        }
          
        return historiales; 
        
}

    public List<Historialclasificacion> getHistorialesClasificacion(Ticket t) {
                     
        List<Historialclasificacion> historiales = null ;   
        
          try {    
         sesionFactory = NewHibernateUtil.getSessionFactory();
         session = sesionFactory.openSession();
         tx = session.beginTransaction();
         
        DetachedCriteria maxFfin = DetachedCriteria.forClass(Historialintervencion.class)
                                                   .setProjection( Projections.max("fechafin")) ;
                                            
        Date fechaMaxima =(Date) maxFfin.getExecutableCriteria(session).uniqueResult(); 
                         
         Criteria cr = session.createCriteria(Historialclasificacion.class)
                              .createAlias("ticket", "t")
                              .createAlias("t.intervencions", "i")
                              .createAlias("i.gruporesolucion", "gr")
                              .createAlias("i.historialintervencions", "hi")
                              .createAlias("t.historialtickets", "ht")
                              .add(Restrictions.eq("ticket", t))
                              .add(Restrictions.or(Restrictions.isNull("hi.fechafin"),
                                                   Restrictions.eq("hi.fechafin",fechaMaxima)));
         
         historiales = cr.list();
         
         tx.commit();
         session.close();

    } catch (HibernateException e) {
        System.out.println(e);
        }
          
        return historiales;   
        
    }
        public void insertHistorialClasificacion(Historialclasificacion hc) {
          try {    
                     sesionFactory = NewHibernateUtil.getSessionFactory();
                     session = sesionFactory.openSession();
                     tx = session.beginTransaction();
             
                    //insert into HistorialClasificion hc;
                    session.save(hc);
                          
                    tx.commit();
                    session.close();

         } catch (HibernateException e) {
                    System.out.println(e);
            }  
    }

    public List<Ticket> getTicketsCerrados(Integer nroTicket, Integer nroLegajoEmpleado, Date fechaApertura, Date fechaUltimoCambioEstado, String estadoActual, String clasificacionActual) {
                List<Ticket> result = null;
        try {    
            
            
            sesionFactory = NewHibernateUtil.getSessionFactory();
            session = sesionFactory.openSession();
            tx = session.beginTransaction();
            
            Criteria ticketCriteria = session.createCriteria(Ticket.class, "t")
                                             .createAlias("empleado", "e")
                                             .createAlias("clasificacion", "c")
                                             .add(Restrictions.eq("t.estadoactual","CERRADO" ))
                                             .setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
                                             
           
            if(nroTicket!=null){
                ticketCriteria.add(Restrictions.eq("t.nroTicket", nroTicket));
            }
            
             if(fechaApertura!=null){
                ticketCriteria.add(Restrictions.eq("t.fecahapertura", fechaApertura));
            }

             if(!estadoActual.equals("Todos")){
                 
                   ticketCriteria.add(Restrictions.eq("t.estadoactual", estadoActual));
            }
              
              
            if(nroLegajoEmpleado!=null){
                
                ticketCriteria.add(Restrictions.eq("e.legajoEmpleado", nroLegajoEmpleado));  
            }
            
            if(fechaUltimoCambioEstado!=null){
                   
                    ticketCriteria.add(Restrictions.eq("t.fechaultimoestado" ,fechaUltimoCambioEstado));
            }
            
            if(!clasificacionActual.equals("Todas")){
                              
                ticketCriteria.add(Restrictions.eq("c.nombreclasificacion", clasificacionActual));
            }
            

             result = ticketCriteria.list();

            tx.commit();
            session.close();
            
    } catch (HibernateException e) {
            System.out.println(e);
        }
        
        return result;
   }
    
    
     public List<Historialticket> getHistorialesTicketCerrados(Ticket ti) {
        
        List<Historialticket> historiales = null ;   
        
          try {    
         sesionFactory = NewHibernateUtil.getSessionFactory();
         session = sesionFactory.openSession();
         tx = session.beginTransaction();
         
         Criteria cr = session.createCriteria(Historialticket.class)
                              .createAlias("ticket", "t")
                              .createAlias("usuario", "u")
                              .createAlias("u.empleados", "e")
                              .add(Restrictions.eq("ticket", ti))
                              .add(Restrictions.eq("t.estadoactual", "CERRADO"))
                              .add(Restrictions.isNotNull("fechafin"))
                              .addOrder(Order.desc("fechafin"));
         
         historiales = cr.list();
         
         tx.commit();
         session.close();

    } catch (HibernateException e) {
        System.out.println(e);
        }
          
        return historiales; 
        
    }
    
}
       
    

   
