package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Client;
import com.example.task.ClientTask;

@CrossOrigin("*")
@RestController
@RequestMapping("/api")
public class ClienteController {
	
	@Autowired
	private ClientTask clientTask;
	
	@PostMapping(value = "client/add", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Client> addCliente(@RequestBody Client client) throws Exception {
		return clientTask.addClient(client);
	}
	
	@GetMapping(value = "client/list")
	public ResponseEntity<List<Client>> listClient () throws Exception{
		return clientTask.listClient();
	}
	
	@GetMapping(value = "client/findBySharedKey/{sharedKey}")
	public ResponseEntity<List<Client>> findClientBySharedKey (@PathVariable(value = "sharedKey") String sharedKey) throws Exception{
		return clientTask.findClientBySharedKey(sharedKey);
	}
	
}
