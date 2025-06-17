package com.vijay.entity;

import jakarta.persistence.Embeddable;

@Embeddable
public class BhkDetails {

    private String bhk;
    private String size;

    public BhkDetails() {}

    public BhkDetails(String bhk, String size) {
        this.bhk = bhk;
        this.size = size;
    }

	public String getBhk() {
		return bhk;
	}

	public void setBhk(String bhk) {
		this.bhk = bhk;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

    
}