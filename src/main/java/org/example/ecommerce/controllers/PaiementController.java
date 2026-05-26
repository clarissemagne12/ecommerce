package org.example.ecommerce.controllers;

import lombok.RequiredArgsConstructor;
import org.example.ecommerce.entities.Paiement;
import org.example.ecommerce.repositories.PaiementRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/paiements")
@RequiredArgsConstructor
public class PaiementController {

    private final PaiementRepository paiementRepository;

    @GetMapping
    public List<Paiement> getAll() {
        return paiementRepository.findAll();
    }

    @GetMapping("/{id}")
    public Paiement getById(@PathVariable Long id) {
        return paiementRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Paiement save(@RequestBody Paiement paiement) {
        return paiementRepository.save(paiement);
    }

    @PutMapping("/{id}")
    public Paiement update(@PathVariable Long id, @RequestBody Paiement paiement) {
        paiement.setId(id);
        return paiementRepository.save(paiement);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        paiementRepository.deleteById(id);
    }
}