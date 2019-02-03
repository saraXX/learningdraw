package com.example.android.learndraw;

import java.util.ArrayList;

public class ArtAlbum {
    private int cover;
    private String tital;
    private int stepsNumber;
    ArrayList<Integer> imgsrc;

    public ArtAlbum(ArrayList<Integer> imgsrc, String tital, int stepsNumber, int cover) {
        this.imgsrc = imgsrc;
        this.tital = tital;
        this.stepsNumber = stepsNumber;
        this.cover = cover;
        }

    public ArtAlbum() {

    }

    public ArrayList<Integer> getImgsrc() {
        return imgsrc;
    }

    public void setImgsrc(ArrayList<Integer> imgsrc)
    {
        this.imgsrc =imgsrc;
    }

    public String getTital() {
        return tital;
    }

    public void setTital(String tital) {
        this.tital = tital;
    }

    public int getStepsNumber() {
        return stepsNumber;
    }

    public void setStepsNumber(int stepsNumber) {
        this.stepsNumber = stepsNumber;
    }

    public int getCover() {
        return cover;
    }

    public void setCover(int cover) {
        this.cover = cover;
    }
}
