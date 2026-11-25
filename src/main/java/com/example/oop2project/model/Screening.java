package com.example.oop2project.model;

import java.time.LocalDateTime;

public class Screening {

    // could have type be Integer
//    private Integer aScreeningId;
//    private Integer aRoomId;
//    private Integer aMovieId;
    private int aScreeningId;
    private int aRoomId;
    private int aMovieId;
    private LocalDateTime aDateTime;

    public Screening(int pScreeningId, int pRoomId, int pMovieId) {
        setScreeningId(pScreeningId);
        setRoomID(pRoomId);
        setMovieID(pMovieId);
    }

    public void setScreeningId(int pScreeningID) {
        if (pScreeningID < 0) {
            throw new IllegalArgumentException("Screening id cannot be negative");
        }
        this.aScreeningId = pScreeningID;
    }

    public void setRoomID(int pRoomID) {
        if (pRoomID < 0) {
            throw new IllegalArgumentException("room id cannot be negative");
        }
        this.aRoomId = pRoomID;
    }
    public void setMovieID(int pMovieID) {
        if (pMovieID < 0) {
            throw new IllegalArgumentException("movie id cannot be negative");
        }
        this.aMovieId = pMovieID;
    }

    public void setDateTime(LocalDateTime pDateTime) {
        if (pDateTime == null) {
            throw new IllegalArgumentException("DateTime cannot be negative");
        }
        this.aDateTime = pDateTime;
    }

    public int getScreeningId() {
        return aScreeningId;
    }

    public int getRoomId() {
        return aRoomId;
    }

    public int getMovieId() {
        return aMovieId;
    }

    public LocalDateTime getDateTime() {
        return aDateTime;
    }
}
