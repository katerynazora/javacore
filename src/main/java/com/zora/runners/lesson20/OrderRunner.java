package com.zora.runners.lesson20;

import com.zora.app.classwork.lesson20.OrderPair;
import com.zora.app.classwork.lesson20.OrderUtil;
import com.zora.app.classwork.lesson20.Pair;

/**
 * Created by Kateryna Zora  on 30.05.2017.
 */
public class OrderRunner {
    public static void main(String[] args) {
        Pair<String, Integer> p1 = new OrderPair<>("Even", 8);
        Pair<String, Integer> p2 = new OrderPair<>("Odd", 11);
        Pair<String, Integer> p3 = new OrderPair<>("Odd", 11);
        Pair<Integer, Integer> p4 = new OrderPair<>(12, 11);
        Pair<Integer, Integer> p5 = new OrderPair<>(12, 11);
//        String key = p1.getKey();
//        boolean same = OrderUtil.<String, Integer>compare(p1,p2);
        boolean same2 = OrderUtil.compare(p1,p2);
        boolean same3 = OrderUtil.compare(p2,p3);
        boolean same4 = OrderUtil.compare(p4,p5);
//        System.out.println(same);
         System.out.println(same2);
        System.out.println(same3);
        System.out.println(same4);
    }


}
