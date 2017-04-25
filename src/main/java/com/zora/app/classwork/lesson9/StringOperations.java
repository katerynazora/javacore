package com.zora.app.classwork.lesson9;

import java.util.Arrays;

/**
 * Created by Kateryna Zora  on 04.04.2017.
 */
public class StringOperations {
    public static void main(String[] args) {
        String name = "Kateryna , test";
        System.out.println(name.contains("ter"));
        System.out.println(name.isEmpty());
        System.out.println(name.equals("name"));
        System.out.println(name.equalsIgnoreCase("nAmE"));
        System.out.println(name.endsWith("yna"));
        System.out.println(name.length());
        String [] arrayString = name.split(",");
        System.out.println(Arrays.toString(arrayString));//разбить стрингу на масив
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.trim()); // убирает пробели в конце
    }
}
