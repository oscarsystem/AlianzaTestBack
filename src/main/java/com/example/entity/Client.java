package com.example.entity;

import java.time.LocalDate;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
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

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSharedKey() {
		return sharedKey;
	}

	public void setSharedKey(String sharedKey) {
		this.sharedKey = sharedKey;
	}

	public String getNames() {
		return names;
	}

	public void setNames(String names) {
		this.names = names;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public LocalDate getDateAdd() {
		return dateAdd;
	}

	public void setDateAdd(LocalDate dateAdd) {
		this.dateAdd = dateAdd;
	}
		
}
