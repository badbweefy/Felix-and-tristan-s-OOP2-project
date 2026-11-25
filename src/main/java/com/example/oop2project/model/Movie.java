package com.example.oop2project.model;

public class Movie {
    private int aRuntime;
    private String aTitle;
    private int aMovieID;


    public Movie(int pRuntime, String pTitle, int pMovieID){
        setRuntime(pRuntime);
        setTitle(pTitle);
        setMovieID(pMovieID);
    }

    private void setRuntime(int pRuntime){
        this.aRuntime = pRuntime;
    }

    private void setTitle(String pTitle){
        this.aTitle = pTitle;
    }
    private void setMovieID(int pMovieID){
        this.aMovieID = pMovieID;
    }

    public int  getRuntime() {
        return this.aRuntime;
    }
    public String getTitle() {
        return this.aTitle;
    }
    public int getMovieID() {
        return this.aMovieID;
    }
}
