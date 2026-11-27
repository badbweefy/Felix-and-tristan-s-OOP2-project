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
        if (pTicketID <= 0){
            throw new IllegalArgumentException("Screening ID must be a positive number");
        }
        this.aTicketID = pTicketID;
    }
    public void setScreeningID(int pScreeningID) {
        if (pScreeningID <= 0){
            throw new IllegalArgumentException("Screening ID must bee a positive number");
        }
        this.aScreeningID = pScreeningID;
    }

    public void setCost(double pCost){
        if (Double.isNaN(pCost) || Double.isInfinite(pCost)){
            throw new IllegalArgumentException("Cost must be a valid number");
        } else if (pCost <= 0) {
            throw new IllegalArgumentException("Cost can't be a negative");
        }
        this.aCost = pCost;
    }

}
