package org.example.ecommerce.services;

import lombok.RequiredArgsConstructor;
import org.example.ecommerce.entities.Client;
import org.example.ecommerce.repositories.ClientRepository;
import org.example.ecommerce.services.ClientService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ClientService implements ClientInterface {

    private final ClientRepository clientRepository;

    @Override
    public Client save(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public Client update(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public List<Client> findAll() {
        return clientRepository.findAll();
    }

    @Override
    public Optional<Client> findById(Long id) {
        return clientRepository.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        clientRepository.deleteById(id);
    }
}