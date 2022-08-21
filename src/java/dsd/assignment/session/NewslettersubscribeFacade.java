/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsd.assignment.session;

import dsd.assignment.entity.Newslettersubscribe;
import dsd.assignment.entity.Users;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Zinto
 */
@Stateless
public class NewslettersubscribeFacade extends AbstractFacade<Newslettersubscribe> {

    @PersistenceContext(unitName = "Assignment1PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public NewslettersubscribeFacade() {
        super(Newslettersubscribe.class);
    }
    
    public String subscribe(Newslettersubscribe newsletter){
        Query qr= em.createNamedQuery("Newslettersubscribe.findByNewsletters", Newslettersubscribe.class);
        qr.setParameter("newsletters",newsletter.getNewsletters());
        if(qr.getResultList().isEmpty()){
            em.persist(newsletter);
            return "Successfully subscribed to "+newsletter.getNewsletters()+" newsletter";
        }else{
            return "Already subscribed to newsletter";
        }
    }
    
    public List<Newslettersubscribe> findAllNewsLetters(){
        Query qr= em.createNamedQuery("Newslettersubscribe.findAll", Newslettersubscribe.class);
        return qr.getResultList();
    }  
}