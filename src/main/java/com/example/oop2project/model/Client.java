package com.example.oop2project.model;

public class Client extends User {
    private String aName;
    private String aEmailAddress;
    private int aClientId;
    private String aPassword;


    public Client(String pName, int pClientId, String pPassword, String pEmailAddress) {
        setName(pName);
        setClientId(pClientId);
        setPassword(pPassword);
        setUsername(pEmailAddress);
    }

    public void setName(String pName) {
        if (pName == null) {
            throw new IllegalArgumentException("Name cannot be null");
        }
        this.aName = pName;
    }

    public void setClientId(int pClientId) {
        if (pClientId < 0) {
            throw new IllegalArgumentException("Client ID cannot be negative!");
        }
        this.aClientId = pClientId;
    }

    protected void setPassword(String pPassword) {
        if (pPassword == null) {
            throw new IllegalArgumentException("Password cannot be empty.");
        }
        this.aPassword = pPassword;
    }

    protected void setUsername(String pEmailAddress) {
        if (pEmailAddress == null) {
            throw new IllegalArgumentException("Email Address cannot be null.");
        }
        this.aEmailAddress = pEmailAddress;
    }

    public String getName() {
        return this.aName;
    }

    public int getClientId() {
        return this.aClientId;
    }

    public String getPassword() { return this.aPassword;}
    
    public String getUsername() { return this.aEmailAddress;}
}
