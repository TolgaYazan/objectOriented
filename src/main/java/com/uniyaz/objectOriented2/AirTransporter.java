package com.uniyaz.objectOriented2;

public abstract class AirTransporter extends Transporter{



    private  int takeOffWeight;
    private  int maximumTakeOffWeight;


    public AirTransporter() {


    }

    public AirTransporter(int takeOffWeight, int maximumTakeOffWeight) {
        this.takeOffWeight = takeOffWeight;
        this.maximumTakeOffWeight = maximumTakeOffWeight;
    }

    public int getTakeOffWeight() {
        return takeOffWeight;
    }

    public void setTakeOffWeight(int takeOffWeight) {
        this.takeOffWeight = takeOffWeight;
    }
    public int getMaximumTakeOffWeight() {
        return maximumTakeOffWeight;
    }

    public void setMaximumTakeOffWeight(int maximumTakeOffWeight) {
        this.maximumTakeOffWeight = maximumTakeOffWeight;
    }

    // range value setted default
    public int rangeFleet() {

        return this.takeOffWeight=5000;

    }

    @Override
    public String toString() {
        return "AirTransporter{" +
                "takeOffWeight=" + takeOffWeight +
                ", maximumTakeOffWeight=" + maximumTakeOffWeight +
                '}';
    }

}
