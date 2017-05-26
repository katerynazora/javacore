package com.zora.app.polymorphism;

/**
 * Created by Kateryna Zora  on 28.04.2017.
 */
public class HP extends Computer {
    public void changeRAM(){
        System.out.println("Changing HP RAM memory");
    }
    public void changeTOSSD() {
        System.out.println("Changing HP SSD");
    }
    public void changeCPU() {
        System.out.println("Changing HP CPU");
    }
}
