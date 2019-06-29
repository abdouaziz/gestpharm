package entities;

import entities.Fournisseur;
import entities.Pharmacien;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-06-21T18:55:22")
@StaticMetamodel(Commande.class)
public class Commande_ { 

    public static volatile SingularAttribute<Commande, Fournisseur> idFournisseur;
    public static volatile SingularAttribute<Commande, Pharmacien> idPharmacien;
    public static volatile SingularAttribute<Commande, Date> dateCommande;
    public static volatile SingularAttribute<Commande, Integer> idCommande;

}