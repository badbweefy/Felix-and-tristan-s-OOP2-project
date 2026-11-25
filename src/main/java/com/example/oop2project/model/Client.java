package com.example.oop2project.model;

public class Client {
    private String aName;
    private String aEmailAddress;
    private int aClientId;
    private String aPassword;

    public Client(String pName, int pClientId, String pPassword, String pEmailAddress) {
        setName(pName);
        setClientId(pClientId);
        setPassword(pPassword);
        setEmailAddress(pEmailAddress);
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

    public void setPassword(String pPassword) {
        if (pPassword == null) {
            throw new IllegalArgumentException("password cannot be empty");
        }
        this.aPassword = pPassword;
    }

    public void setEmailAddress(String pEmailAddress) {
        if (pEmailAddress == null) {
            throw new IllegalArgumentException("Email Addresss cannot be null");
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
    
    public String getEmailAddress() { return this.aEmailAddress;}
}
