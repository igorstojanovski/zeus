package org.programirame.models.address;

import org.programirame.models.client.Client;

import javax.persistence.*;
import java.util.List;

@Entity
public class Address {
    private long id;
    private Client client;
    private List<AddressType> addressType;
    private String address;

    @Id
    @GeneratedValue
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @ManyToOne
    @JoinColumn(name = "client_id")
    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @ManyToMany
    @JoinColumn(name = "type_id")
    public List<AddressType> getAddressType() {
        return addressType;
    }

    public void setAddressType(List<AddressType> addressType) {
        this.addressType = addressType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
