package org.programirame.services;

import org.programirame.models.Client;
import org.programirame.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {

    @Autowired
    ClientRepository clientRepository;

    public Client createClient(Client client) {
        return clientRepository.save(client);
    }

}
