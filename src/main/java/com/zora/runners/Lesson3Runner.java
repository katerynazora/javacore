package com.zora.runners;

import com.zora.app.classwork.lesson1.PrimitiveConvertor;

/**
 * Created by Катерина on 17.03.2017.
 */
public class Lesson3Runner {
    public static void main(String[] args) {
        PrimitiveConvertor convertor = new PrimitiveConvertor();
        convertor.floatToChar(74.6f);
        convertor.charToInt('i');
        convertor.intToChar(119);
    }
}

