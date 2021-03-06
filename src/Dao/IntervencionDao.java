
package Dao;

import clases.Gruporesolucion;
import clases.Historialintervencion;
import clases.Intervencion;
import clases.Ticket;
import java.util.Calendar;
import java.util.Date;
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
public class IntervencionDao {
    
     private SessionFactory sesionFactory;
     private Session session;
     private Transaction tx;

    public Intervencion getIntervencion(Ticket t, Gruporesolucion grupoR) {

        Intervencion i = new Intervencion();
        try{
            sesionFactory = NewHibernateUtil.getSessionFactory();
            session = sesionFactory.openSession();
            tx = session.beginTransaction();
         
            Criteria cr = session.createCriteria(Intervencion.class);
            cr.add(Restrictions.eq("ticket", t)).add(Restrictions.eq("gruporesolucion", grupoR));
            i = (Intervencion) cr.uniqueResult();
         
            tx.commit();
            session.close();
         
        }catch (HibernateException e) {
                 System.out.println(e);
        }
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

    public List<Intervencion> getIntervencionesFiltradas(Integer nroTicket, Integer nroLegajoEmpleado, String estadoIntervencion, Date fechaDesde, Date fechaHasta) {
        
        try {    
                       
            List result;
            sesionFactory = NewHibernateUtil.getSessionFactory();
            session = sesionFactory.openSession();
            tx = session.beginTransaction();
            
            Criteria cr = session.createCriteria(Intervencion.class, "i")
                                 .createAlias("gruporesolucion", "gr")
                                 .createAlias("historialintervencions", "hi")
                                 .createAlias("ticket", "t")
                                 .createAlias("t.empleado", "e")
                                 .add(Restrictions.isNull("hi.fechafin"));
            
            if(nroTicket!=null){
                cr.add(Restrictions.eq("t.nroTicket", nroTicket));
            }

             if(fechaDesde!=null){
                cr.add(Restrictions.ge("hi.fechainicio", fechaDesde));
            }
            
             if(!estadoIntervencion.equals("Todos")){
                 cr.add(Restrictions.eq("i.estadoactual", estadoIntervencion));
            }
              
              
            if(nroLegajoEmpleado!=null){
                
                cr.add(Restrictions.eq("e.legajoEmpleado", nroLegajoEmpleado));  
            }
            
            if(fechaHasta!=null){
                   
                //NO ANDA NOSE PORQUE; SE QUE CON LOS NULOS SE CAGA PERO SI SE LOS FILTRO TAMPOCO ANDA
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(fechaHasta);
                calendar.add(Calendar.DAY_OF_YEAR, 1);
                
                //cr.add(Restrictions.isNotNull("hi.fechafin"));
                cr.add(Restrictions.le("hi.fechafin" ,calendar.getTime()));
                 
            }
                   
            result = cr.list();
                        
            tx.commit();
            session.close();
            
            return result;
            
    } catch (HibernateException e) {
            System.out.println(e);
        }
        
        return null;
    }

    public Intervencion getIntervencion(int idInt) {
         
        Intervencion i = new Intervencion();
        try {    
            sesionFactory = NewHibernateUtil.getSessionFactory();
            session = sesionFactory.openSession();
            tx = session.beginTransaction();
        
             Criteria cr = session.createCriteria(Intervencion.class, "i")
                                  .createAlias("ticket", "t")
                                  .add(Restrictions.eq("idIntervencion", idInt));
             
             i = (Intervencion) cr.uniqueResult();
            
            tx.commit();
            session.close();

        } catch (HibernateException e) {
                System.out.println(e);
            }  
            
            return i;
        }

    public Historialintervencion getHistorial(Intervencion i) {
    
            Historialintervencion hi = new Historialintervencion();
        
             try {    
                 sesionFactory = NewHibernateUtil.getSessionFactory();
                 session = sesionFactory.openSession();
                 tx = session.beginTransaction();
        
                 Criteria cr = session.createCriteria(Historialintervencion.class);
                    cr.add(Restrictions.eq("intervencion", i)).add(Restrictions.eq("estado", i.getEstadoactual()))
                    .add(Restrictions.isNull("fechafin")).add(Restrictions.isNull("horafin"));
                 
                hi = (Historialintervencion) cr.uniqueResult();
             
            
                tx.commit();
                session.close();

           } catch (HibernateException e) {
                        System.out.println(e);
           }  
      return hi;
    
    }

    public void updateHistorialIntervencion(Historialintervencion historialIntervencion) {
   
         try {    
                 sesionFactory = NewHibernateUtil.getSessionFactory();
                 session = sesionFactory.openSession();
                 tx = session.beginTransaction();
        
                 
                 session.merge(historialIntervencion);
             
            
                tx.commit();
                session.close();

           } catch (HibernateException e) {
                        System.out.println(e);
           }  
    
    }

    public void insertHistorialIntervencion(Historialintervencion hi) {
    
            try {    
                 sesionFactory = NewHibernateUtil.getSessionFactory();
                 session = sesionFactory.openSession();
                 tx = session.beginTransaction();
        
                 
                 session.save(hi);
             
            
                tx.commit();
                session.close();

           } catch (HibernateException e) {
                        System.out.println(e);
           }
    
    
    }

    public List<Intervencion> getIntervenciones(Ticket ticket) {
                    
        List<Intervencion> lista = null;
        try {    
            sesionFactory = NewHibernateUtil.getSessionFactory();
            session = sesionFactory.openSession();
            tx = session.beginTransaction();
        
             Criteria cr = session.createCriteria(Intervencion.class, "i")
                                  .add(Restrictions.eq("ticket", ticket));
             
             lista = cr.list();
            
            tx.commit();
            session.close();

        } catch (HibernateException e) {
                System.out.println(e);
            }  
            
            return lista;
    }
     
}


