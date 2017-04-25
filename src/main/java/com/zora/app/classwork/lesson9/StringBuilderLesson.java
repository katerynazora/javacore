package com.zora.app.classwork.lesson9;

/**
 * Created by Kateryna Zora  on 04.04.2017.
 */
public class StringBuilderLesson {
    public static void main(String[] args) {
        String palindrome = "moom";
        StringBuilder str = new StringBuilder(palindrome);
        str.reverse();
        System.out.println("string = " + str);
        System.out.println("reverse = " + str.reverse());

        if (palindrome.equals(str.toString())){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }
    }
}



