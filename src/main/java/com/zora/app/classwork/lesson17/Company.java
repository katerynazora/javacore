package com.zora.app.classwork.lesson17;

/**
 * Created by Kateryna Zora  on 16.05.2017.
 */
public enum Company {
    EBAY(30,"Ebay Inc"), GOOGLE(15, "Google Inc");
    private int value;
    private String fullName;
    private Company(int value, String fullName){
        this.value = value;
        this.fullName = fullName;
    }
    public int getValue(){return value;}
}
