/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsd.assignment.servlet;

import dsd.assignment.entity.Users;
import dsd.assignment.session.AddressFacade;
import dsd.assignment.session.UsersFacade;
import java.io.IOException;
import dsd.assignment.entity.Address;
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
@WebServlet(name = "LoginServlet", urlPatterns = {"/LoginServlet"})
public class RegisterServlet extends HttpServlet {

    @EJB
    UsersFacade user;
    @EJB
    AddressFacade address;
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Address address1=new Address();
        Users user1=new Users();
      
            //SUbmit to address retun id
            
            address1.setIssame(false);
            address1.setRcode(Integer.parseInt(request.getParameter("rcode")));
            address1.setResidentiaaddress(request.getParameter("raddress"));
            address1.setPcode(request.getParameter("pcode"));
            address1.setPostaladdress(request.getParameter("paddress"));
        
        
            user1.setUsername(request.getParameter("username"));
            user1.setPassword(request.getParameter("password"));
            user1.setFirstname(request.getParameter("firstname"));
            user1.setLastname(request.getParameter("lastname"));
            user1.setIdnumber(request.getParameter("idno"));
            user1.setAddresskey(address1); //put id here then submit to db
            user1.setGender(request.getParameter("gender"));
            user1.setCountry(request.getParameter("country"));
            user1.setEmail(request.getParameter("email"));
     
           String message=user.registerUser(user1);
           System.out.println("In something"+message);
        
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
