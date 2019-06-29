/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Dell
 */
@Entity
@Table(name = "pharmacien")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pharmacien.findAll", query = "SELECT p FROM Pharmacien p")
    , @NamedQuery(name = "Pharmacien.findByIdPharmacien", query = "SELECT p FROM Pharmacien p WHERE p.idPharmacien = :idPharmacien")
    , @NamedQuery(name = "Pharmacien.findByNom", query = "SELECT p FROM Pharmacien p WHERE p.nom = :nom")
    , @NamedQuery(name = "Pharmacien.findByPrenom", query = "SELECT p FROM Pharmacien p WHERE p.prenom = :prenom")
    , @NamedQuery(name = "Pharmacien.findByDatenais", query = "SELECT p FROM Pharmacien p WHERE p.datenais = :datenais")
    , @NamedQuery(name = "Pharmacien.findByAdmin", query = "SELECT p FROM Pharmacien p WHERE p.admin = :admin")
    , @NamedQuery(name = "Pharmacien.findByMotdepasse", query = "SELECT p FROM Pharmacien p WHERE p.motdepasse = :motdepasse")})
public class Pharmacien implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idPharmacien")
    private Integer idPharmacien;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "nom")
    private String nom;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "prenom")
    private String prenom;
    @Basic(optional = false)
    @NotNull
    @Column(name = "datenais")
    @Temporal(TemporalType.DATE)
    private Date datenais;
    @Basic(optional = false)
    @NotNull
    @Column(name = "admin")
    private boolean admin;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "motdepasse")
    private String motdepasse;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPharmacien")
    private Collection<Livraison> livraisonCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPharmacien")
    private Collection<Commande> commandeCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPharmacien")
    private Collection<Vente> venteCollection;

    public Pharmacien() {
    }

    public Pharmacien(Integer idPharmacien) {
        this.idPharmacien = idPharmacien;
    }

    public Pharmacien(Integer idPharmacien, String nom, String prenom, Date datenais, boolean admin, String motdepasse) {
        this.idPharmacien = idPharmacien;
        this.nom = nom;
        this.prenom = prenom;
        this.datenais = datenais;
        this.admin = admin;
        this.motdepasse = motdepasse;
    }

    public Integer getIdPharmacien() {
        return idPharmacien;
    }

    public void setIdPharmacien(Integer idPharmacien) {
        this.idPharmacien = idPharmacien;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Date getDatenais() {
        return datenais;
    }

    public void setDatenais(Date datenais) {
        this.datenais = datenais;
    }

    public boolean getAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    public String getMotdepasse() {
        return motdepasse;
    }

    public void setMotdepasse(String motdepasse) {
        this.motdepasse = motdepasse;
    }

    @XmlTransient
    public Collection<Livraison> getLivraisonCollection() {
        return livraisonCollection;
    }

    public void setLivraisonCollection(Collection<Livraison> livraisonCollection) {
        this.livraisonCollection = livraisonCollection;
    }

    @XmlTransient
    public Collection<Commande> getCommandeCollection() {
        return commandeCollection;
    }

    public void setCommandeCollection(Collection<Commande> commandeCollection) {
        this.commandeCollection = commandeCollection;
    }

    @XmlTransient
    public Collection<Vente> getVenteCollection() {
        return venteCollection;
    }

    public void setVenteCollection(Collection<Vente> venteCollection) {
        this.venteCollection = venteCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPharmacien != null ? idPharmacien.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pharmacien)) {
            return false;
        }
        Pharmacien other = (Pharmacien) object;
        if ((this.idPharmacien == null && other.idPharmacien != null) || (this.idPharmacien != null && !this.idPharmacien.equals(other.idPharmacien))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Pharmacien[ idPharmacien=" + idPharmacien + " ]";
    }
    
}
