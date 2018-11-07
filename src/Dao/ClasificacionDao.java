
package Dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import clases.Clasificacion;
import java.util.List;
import org.hibernate.Criteria;

/**
 *
 * @author Guido D'Antoni guidodantoni2335@gmail.com
 */
public class ClasificacionDao {
    
    /*
     private int codigo;
     private String descripcion;
     private String nombreclasificacion;
     */
     private SessionFactory sesion;
     private Session session;
     private Transaction tx;
     
     public List<Clasificacion> getClasificacion(){
         sesion = NewHibernateUtil.getSessionFactory();
         session = sesion.openSession();
         tx = session.beginTransaction();
         
         Criteria cr = session.createCriteria(Clasificacion.class);
         List<Clasificacion> c = cr.list();
         
         tx.commit();
         session.close();
         return c;
     }
     
     
     
     /*
     public List<String> getClasificacion(){
         
         Configuration configuration = new Configuration().configure();
         serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
         sessionFactory = configuration.buildSessionFactory(serviceRegistry);
         
         
         Session session = sessionFactory.openSession();
         session.beginTransaction();
         
         List<String>  clasificaciones = new ArrayList();
         //clasificaciones = session.createSQLQuery("SELECT c.nombreClasificacion FROM Clasificacion c").addEntity(nombreclasificacion).setParameter("nombreclasificacion", this.nombreclasificacion).list();
         
         session.getTransaction().commit();
         session.close();
         
         return clasificaciones;
     }
     public static void main(String[] args) {
    
        String url = "jdbc:postgresql://localhost:5432/postgres";
        String usuario = "postgres";
        String pass = "postgres";
        List<String>  listaClasif = new ArrayList();
   
        //Para recuperar las clasificaciones de la BD
        try {
            Class.forName("org.postgresql.Driver");
            Connection c = DriverManager.getConnection(url, usuario, pass);
            java.sql.Statement st = c.createStatement();
            String sql ="SELECT nombreclasificacion FROM clasificacion";
            ResultSet resultado = st.executeQuery(sql);
                while(resultado.next()) {
                    
                    listaClasif.add(resultado.getString("nombreclasificacion"));
                    //System.out.println("nombreClasificacion: " + " " + nombreClasif);
                }
            resultado.close();
            st.close();
            c.close();
        } catch (Exception e) {
            System.out.println("Error de coneccion " + e.getMessage());
        } 
    
   }
     
     public List<String> getClasificacion(){
         
        String url = "jdbc:postgresql://localhost:5432/postgres";
        String usuario = "postgres";
        String pass = "postgres";
        List<String>  clasificaciones = new ArrayList();
   
        //Para recuperar las clasificaciones de la BD
        try {
            Class.forName("org.postgresql.Driver");
            Connection c = DriverManager.getConnection(url, usuario, pass);
            java.sql.Statement st = c.createStatement();
            String sql ="SELECT nombreclasificacion FROM clasificacion";
            ResultSet resultado = st.executeQuery(sql);
                while(resultado.next()) {
                    
                    clasificaciones.add(resultado.getString("nombreclasificacion"));
                    //System.out.println("nombreClasificacion: " + " " + nombreClasif);
                }
                
            c.commit();
            resultado.close();
            st.close();
            c.close();
        } catch (Exception e) {
            System.out.println("Error de coneccion " + e.getMessage());
        } 
         
         return clasificaciones;
     }
   */  
}
