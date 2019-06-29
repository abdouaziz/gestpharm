package entities;

import entities.Commande;
import entities.Livraison;
import entities.Vente;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-06-21T18:55:22")
@StaticMetamodel(Pharmacien.class)
public class Pharmacien_ { 

    public static volatile SingularAttribute<Pharmacien, Integer> idPharmacien;
    public static volatile SingularAttribute<Pharmacien, Boolean> admin;
    public static volatile SingularAttribute<Pharmacien, String> motdepasse;
    public static volatile SingularAttribute<Pharmacien, String> nom;
    public static volatile SingularAttribute<Pharmacien, String> prenom;
    public static volatile SingularAttribute<Pharmacien, Date> datenais;
    public static volatile CollectionAttribute<Pharmacien, Livraison> livraisonCollection;
    public static volatile CollectionAttribute<Pharmacien, Commande> commandeCollection;
    public static volatile CollectionAttribute<Pharmacien, Vente> venteCollection;

}