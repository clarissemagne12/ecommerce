package org.example.ecommerce.services;

import lombok.RequiredArgsConstructor;
import org.example.ecommerce.entities.Produit;
import org.example.ecommerce.repositories.ProduitRepository;
import org.example.ecommerce.services.ProduitInterface;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProduitService implements ProduitInterface {

    private final ProduitRepository produitRepository;

    @Override
    public Produit save(Produit produit) {
        return produitRepository.save(produit);
    }

    @Override
    public Produit update(Produit produit) {
        return produitRepository.save(produit);
    }

    @Override
    public List<Produit> findAll() {
        return produitRepository.findAll();
    }

    @Override
    public Optional<Produit> findById(Long id) {
        return produitRepository.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        produitRepository.deleteById(id);
    }
}