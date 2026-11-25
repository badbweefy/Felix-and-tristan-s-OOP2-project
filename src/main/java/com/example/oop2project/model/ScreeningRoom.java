package com.example.oop2project.model;

public class ScreeningRoom {
    private int aRoomID;
    private String aRoomName;
    private int aRoomCapacity;

    public ScreeningRoom(int pRoomID, int pCapacity, String pRoomName) {
        setRoomID(pRoomID);
        setCapacity(pCapacity);
        setRoomName(pRoomName);
    }
    public int getRoomID() {
        return aRoomID;
    }
    public void setRoomID(int pRoomID) {
        this.aRoomID = pRoomID;
    }
    public String getRoomName() {
        return aRoomName;
    }
    public void setRoomName(String pRoomName) {
        this.aRoomName = pRoomName;
    }
    public int getCapacity() {
        return aRoomCapacity;
    }
    public void setCapacity(int pCapacity) {
        this.aRoomCapacity = pCapacity;
    }
}
