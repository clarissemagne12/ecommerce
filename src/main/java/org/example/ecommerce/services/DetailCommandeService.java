package org.example.ecommerce.services;

import lombok.RequiredArgsConstructor;
import org.example.ecommerce.entities.DetailCommande;
import org.example.ecommerce.entities.DetailCommandePK;
import org.example.ecommerce.repositories.DetailCommandeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class DetailCommandeService implements DetailCommandeInterface {

    private final DetailCommandeRepository detailCommandeRepository;

    @Override
    public DetailCommande save(DetailCommande detailCommande) {
        return detailCommandeRepository.save(detailCommande);
    }

    @Override
    public DetailCommande update(DetailCommande detailCommande) {
        return detailCommandeRepository.save(detailCommande);
    }

    @Override
    public List<DetailCommande> findAll() {
        return detailCommandeRepository.findAll();
    }

    @Override
    public Optional<DetailCommande> findById(DetailCommandePK id) {
        return detailCommandeRepository.findById(id);
    }

    @Override
    public void deleteById(DetailCommandePK id) {
        detailCommandeRepository.deleteById(id);
    }
}