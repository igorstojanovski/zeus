package org.programirame.models.client;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import org.hibernate.search.annotations.Field;
import org.hibernate.search.annotations.Indexed;

import javax.persistence.*;

@Entity
@Indexed
@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "@clientId")
public class Client {

    private String externalId;
    @Field
    private String name;
    @Field
    private String surname;
    @Field
    private String taxNumber;
    @Field
    private String uid;

    private long id;
    private ClientType type;

    public Client() {
    }

    public Client(String externalId, String name) {
        this.externalId = externalId;
        this.name = name;
    }

    @Id
    @GeneratedValue
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Column(nullable = false)
    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @OneToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="TYPE_ID")
    public ClientType getType() {
        return type;
    }

    public void setType(ClientType type) {
        this.type = type;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getTaxNumber() {
        return taxNumber;
    }

    public void setTaxNumber(String taxNumber) {
        this.taxNumber = taxNumber;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }
}
