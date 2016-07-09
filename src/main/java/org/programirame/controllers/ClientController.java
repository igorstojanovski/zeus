package org.programirame.controllers;

import org.programirame.models.client.Client;
import org.programirame.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clients")
public class ClientController {

    @Autowired
    ClientService clientService;

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Client> createClient(@RequestBody Client client) {
        Client newClient = clientService.createClient(client);

        return new ResponseEntity<>(newClient, HttpStatus.OK);
    }


    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Client>> getAllClients() {

        List<Client> clients = clientService.getAllClients();

        return new ResponseEntity<>(clients, HttpStatus.OK);
    }

    @RequestMapping(path = "/{clientId}", method = RequestMethod.GET)
    public ResponseEntity<Client> getClient(@PathVariable long clientId) {

        Client client = clientService.getClient(clientId);

        return new ResponseEntity<>(client, HttpStatus.OK);
    }
}
