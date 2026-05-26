package org.example.ecommerce.services;

import lombok.RequiredArgsConstructor;
import org.example.ecommerce.entities.Paiement;
import org.example.ecommerce.repositories.PaiementRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PaiementService implements PaiementInterface {

    private final PaiementRepository paiementRepository;

    @Override
    public Paiement save(Paiement paiement) {
        return paiementRepository.save(paiement);
    }

    @Override
    public Paiement update(Paiement paiement) {
        return paiementRepository.save(paiement);
    }

    @Override
    public List<Paiement> findAll() {
        return paiementRepository.findAll();
    }

    @Override
    public Optional<Paiement> findById(Long id) {
        return paiementRepository.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        paiementRepository.deleteById(id);
    }
}