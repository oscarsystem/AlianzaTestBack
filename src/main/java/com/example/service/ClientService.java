package com.example.service;

import java.util.List;

import com.example.entity.Client;

public interface ClientService {

	Client addClient(Client client) throws Exception;
	
	List<Client> listClient() throws Exception;
	
	String createSharedKey(String email) throws Exception; 
	
	List<Client> findClientBySharedKey(String sharedKey) throws Exception;
	
	
}
