package org.programirame.models.address;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.programirame.models.client.Client;

import javax.persistence.*;

@Entity
public class Address {
    private long id;
    private Client client;
    private AddressType addressType;
    private String address;

    @Id
    @GeneratedValue
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "client_id")
    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @OneToOne
    @JoinColumn(name = "type_id")
    public AddressType getAddressType() {
        return addressType;
    }

    public void setAddressType(AddressType addressType) {
        this.addressType = addressType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
