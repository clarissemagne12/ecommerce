package org.example.ecommerce.services;

import org.example.ecommerce.entities.Livreur;

import java.util.List;
import java.util.Optional;

public interface LivreurInterface {

    Livreur save(Livreur livreur);

    Livreur update(Livreur livreur);

    List<Livreur> findAll();

    Optional<Livreur> findById(Long id);

    void deleteById(Long id);
}