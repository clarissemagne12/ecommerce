/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example.ecommerce.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Collection;

/**
 *
 * @author user
 */
@Entity
@Table(catalog = "livraison1", schema = "")
@NamedQueries({
    @NamedQuery(name = "Livreur.findAll", query = "SELECT l FROM Livreur l"),
    @NamedQuery(name = "Livreur.findByIdLivreur", query = "SELECT l FROM Livreur l WHERE l.idLivreur = :idLivreur"),
    @NamedQuery(name = "Livreur.findByNom", query = "SELECT l FROM Livreur l WHERE l.nom = :nom"),
    @NamedQuery(name = "Livreur.findByPrenom", query = "SELECT l FROM Livreur l WHERE l.prenom = :prenom"),
    @NamedQuery(name = "Livreur.findByStatut", query = "SELECT l FROM Livreur l WHERE l.statut = :statut")})
public class Livreur implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_livreur", nullable = false)
    private Integer idLivreur;
    @Basic(optional = false)
    @Column(nullable = false, length = 100)
    private String nom;
    @Basic(optional = false)
    @Column(nullable = false, length = 100)
    private String prenom;
    @Column(length = 20)
    private String statut;
    @OneToMany(mappedBy = "idLivreur")
    private Collection<Notification> notificationCollection;
    @OneToMany(mappedBy = "idLivreur")
    private Collection<Commande> commandeCollection;

    public Livreur() {
    }

    public Livreur(Integer idLivreur) {
        this.idLivreur = idLivreur;
    }

    public Livreur(Integer idLivreur, String nom, String prenom) {
        this.idLivreur = idLivreur;
        this.nom = nom;
        this.prenom = prenom;
    }

    public Integer getIdLivreur() {
        return idLivreur;
    }

    public void setIdLivreur(Integer idLivreur) {
        this.idLivreur = idLivreur;
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

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public Collection<Notification> getNotificationCollection() {
        return notificationCollection;
    }

    public void setNotificationCollection(Collection<Notification> notificationCollection) {
        this.notificationCollection = notificationCollection;
    }

    public Collection<Commande> getCommandeCollection() {
        return commandeCollection;
    }

    public void setCommandeCollection(Collection<Commande> commandeCollection) {
        this.commandeCollection = commandeCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idLivreur != null ? idLivreur.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Livreur)) {
            return false;
        }
        Livreur other = (Livreur) object;
        if ((this.idLivreur == null && other.idLivreur != null) || (this.idLivreur != null && !this.idLivreur.equals(other.idLivreur))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.mavenproject4.Livreur[ idLivreur=" + idLivreur + " ]";
    }

    public void setId(Long id) {
    }
}
