package com.uniyaz.objectOriented2.airtrasnporters;

import com.uniyaz.objectOriented2.AirTransporter;

public class Helicopter extends AirTransporter {



    public Helicopter(int takeOffWeight, int maximumTakeOffWeight) {
        super(takeOffWeight, maximumTakeOffWeight);
    }

    public void hareketeder() {

    }
    public int rangeFleet() {

        setTakeOffWeight(8000);
        return  getTakeOffWeight();

    }


}
