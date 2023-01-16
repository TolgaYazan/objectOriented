package com.uniyaz.objectoriented3;

import com.uniyaz.objectoriented3.householdappliance.Freezer;
import com.uniyaz.objectoriented3.householdappliance.Fridge;
import com.uniyaz.objectoriented3.smartdevice.Computer;
import com.uniyaz.objectoriented3.smartdevice.Phone;
import com.uniyaz.objectoriented3.smartdevice.Tablet;

public class OriendtedMain {

    public static void main(String[] args) {

        SmartDevices smartDevices[] = {new Phone(),new Tablet(),new Computer()};

/*
        for(int i = 0 ; i<smartDevices.length;i++){
            smartDevices[i].hasAudioOutput();
        }
        */
        Electronic electronic[] = {new Freezer(),new Fridge(),new Computer()};
        for(int i = 0 ; i<smartDevices.length;i++){
            electronic[i].consumedElectricPower();
        }


    }
}
