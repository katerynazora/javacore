package com.zora.app.polymorphism;

/**
 * Created by Kateryna Zora  on 28.04.2017.
 */
public class IBM extends Computer {
    public void changeRAM(){
        System.out.println("Changing IBM RAM memory");
    }
    public void changeTOSSD() {
        System.out.println("Changing IBM SSD");
    }
    public void changeCPU() {
        System.out.println("Changing IBM CPU");
    }
    public void changeOnlyForIBM(){
        System.out.println("Changing only for IBM SSD");
    }
}
