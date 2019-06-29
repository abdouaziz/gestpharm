package entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-06-21T18:55:22")
@StaticMetamodel(Medicament.class)
public class Medicament_ { 

    public static volatile SingularAttribute<Medicament, Integer> idMedicament;
    public static volatile SingularAttribute<Medicament, String> categorie;
    public static volatile SingularAttribute<Medicament, Integer> prixAchat;
    public static volatile SingularAttribute<Medicament, String> libelle;
    public static volatile SingularAttribute<Medicament, Integer> prixVente;
    public static volatile SingularAttribute<Medicament, Date> datePeremption;
    public static volatile SingularAttribute<Medicament, Integer> qteStock;

}