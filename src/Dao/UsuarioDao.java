/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

//import clases.Clasificacion;
import clases.Usuario;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.util.List;
//import org.hibernate.Criteria;
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
        
        
         sesion = NewHibernateUtil.getSessionFactory();
         session = sesion.openSession();
         tx = session.beginTransaction();
         
        Usuario user = (Usuario) session.get(Usuario.class, legajoUsuario);
         
         tx.commit();
         session.close();
         return user;
     }
    
     public Usuario getUsuario(Integer legajoUsuario){
         
         sesion = NewHibernateUtil.getSessionFactory();
         session = sesion.openSession();
         tx = session.beginTransaction();
         
         Usuario u = (Usuario) session.get(Usuario.class, legajoUsuario);
         
         tx.commit();
         session.close();
         return u;
     }
      
       
}

