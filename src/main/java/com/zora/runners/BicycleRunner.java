package com.zora.runners;

import com.zora.app.classwork.lesson11.Bicycle;

/**
 * Created by Kateryna Zora  on 21.04.2017.
 */
public class BicycleRunner {
    public static void main(String[] args) {
        String color = "red";
        String wheelSize = "15";
        //int speed = 100;
        //int prise = 2000;

        Bicycle bicycle = new Bicycle(color, 10); // Ctrl + Right click // Ctrl + P - подсказ сколько принемает методов
        Bicycle bicycle2 = new Bicycle(color, 10, wheelSize);
        Bicycle bicycle3 = new Bicycle(color, 100, wheelSize, 2000);

        System.out.println(bicycle.color);
        System.out.println("Bicycle 3: " + "Price is " + bicycle3.price + ", speed - " + bicycle3.speed + ", color - " + bicycle3.color + ", wheelSize - " + bicycle3.wheelSize);
        System.out.println("Bicycle 2: " + bicycle2.color +  "wheelSize " + bicycle2.wheelSize);

    }
}
