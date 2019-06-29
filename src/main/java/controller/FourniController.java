/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entities.Fournisseur;
import java.util.List;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import session.FournisseurFacadeLocal;

/**
 *
 * @author Dell
 */
@Named(value = "fourniController")
@RequestScoped
public class FourniController {

    @EJB
    private FournisseurFacadeLocal fournisseurFacade;

    private Fournisseur c = new Fournisseur() ;

    public Fournisseur getC() {
        return c;
    }

    public void setC(Fournisseur c) {
        this.c = c;
    }
    
    public FourniController() {
    }
    
    
    public String ajouter(){
       fournisseurFacade.create(c);
        return "fournisseur" ;
    }
    
    public String avanmodif(int id ){
        fournisseurFacade.find(id) ;
        return "fournimodif" ;
    }
    public String modifier(){
      fournisseurFacade.edit(c);
        return "fournisseur" ;
    }
    public String supprimer(int id){
       Fournisseur e = fournisseurFacade.find(id) ;
        fournisseurFacade.remove(e);
        return"fournisseur";
        
    }
    
    public List<Fournisseur> malist(){
        return fournisseurFacade.findAll() ;
    }
    
}
