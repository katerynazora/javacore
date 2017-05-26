package com.zora.app.polymorphism;

/**
 * Created by Kateryna Zora  on 28.04.2017.
 */
public class LENOVO extends Computer {
    public void changeRAM(){
        System.out.println("Changing LENOVO RAM memory");
    }
    public void changeTOSSD() {
        System.out.println("Changing LENOVO SSD");
    }
    public void changeCPU() {
        System.out.println("Changing LENOVO CPU");
    }
}
