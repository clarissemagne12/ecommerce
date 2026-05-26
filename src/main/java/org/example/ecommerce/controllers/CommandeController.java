package org.example.ecommerce.controllers;

import lombok.RequiredArgsConstructor;
import org.example.ecommerce.entities.Commande;
import org.example.ecommerce.repositories.CommandeRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/commandes")
@RequiredArgsConstructor
public class CommandeController {

    private final CommandeRepository commandeRepository;

    @GetMapping
    public List<Commande> getAll() {
        return commandeRepository.findAll();
    }

    @GetMapping("/{id}")
    public Commande getById(@PathVariable Long id) {
        return commandeRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Commande save(@RequestBody Commande commande) {
        return commandeRepository.save(commande);
    }

    @PutMapping("/{id}")
    public Commande update(@PathVariable Long id, @RequestBody Commande commande) {
        commande.setId(id);
        return commandeRepository.save(commande);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        commandeRepository.deleteById(id);
    }
}