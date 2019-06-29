package entities;

import entities.Pharmacien;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-06-21T18:55:22")
@StaticMetamodel(Livraison.class)
public class Livraison_ { 

    public static volatile SingularAttribute<Livraison, Date> dateLivraison;
    public static volatile SingularAttribute<Livraison, Pharmacien> idPharmacien;
    public static volatile SingularAttribute<Livraison, Integer> idLivraison;

}