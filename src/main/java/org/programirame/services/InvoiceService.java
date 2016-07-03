package org.programirame.services;

import org.programirame.models.Invoice;
import org.programirame.repository.InvoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvoiceService {

    @Autowired
    InvoiceRepository invoiceRepository;

    public Invoice createInvoice(Invoice invoice) {
        return invoiceRepository.save(invoice);
    }

    public List<Invoice> getInvoicesByNumberOfDaysLate(double minDays, double maxDays) {
        return invoiceRepository.findInvoiceByDueDateMinMax(minDays, maxDays);
    }

    public List<Invoice> getAllClientInvoices(long clientId) {
        return invoiceRepository.findInvoiceByClientId(clientId);
    }
}
