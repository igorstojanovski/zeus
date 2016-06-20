package org.programirame.models;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by igstojanovski on 6/18/2016.
 */
public class Address {
    private long id;

    @Id
    @GeneratedValue
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
