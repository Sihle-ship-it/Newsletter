/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsd.assignment.session;

import dsd.assignment.entity.Newslettersubscribe;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

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
    
}
