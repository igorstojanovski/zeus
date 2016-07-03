package org.programirame.controllers;

import org.programirame.models.Invoice;

import java.util.List;

interface LateInvoiceRetriever {

    List<Invoice> getLateInvoices(List<Integer> clientIds);

}
