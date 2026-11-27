package com.example.oop2project.model;

public abstract class User {
    public User(String pUsername, String pPassword) {
        setUsername(pUsername);
        setPassword(pPassword);
    }

    protected String aEmailAddress;
    protected String aPassword;

    public String getUsername() {
        return this.aEmailAddress;
    }
    public String getPassword() {
        return this.aPassword;
    }
    protected void setPassword(String pPassword) {
        if (pPassword == null || pPassword.isBlank()) {
            throw new IllegalArgumentException("Password cannot be null or empty.");
        }
        this.aPassword = pPassword;
    }

    protected void setUsername(String pEmailAddress) {
        if (pEmailAddress == null || pEmailAddress.isBlank()) {
            throw new IllegalArgumentException("Email Address cannot be null or empty.");
        }
        this.aEmailAddress = pEmailAddress;
    }
}
