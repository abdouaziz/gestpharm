/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entities.Vente;
import java.util.List;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import session.VenteFacadeLocal;

/**
 *
 * @author Dell
 */
@Named(value = "venteController")
@RequestScoped
public class VenteController {

    @EJB
    private VenteFacadeLocal venteFacade;
    private Vente c = new Vente() ;

    
    public VenteController() {
    }

    public Vente getC() {
        return c;
    }

    public void setC(Vente c) {
        this.c = c;
    }
    
        
      public String ajouter(){
        venteFacade.create(c);
        return "vente" ;
    }
    
    public String avanmodif(int id ){
        venteFacade.find(id) ;
        return "ventemodif" ;
    }
    public String modifier(){
        venteFacade.edit(c);
        return "vente" ;
    }
    public String supprimer(int id){
        Vente e = venteFacade.find(id) ;
        venteFacade.remove(e);
        return"vente";
        
    }
    
    
    
    public List<Vente> malist(){
        return venteFacade.findAll();
    }
    
}
