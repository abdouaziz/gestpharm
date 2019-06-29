/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entities.Pharmacien;
import java.util.List;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import session.PharmacienFacadeLocal;

/**
 *
 * @author Dell
 */
@Named(value = "pharmaController")
@RequestScoped
public class PharmaController {

    @EJB
    private PharmacienFacadeLocal pharmacienFacade;
    private Pharmacien c =new Pharmacien() ;

    
    public PharmaController() {
    }

    public Pharmacien getC() {
        return c;
    }

    public void setC(Pharmacien c) {
        this.c = c;
    }
    
    
     public String ajouter(){
        pharmacienFacade.create(c);
        return "pharmacien" ;
    }
    
    public String avanmodif(int id ){
        c=pharmacienFacade.find(id) ;
        return "pharmodif" ;
    }
    public String modifier( Pharmacien c){
       
        pharmacienFacade.edit(c);
        return "pharmacien" ;
    }
    public String supprimer(int id){
        Pharmacien e = pharmacienFacade.find(id) ;
        pharmacienFacade.remove(e);
        return"pharmacien";
        
    }
    public String retour(){
        return "pharmacien" ;
    }
    
    
   public List<Pharmacien> malist(){
       return pharmacienFacade.findAll() ;
   }
    
}
