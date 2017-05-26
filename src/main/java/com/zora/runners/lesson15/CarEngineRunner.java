package com.zora.runners.lesson15;

import com.zora.app.classwork.lesson15.*;

/**
 * Created by Kateryna Zora  on 05.05.2017.
 */
public class CarEngineRunner {
    public static void main(String[] args) {
        String engineName = "V8Turbo";
        String brakeName = "BrakeDiscMechanism";
        Brake brake = new Brake(brakeName);
        Engine engine = new Engine(engineName);
        Car car = new Car(engine, brake);
        System.out.println(car.getEngine().getName());
        System.out.println(car.getBrake().getName());

        Navigation navigationGoogle = new Navigation();
        navigationGoogle.setName("Google");
        car.setNavigation(navigationGoogle);

        Navigation navigationGarmin = new Navigation();
        navigationGarmin.setName("Google");
        car.setNavigation(navigationGarmin);

        Parktronic parktronicParkCity = new Parktronic();
        parktronicParkCity.setName("ParkCity");
        car.setParktronic(parktronicParkCity);

        System.out.println("Navigation: " + car.getNavigation().getName() + "  Parktronic: " + car.getParktronic().getName());
    }
}
