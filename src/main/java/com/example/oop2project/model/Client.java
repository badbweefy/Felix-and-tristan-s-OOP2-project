package com.example.oop2project.model;

/**
 * @author Felix Malboeuf
 */
public class Client {
    private String aName;
    private String aEmailAddress;
    private int aClientId;
    private String aPassword;

    /**
     * constructor for the Client
     * @param pName used to set the name of the instance via setname method
     * @param pClientId used to set the client id through the setclientid method
     * @param pPassword used to set the password through the setpassword method
     * @param pEmailAddress used to set the emailaddress through the setEmailaddress method
     */
    public Client(String pName, int pClientId, String pPassword, String pEmailAddress) {
        setName(pName);
        setClientId(pClientId);
        setPassword(pPassword);
        setEmailAddress(pEmailAddress);
    }

    /**
     *
     * @param pName checks if null, if not string used to set the name of the instance
     */
    public void setName(String pName) {
        if (pName == null) {
            throw new IllegalArgumentException("Name cannot be null");
        }
        this.aName = pName;
    }

    /**
     *
     * @param pClientId checks if its higher than 0 (could add method later to check if it exists) else sets the client id
     */
    public void setClientId(int pClientId) {
        if (pClientId < 0) {
            throw new IllegalArgumentException("client id cannot be negative!");
        }
        this.aClientId = pClientId;
    }

    /**
     *
     * @param pPassword checks if the password is null if not sets the password
     */
    public void setPassword(String pPassword) {
        // later ask what the password would need to be valid
        if (pPassword == null) {
            throw new IllegalArgumentException("password cannot be empty");
        }
        this.aPassword = pPassword;
    }

    /**
     *
     * @param pEmailAddress checks if the email is null if not sets the email of the instance
     */
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
