package com.zora.app.classwork.lesson15;

/**
 * Created by Kateryna Zora  on 05.05.2017.
 */
public class Chicago extends AbstractHouse{
    public Chicago(String name) {
        super(name);
    }

    @Override
    public void build() {
        System.out.println("Build Chicago house");
        showHouseNumber("123");
    }
}
