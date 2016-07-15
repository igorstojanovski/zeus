package org.programirame.controllers;

import org.programirame.models.Invoice;
import org.programirame.models.filters.invoice.FindInvoiceByMinMaxDate;
import org.programirame.services.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/invoices")
public class InvoiceController {

    private InvoiceService invoiceService;

    @Autowired
    public InvoiceController(InvoiceService invoiceService) {
        this.invoiceService = invoiceService;
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Invoice> insertInvoices(@RequestBody Invoice invoice) {
        Invoice insertedInvoice = invoiceService.createInvoice(invoice);

        return new ResponseEntity<>(insertedInvoice, HttpStatus.OK);
    }

    @RequestMapping(path = "searchByLateDate", method = RequestMethod.POST)
    public ResponseEntity<List<Invoice>> getInvoicesByLateDate(@RequestBody FindInvoiceByMinMaxDate filter) {

        List<Invoice> invoices = invoiceService.getInvoicesByNumberOfDaysLate(filter.getMinDays(), filter.getMaxDays());

        return new ResponseEntity<>(invoices, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Invoice>> getAllClientInvoices(@RequestParam(name = "clientId") long clientId) {
        List<Invoice> invoices = invoiceService.getAllClientInvoices(clientId);

        return new ResponseEntity<>(invoices, HttpStatus.OK);
    }
}
