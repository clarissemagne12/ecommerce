package org.example.ecommerce.services;

import org.example.ecommerce.entities.Paiement;

import java.util.List;
import java.util.Optional;

public interface PaiementInterface {

    Paiement save(Paiement paiement);

    Paiement update(Paiement paiement);

    List<Paiement> findAll();

    Optional<Paiement> findById(Long id);

    void deleteById(Long id);
}