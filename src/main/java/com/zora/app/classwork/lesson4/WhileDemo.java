package com.zora.app.classwork.lesson4;

/**
 * Created by Kateryna Zora  on 20.03.2017.
 */
public class WhileDemo {
    public static void main(String args[]) {
        int n = 10;
        while (n > 5) {
            System.out.println("tick " + --n);
        }
        //////////////////////////////
        int a = n--;

        a = n;
        n = n -1;

        //////////////////////////
        a = --n;

        n = n-1;
        a = n;
    }
}
/**
 class DoWhile {
 public static void main(String args[]) {
 int n = 10;
 do {
 System.out.println("tick " + n);
 } while (--n > 0);
 } }
*/