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
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Dell
 */
@Entity
@Table(name = "livraison")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Livraison.findAll", query = "SELECT l FROM Livraison l")
    , @NamedQuery(name = "Livraison.findByIdLivraison", query = "SELECT l FROM Livraison l WHERE l.idLivraison = :idLivraison")
    , @NamedQuery(name = "Livraison.findByDateLivraison", query = "SELECT l FROM Livraison l WHERE l.dateLivraison = :dateLivraison")})
public class Livraison implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idLivraison")
    private Integer idLivraison;
    @Column(name = "DateLivraison")
    @Temporal(TemporalType.DATE)
    private Date dateLivraison;
    @JoinColumn(name = "idPharmacien", referencedColumnName = "idPharmacien")
    @ManyToOne(optional = false)
    private Pharmacien idPharmacien;

    public Livraison() {
    }

    public Livraison(Integer idLivraison) {
        this.idLivraison = idLivraison;
    }

    public Integer getIdLivraison() {
        return idLivraison;
    }

    public void setIdLivraison(Integer idLivraison) {
        this.idLivraison = idLivraison;
    }

    public Date getDateLivraison() {
        return dateLivraison;
    }

    public void setDateLivraison(Date dateLivraison) {
        this.dateLivraison = dateLivraison;
    }

    public Pharmacien getIdPharmacien() {
        return idPharmacien;
    }

    public void setIdPharmacien(Pharmacien idPharmacien) {
        this.idPharmacien = idPharmacien;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idLivraison != null ? idLivraison.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Livraison)) {
            return false;
        }
        Livraison other = (Livraison) object;
        if ((this.idLivraison == null && other.idLivraison != null) || (this.idLivraison != null && !this.idLivraison.equals(other.idLivraison))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Livraison[ idLivraison=" + idLivraison + " ]";
    }
    
}
