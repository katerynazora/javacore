package com.zora.app.classwork.lesson8;

import java.util.Arrays;

/**
 * Created by Kateryna Zora  on 31.03.2017.
 */
public class ArrayBubbleSort {
    public static void main(String[] args) {
        int [] array = {15,8,12,2};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]){
                    int tmp = array[j];
                    array[j]= array[j +1];
                    array[j +1] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}