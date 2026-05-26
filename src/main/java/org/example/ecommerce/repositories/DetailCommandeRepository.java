package org.example.ecommerce.repositories;
import org.example.ecommerce.entities.DetailCommande;
import org.example.ecommerce.entities.DetailCommandePK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetailCommandeRepository extends JpaRepository<DetailCommande, DetailCommandePK> {

}