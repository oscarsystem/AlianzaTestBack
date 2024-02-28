package com.example.entity;

import java.time.LocalDate;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "Cliente")
public class Client {
	
	@Id
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name="system-uuid", strategy = "uuid")
	@Column(name = "ID_EMPLEADO", nullable = false)
	private String id;
	
	@Column(name = "SHARED_KEY", nullable = false)
	private String sharedKey;

	@Column(name = "NAMES", nullable = false)
	private String names;
	
	@Column(name = "EMAIL", nullable = false)
	private String email;
	
	@Column(name = "PHONE", nullable = false)
	private String phone;
	
	@Column(name = "DATE_ADD", nullable = false)
	private LocalDate dateAdd;
	
	@Column(name = "DATE_END", nullable = true)
	private LocalDate dateEnd;
		
}
