package com.vijay.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class QuoteRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String email;

    private String phone;

    private String propertyName;

    private boolean whatsappUpdates;

	public QuoteRequest() {
		super();
		// TODO Auto-generated constructor stub
	}

	public QuoteRequest(Long id, String name, String email, String phone, String propertyName,
			boolean whatsappUpdates) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.propertyName = propertyName;
		this.whatsappUpdates = whatsappUpdates;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getPropertyName() {
		return propertyName;
	}

	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}

	public boolean isWhatsappUpdates() {
		return whatsappUpdates;
	}

	public void setWhatsappUpdates(boolean whatsappUpdates) {
		this.whatsappUpdates = whatsappUpdates;
	}
}