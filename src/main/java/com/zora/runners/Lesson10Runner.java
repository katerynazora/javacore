package com.zora.runners;

import com.zora.app.classwork.lesson10.ClassWorkEnigma;
import com.zora.app.classwork.lesson10.ClassWorkReader;

import java.io.IOException;

/**
 * Created by Kateryna Zora  on 11.04.2017.
 */
public class Lesson10Runner {
    public static void main(String[] args) {
        ClassWorkEnigma enigma = new ClassWorkEnigma();
        String parole = enigma.stringEnigma("65778");
        System.out.println(parole);

        ClassWorkReader reader = new ClassWorkReader();
        reader.setReaderText();
    }
}

/*
 ClassWorkEnigma enigma = new ClassWorkEnigma();
        enigma.stringEnigma("65778");
 */