package org.example.ecommerce.services;

import org.example.ecommerce.entities.Client;

import java.util.List;
import java.util.Optional;

public interface ClientInterface {

    Client save(Client client);

    Client update(Client client);

    List<Client> findAll();

    Optional<Client> findById(Long id);

    void deleteById(Long id);

}