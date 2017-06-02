package com.zora.runners.lesson20;

import com.zora.app.classwork.lesson20.BoxPrinter;

/**
 * Created by Kateryna Zora  on 30.05.2017.
 */
public class BoxPrinterRunner {
    public static void main(String[] args) {
        BoxPrinter boxPrinter = new BoxPrinter(new Integer(10));
        System.out.println(boxPrinter);
        Integer integer = (Integer) boxPrinter.getVal();
        BoxPrinter boxPrinter1 = new BoxPrinter(new String("Hello World"));
        System.out.println(boxPrinter1);
        Integer integer1 = (Integer)boxPrinter1.getVal();

    }
}
