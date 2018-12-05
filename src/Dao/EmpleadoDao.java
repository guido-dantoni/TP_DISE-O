/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import clases.Empleado;
import clases.Historialticket;
import clases.Ticket;
import clases.Usuario;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Property;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Guido D'Antoni guidodantoni2335@gmail.com
 */
public class EmpleadoDao {
    
    
     private SessionFactory sesionFactory;
     private Session session;
     private Transaction tx;
     
     public Empleado getEmpleado(Integer legajo){
         sesionFactory = NewHibernateUtil.getSessionFactory();
         session = sesionFactory.openSession();
         tx = session.beginTransaction();
         
         Empleado e= (Empleado) session.get(Empleado.class, legajo);
         
         
         tx.commit();
         session.close();
         return e;
     }
     
    public List getEmpleadoAbrioTicket(Integer ticket){
         sesionFactory = NewHibernateUtil.getSessionFactory();
         session = sesionFactory.openSession();
         tx = session.beginTransaction();
         
                 
//         Criteria cr = session.createCriteria(Usuario.class);
//                 cr.createCriteria("historialtickets", "ht").setFetchMode("ht.ticket", FetchMode.JOIN)
//                .add(Property.forName("ht.fechainicio").eq(session.createCriteria(Historialticket.class)
//                .add(Restrictions.eq("nroticket", ticket)).setProjection(Projections.min("fechainicio"))));        
//                
//         Usuario u = (Usuario) cr.uniqueResult();
           List result =  session.createSQLQuery("select e.nombre, e.apellido" +
                                    "from historialticket ht, empleado e, usuario u" +
                                    "where (:nro_ticket = ht.nroticket) and ht.legajousuario=e.legajousuario and" +
                                    "e.legajousuario=u.legajo_usuario" +
                                    "group by ht.nroticket,e.nombre,e.apellido, ht.fechainicio")
                                    .addEntity(Historialticket.class).setParameter("nro_ticket", ticket).list();
           
           
//                     List result = session.createSQLQuery("SELECT t.* FROM public.ticket t join public.historialticket ht on (t.nro_ticket=ht.nroticket) join public.historialclasificacion hc on (t.nro_ticket=hc.nro_ticket)"
//        + " join public.clasificacion cl on (t.codigoclasificacion=cl.codigo) join public.empleado on (e.legajo_empleado=t.legajoempleado) join public.usuario u on(u.legajo_usuario=ht.legajousuario"
//        + " join public.intervencion i on (t.nro_ticket = i.nroticket) join public.gruporesolucion gr on (i.codigogruporesolucion = gr.codigo_grupo_resolucion) join public.historialintervencion hi on (hi.idintervencion=i.id_intervencion)"
//        + " WHERE(((:nroTicket='') or (:nroTicket = t.nro_ticket)) and true) and (((:nroLegajo = '') or (:nroLejajo = e.legajo_empleado)) and true) and "
//        + " (((:fechaApertura = 'null') or (:fechaApertura = t.fechaapertura)) and true) and (((:fechaUltimoEstado = 'null') or (:fechaUltimoEstado = ht.fechaFin)) and true)"
//        + " and (((:estadoActual = 'Todos') or (:estadoActual = t.estadoactual)) and true ) and (((:clasificacionActual= 'Todas' ) or (:clasificacionActual = cl.nombreclasificacion) and true)"
//        + " and (((:ultimoGrupo = 'Todos') or (:ultimoGrupo = gr.nombre )) and true"
//        + " GROUP BY t.nro_ticket ORDER BY ht.fechaFin DESC").addEntity(Ticket.class).setParameter("nroTicket", nroTicket).setParameter("nroLegajo", nroLegajoEmpleado)
//            .setParameter("fechaApertura", fechaApertura).setParameter("fechaUltimoEstado", fechaUltimoCambioEstado)
//            .setParameter("estadoActual", estadoActual).setParameter("clasificacionActual", clasificacionActual)
//            .setParameter("ultimoGrupo", ultimoGrupo).list();
        
 //        Empleado e = (Empleado) u.getEmpleados();
         tx.commit();
         session.close();
         return result;
     }
}
