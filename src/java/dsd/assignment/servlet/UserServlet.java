/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsd.assignment.servlet;

import dsd.assignment.entity.Address;
import dsd.assignment.entity.Newslettersubscribe;
import dsd.assignment.entity.Users;
import dsd.assignment.session.AddressFacade;
import dsd.assignment.session.NewslettersubscribeFacade;
import dsd.assignment.session.UsersFacade;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.Date;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Mukwevho
 */
@WebServlet(name = "UserServlet", urlPatterns = {"/UserServlet"})
public class UserServlet extends HttpServlet {

    @EJB
    AddressFacade address;
    
    @EJB
    UsersFacade user;
    
    @EJB
    NewslettersubscribeFacade newsLetter;
    
    Users user1=new Users();
    Address address1=new Address();
    Newslettersubscribe subscribe=new Newslettersubscribe();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet UserServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            
            address1.setAddressid(62);
            address1.setIssame(false);
            address1.setRcode(2030);
            address1.setResidentiaaddress("MMMMM");
            address1.setPcode(true);
            address1.setPostaladdress("adasdasds");
            
            user1.setUsername("TK3");
            user1.setPassword("Pass1");
            user1.setFirstname("TK");
            user1.setLastname("Max");
            user1.setIdnumber("12132");
            user1.setAddresskey(address1);
            user1.setGender("Male");
            user1.setCountry("SA");
            user1.setEmail("tk@gmai.com");
           
            
            
            out.println("<h1>Servlet UserServlet at " + newsLetter.findAllNewsLetters() + "</h1>");
             out.println("<h1>Save user "+ user.registerUser(user1)+ "</h1>");
            out.println("<h1>Save Adress "+ address.createAddress(address1)+ "</h1>");
             out.println("<h1>GET Adress "+ address.getAdressByID(62)+"</h1>");
            out.println("<h1>GET Adress "+ address.getAdressByID(62)+"</h1>");
          
            out.println("</body>");
            out.println("</html>");
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
    }// </editor-fold>

}
