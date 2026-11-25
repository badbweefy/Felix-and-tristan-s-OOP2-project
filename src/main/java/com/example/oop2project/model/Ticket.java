package com.example.oop2project.model;

public class Ticket {
    private int aTicketID;
    private double aCost;
    private int aScreeningID;

    public Ticket(int pTicketID,double pCost, int pScreeningID){
        setTicketID(pTicketID);
        setScreeningID(pScreeningID);
        setCost(pCost);
    }

    public int getTicketID(){
        return this.aTicketID;
    }

    public int getScreeningID(){
        return aScreeningID;
    }

    public double getCost(){
        return this.aCost;
    }

    public void setTicketID(int pTicketID){
        this.aTicketID = pTicketID;
    }
    public void setScreeningID(int pScreeningID) {
        this.aScreeningID = pScreeningID;
    }

    public void setCost(double pCost){
        this.aCost = pCost;
    }
}
