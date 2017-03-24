package com.zora.app.classwork.lesson6;

/**
 * Created by Kateryna Zora  on 24.03.2017.
 */
public class Lesson6 {
    public void askUserNumber(int a, int b){
            while (a > b){
                a = a - 1; // a--
                System.out.println("a = " + a + " b = "+ b);
                if (a <= b){
                    System.out.println("a = " + a + " b = " + b + " exit program");
            }
        }
    }
    public void askUserForLoop(int a) {
        for (int i = 0; i <= a; i++) {
            System.out.println("i = " + i);
        }
    }
    public void askUserForCount(int a) {
        int k = 0;
        for (int i = 0; i <= a; i++) {
            if (i%2 == 0) {
                System.out.println("i = " + i);
                ++k;
            }
        }
        System.out.println("Count = " + k);
    }
    public void askUserMasive(){
        int [] askIntMasive = {1, 2, 3};
        askIntMasive[0] = 1;
        askIntMasive[1] = 2;
        askIntMasive[2] = 3;
        char [] askCharMasive = {'a','b', '1'};
        boolean[] askBooleanMasive = {true, true, false};
        System.out.println();

    }
}
