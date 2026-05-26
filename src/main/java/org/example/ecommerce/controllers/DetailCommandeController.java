package org.example.ecommerce.controllers;

import lombok.RequiredArgsConstructor;
import org.example.ecommerce.entities.DetailCommande;
import org.example.ecommerce.entities.DetailCommandePK;
import org.example.ecommerce.repositories.DetailCommandeRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/detail-commandes")
@RequiredArgsConstructor
public class DetailCommandeController {

    private final DetailCommandeRepository detailCommandeRepository;

    @GetMapping
    public List<DetailCommande> getAll() {
        return detailCommandeRepository.findAll();
    }

    @PostMapping
    public DetailCommande save(@RequestBody DetailCommande detailCommande) {
        return detailCommandeRepository.save(detailCommande);
    }

    @DeleteMapping
    public void delete(@RequestBody DetailCommandePK id) {
        detailCommandeRepository.deleteById(id);
    }
}