package org.programirame.services;

import org.programirame.models.Client;
import org.programirame.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClientService {

    @Autowired
    ClientRepository clientRepository;

    public Client createClient(Client client) {
        return clientRepository.save(client);
    }

    public List<Client> getAllClients() {

        return makeList(clientRepository.findAll());
    }

    public static <E> List<E> makeList(Iterable<E> iter) {
        List<E> list = new ArrayList<>();
        for (E item : iter) {
            list.add(item);
        }
        return list;
    }

    public Client getClient(long clientId) {
        return clientRepository.findOne(clientId);
    }
}
