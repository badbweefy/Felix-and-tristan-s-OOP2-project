package com.example.oop2project.model;

public abstract class User {
    private String aUsername;
    private String aPassword;

    public String getUsername() {
        return aUsername;
    }
    private void setUsername(String pUsername) {
        this.aUsername = pUsername;
    }
    public String getPassword() {
        return aPassword;
    }
    private void setPassword(String pPassword) {
        this.aPassword = pPassword;
    }
}
