package com.zora.runners.lesson15;

import com.zora.app.classwork.lesson15.AbstractHouse;
import com.zora.app.classwork.lesson15.Chicago;
import com.zora.app.classwork.lesson15.ObolonPlaza;

/**
 * Created by Kateryna Zora  on 05.05.2017.
 */
public class AbstractRunner {

    public static void main(String[] args) {
        String nameChicago = "Street Chicago 23";
        String namePlaza = "Obolon Street 20";
        AbstractHouse abstractHouse = new Chicago(nameChicago);
        AbstractHouse obolonPlaza = new ObolonPlaza(namePlaza);
        obolonPlaza.build();
        abstractHouse.build();

    }


}
