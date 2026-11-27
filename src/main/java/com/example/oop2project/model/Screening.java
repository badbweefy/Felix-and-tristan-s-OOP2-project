package com.example.oop2project.model;

import java.time.LocalDateTime;

/**
 * @author Felix Malbooeuf
 */
public class Screening {
// initializing them to have 0 for now, might need to change later just trying things out
    private int aScreeningId = 0 ;
    private int aRoomId;
    private int aMovieId;
    private LocalDateTime aDateTime;

    /**
     * constructor for the Screening
     *
     * @param pScreeningId to set the ScreeningId for the created Screening
     * @param pRoomId needed For the method of setting the room id.
     * @param pMovieId needed for the method of setting the movieId
     */
    public Screening(int pScreeningId, int pRoomId, int pMovieId) {
        setScreeningId(pScreeningId);
        setRoomID(pRoomId);
        setMovieID(pMovieId);
    }

    /**
     *
     * @param pScreeningID checks if it is more than 0 if so set aScreeningId to pScreeningId
     */
    public void setScreeningId(int pScreeningID) {
        // later could change to ask if the screening id already exists
        if (pScreeningID < 0) {
            throw new IllegalArgumentException("Screening id cannot be negative");
        }
        this.aScreeningId = pScreeningID;
    }

    /**
     *
     * @param pRoomID checks if it is larger than 0 if so sets aRoomId to pRoomId
     */
    public void setRoomID(int pRoomID) {
        if (pRoomID < 0) {
            throw new IllegalArgumentException("room id cannot be negative");
        }
        this.aRoomId = pRoomID;
    }

    /**
     * sets the movie id for the instance
     * @param pMovieID checks if movie id is larger than 0 if so set aMovieId same as pMovieId
     */
    public void setMovieID(int pMovieID) {
        if (pMovieID < 0) {
            throw new IllegalArgumentException("movie id cannot be negative");
        }
        this.aMovieId = pMovieID;
    }

    /**
     *
     * @param pDateTime checks if it is null if not set aDateTime to pDateTime
     */
    public void setDateTime(LocalDateTime pDateTime) {
        if (pDateTime == null) {
            throw new IllegalArgumentException("DateTime cannot be negative");
        }
        this.aDateTime = pDateTime;
    }

    /**
     *
     * @return ScreeningId
     */
    public int getScreeningId() {
        return aScreeningId;
    }

    /**
     *
     * @return RoomId
     */
    public int getRoomId() {
        return aRoomId;
    }

    /**
     *
     * @return movie id
     */
    public int getMovieId() {
        return aMovieId;
    }

    /**
     *
     * @return the dateTime
     */
    public LocalDateTime getDateTime() {
        return aDateTime;
    }
}
