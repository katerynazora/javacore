package com.zora.app.homework.lesson17.interfaces;

/**
 * Created by Kateryna Zora  on 23.05.2017.
 */
public class WheeledTractor extends Traktor {
    private String name;
    private int speed;
    private int weight;
    private int numberOfPeople;
    private int numberOfWheel;

    public WheeledTractor(String nameMashine, int speedRunAtTHisMoment, int numberOfPeople, int numberOfWheel, int weight) {
        super(nameMashine, speedRunAtTHisMoment);
        this.weight = weight;
        this.numberOfPeople = numberOfPeople;
        this.numberOfWheel = numberOfWheel;
    }
    @Override
    public void nameRun() {
        System.out.println("Transport name is " + nameMashine);
    }

    @Override
    public void speedRun() {
        System.out.println("Speed = " + speedRunAtTHisMoment);
        super.speedRun();
    }

    @Override
    public void weightRun() {
        System.out.println("Weight = " + weight);
    }

    @Override
    public void numberOfPeopleRun() {
        System.out.println("People numbers = " + numberOfPeople);
        super.numberOfPeopleRun();
    }

    @Override
    public void numberOfWheelRun() {
        System.out.println("Numbers of wheel = " + numberOfWheel);
        super.numberOfWheelRun();
    }
}
