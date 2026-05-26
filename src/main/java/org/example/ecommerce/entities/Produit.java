/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example.ecommerce.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;

/**
 *
 * @author user
 */
@Entity
@Table(catalog = "livraison1", schema = "")
@NamedQueries({
    @NamedQuery(name = "Produit.findAll", query = "SELECT p FROM Produit p"),
    @NamedQuery(name = "Produit.findByIdProduit", query = "SELECT p FROM Produit p WHERE p.idProduit = :idProduit"),
    @NamedQuery(name = "Produit.findByNomProduit", query = "SELECT p FROM Produit p WHERE p.nomProduit = :nomProduit"),
    @NamedQuery(name = "Produit.findByPrix", query = "SELECT p FROM Produit p WHERE p.prix = :prix"),
    @NamedQuery(name = "Produit.findByStockDisponible", query = "SELECT p FROM Produit p WHERE p.stockDisponible = :stockDisponible")})
public class Produit implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_produit", nullable = false)
    private Integer idProduit;
    @Basic(optional = false)
    @Column(name = "nom_produit", nullable = false, length = 150)
    private String nomProduit;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal prix;
    @Column(name = "stock_disponible")
    private Integer stockDisponible;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "produit")
    private Collection<DetailCommande> detailCommandeCollection;

    public Produit() {
    }

    public Produit(Integer idProduit) {
        this.idProduit = idProduit;
    }

    public Produit(Integer idProduit, String nomProduit, BigDecimal prix) {
        this.idProduit = idProduit;
        this.nomProduit = nomProduit;
        this.prix = prix;
    }

    public Integer getIdProduit() {
        return idProduit;
    }

    public void setIdProduit(Integer idProduit) {
        this.idProduit = idProduit;
    }

    public String getNomProduit() {
        return nomProduit;
    }

    public void setNomProduit(String nomProduit) {
        this.nomProduit = nomProduit;
    }

    public BigDecimal getPrix() {
        return prix;
    }

    public void setPrix(BigDecimal prix) {
        this.prix = prix;
    }

    public Integer getStockDisponible() {
        return stockDisponible;
    }

    public void setStockDisponible(Integer stockDisponible) {
        this.stockDisponible = stockDisponible;
    }

    public Collection<DetailCommande> getDetailCommandeCollection() {
        return detailCommandeCollection;
    }

    public void setDetailCommandeCollection(Collection<DetailCommande> detailCommandeCollection) {
        this.detailCommandeCollection = detailCommandeCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idProduit != null ? idProduit.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Produit)) {
            return false;
        }
        Produit other = (Produit) object;
        if ((this.idProduit == null && other.idProduit != null) || (this.idProduit != null && !this.idProduit.equals(other.idProduit))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.mavenproject4.Produit[ idProduit=" + idProduit + " ]";
    }

    public void setId(Long id) {
    }
}
