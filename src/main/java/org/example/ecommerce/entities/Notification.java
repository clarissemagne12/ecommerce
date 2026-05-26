/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example.ecommerce.entities;


import jakarta.persistence.*;

import java.io.Serializable;

/**
 *
 * @author user
 */
@Entity
@Table(catalog = "livraison1", schema = "")
@NamedQueries({
    @NamedQuery(name = "Notification.findAll", query = "SELECT n FROM Notification n"),
    @NamedQuery(name = "Notification.findByIdNotification", query = "SELECT n FROM Notification n WHERE n.idNotification = :idNotification")})
public class Notification implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_notification", nullable = false)
    private Integer idNotification;
    @Basic(optional = false)
    @Lob
    @Column(nullable = false, length = 65535)
    private String message;
    @JoinColumn(name = "id_client", referencedColumnName = "id_client")
    @ManyToOne
    private Client idClient;
    @JoinColumn(name = "id_livreur", referencedColumnName = "id_livreur")
    @ManyToOne
    private Livreur idLivreur;

    public Notification() {
    }

    public Notification(Integer idNotification) {
        this.idNotification = idNotification;
    }

    public Notification(Integer idNotification, String message) {
        this.idNotification = idNotification;
        this.message = message;
    }

    public Integer getIdNotification() {
        return idNotification;
    }

    public void setIdNotification(Integer idNotification) {
        this.idNotification = idNotification;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
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
        hash += (idNotification != null ? idNotification.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Notification)) {
            return false;
        }
        Notification other = (Notification) object;
        if ((this.idNotification == null && other.idNotification != null) || (this.idNotification != null && !this.idNotification.equals(other.idNotification))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.mavenproject4.Notification[ idNotification=" + idNotification + " ]";
    }

    public void setId(Long id) {
    }
}
