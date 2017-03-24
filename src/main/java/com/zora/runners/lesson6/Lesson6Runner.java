package com.zora.runners.lesson6;

import com.zora.app.classwork.lesson6.Lesson6;

/**
 * Created by Kateryna Zora  on 24.03.2017.
 */
public class Lesson6Runner {
    public static void main(String[] args){
        Lesson6 lesson6 = new Lesson6(); // if use public void askUserNumber(int a, int b)
     lesson6.askUserNumber(8,3);
     //Lesson6.askUserNumber(a:8,b:3) if use public static void askUserNumber(int a, int b)
    lesson6.askUserForLoop(10);
    lesson6.askUserForCount(20);
        int r = 1;
        System.out.println("Original r value " + r);
        System.out.println("Post-increment r " + r++);
        System.out.println("After post-increment " + r);
        System.out.println("Pre-increment r " + ++r);
        System.out.println("After pre-increment " + r);
    lesson6.askUserMasive();
    }
}
