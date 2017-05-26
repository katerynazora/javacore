package com.zora.runners;

import com.zora.app.classwork.lesson12.Car;

/**
 * Created by Kateryna Zora  on 28.04.2017.
 */
public class CarRunner {
    public static void main(String[] args) {
        Car car = new Car();
//        car.name = "BMW";
//        car.name = "AUDI";
//        System.out.println(car.name); Ctrl + / - все выделить что коментить
        car.setName("BMB");
        System.out.println(car.getName());
    }
}
