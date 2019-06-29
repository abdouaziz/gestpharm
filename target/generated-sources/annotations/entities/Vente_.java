package entities;

import entities.Pharmacien;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-06-21T18:55:22")
@StaticMetamodel(Vente.class)
public class Vente_ { 

    public static volatile SingularAttribute<Vente, Pharmacien> idPharmacien;
    public static volatile SingularAttribute<Vente, Date> dateVente;
    public static volatile SingularAttribute<Vente, Integer> montant;
    public static volatile SingularAttribute<Vente, Integer> idVente;

}