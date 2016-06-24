package org.programirame.controllers;

import org.programirame.models.Customer;
import org.programirame.models.Invoice;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Component
public enum DataRetrieverStrategy implements LateInvoiceRetriever {

    DAY_ONE {
        @Override
        public List<Invoice> getLateInvoices(List<Integer> customerIds) {

            Invoice invoice = new Invoice();
            invoice.setAmount(BigDecimal.valueOf(1000));
            invoice.setExternalId("InvEXT0001");
            invoice.setId(1);
            invoice.setCustomer(new Customer());

            ArrayList<Invoice> invoices = new ArrayList<>();
            invoices.add(invoice);

            return invoices;
        }
    }
}
