package org.programirame.controllers.messages.creators;

import org.programirame.controllers.messages.Message;
import org.programirame.models.Invoice;

import java.util.List;

/**
 * Created by igorce on 23.06.16..
 */
public class EmailMessageCreator implements MessageCreator {
    @Override
    public List<Message> createMessages(List<Invoice> invoices) {
        return null;
    }
}
