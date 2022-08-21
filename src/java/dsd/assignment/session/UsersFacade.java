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
    
    public String register(Users user){
        Query qr=em.createNativeQuery("Select * From users where email=?", Users.class);
        qr.setParameter("email",user.getEmail());
        if(qr.getSingleResult()==null){
            em.persist(user);
            return "User successfully Created";
        }else{
            return "User already exist";
        }
    }
    
    public Users login(String email,String password){
        Query qr=em.createNativeQuery("Select * From users where email=? and password=?", Users.class);
        qr.setParameter("email",email);
        qr.setParameter("password",password);
        if(qr.getSingleResult()==null){
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
