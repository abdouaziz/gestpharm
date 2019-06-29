/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entities.Commande;
import java.util.List;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import session.CommandeFacadeLocal;

/**
 *
 * @author Dell
 */
@Named(value = "commandeController")
@RequestScoped
public class CommandeController {

    @EJB
    private CommandeFacadeLocal commandeFacade;
    private Commande c = new Commande () ;

    
    
    public CommandeController() {
    } 

    public Commande getC() {
        return c;
    }

    public void setC(Commande c) {
        this.c = c;
    }
    
    
      public String ajouter(){
       commandeFacade.create(c);
        return "commande" ;
    }
    
    public String avanmodif(int id ){
        commandeFacade.find(id) ;
        return "commandmodif" ;
    }
    public String modifier(){
      commandeFacade.edit(c);
        return "commande" ;
    }
    public String supprimer(int id){
       Commande e = commandeFacade.find(id) ;
        commandeFacade.remove(e);
        return"commande";
        
    }
    
    
    public List<Commande> maliste(){
        
        return commandeFacade.findAll() ;
    }
    
}
