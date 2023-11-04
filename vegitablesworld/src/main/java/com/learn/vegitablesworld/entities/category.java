/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.learn.vegitablesworld.entities;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
/**
 *
 * @author hp
 */
public class category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private int cid;
    private String cdescription;
    private String categorytitle;

    @OneToMany(mappedBy = "category")
    private List<product> products=new ArrayList<>();

    public category(int cid, String cdescription, String categorytitle) {
        this.cid = cid;
        this.cdescription = cdescription;
        this.categorytitle = categorytitle;
    }

    public category(String cdescription, String categorytitle,List<product> products) {
        this.cdescription = cdescription;
        this.categorytitle = categorytitle;
        this.products=products;
    }
    
    
  
    
    

    
    public category() {
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getCdescription() {
        return cdescription;
    }

    public void setCdescription(String cdescription) {
        this.cdescription = cdescription;
    }

    public String getCategorytitle() {
        return categorytitle;
    }

    public void setCategorytitle(String categorytitle) {
        this.categorytitle = categorytitle;
    }

    public List<product> getProducts() {
        return products;
    }

    public void setProducts(List<product> products) {
        this.products = products;
    }
    
    
    
       
    
    
    
    
    

    @Override
    public String toString() {
        return "category{" + "cid=" + cid + ", cdescription=" + cdescription + ", categorytitle=" + categorytitle + '}';
    }
    
    
    
    
    
      
    
    
    
}
