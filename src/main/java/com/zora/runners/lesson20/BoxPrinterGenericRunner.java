package com.zora.runners.lesson20;

import com.zora.app.classwork.lesson20.BoxPrinter;
import com.zora.app.classwork.lesson20.BoxPrinterGeneric;

/**
 * Created by Kateryna Zora  on 30.05.2017.
 */
public class BoxPrinterGenericRunner {
    public static void main(String[] args) {
        BoxPrinterGeneric<Integer> boxPrinterGeneric = new BoxPrinterGeneric<>(10);
        System.out.println(boxPrinterGeneric);
        Integer integer = (Integer) boxPrinterGeneric.getVal();
        BoxPrinterGeneric<String> boxPrinterGeneric1 = new BoxPrinterGeneric<>("Hello World");

        System.out.println(boxPrinterGeneric1);
//        String integer2 = (Integer)boxPrinterGeneric1.getVal(); - compile error
        String value = boxPrinterGeneric1.getVal();
        BoxPrinterGeneric<Long> boxPrinterGeneric2 = new BoxPrinterGeneric<>(2345L);
        Long key = boxPrinterGeneric2.getVal();
        System.out.println(boxPrinterGeneric2);

    }
}
