package com.example.repository;

import java.time.LocalDate;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jdbc.EmbeddedDatabaseConnection;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.example.entity.Client;

@DataJpaTest
@AutoConfigureTestDatabase(connection = EmbeddedDatabaseConnection.H2)
public class ClientRepositoryTest {

	@Autowired
	private ClientRepository clientRepository;
	
	private Client client;
	
	@BeforeEach	
	public void init() {
		client = new Client();
		client.setSharedKey("prueba");
		client.setNames("Prueba");
		client.setPhone("3225");
		client.setEmail("prueba@gm.com");
		client.setDateAdd(LocalDate.now());			
	}
	
	@Test
	public void clientRepository_Save_All_ReturnSaveEmpleado() {		
		Client saveClient = clientRepository.save(client);		
		Assertions.assertThat(saveClient).isNotNull();		
	}
	
}
