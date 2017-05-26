package com.zora.app.polymorphism;

/**
 * Created by Kateryna Zora  on 28.04.2017.
 */
public class ACER extends Computer{
    public void changeRAM(){
        System.out.println("Changing ACER RAM memory");
    }
    public void changeTOSSD() {
        System.out.println("Changing ACER SSD");
    }
    public void changeCPU() {
        System.out.println("Changing ACER CPU");
    }
}
