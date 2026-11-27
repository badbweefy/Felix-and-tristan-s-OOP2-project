package com.example.oop2project.model;

/**
 * @author Felix Malboeuf
 */
public class Client extends User{
    private String aName;
    private int aClientId;

    /**
     * constructor for the Client
     * @param pName used to set the name of the instance via setName method
     * @param pClientId used to set the client id through the setClientID method
     * @param pPassword used to set the password through super()
     * @param pEmailAddress used to set the email address through super()
     */    
    public Client(String pName, int pClientId, String pEmailAddress, String pPassword) {
        super(pEmailAddress, pPassword);
        setName(pName);
        setClientId(pClientId);
    }
    
    /**
     *
     * @param pName checks if null or blank, if not string used to set the name of the instance
     */
    public void setName(String pName) {
        if (pName == null || pName.isBlank()) {
            throw new IllegalArgumentException("Name cannot be null or empty.");
        }
        this.aName = pName;
    }

    /**
     *
     * @param pClientId checks if it's higher than 0 (could add method later to check if it exists) else sets the client id
     */
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
