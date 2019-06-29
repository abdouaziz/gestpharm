/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import entities.Pharmacien;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Dell
 */
@Local
public interface PharmacienFacadeLocal {

    void create(Pharmacien pharmacien);

    void edit(Pharmacien pharmacien);

    void remove(Pharmacien pharmacien);

    Pharmacien find(Object id);

    List<Pharmacien> findAll();

    List<Pharmacien> findRange(int[] range);

    int count();
    
}
