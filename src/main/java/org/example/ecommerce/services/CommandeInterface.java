package org.example.ecommerce.services;

import org.example.ecommerce.entities.Commande;

import java.util.List;
import java.util.Optional;

public interface CommandeInterface {

    Commande save(Commande commande);

    Commande update(Commande commande);

    List<Commande> findAll();

    Optional<Commande> findById(Long id);

    void deleteById(Long id);
}