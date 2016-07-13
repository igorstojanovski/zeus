package org.programirame.repository;


import org.programirame.models.address.Address;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AddressRepository extends CrudRepository<Address, Long> {

    List<Address> findAddressByClientId(long clientId);

}
