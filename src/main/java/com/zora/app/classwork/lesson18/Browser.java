package com.zora.app.classwork.lesson18;

/**
 * Created by Kateryna Zora  on 23.05.2017.
 */
public class Browser { //Overloading
    private String name;
    private int version;

    public void invoke(String name){
        System.out.println(name);
    }
    public void invoke(String name, int version){
       // invoke(name); or
        System.out.println(name + version);
    }

}
