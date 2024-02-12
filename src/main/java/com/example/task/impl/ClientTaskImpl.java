package com.example.task.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.entity.Client;
import com.example.service.ClientService;
import com.example.task.ClientTask;

@Service
public class ClientTaskImpl implements ClientTask {

	@Autowired
	ClientService clientService;
	
	@Override
	public ResponseEntity<Client> addClient(Client client) throws Exception {
		
		try {
			Client clientSaved = clientService.addClient(client);
			return new ResponseEntity<>(clientSaved, HttpStatus.CREATED);
		}catch (Exception e) {
			return new ResponseEntity<>(client, HttpStatus.BAD_REQUEST);
		}
	}

	@Override
	public ResponseEntity<List<Client>> listClient() throws Exception {
		try {
			List<Client> listClients = clientService.listClient();
			return new ResponseEntity<>(listClients, HttpStatus.OK);
		}catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		}
	}

	@Override
	public ResponseEntity<List<Client>> findClientBySharedKey(String sharedKey) throws Exception {
		try {
			List<Client> listClients = clientService.findClientBySharedKey(sharedKey);
			return new ResponseEntity<>(listClients, HttpStatus.OK);
		}catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		}
	}

}
