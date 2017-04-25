package com.zora.app.classwork.lesson9;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Kateryna Zora  on 04.04.2017.
 */
public class StringSplit {
    public static void main(String[] args) {
        System.out.println("Enter nameID using dot delimiter");
        Scanner scanner = new Scanner(System.in);
        new StringBuilderLesson();
        String inputString = scanner.nextLine();
        String[] splittedStringArray = inputString.split("\\.");
        int[] intArray = new int[splittedStringArray.length];

        for (int i = 0; i < splittedStringArray.length; i++) {
            intArray[i] = Integer.valueOf(splittedStringArray[i]);
        }
            System.out.println(Arrays.toString(intArray)
                    .replace("[", "")
                    .replace("]", ""));
    }
}
