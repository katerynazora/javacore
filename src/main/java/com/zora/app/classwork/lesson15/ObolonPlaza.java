package com.zora.app.classwork.lesson15;

/**
 * Created by Kateryna Zora  on 05.05.2017.
 */
public class ObolonPlaza extends AbstractHouse {

    public ObolonPlaza(String name) {
        super(name);
    }

    @Override
    public void build() {
        System.out.println("Build Obolon Plaza house");
        showHouseNumber("Obolon 34");
    }
}
