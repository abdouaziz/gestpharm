/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entities.Livraison;
import java.util.List;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import session.LivraisonFacadeLocal;

/**
 *
 * @author Dell
 */
@Named(value = "livraisonController")
@RequestScoped
public class LivraisonController {

    @EJB
    private LivraisonFacadeLocal livraisonFacade;
    private Livraison c = new Livraison();

    public LivraisonController() {
    }

    public Livraison getC() {
        return c;
    }

    public void setC(Livraison c) {
        this.c = c;
    }

    public String ajouter() {
        livraisonFacade.create(c);
        return "livraison";
    }

    public String avanmodif(int id) {
        livraisonFacade.find(id);
        return "livmodif";
    }

    public String modifier(Livraison t) {
        livraisonFacade.edit(t);
        return "livraison";
    }

    public String supprimer(int id) {
        Livraison e = livraisonFacade.find(id);
        livraisonFacade.remove(e);
        return "livraison";

    }

    public List<Livraison> malist() {
        return livraisonFacade.findAll();
    }
}
