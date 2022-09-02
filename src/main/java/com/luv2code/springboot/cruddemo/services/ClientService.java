package com.luv2code.springboot.cruddemo.services;

import com.luv2code.springboot.cruddemo.entity.Client;

import java.util.List;

public interface ClientService {
    public void saveClient(Client client);

    public void deleteClientById(int id);
}
