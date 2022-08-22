/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsd.assignment.servlet;

import dsd.assignment.entity.Users;
import dsd.assignment.session.UsersFacade;
import java.io.IOException;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Mukwevho
 */
@WebServlet(name = "LoginServlet", urlPatterns = {"/LoginServlet"})
public class LoginServlet extends HttpServlet {

    @EJB
    UsersFacade user;
    
    Users user1;
    HttpSession session;
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String username=request.getParameter("username");
        String  password=request.getParameter("password");
        System.out.println("See"+username+" "+password);
        user1=user.login(username, password);
        if(user1!=null){
         session.setAttribute("user", user1);
         response.sendRedirect("newsletter.jsp");
        }else{
            response.sendError(1,"Not registered");
        }

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
