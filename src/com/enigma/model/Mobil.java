package com.enigma.model;

import java.util.Arrays;

public class Mobil {
    private Integer postX;
    private Integer postY;
    private Integer fuel=0;
    char [] comands;
    //konstanta
    private final String kanan="R";
    private final String kiri= "L";
    private final String maju ="F";
    private final String mundur ="B";



    public Mobil(Integer x, Integer y){
        this.postX =x;
        this.postY = y;
    }
    public void fillFuel(int fuel){
        this.fuel = this.fuel+fuel;
    }

    public void move(String karakter) {

//        for ( int i = 0; i< moven.length(); i++) {
//            char karakter = moven.toUpperCase().charAt(i);
            if (karakter.equals(kanan)) {
                this.postX++;
            } else if (karakter.equals(kiri)) {
                this.postX--;
            } else if (karakter.equals(maju)) {
                this.postY++;
            } else if (karakter.equals(mundur)) {
                this.postY--;
            }
//            return ("k");
    }

    public void comands(String x){

            this.comands = x.toCharArray();
    }

    public void run(){
        for (int i=0; i < this.comands.length; i++) {
            if (fuel == 0) {
                System.out.println("Bensin sudah Habis");
                break;
            }
//
            move(String.valueOf(this.comands[i]));
            System.out.println(this.comands[i] + getPosition());
            if ((i + 1) % 3 == 0) {
                fuel--;
            }
        }
    }

    public String getPosition(){
        return ("("+this.postX+","+this.postY+")");
    }

    public String print() {
        return "Mobil{" +
                "postX=" + postX +
                ", postY=" + postY +
                ", fuel=" + fuel +
                ", comands=" + Arrays.toString(comands) +
                '}';
    }
}