package com.zora.app.homework.lesson6;

/**
 * Created by Kateryna Zora  on 27.03.2017.
 */
public class MassiveB {
    public static void main(String[] args) {
        int add = 0;
        for (int i = 1; i <= 99; i++) {
            if (i % 2 != 0) add++;
        }
        int[] MasUp = new int[add];
        for (int i = 1, b = 0; i <= 99; i++) {
            if (i % 2 != 0) {
                MasUp[b] = i;
                System.out.print(MasUp[b] + " ");
                b++;
            }
        }
        System.out.println(" ");
        for (int down = MasUp.length - 1; down >= 0; down--) {
            System.out.println(MasUp[down]);
        }
    }
}