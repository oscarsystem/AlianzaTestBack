package com.example.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Client;
import com.example.repository.ClientRepository;
import com.example.service.ClientService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class ClientServiceImpl implements ClientService {

	@Autowired
	ClientRepository clientRepository;
	
	@Override
	public Client addClient(Client client) throws Exception {
		try {
			log.info("Added client");
			String sharedKey = createSharedKey(client.getEmail());
			client.setSharedKey(sharedKey);
			return clientRepository.save(client);
		}catch (Exception e) {
			log.error("Error add client");
			throw new Exception();
		}
	}

	@Override
	public List<Client> listClient() throws Exception {
		try {
			return clientRepository.findAll();
		}catch (Exception e) {
			log.error("Error listClient");
			throw new Exception();
		}
	}

	@Override
	public String createSharedKey(String email) throws Exception {
		try {
			log.info("createSharedKey");
			String[] parts = email.split("@");
			String sharedKey = parts[0];
			return sharedKey;
		}catch (Exception e) {
			log.error("Error create SharedKey");
			throw new Exception();
		}
	}

	@Override
	public List<Client> findClientBySharedKey(String sharedKey) throws Exception {
		try {
			log.info("Find client by sharedKey");
			return clientRepository.findBySharedKey(sharedKey);
		}catch (Exception e) {
			log.error("Error add client");
			throw new Exception();
		}
	}

	
	
}
