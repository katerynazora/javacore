package com.zora.runners.lesson4;

import com.zora.app.classwork.lesson4.Car;

/**
 * Created by Катерина on 17.03.2017.
 */
public class CarRunner {
    public static void main(String[] args) {
        Car lexus = new Car();
        lexus.name = "h300";
        Car toyota = new Car();
        toyota.name = "corolla";
        System.out.println(lexus.name + " " + Car.wheelCounter);
        System.out.println(toyota.name + " " + Car.wheelCounter);
        Car.wheelCounter = 5; //
        System.out.println(Car.wheelCounter);
        Car.drive(); // method
        System.out.println(lexus.name + " " + Car.dorCounter);
        System.out.println(toyota.name + " " + Car.dorCounter);
        Car.open();
        System.out.println(lexus.name + " cardan shaft " + Car.cardanShaft);
        System.out.println(toyota.name + " cardan shaft " + Car.cardanShaft);
    }
}
