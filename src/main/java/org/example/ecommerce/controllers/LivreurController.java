package org.example.ecommerce.controllers;

import lombok.RequiredArgsConstructor;
import org.example.ecommerce.entities.Livreur;
import org.example.ecommerce.repositories.LivreurRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/livreurs")
@RequiredArgsConstructor
public class LivreurController {

    private final LivreurRepository livreurRepository;

    @GetMapping
    public List<Livreur> getAll() {
        return livreurRepository.findAll();
    }

    @GetMapping("/{id}")
    public Livreur getById(@PathVariable Long id) {
        return livreurRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Livreur save(@RequestBody Livreur livreur) {
        return livreurRepository.save(livreur);
    }

    @PutMapping("/{id}")
    public Livreur update(@PathVariable Long id, @RequestBody Livreur livreur) {
        livreur.setId(id);
        return livreurRepository.save(livreur);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        livreurRepository.deleteById(id);
    }
}