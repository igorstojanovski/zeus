package org.programirame.services;

import org.programirame.models.client.Client;
import org.programirame.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClientService {

    @Autowired
    ClientRepository clientRepository;

    @Autowired
    UtilityService utilityService;

    public Client createClient(Client client) {
        return clientRepository.save(client);
    }

    public List<Client> getAllClients() {

        return utilityService.makeList(clientRepository.findAll());
    }

    public Client getClient(long clientId) {
        return clientRepository.findOne(clientId);
    }
}
