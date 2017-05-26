package com.zora.app.polymorphism;

/**
 * Created by Kateryna Zora  on 28.04.2017.
 */
public class DELL extends Computer{
    public void changeRAM(){
        System.out.println("Changing DELL RAM memory");
    }
    public void changeTOSSD() {
        System.out.println("Changing DELL SSD");
    }
    public void changeCPU() {
        System.out.println("Changing DELL CPU");
    }
}
