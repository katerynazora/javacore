package com.zora.app.homework.lesson6;

/**
 * Created by Kateryna Zora  on 30.03.2017.
 */
/*
Создать двумерный массив из 8 строк по 5 столбцов в каждой из случайных целых чисел
        из отрезка [10;99]. Вывести массив на экран.
 */
public class MassiveE {
    public static void main(String[] args) {
        int[][] massiveCasual = new int[8][5];
        for (int i = 0; i < massiveCasual.length; i++) {
            for (int j = 0; j < massiveCasual[i].length; j++) {
                massiveCasual[i][j]= (int)(Math.random()*90)+10;
                System.out.print(massiveCasual[i][j]+ " ");
            }
            System.out.println(" ");
        }
    }
}
