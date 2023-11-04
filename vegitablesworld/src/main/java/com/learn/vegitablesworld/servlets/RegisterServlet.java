/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.learn.vegitablesworld.servlets;

import com.learn.vegitablesworld.entities.farmer;
import com.learn.vegitablesworld.helper.FactoryProvider;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author hp
 */
public class RegisterServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
           
            try {
                
               String farmername= request.getParameter("farmername");
               String farmeremail= request.getParameter("farmeremail");
               String farmerpassword= request.getParameter("farmerpassword");
                 
                  String farmeraddress= request.getParameter("farmeraddress");
               String farmerphone= request.getParameter("farmerphone");
               
                if(farmername.isEmpty())
                {
                    out.println("NAME IS BLANK ");
                    return;
                }
                
                
                
            farmer farmer;
                farmer = new farmer(farmername, farmeremail, farmerpassword, "default.jpg", farmeraddress, farmerphone);
                        
                Session hibernateSession;
                hibernateSession = FactoryProvider.getFactory().openSession();
                
                
                Transaction tx = hibernateSession.beginTransaction();
                
                int farmerid;
                farmerid = (int) hibernateSession.save(farmer);
                
                
                
                
                tx.commit();
                hibernateSession.close();
                
                HttpSession httpSession = request.getSession();
                httpSession.setAttribute("message","Registration Sucesssfull"+ farmerid);
                response.sendRedirect("register.jsp");
                return;
                
                
            }
                
            catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
   
     @Override
    public String getServletInfo() {
        return "Short description";
    }}
    
    


