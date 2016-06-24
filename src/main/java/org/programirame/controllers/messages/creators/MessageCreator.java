package org.programirame.controllers.messages.creators;

import org.programirame.controllers.messages.Message;
import org.programirame.models.Invoice;

import java.util.List;


public interface MessageCreator {

    List<Message> createMessages(List<Invoice> invoices);

}
