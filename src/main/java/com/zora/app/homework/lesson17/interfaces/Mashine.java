package com.zora.app.homework.lesson17.interfaces;

/**
 * Created by Kateryna Zora  on 23.05.2017.
 */
public abstract class Mashine implements Run{
    int MAX_SPEED = 250;
    int MIN_SPEED = 10;
    int MIN_COUNT_PEOPLE = 1;
    int MAX_COUNT_PEOPLE = 12;
    protected String nameMashine;
    protected int speedRunAtTHisMoment;


    public Mashine(String nameMashine, int speedRunAtTHisMoment) {
        this.nameMashine = nameMashine;
        this.speedRunAtTHisMoment = speedRunAtTHisMoment;
    }
    @Override
    public void nameRun(){
    }
}
