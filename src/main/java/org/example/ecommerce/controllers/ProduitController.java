package org.example.ecommerce.controllers;

import lombok.RequiredArgsConstructor;
import org.example.ecommerce.entities.Produit;
import org.example.ecommerce.repositories.ProduitRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/produits")
@RequiredArgsConstructor
public class ProduitController {

    private final ProduitRepository produitRepository;

    @GetMapping
    public List<Produit> getAll() {
        return produitRepository.findAll();
    }

    @GetMapping("/{id}")
    public Produit getById(@PathVariable Long id) {
        return produitRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Produit save(@RequestBody Produit produit) {
        return produitRepository.save(produit);
    }

    @PutMapping("/{id}")
    public Produit update(@PathVariable Long id, @RequestBody Produit produit) {
        produit.setId(id);
        return produitRepository.save(produit);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        produitRepository.deleteById(id);
    }
}