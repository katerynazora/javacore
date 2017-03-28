package com.zora.runners.lesson6;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Kateryna Zora  on 27.03.2017.
 */
public class MassiveARunner {
    public static void main(String[] args) {
        int[] massiveInt = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        System.out.println(Arrays.toString(massiveInt));
        for (int massivePosition : massiveInt) {
            System.out.println(massivePosition);
        }
    }
}

