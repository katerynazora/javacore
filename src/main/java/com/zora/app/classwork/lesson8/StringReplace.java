package com.zora.app.classwork.lesson8;

import java.util.Arrays;

/**
 * Created by Kateryna Zora  on 31.03.2017.
 */
public class StringReplace {
    public static void main(String[] args) {
        String stringToDisplay2 = "";
        char [] charsArrayToString = {'a', 'b', 'c', 'd'};
        stringToDisplay2 = Arrays.toString(charsArrayToString)
                .replace("," , "") //remove the commas
                .replace("[" , "")
                .replace("]" , "")
                .replace(" ", "")
                .trim();          //trim empty cells at end
        System.out.println(stringToDisplay2);
    }
}
