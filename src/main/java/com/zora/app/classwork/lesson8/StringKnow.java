package com.zora.app.classwork.lesson8;

/**
 * Created by Kateryna Zora  on 31.03.2017.
 */
public class StringKnow {
    public static void main(String[] args) {
        String stringToDisplay = "";
        char[] charsArrayToString = {'a', 'b', 'c', 'd'};
        for (int i = 0; i < charsArrayToString.length; i++) {
            stringToDisplay += charsArrayToString[i];
        }
        System.out.println(stringToDisplay);
    }
}
