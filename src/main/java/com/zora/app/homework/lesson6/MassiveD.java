package com.zora.app.homework.lesson6;

import java.util.Random;

/**
 * Created by Kateryna Zora  on 28.03.2017.
 */
/*
Создайте массив из 15 случайных целых чисел из отрезка [0;999]. Выведите массив на экран.
Выведите минимальное и максимальное значение элементов массива
 */
public class MassiveD {
    public static void main(String[] args){
        int max = 0;
        int min = 1000;
        int[] massiveNotKnow = new int[15];
        for (int i = 0; i < massiveNotKnow.length; i++) { //fori!!!!! = this
            Random random = new Random();
            massiveNotKnow[i] = random.nextInt(1000);
            System.out.println(massiveNotKnow[i] + " ");
            if (max<massiveNotKnow[i])
                max = massiveNotKnow[i];
            if (min>massiveNotKnow[i])
                min = massiveNotKnow[i];
        }
/*        for (int i = 0; i != massiveNotKnow.length ; i++) {
            if (min > massiveNotKnow[i])
                min = massiveNotKnow[i];
            }
            */
        System.out.println("Min = " + min);
        System.out.println("Max = " + max);
    }

}
