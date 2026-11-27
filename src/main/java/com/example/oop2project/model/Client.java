package com.example.oop2project.model;

public class Client extends User {
    private String aName;
    private int aClientId;


    public Client(String pName, int pClientId, String pEmailAddress, String pPassword) {
        super(pEmailAddress, pPassword);
        setName(pName);
        setClientId(pClientId);
    }

    public void setName(String pName) {
        if (pName == null || pName.isBlank()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        this.aName = pName;
    }

    public void setClientId(int pClientId) {
        if (pClientId < 0) {
            throw new IllegalArgumentException("Client ID cannot be negative!");
        }
        this.aClientId = pClientId;
    }

    public String getName() {
        return this.aName;
    }

    public int getClientId() {
        return this.aClientId;
    }
}
