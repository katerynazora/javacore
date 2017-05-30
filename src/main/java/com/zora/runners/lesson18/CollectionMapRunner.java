package com.zora.runners.lesson18;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Kateryna Zora  on 23.05.2017.
 */
public class CollectionMapRunner {
    public static void main(String[] args) {
        Map m1 = new HashMap();
        m1.put("Zara","8");
        m1.put("Mahnaz", "31");
        m1.put("Ayan", "12");
        m1.put("Daisy", "14");
        m1.put("Zara", "8");
        m1.put("WWW", "2");
        m1.put("WWW", "");
        System.out.println(m1.get("Zara"));
        System.out.println("Map Elements");
        System.out.println("\t" + m1);
    }
}
