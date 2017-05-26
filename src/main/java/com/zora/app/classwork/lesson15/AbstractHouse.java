package com.zora.app.classwork.lesson15;

/**
 * Created by Kateryna Zora  on 05.05.2017.
 */
public abstract class AbstractHouse { // нестрогий контракт : комбинируем методы у каждого свой и общий

    private String name;

    public AbstractHouse(String name){
        this.name = name;
    }

    abstract public void build();

    public void showHouseNumber(String number){
        System.out.println("Number 1 " + number);
    }
}
