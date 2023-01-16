package com.uniyaz.objectOriented2;

import com.uniyaz.objectOriented2.airtrasnporters.Helicopter;
import com.uniyaz.objectOriented2.airtrasnporters.Plane;
import com.uniyaz.objectOriented2.airtrasnporters.Uav;

public class ObjectOrientedMain {

    public static void main(String[] args) {
        AirTransporter airTransporter = new Plane(70, 50, 80);

        AirTransporter airTransporte2 = new Uav();
        Plane plane1 = new Plane(50, 70, 90);

        Plane plane2 = new Plane(50);

/*
        // System.out.println(airTransporter.toString());
 //       System.out.println(airTransporte2);
        // return fonksiyonu sout içinde yazılabilir
        System.out.println(plane1.stringJustWingLength());
        System.out.println(plane1.toString());

        // void fonksiyon sout içinde yazılamaz
        plane1.fly();

        System.out.println(plane2.stringJustWingLength());
        System.out.println(plane2.toString());*/
        plane1.fly();


        AirTransporter airTransporter1 = new Plane(25, 45, 55);
        System.out.println(airTransporter1.toString());
    }
}
