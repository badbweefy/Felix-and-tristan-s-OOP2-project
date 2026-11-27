package com.example.oop2project.model;

/**
 *
 * Abstract class implemented by both clients and managers, holds their shared
 * trait of having an email and password
 *
 * @author Felix Leblanc Roy
 */
public abstract class User {

    /**
     *
     *Constructor for User
     *
     * @param pEmailAddress used to set the email through the setEmailAddress method
     * @param pPassword used to set the password through the setPassword method
     */
    public User(String pEmailAddress, String pPassword) {
        setEmailAddress(pEmailAddress);
        setPassword(pPassword);
    }

    protected String aEmailAddress;
    protected String aPassword;

    /**
     *
     * @return returns the user's email
     */
    public String getEmailAddress() {
        return this.aEmailAddress;
    }

    /**
     *
     * @return returns the user's password
     */
    public String getPassword() {
        return this.aPassword;
    }

    /**
     *
     * @param pPassword checked if it's null or blank, if not is used to set the user's password
     * @author Felix Malboeuf
     * @author Felix Leblanc Roy
     */
    protected void setPassword(String pPassword) {
        if (pPassword == null || pPassword.isBlank()) {
            throw new IllegalArgumentException("Password cannot be null or empty.");
        }
        this.aPassword = pPassword;
    }

    /**
     *
     * @param pEmailAddress checked if it's null or blank, if not then sets the user's email
     * @author Felix Malboeuf
     * @author Felix Leblanc Roy
     */
    protected void setEmailAddress(String pEmailAddress) {
        if (pEmailAddress == null || pEmailAddress.isBlank()) {
            throw new IllegalArgumentException("Email Address cannot be null or empty.");
        }
        this.aEmailAddress = pEmailAddress;
    }
}
