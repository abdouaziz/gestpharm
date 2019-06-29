package entities;

import entities.Commande;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-06-21T18:55:22")
@StaticMetamodel(Fournisseur.class)
public class Fournisseur_ { 

    public static volatile SingularAttribute<Fournisseur, Integer> idFournisseur;
    public static volatile SingularAttribute<Fournisseur, String> adresse;
    public static volatile SingularAttribute<Fournisseur, String> nomfournisseur;
    public static volatile CollectionAttribute<Fournisseur, Commande> commandeCollection;

}