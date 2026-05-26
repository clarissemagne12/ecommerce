/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example.ecommerce.entities;


import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

/**
 *
 * @author user
 */
@Embeddable
public class DetailCommandePK implements Serializable {

    @Basic(optional = false)
    @Column(name = "id_commande", nullable = false)
    private int idCommande;
    @Basic(optional = false)
    @Column(name = "id_produit", nullable = false)
    private int idProduit;

    public DetailCommandePK() {
    }

    public DetailCommandePK(int idCommande, int idProduit) {
        this.idCommande = idCommande;
        this.idProduit = idProduit;
    }

    public int getIdCommande() {
        return idCommande;
    }

    public void setIdCommande(int idCommande) {
        this.idCommande = idCommande;
    }

    public int getIdProduit() {
        return idProduit;
    }

    public void setIdProduit(int idProduit) {
        this.idProduit = idProduit;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idCommande;
        hash += (int) idProduit;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetailCommandePK)) {
            return false;
        }
        DetailCommandePK other = (DetailCommandePK) object;
        if (this.idCommande != other.idCommande) {
            return false;
        }
        if (this.idProduit != other.idProduit) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.mavenproject4.DetailCommandePK[ idCommande=" + idCommande + ", idProduit=" + idProduit + " ]";
    }
    
}
