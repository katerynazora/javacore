package com.zora.runners.lesson20;

import com.zora.app.classwork.lesson20.Box;
import com.zora.app.classwork.lesson20.OrderPair;
import com.zora.app.classwork.lesson20.Pair;

/**
 * Created by Kateryna Zora  on 30.05.2017.
 */
public class BoxRunner {
    public static void main(String[] args) {
//        Box<String> numberBox = new Box<>("10"); compile error,incompatible
        Box<Integer> numberBox = new Box<>(10);
        Pair<String, Integer> p2 = new OrderPair<>("Odd", 11);
        numberBox.inspect(p2);
//        numberBox.inspect(new Integer(10)); compile error, incompatible

    }
}
