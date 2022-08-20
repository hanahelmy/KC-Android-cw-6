package com.example.people;

public class Cat {
    private String catname;
    private double catweight;
    private int catage;

    public String getCatname() {
        return catname;
    }

    public void setCatname(String catname) {
        this.catname = catname;
    }

    public double getCatweight() {
        return catweight;
    }

    public void setCatweight(double catweight) {
        this.catweight = catweight;
    }

    public int getCatage() {
        return catage;
    }

    public void setCatage(int catage) {
        this.catage = catage;
    }

    public int getCatimg() {
        return catimg;
    }

    public void setCatimg(int catimg) {
        this.catimg = catimg;
    }

    private int catimg;

    public Cat(String catname, double catweight, int catage, int catimg) {
        this.catname = catname;
        this.catweight = catweight;
        this.catage = catage;
        this.catimg = catimg;
    }
}
