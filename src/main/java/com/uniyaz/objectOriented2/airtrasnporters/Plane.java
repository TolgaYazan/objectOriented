package com.uniyaz.objectOriented2.airtrasnporters;

import com.uniyaz.objectOriented2.AirTransporter;

public class Plane extends AirTransporter {

    private int wingLength;

    public void hareketeder() {

    }



    public Plane(int wingLength) {
        this.wingLength = wingLength;
    }

    // constrcutred with upper class
    public Plane(int takeOffWeight, int maximumTakeOffWeight, int wingLength) {
        super(takeOffWeight, maximumTakeOffWeight);
        this.wingLength = wingLength;
    }

    public int getWingLength() {
        return wingLength;
    }

    public void setWingLength(int wingLength) {
        this.wingLength = wingLength;
    }

    @Override
    public String toString() {
        return super.toString() +"Plane{" +
                "wingLength=" + wingLength +"}";


    }

    public String stringJustWingLength() {
        return "Plane{" +
                "wingLength=" + wingLength +
                '}';
    }
    public void fly() {
        System.out.println("Plane can fly");
    }

    // rangefleet taken
}
