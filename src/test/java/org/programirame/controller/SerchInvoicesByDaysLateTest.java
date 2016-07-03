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
import org.programirame.models.filters.invoice.FindInvoiceByMinMaxDate;
import org.programirame.services.InvoiceService;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = ZeusApplication.class)
public class SerchInvoicesByDaysLateTest {

    @Mock
    private InvoiceService invoiceService;

    @InjectMocks
    private InvoiceController invoiceController;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
        when(invoiceService.getInvoicesByNumberOfDaysLate(1.0, 10.0)).thenReturn(new ArrayList<Invoice>());
    }

    @Test
    public void getInvoicesByLateDateTest() {

        FindInvoiceByMinMaxDate findInvoiceByMinMaxDate = new FindInvoiceByMinMaxDate();
        findInvoiceByMinMaxDate.setMinDays(1.0);
        findInvoiceByMinMaxDate.setMaxDays(10.0);

        invoiceController.getInvoicesByLateDate(findInvoiceByMinMaxDate);
        verify(invoiceService).getInvoicesByNumberOfDaysLate(1.0, 10.0);
    }

}
