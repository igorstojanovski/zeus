package org.programirame.models;

import javax.persistence.*;

@Entity
public class InvoiceDetails {
    private long id;
    private Invoice invoiceId;

    @Id
    @GeneratedValue
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @ManyToOne
    @JoinColumn(name="invoice_id")
    public Invoice getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(Invoice invoiceId) {
        this.invoiceId = invoiceId;
    }
}
