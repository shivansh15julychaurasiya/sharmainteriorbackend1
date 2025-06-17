package com.vijay.entity;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class InteriorLead {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String email;

    private String phone;

    private String propertyName;

    @Embedded
    private BhkDetails bhkDetails;

    // Constructors
    public InteriorLead() {}

    public InteriorLead(String name, String email, String phone, String propertyName, BhkDetails bhkDetails) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.propertyName = propertyName;
        this.bhkDetails = bhkDetails;
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

	public BhkDetails getBhkDetails() {
		return bhkDetails;
	}

	public void setBhkDetails(BhkDetails bhkDetails) {
		this.bhkDetails = bhkDetails;
	}

	@Override
	public String toString() {
		return "InteriorLead [id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone + ", propertyName="
				+ propertyName + "]";
	}

}