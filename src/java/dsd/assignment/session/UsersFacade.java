/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsd.assignment.session;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import dsd.assignment.entity.Users;


/**
 *
 * @author Zinto
 */
@Stateless
public class UsersFacade extends AbstractFacade<Users> {

    @PersistenceContext(unitName = "Assignment1PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UsersFacade() {
        super(Users.class);
    }
    
    public String registerUser(Users user){
        Query qr= em.createNamedQuery("Users.findByUsername", Users.class);
        qr.setParameter("username",user.getUsername());
       
       if(qr.getResultList().isEmpty()){
           em.persist(user);
           return "Successfully created user";
       }
        return "Username already in use";
       
    }
    
    public Users login(String username,String password){
        Query qr=em.createNativeQuery("Select * From users where username=? and password=?", Users.class);
        qr.setParameter("username",username);
        qr.setParameter("password",password);
        if(qr.getResultList().isEmpty()){
            return null;
        }  
        return (Users)qr.getSingleResult();
    }

    public String resetPassword(String email,String newPassword){
       Query qr=em.createNativeQuery("Select * From users where email=?", Users.class);
       qr.setParameter("email",email);
       if(qr.getSingleResult()!=null){
           Query qr2=em.createNativeQuery("Update users SET password=? where email=?", Users.class);
            qr2.setParameter("email",email);
            qr2.setParameter("password",newPassword);
            qr2.executeUpdate();
            return "Successfully updated password";
       }
       return "Something went wrong";
    }
    
}
