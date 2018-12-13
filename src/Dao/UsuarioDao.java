
package Dao;


import clases.Usuario;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Guido D'Antoni guidodantoni2335@gmail.com
 */
public class UsuarioDao {

     private SessionFactory sesion;
     private Session session;
     private Transaction tx;
     
     public Usuario getUsuario(int legajoUsuario, String tipoDeUsuario) {
        
         Usuario user = new Usuario();
        try{
            
         sesion = NewHibernateUtil.getSessionFactory();
         session = sesion.openSession();
         tx = session.beginTransaction();
         
         user = (Usuario) session.get(Usuario.class, legajoUsuario);
         
         tx.commit();
         session.close();
         
        }catch (HibernateException e) {
            System.out.println(e);
        }
         return user;
    }
    
     public Usuario getUsuario(Integer legajoUsuario){
         
         Usuario u = new Usuario();
        try{ 
            sesion = NewHibernateUtil.getSessionFactory();
            session = sesion.openSession();
            tx = session.beginTransaction();
         
            u = (Usuario) session.get(Usuario.class, legajoUsuario);
         
            tx.commit();
            session.close();
         
        }catch (HibernateException e) {
            System.out.println(e);
        } 
         return u;
     }
      
       
}

