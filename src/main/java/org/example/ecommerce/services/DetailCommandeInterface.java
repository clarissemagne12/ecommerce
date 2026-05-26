package org.example.ecommerce.services;

import org.example.ecommerce.entities.DetailCommande;
import org.example.ecommerce.entities.DetailCommandePK;

import java.util.List;
import java.util.Optional;

public interface DetailCommandeInterface{

    DetailCommande save(DetailCommande detailCommande);

    DetailCommande update(DetailCommande detailCommande);

    List<DetailCommande> findAll();

    Optional<DetailCommande> findById(DetailCommandePK id);

    void deleteById(DetailCommandePK id);
}