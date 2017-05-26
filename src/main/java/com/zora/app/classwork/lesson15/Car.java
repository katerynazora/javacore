package com.zora.app.classwork.lesson15;

/**
 * Created by Kateryna Zora  on 05.05.2017.
 */
public class Car {
    private Engine engine;
    private Brake brake;
    private Navigation navigation;
    private Parktronic parktronic;

    public Car(Engine engine, Brake brake) {
        this.engine = engine;
        this.brake = brake;
    }

    public Engine getEngine() {
        return engine;
    }

    public Brake getBrake() {
        return brake;
    }

    public Navigation getNavigation() {
        return navigation;
    }

    public void setNavigation(Navigation navigation) {
        this.navigation = navigation;
    }

    public Parktronic getParktronic() {
        return parktronic;
    }

    public void setParktronic(Parktronic parktronic) {
        this.parktronic = parktronic;
    }
}
