package org.example.ecommerce.services;

import lombok.RequiredArgsConstructor;
import org.example.ecommerce.entities.Livreur;
import org.example.ecommerce.repositories.LivreurRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class LivreurService implements LivreurInterface {

    private final LivreurRepository livreurRepository;

    @Override
    public Livreur save(Livreur livreur) {
        return livreurRepository.save(livreur);
    }

    @Override
    public Livreur update(Livreur livreur) {
        return livreurRepository.save(livreur);
    }

    @Override
    public List<Livreur> findAll() {
        return livreurRepository.findAll();
    }

    @Override
    public Optional<Livreur> findById(Long id) {
        return livreurRepository.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        livreurRepository.deleteById(id);
    }
}