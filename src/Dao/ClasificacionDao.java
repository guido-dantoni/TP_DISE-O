
package Dao;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import java.util.*;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
/**
 *
 * @author Guido D'Antoni guidodantoni2335@gmail.com
 */
public class ClasificacionDao {
    
     private int codigo;
     private String descripcion;
     private String nombreclasificacion;
     
     private static StandardServiceRegistry serviceRegistry;
     private static SessionFactory sessionFactory;
     
     public List<String> getClasificacion(){
         
         Configuration configuration = new Configuration().configure();
         serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
         sessionFactory = configuration.buildSessionFactory(serviceRegistry);
         
         Session session = sessionFactory.openSession();
         session.beginTransaction();
         
         List<String>  clasificaciones = new ArrayList();
         clasificaciones = session.createSQLQuery("SELECT c.nombreClasificacion FROM Clasificacion c").addEntity(nombreclasificacion).list();
         
         session.getTransaction().commit();
         session.close();
         
         return clasificaciones;
     }
    
}
