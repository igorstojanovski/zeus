package org.programirame.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.programirame.ZeusApplication;
import org.programirame.controllers.ClientController;
import org.programirame.models.client.Client;
import org.programirame.services.ClientService;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = ZeusApplication.class)
public class ClientControllerTest {

    @Mock
    ClientService clientService;

    @InjectMocks
    ClientController clientController;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);

        when(clientService.getAllClients()).thenReturn(new ArrayList<>());

    }

    @Test
    public void getAllClientsTest() {
        ResponseEntity<List<Client>> clients = clientController.getAllClients();
        verify(clientService).getAllClients();
        assertNotNull(clients);
        assertEquals(clients.getStatusCode(), HttpStatus.OK);
    }
}
