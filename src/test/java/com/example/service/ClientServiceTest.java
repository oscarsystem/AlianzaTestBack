package com.example.service;

import static org.mockito.Mockito.when;

import java.time.LocalDate;
import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.example.entity.Client;
import com.example.repository.ClientRepository;
import com.example.service.impl.ClientServiceImpl;


@ExtendWith(MockitoExtension.class)
public class ClientServiceTest {

	@Mock
	private ClientRepository empleadoRepository;
	
	@InjectMocks
	private ClientServiceImpl empleadoService;
	
	private Client client;
	
	@BeforeEach	
	public void init() {
		client = new Client();		
		client.setNames("Prueba");
		client.setPhone("3225");
		client.setEmail("prueba@gm.com");
		client.setDateAdd(LocalDate.now());			
	}
	
	@Test
	public void clientService_CreateClient_Returnclient() throws Exception {
		when(empleadoRepository.save(Mockito.any(Client.class))).thenReturn(client);
		
		Client empleadoSaved = empleadoService.addClient(client);	
		Assertions.assertThat(empleadoSaved).isNotNull();
	}
	
	@Test
	public void empleadoService_GetAllClients_ReturnClients() throws Exception {
		 
		List<Client> empleadoSaved = empleadoService.listClient();		
		Assertions.assertThat(empleadoSaved).isNotNull();		
	}
	
}
