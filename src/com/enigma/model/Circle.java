package com.enigma.model;

public class Circle {
    public  Integer r;
    private final Double pi=3.14;

    public Double getSurface(){
        Double surface = pi*r*r;
        return surface;
    }
    public Double getRound(){
        return pi*r*2;
    }
    public Double getHalfSurface(){
        return getSurface()/2;
    }
    public Double getHalfRound(){
        return getRound()/2;
    }
    public String print() {
        return "Circle{" +
                "r=" + r +
                ", pi=" + pi +
                '}';
    }
}
