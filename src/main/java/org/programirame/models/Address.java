package org.programirame.models;

import org.programirame.models.client.Client;

import javax.persistence.*;

@Entity
public class Address {
    private long id;
    private Client client;

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
}
