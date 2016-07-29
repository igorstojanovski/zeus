package org.programirame.services;

import org.programirame.models.client.Client;
import org.programirame.repository.ClientRepository;
import org.programirame.services.search.ClientSearch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

    @Autowired
    ClientRepository clientRepository;

    @Autowired
    ClientSearch clientSearch;

    @Autowired
    UtilityService utilityService;

    public Client createClient(Client client) {
        return clientRepository.save(client);
    }

    public List<Client> getAllClients() {

        return utilityService.makeList(clientRepository.findAll());
    }

    public List<Client> searchClients(String query) {
        return clientSearch.search(query);
    }

    public Client getClient(long clientId) {
        return clientRepository.findOne(clientId);
    }
}
