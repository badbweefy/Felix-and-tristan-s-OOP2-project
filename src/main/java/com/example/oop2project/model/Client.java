package com.example.oop2project.model;

public class Client {
    private String aName;
    private int aClientId;

    public Client(String pName, int pClientId) {
        setName(pName);
        setClientId(pClientId);
    }

    public void setName(String pName) {
        if (pName == null) {
            throw new IllegalArgumentException("Name cannot be null");
        }
        this.aName = pName;
    }

    public void setClientId(int pClientId) {
        if (pClientId < 0) {
            throw new IllegalArgumentException("client id cannot be negative!");
        }
        this.aClientId = pClientId;
    }

    public String getName() {
        return aName;
    }

    public int getClientId() {
        return aClientId;
    }
}
