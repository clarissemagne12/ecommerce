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
@Table(name = "detail_commande", catalog = "livraison1", schema = "")
@NamedQueries({
    @NamedQuery(name = "DetailCommande.findAll", query = "SELECT d FROM DetailCommande d"),
    @NamedQuery(name = "DetailCommande.findByIdCommande", query = "SELECT d FROM DetailCommande d WHERE d.detailCommandePK.idCommande = :idCommande"),
    @NamedQuery(name = "DetailCommande.findByIdProduit", query = "SELECT d FROM DetailCommande d WHERE d.detailCommandePK.idProduit = :idProduit"),
    @NamedQuery(name = "DetailCommande.findByQuantite", query = "SELECT d FROM DetailCommande d WHERE d.quantite = :quantite"),
    @NamedQuery(name = "DetailCommande.findByPrixUnitaire", query = "SELECT d FROM DetailCommande d WHERE d.prixUnitaire = :prixUnitaire")})
public class DetailCommande implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DetailCommandePK detailCommandePK;
    @Basic(optional = false)
    @Column(nullable = false)
    private int quantite;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "prix_unitaire", nullable = false, precision = 10, scale = 2)
    private BigDecimal prixUnitaire;
    @JoinColumn(name = "id_commande", referencedColumnName = "id_commande", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Commande commande;
    @JoinColumn(name = "id_produit", referencedColumnName = "id_produit", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Produit produit;

    public DetailCommande() {
    }

    public DetailCommande(DetailCommandePK detailCommandePK) {
        this.detailCommandePK = detailCommandePK;
    }

    public DetailCommande(DetailCommandePK detailCommandePK, int quantite, BigDecimal prixUnitaire) {
        this.detailCommandePK = detailCommandePK;
        this.quantite = quantite;
        this.prixUnitaire = prixUnitaire;
    }

    public DetailCommande(int idCommande, int idProduit) {
        this.detailCommandePK = new DetailCommandePK(idCommande, idProduit);
    }

    public DetailCommandePK getDetailCommandePK() {
        return detailCommandePK;
    }

    public void setDetailCommandePK(DetailCommandePK detailCommandePK) {
        this.detailCommandePK = detailCommandePK;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public BigDecimal getPrixUnitaire() {
        return prixUnitaire;
    }

    public void setPrixUnitaire(BigDecimal prixUnitaire) {
        this.prixUnitaire = prixUnitaire;
    }

    public Commande getCommande() {
        return commande;
    }

    public void setCommande(Commande commande) {
        this.commande = commande;
    }

    public Produit getProduit() {
        return produit;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (detailCommandePK != null ? detailCommandePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetailCommande)) {
            return false;
        }
        DetailCommande other = (DetailCommande) object;
        if ((this.detailCommandePK == null && other.detailCommandePK != null) || (this.detailCommandePK != null && !this.detailCommandePK.equals(other.detailCommandePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.mavenproject4.DetailCommande[ detailCommandePK=" + detailCommandePK + " ]";
    }
    
}
