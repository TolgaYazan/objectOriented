package com.uniyaz.objectOriented2.airtrasnporters;

import com.uniyaz.objectOriented2.AirTransporter;

public class Uav extends AirTransporter {

    public Uav(int takeOffWeight, int maximumTakeOffWeight) {
        super(takeOffWeight, maximumTakeOffWeight);
    }

    public void hareketeder() {

    }

    public Uav() {
    }

    public  void flyWithoutPerson(){
        System.out.println("I can fly withouyt a person");
    }

    //rangefleet overrided
}
