package com.zora.app.classwork.lesson10;

/**
 * Created by Kateryna Zora  on 11.04.2017.
 */
public class ClassWorkEnigma {
    public String stringEnigma (String stringToEnigma) {
        String paroleText = "1234567890";
        String useParoleText = "abcdehlows";
        StringBuilder stringBuilder = new StringBuilder(stringToEnigma);
        //String encodedString = " ";

        for (int i = 0; i < stringBuilder.length(); i++) {
            for (int j = 0; j < paroleText.length(); j++) {
                if (stringBuilder.charAt(i) == paroleText.charAt(j)) {
                    stringBuilder.setCharAt(i, useParoleText.charAt(j));
                    break;
                }
            }
        }
        return stringBuilder.toString();
    }
}
/*
public class ClassWorkEnigma {
    public void stringEnigma (String stringToEnigma) {
        String paroleText = "1234567890";
        String useParoleText = "abcdehlows";
        StringBuilder stringBuilder = new StringBuilder(stringToEnigma);
        //String encodedString = " ";

        for (int i = 0; i < stringBuilder.length(); i++) {
            for (int j = 0; j < paroleText.length(); j++) {
                if (stringBuilder.charAt(i) == paroleText.charAt(j)) {
                    stringBuilder.setCharAt(i, useParoleText.charAt(j));
                    break;
                }
            }
        }
        System.out.println(stringBuilder.toString());
        //return stringBuilder.toString();
    }
}
 */