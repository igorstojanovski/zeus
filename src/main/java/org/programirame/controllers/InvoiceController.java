package org.programirame.controllers;

import org.programirame.models.Invoice;
import org.programirame.repository.InvoiceRepository;
import org.programirame.services.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/invoices")
public class InvoiceController {

    @Autowired
    InvoiceService invoiceService;

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Invoice> insertInvoices(@RequestBody Invoice invoice) {
        Invoice insertedInvoice = invoiceService.createInvoice(invoice);

        return new ResponseEntity<>(insertedInvoice, HttpStatus.OK);
    }

}