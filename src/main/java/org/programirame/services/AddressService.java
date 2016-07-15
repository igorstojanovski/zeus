package org.programirame.services;

import org.programirame.models.address.Address;
import org.programirame.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {

    @Autowired
    private AddressRepository addressRepository;

    public List<Address> getClientAddresses(long clientId) {
        return addressRepository.findAddressByClientId(clientId);
    }
}
