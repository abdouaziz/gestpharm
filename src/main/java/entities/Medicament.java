/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Dell
 */
@Entity
@Table(name = "medicament")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Medicament.findAll", query = "SELECT m FROM Medicament m")
    , @NamedQuery(name = "Medicament.findByIdMedicament", query = "SELECT m FROM Medicament m WHERE m.idMedicament = :idMedicament")
    , @NamedQuery(name = "Medicament.findByLibelle", query = "SELECT m FROM Medicament m WHERE m.libelle = :libelle")
    , @NamedQuery(name = "Medicament.findByCategorie", query = "SELECT m FROM Medicament m WHERE m.categorie = :categorie")
    , @NamedQuery(name = "Medicament.findByPrixAchat", query = "SELECT m FROM Medicament m WHERE m.prixAchat = :prixAchat")
    , @NamedQuery(name = "Medicament.findByPrixVente", query = "SELECT m FROM Medicament m WHERE m.prixVente = :prixVente")
    , @NamedQuery(name = "Medicament.findByQteStock", query = "SELECT m FROM Medicament m WHERE m.qteStock = :qteStock")
    , @NamedQuery(name = "Medicament.findByDatePeremption", query = "SELECT m FROM Medicament m WHERE m.datePeremption = :datePeremption")})
public class Medicament implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idMedicament")
    private Integer idMedicament;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "libelle")
    private String libelle;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "categorie")
    private String categorie;
    @Basic(optional = false)
    @NotNull
    @Column(name = "prixAchat")
    private int prixAchat;
    @Basic(optional = false)
    @NotNull
    @Column(name = "prixVente")
    private int prixVente;
    @Basic(optional = false)
    @NotNull
    @Column(name = "qteStock")
    private int qteStock;
    @Basic(optional = false)
    @NotNull
    @Column(name = "datePeremption")
    @Temporal(TemporalType.DATE)
    private Date datePeremption;

    public Medicament() {
    }

    public Medicament(Integer idMedicament) {
        this.idMedicament = idMedicament;
    }

    public Medicament(Integer idMedicament, String libelle, String categorie, int prixAchat, int prixVente, int qteStock, Date datePeremption) {
        this.idMedicament = idMedicament;
        this.libelle = libelle;
        this.categorie = categorie;
        this.prixAchat = prixAchat;
        this.prixVente = prixVente;
        this.qteStock = qteStock;
        this.datePeremption = datePeremption;
    }

    public Integer getIdMedicament() {
        return idMedicament;
    }

    public void setIdMedicament(Integer idMedicament) {
        this.idMedicament = idMedicament;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public int getPrixAchat() {
        return prixAchat;
    }

    public void setPrixAchat(int prixAchat) {
        this.prixAchat = prixAchat;
    }

    public int getPrixVente() {
        return prixVente;
    }

    public void setPrixVente(int prixVente) {
        this.prixVente = prixVente;
    }

    public int getQteStock() {
        return qteStock;
    }

    public void setQteStock(int qteStock) {
        this.qteStock = qteStock;
    }

    public Date getDatePeremption() {
        return datePeremption;
    }

    public void setDatePeremption(Date datePeremption) {
        this.datePeremption = datePeremption;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMedicament != null ? idMedicament.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Medicament)) {
            return false;
        }
        Medicament other = (Medicament) object;
        if ((this.idMedicament == null && other.idMedicament != null) || (this.idMedicament != null && !this.idMedicament.equals(other.idMedicament))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Medicament[ idMedicament=" + idMedicament + " ]";
    }
    
}
