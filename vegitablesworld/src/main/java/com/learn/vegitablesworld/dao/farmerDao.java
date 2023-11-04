/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.learn.vegitablesworld.dao;

import com.learn.vegitablesworld.entities.farmer;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;


/**
 *
 * @author hp
 */
public class farmerDao {
    
    private SessionFactory factory;

    public farmerDao(SessionFactory factory) {
        this.factory = factory;
    }
    
    public farmer getfarmerByemailAndpassword(String email,String password)
    {
        farmer farmer=null;
        
        
        try {
            
            String query="from farmer where farmeremail =:e and user password=: p";
           
            Session session =  this.factory.openSession();
            Query q = session.createQuery(query);
           q.setParameter("e", email);
           q.setParameter("p", password);
           
            farmer  =(farmer) q.uniqueResult();
           
            
            
            
            session.close();
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
        
        return farmer;
        
    }

    public farmer getfarmerByemailAndpasssword(String email, String password) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
