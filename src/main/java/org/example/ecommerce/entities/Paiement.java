/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example.ecommerce.entities;


import jakarta.persistence.*;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 *
 * @author user
 */
@Entity
@Table(catalog = "livraison1", schema = "", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"id_commande"})})
@NamedQueries({
    @NamedQuery(name = "Paiement.findAll", query = "SELECT p FROM Paiement p"),
    @NamedQuery(name = "Paiement.findByIdPaiement", query = "SELECT p FROM Paiement p WHERE p.idPaiement = :idPaiement"),
    @NamedQuery(name = "Paiement.findByMontant", query = "SELECT p FROM Paiement p WHERE p.montant = :montant"),
    @NamedQuery(name = "Paiement.findByStatutPaiement", query = "SELECT p FROM Paiement p WHERE p.statutPaiement = :statutPaiement")})
public class Paiement implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_paiement", nullable = false)
    private Integer idPaiement;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal montant;
    @Column(name = "statut_paiement", length = 20)
    private String statutPaiement;
    @JoinColumn(name = "id_commande", referencedColumnName = "id_commande", nullable = false)
    @OneToOne(optional = false)
    private Commande idCommande;

    public Paiement() {
    }

    public Paiement(Integer idPaiement) {
        this.idPaiement = idPaiement;
    }

    public Paiement(Integer idPaiement, BigDecimal montant) {
        this.idPaiement = idPaiement;
        this.montant = montant;
    }

    public Integer getIdPaiement() {
        return idPaiement;
    }

    public void setIdPaiement(Integer idPaiement) {
        this.idPaiement = idPaiement;
    }

    public BigDecimal getMontant() {
        return montant;
    }

    public void setMontant(BigDecimal montant) {
        this.montant = montant;
    }

    public String getStatutPaiement() {
        return statutPaiement;
    }

    public void setStatutPaiement(String statutPaiement) {
        this.statutPaiement = statutPaiement;
    }

    public Commande getIdCommande() {
        return idCommande;
    }

    public void setIdCommande(Commande idCommande) {
        this.idCommande = idCommande;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPaiement != null ? idPaiement.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Paiement)) {
            return false;
        }
        Paiement other = (Paiement) object;
        if ((this.idPaiement == null && other.idPaiement != null) || (this.idPaiement != null && !this.idPaiement.equals(other.idPaiement))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.mavenproject4.Paiement[ idPaiement=" + idPaiement + " ]";
    }

    public void setId(Long id) {
    }
}
