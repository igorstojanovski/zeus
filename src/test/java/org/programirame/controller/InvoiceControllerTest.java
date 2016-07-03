package org.programirame.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.programirame.ZeusApplication;
import org.programirame.controllers.InvoiceController;
import org.programirame.models.Invoice;
import org.programirame.services.InvoiceService;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.anyListOf;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = ZeusApplication.class)
public class InvoiceControllerTest {

    @Mock
    private InvoiceService invoiceService;

    @InjectMocks
    private InvoiceController invoiceController;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
        when(invoiceService.getAllClientInvoices(anyInt())).thenReturn(anyListOf(Invoice.class));
    }

    @Test
    public void getAllClientInvoicesTest() {
        invoiceController.getAllClientInvoices((long) 1);
        verify(invoiceService).getAllClientInvoices((long) 1);
    }

}
