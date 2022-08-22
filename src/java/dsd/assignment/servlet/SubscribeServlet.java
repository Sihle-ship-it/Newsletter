/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsd.assignment.servlet;

import dsd.assignment.session.NewslettersubscribeFacade;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dsd.assignment.entity.Newslettersubscribe;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mukwevho
 */
@WebServlet(name = "SubscribeServlet", urlPatterns = {"/SubscribeServlet"})
public class SubscribeServlet extends HttpServlet {

    @EJB
    NewslettersubscribeFacade newsletter; 

    Newslettersubscribe news;
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
        Date date = new Date();  
        
        String sDate1=request.getParameter("date");
        try {  
            Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);
            news.setEnddate(date1);
        } catch (ParseException ex) {
            Logger.getLogger(SubscribeServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
       news.setSubscriptionid(Integer.SIZE);
       news.setStartdate(date);
       news.setIssubscribe(true);
       news.setNewsletters(request.getParameter("newsletter"));
       
       
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
