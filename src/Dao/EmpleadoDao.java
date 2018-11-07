/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import clases.Empleado;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Guido D'Antoni guidodantoni2335@gmail.com
 */
public class EmpleadoDao {
    
    
     private SessionFactory sesionFactory;
     private Session session;
     private Transaction tx;
     
     public Empleado getNombre(Integer legajo){
         sesionFactory = NewHibernateUtil.getSessionFactory();
         session = sesionFactory.openSession();
         tx = session.beginTransaction();
         
         Empleado e= (Empleado) session.get(Empleado.class, legajo);
         
         
         tx.commit();
         session.close();
         return e;
     }
}
