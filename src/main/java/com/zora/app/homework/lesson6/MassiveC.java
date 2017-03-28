package com.zora.app.homework.lesson6;

import java.util.Random;

/**
 * Created by Kateryna Zora  on 27.03.2017.
 */
public class MassiveC {
    public static void main(String[] args) {
        int b=0;
        int[] masNotKnow = new int[15];
        for(int i = 0; i< masNotKnow.length; i++){
            Random rnd=new Random();
            masNotKnow[i]=rnd.nextInt(10);
            System.out.print(masNotKnow[i] +" ");
            if(masNotKnow[i]>0& masNotKnow[i]%2==0)b++;
        }
        System.out.println(" ");
        System.out.println("Всего в массиве "+b+" четных");
    }
}