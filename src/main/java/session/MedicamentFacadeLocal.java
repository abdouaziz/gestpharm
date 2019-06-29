/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import entities.Medicament;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Dell
 */
@Local
public interface MedicamentFacadeLocal {

    void create(Medicament medicament);

    void edit(Medicament medicament);

    void remove(Medicament medicament);

    Medicament find(Object id);

    List<Medicament> findAll();

    List<Medicament> findRange(int[] range);

    int count();
    
}
