package org.programirame.services.data;

import org.programirame.controllers.DataRetrieverStrategy;
import org.programirame.models.Invoice;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataRetriever {
    public List<Invoice> getSubjectInvoices(String notificationType, List<Integer> clientIds) {

        DataRetrieverStrategy dataRetrieverStrategy = DataRetrieverStrategy.valueOf(notificationType);

        return dataRetrieverStrategy.getLateInvoices(clientIds);
    }
}
