package com.zora.app.classwork.lesson12;

/**
 * Created by Kateryna Zora  on 28.04.2017.
 */
public class Car {
    private String name = "Car";
    //Alt ins getter
    public String getName() { // позволить доступ считать private
        return name;
    }
//set
    public void setName(String name) { // позволить доступ изменить private
        this.name = name;
    }
    public void shiftCar(){
        System.out.println(name);
    }
}
