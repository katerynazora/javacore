package com.zora.runners.lesson20;

import com.zora.app.classwork.lesson20.Compare;
import com.zora.app.classwork.lesson20.CompareData;
import com.zora.app.classwork.lesson20.OrderUtil;


/**
 * Created by Kateryna Zora  on 30.05.2017.
 */
public class CompareRunner {
    public static void main(String[] args) {
        Compare<Integer>k1 = new CompareData<>(102);
        Compare<Integer>k2 = new CompareData<>(120);
        boolean same = OrderUtil.compare(k1,k2);
        System.out.println(same);
    }
}
