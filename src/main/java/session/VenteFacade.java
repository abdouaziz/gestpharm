/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import entities.Vente;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Dell
 */
@Stateless
public class VenteFacade extends AbstractFacade<Vente> implements VenteFacadeLocal {

    @PersistenceContext(unitName = "com.mycompany_XXML_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public VenteFacade() {
        super(Vente.class);
    }
    
}
