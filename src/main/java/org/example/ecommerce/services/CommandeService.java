package org.example.ecommerce.services;

import lombok.RequiredArgsConstructor;
import org.example.ecommerce.entities.Commande;
import org.example.ecommerce.repositories.CommandeRepository;
import org.example.ecommerce.services.CommandeInterface;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CommandeService implements CommandeInterface {

    private final CommandeRepository commandeRepository;

    @Override
    public Commande save(Commande commande) {
        return commandeRepository.save(commande);
    }

    @Override
    public Commande update(Commande commande) {
        return commandeRepository.save(commande);
    }

    @Override
    public List<Commande> findAll() {
        return commandeRepository.findAll();
    }

    @Override
    public Optional<Commande> findById(Long id) {
        return commandeRepository.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        commandeRepository.deleteById(id);
    }
}