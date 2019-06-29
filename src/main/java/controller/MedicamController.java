/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entities.Medicament;
import java.util.List;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import session.MedicamentFacadeLocal;

/**
 *
 * @author Dell
 */
@Named(value = "medicamController")
@RequestScoped
public class MedicamController {

    @EJB
    private MedicamentFacadeLocal medicamentFacade;
    private Medicament c = new Medicament() ;

    
    public MedicamController() {
    }

    public Medicament getC() {
        return c;
    }

    public void setC(Medicament c) {
        this.c = c;
    }
    
        
          public String ajouter(){
       medicamentFacade.create(c);
        return "medicament" ;
    }
    
    public String avanmodif(int id ){
        medicamentFacade.find(id) ;
        return "medimodif" ;
    }
    public String modifier(){
      medicamentFacade.edit(c);
        return "medicament" ;
    }
    public String supprimer(int id){
       Medicament e = medicamentFacade.find(id) ;
        medicamentFacade.remove(e);
        return"medicament";
        
    }
    
    
    public List<Medicament> malist(){
        return medicamentFacade.findAll() ;
    }
    
}
