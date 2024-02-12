package com.example.task;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.example.entity.Client;


public interface ClientTask {
	
	ResponseEntity<Client> addClient(Client empleado) throws Exception;
	
	ResponseEntity<List<Client>> listClient() throws Exception;
	
	ResponseEntity<List<Client>> findClientBySharedKey(String sharedKey) throws Exception;
	
}
