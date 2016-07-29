package org.programirame.controllers;

import org.programirame.models.address.Address;
import org.programirame.models.client.Client;
import org.programirame.services.AddressService;
import org.programirame.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clients")
public class ClientController {

    private ClientService clientService;
    private AddressService addressService;

    @Autowired
    public ClientController(ClientService clientService, AddressService addressService) {
        this.clientService = clientService;
        this.addressService = addressService;
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Client> createClient(@RequestBody Client client) {
        Client newClient = clientService.createClient(client);

        return new ResponseEntity<>(newClient, HttpStatus.OK);
    }


//    @RequestMapping(method = RequestMethod.GET)
//    public ResponseEntity<List<Client>> getAllClients() {
//
//        List<Client> clients = clientService.getAllClients();
//
//        return new ResponseEntity<>(clients, HttpStatus.OK);
//    }

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Client>> searchClients(@RequestParam(value = "query", required = false) String query) {

        List<Client> clients;
        if(query == null) {
             clients = clientService.getAllClients();
        } else {
            clients = clientService.searchClients(query);
        }

        return new ResponseEntity<>(clients, HttpStatus.OK);
    }

    @RequestMapping(path = "/{clientId}", method = RequestMethod.GET)
    public ResponseEntity<Client> getClient(@PathVariable long clientId) {

        Client client = clientService.getClient(clientId);

        return new ResponseEntity<>(client, HttpStatus.OK);
    }

    @RequestMapping(value = "/{clientId}/addresses", method = RequestMethod.GET)
    public ResponseEntity<List<Address>> getClientAddresses(@PathVariable long clientId) {
        List<Address> addresses = addressService.getClientAddresses(clientId);

        return new ResponseEntity<>(addresses, HttpStatus.OK);
    }
}
