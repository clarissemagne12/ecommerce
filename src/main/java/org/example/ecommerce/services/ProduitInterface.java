package org.example.ecommerce.services;

import org.example.ecommerce.entities.Produit;

import java.util.List;
import java.util.Optional;

public interface ProduitInterface {

    Produit save(Produit produit);

    Produit update(Produit produit);

    List<Produit> findAll();

    Optional<Produit> findById(Long id);

    void deleteById(Long id);
}