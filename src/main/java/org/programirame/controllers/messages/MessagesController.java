package org.programirame.controllers.messages;

import org.programirame.controllers.messages.creators.MessageCreator;
import org.programirame.controllers.messages.creators.MessageCreatorStrategy;
import org.programirame.models.Invoice;
import org.programirame.services.data.DataRetriever;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/messages")
public class MessagesController {

    @Autowired
    private DataRetriever dataRetriever;

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<List<Message>> getMesages(@RequestParam(value = "notification") String notificationType,
                                                    @RequestParam(value = "message") String messageType,
                                                    @RequestBody List<Integer> clientIds) {
        System.out.println("Request Received");
        List<Invoice> invoices = dataRetriever.getSubjectInvoices(notificationType, clientIds);
        MessageCreator messageCreator = MessageCreatorStrategy.valueOf(messageType).getMessageCreator();

        List<Message> messages = messageCreator.createMessages(invoices);
        return new ResponseEntity<>(messages, HttpStatus.OK);
    }

}
