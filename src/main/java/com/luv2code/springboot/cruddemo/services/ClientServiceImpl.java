package com.luv2code.springboot.cruddemo.services;

import com.luv2code.springboot.cruddemo.entity.Client;
import com.luv2code.springboot.cruddemo.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientServiceImpl implements ClientService{

    private final ClientRepository clientRepository;

    @Autowired
    public ClientServiceImpl(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Override
    public void saveClient(Client client) {
        clientRepository.save(client);
    }

    @Override
    public void deleteClientById(int id) {
        clientRepository.deleteById(id);
    }
}
