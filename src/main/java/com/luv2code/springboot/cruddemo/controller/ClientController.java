package com.luv2code.springboot.cruddemo.controller;

import com.luv2code.springboot.cruddemo.entity.Client;
import com.luv2code.springboot.cruddemo.entity.User;
import com.luv2code.springboot.cruddemo.services.ClientService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/client")
public class ClientController {

    private final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @PostMapping
    public String save(@RequestBody Client client){
        clientService.saveClient(client);
        return "client created";
    }

    @DeleteMapping(value = "/delete/{id}")
    public void deleteClient(@PathVariable int id){
        clientService.deleteClientById(id);
    }
}
