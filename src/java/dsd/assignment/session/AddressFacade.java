/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsd.assignment.session;

import dsd.assignment.entity.Address;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Zinto
 */
@Stateless
public class AddressFacade extends AbstractFacade<Address> {

    @PersistenceContext(unitName = "Assignment1PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AddressFacade() {
        super(Address.class);
    }
        
    public String createAddress (Address address){
       Query qr= em.createNamedQuery("Address.findByAddressid", Address.class);
       qr.setParameter("addressid",address.getAddressid());
       if(qr.getResultList().isEmpty()){
            em.persist(address);
            return "Address created";
       }
        return "Address exist";
    }
    
    public void update (Address address){
        em.merge(address);
    } 
    
    public Address getAdressByID(int id){
        Query qr= em.createNamedQuery("Address.findByAddressid", Address.class);
        qr.setParameter("addressid",id);
        if(qr.getResultList().isEmpty()){
             return null;
        }
        return (Address)qr.getSingleResult();
       
    }
}
