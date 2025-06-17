package com.vijay.dto;

import java.util.List;

public class QuoteRequest {
	
    private BhkDetails bhkDetails;
    private List<Room> rooms;
    private String name;
    private String email;
    private String phone;
    private String propertyName;
    private String pkg; // "package" is reserved in Java
    private boolean whatsappUpdates;

    // Getters and Setters
    public BhkDetails getBhkDetails() {
        return bhkDetails;
    }

    public void setBhkDetails(BhkDetails bhkDetails) {
        this.bhkDetails = bhkDetails;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
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

    public String getPkg() {
        return pkg;
    }

    public void setPkg(String pkg) {
        this.pkg = pkg;
    }

    public boolean isWhatsappUpdates() {
        return whatsappUpdates;
    }

    public void setWhatsappUpdates(boolean whatsappUpdates) {
        this.whatsappUpdates = whatsappUpdates;
    }
}