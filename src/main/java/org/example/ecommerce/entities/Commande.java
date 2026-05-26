/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example.ecommerce.entities;


import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

/**
 *
 * @author user
 */
@Entity
@Table(catalog = "livraison1", schema = "")
@NamedQueries({
    @NamedQuery(name = "Commande.findAll", query = "SELECT c FROM Commande c"),
    @NamedQuery(name = "Commande.findByIdCommande", query = "SELECT c FROM Commande c WHERE c.idCommande = :idCommande"),
    @NamedQuery(name = "Commande.findByDateCommande", query = "SELECT c FROM Commande c WHERE c.dateCommande = :dateCommande"),
    @NamedQuery(name = "Commande.findByStatutCommande", query = "SELECT c FROM Commande c WHERE c.statutCommande = :statutCommande")})
public class Commande implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_commande", nullable = false)
    private Integer idCommande;
    @Basic(optional = false)
    @Column(name = "date_commande", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCommande;
    @Column(name = "statut_commande", length = 30)
    private String statutCommande;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "commande")
    private Collection<DetailCommande> detailCommandeCollection;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "idCommande")
    private Paiement paiement;
    @JoinColumn(name = "id_client", referencedColumnName = "id_client", nullable = false)
    @ManyToOne(optional = false)
    private Client idClient;
    @JoinColumn(name = "id_livreur", referencedColumnName = "id_livreur")
    @ManyToOne
    private Livreur idLivreur;

    public Commande() {
    }

    public Commande(Integer idCommande) {
        this.idCommande = idCommande;
    }

    public Commande(Integer idCommande, Date dateCommande) {
        this.idCommande = idCommande;
        this.dateCommande = dateCommande;
    }

    public Integer getIdCommande() {
        return idCommande;
    }

    public void setIdCommande(Integer idCommande) {
        this.idCommande = idCommande;
    }

    public Date getDateCommande() {
        return dateCommande;
    }

    public void setDateCommande(Date dateCommande) {
        this.dateCommande = dateCommande;
    }

    public String getStatutCommande() {
        return statutCommande;
    }

    public void setStatutCommande(String statutCommande) {
        this.statutCommande = statutCommande;
    }

    public Collection<DetailCommande> getDetailCommandeCollection() {
        return detailCommandeCollection;
    }

    public void setDetailCommandeCollection(Collection<DetailCommande> detailCommandeCollection) {
        this.detailCommandeCollection = detailCommandeCollection;
    }

    public Paiement getPaiement() {
        return paiement;
    }

    public void setPaiement(Paiement paiement) {
        this.paiement = paiement;
    }

    public Client getIdClient() {
        return idClient;
    }

    public void setIdClient(Client idClient) {
        this.idClient = idClient;
    }

    public Livreur getIdLivreur() {
        return idLivreur;
    }

    public void setIdLivreur(Livreur idLivreur) {
        this.idLivreur = idLivreur;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCommande != null ? idCommande.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Commande)) {
            return false;
        }
        Commande other = (Commande) object;
        if ((this.idCommande == null && other.idCommande != null) || (this.idCommande != null && !this.idCommande.equals(other.idCommande))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.mavenproject4.Commande[ idCommande=" + idCommande + " ]";
    }

    public void setId(Long id) {
    }
}
