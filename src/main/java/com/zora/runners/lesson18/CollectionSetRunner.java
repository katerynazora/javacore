package com.zora.runners.lesson18;

import java.util.HashSet;

/**
 * Created by Kateryna Zora  on 23.05.2017.
 */
public class CollectionSetRunner {
    public static void main(String[] args) {
        HashSet hs = new HashSet();
        hs.add("C");
        hs.add("D");
        hs.add("A");
        hs.add("B");
        hs.add("D");
        hs.add("C");
        hs.add("3");
        hs.add("23");
        hs.add(34);
        hs.add(23);
        System.out.println(hs);
    }
}
