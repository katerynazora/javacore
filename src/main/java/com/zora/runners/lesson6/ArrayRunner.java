package com.zora.runners.lesson6;

/**
 * Created by Kateryna Zora  on 24.03.2017.
 */
public class ArrayRunner {
    public static void main(String[] args) {
        int[] arrayInt = new int[2];//create massive
        arrayInt[0] = 1;
        arrayInt[1] = 5;
        System.out.println(arrayInt);
        for (int arrayPosition : arrayInt) { //foreach
            System.out.println(arrayPosition); // выводит все элементы ячейки
        }
        int[] arrayInt2 = new int[4];
        arrayInt2[0] = 4;
        arrayInt2[1] = 3;
        arrayInt2[2] = 8;
        arrayInt2[3] = 1;
        for (int arrayPosition2 : arrayInt2) {
            System.out.println(arrayPosition2);
            System.out.println(arrayInt2[2]);
            System.out.println(arrayInt2.length);// длина масива
        }
    }
}

