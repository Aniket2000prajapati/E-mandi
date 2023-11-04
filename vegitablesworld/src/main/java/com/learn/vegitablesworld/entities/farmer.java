/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.learn.vegitablesworld.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
/**
 *
 * @author hp
 */
public class farmer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(length = 10 , name ="farmer_id")
    private int farmerid;
    @Column(length = 160, name ="farmer_name")
    private String farmername;
    @Column(length= 100, name ="farmer_email")
    private String farmeremail;
    @Column(length =150 , name ="farmer_password")
    private String farmerpassword;
    @Column(length =170 , name ="farmer_photo")
    private String farmerphoto;
    @Column(length =150 , name ="farmer_address")
    private String farmeraddress;
    @Column(length =10 , name ="farmer_phone")
    private String farmerphone;
    

    public farmer(int farmerid, String farmername, String farmeremail, String farmerpassword, String farmerphoto, String farmeraddress, String farmerphone) {
        this.farmerid = farmerid;
        this.farmername = farmername;
        this.farmeremail = farmeremail;
        this.farmerpassword = farmerpassword;
        this.farmerphoto = farmerphoto;
        this.farmeraddress = farmeraddress;
        this.farmerphone = farmerphone;
    }

    public farmer(String farmername, String farmeremail, String farmerpassword, String farmerphoto, String farmeraddress, String farmerphone) {
        this.farmername = farmername;
        this.farmeremail = farmeremail;
        this.farmerpassword = farmerpassword;
        this.farmerphoto = farmerphoto;
        this.farmeraddress = farmeraddress;
        this.farmerphone = farmerphone;
    }

   
   

    

    public farmer() {
    }

    public int getFarmerid() {
        return farmerid;
    }

    public void setFarmerid(int farmerid) {
        this.farmerid = farmerid;
    }

    public String getFarmername() {
        return farmername;
    }

    public void setFarmername(String farmername) {
        this.farmername = farmername;
    }

    public String getFarmeremail() {
        return farmeremail;
    }

    public void setFarmeremail(String farmeremail) {
        this.farmeremail = farmeremail;
    }

    public String getFarmerpassword() {
        return farmerpassword;
    }

    public void setFarmerpassword(String farmerpassword) {
        this.farmerpassword = farmerpassword;
    }

    public String getFarmerphoto() {
        return farmerphoto;
    }

    public void setFarmerphoto(String farmerphoto) {
        this.farmerphoto = farmerphoto;
    }

    public String getFarmeraddress() {
        return farmeraddress;
    }

    public void setFarmeraddress(String farmeraddress) {
        this.farmeraddress = farmeraddress;
    }

    public String getFarmerphone() {
        return farmerphone;
    }

    public void setFarmerphone(String farmerphone) {
        this.farmerphone = farmerphone;
    }

   
    
    
    
    
    @Override
    public String toString() {
        return "farmer{" + "farmerid=" + farmerid + ", farmername=" + farmername + ", farmeremail=" + farmeremail + ", farmerpassword=" + farmerpassword + ", farmerphoto=" + farmerphoto + ", farmeraddress=" + farmeraddress + ", farmerphone=" + farmerphone + '}';
    }

   
    
    
    
    
    
    
    
    
    
    
    
}
