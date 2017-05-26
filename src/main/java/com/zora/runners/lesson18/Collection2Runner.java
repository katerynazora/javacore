package com.zora.runners.lesson18;

import java.util.ArrayList;

/**
 * Created by Kateryna Zora  on 23.05.2017.
 */
public class Collection2Runner {
    public static void main(String[] args) {
        int number = 123;
        int number2 = 456;
        int number3 = 78;
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(number);
        arrayList.add(number2);
        arrayList.add(number3);
        arrayList.size();
        arrayList.remove(0);
        boolean isEmpty = arrayList.isEmpty();
        boolean isIn = arrayList.contains(456);
        System.out.println(arrayList);
        System.out.println(isEmpty);
        System.out.println(isIn);
        System.out.println(arrayList.size());
    }

}
