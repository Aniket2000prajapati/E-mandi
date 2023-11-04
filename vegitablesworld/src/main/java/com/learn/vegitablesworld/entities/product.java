/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.learn.vegitablesworld.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
/**
 *
 * @author hp
 */
public class product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
             private int pid;

   
    
             private String pname;
              private String pdiscription;
               private String pphoto;
                private int pprice;
                 private int pdiscount;
                  private int pquantity;
                  
                  @ManyToOne
                  private category category;

    public product(int pid, String pname, String pdiscription, String pphoto, int pprice, int pdiscount, int pquantity, category category) {
        this.pid = pid;
        this.pname = pname;
        this.pdiscription = pdiscription;
        this.pphoto = pphoto;
        this.pprice = pprice;
        this.pdiscount = pdiscount;
        this.pquantity = pquantity;
        this.category = category;
    }

    

    public product() {
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

   

    public String getPdiscription() {
        return pdiscription;
    }

    public void setPdiscription(String pdiscription) {
        this.pdiscription = pdiscription;
    }

    public String getPphoto() {
        return pphoto;
    }

    public void setPphoto(String pphoto) {
        this.pphoto = pphoto;
    }



    public int getPprice() {
        return pprice;
    }

    public void setPprice(int pprice) {
        this.pprice = pprice;
    }

    public int getPdiscount() {
        return pdiscount;
    }

    public void setPdiscount(int pdiscount) {
        this.pdiscount = pdiscount;
    }

    public int getPquantity() {
        return pquantity;
    }

    public void setPquantity(int pquantity) {
        this.pquantity = pquantity;
    }

    public category getCategory() {
        return category;
    }

    public void setCategory(category category) {
        this.category = category;
    }
    
    

    @Override
    public String toString() {
        return "product{" + "pid=" + pid + ", pname=" + pname + ", pdiscription=" + pdiscription + ", pphoto=" + pphoto + ", pprice=" + pprice + ", pdiscount=" + pdiscount + ", pquantity=" + pquantity + '}';
    }
    
    
    
    
    
                  
                  
                  
                  
                  
}
