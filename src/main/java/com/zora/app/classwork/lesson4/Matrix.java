package com.zora.app.classwork.lesson4;

/**
 * Created by Kateryna Zora  on 21.03.2017.
 */
public class Matrix {
    public static void main(String args[])
    { int m[][];
        m = new int[4][4];
        m[0][0] = 1;
        m[1][1] = 1;
        m[2][2] = 1;
        m[3][3] = 1;
        System.out.println(m[0][0] +" "+ m[0][1] +" "+ m[0][2] +" "+ m[0][3]);
        System.out.println(m[1][0] +" "+ m[1][1] +" "+ m[1][2] +" "+ m[1][3]);
        System.out.println(m[2][0] +" "+ m[2][1] +" "+ m[2][2] +" "+ m[2][3]);
        System.out.println(m[3][0] +" "+ m[3][1] +" "+ m[3][2] +" "+ m[3][3]);
    }
}
