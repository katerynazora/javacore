package com.zora.app.homework.lesson5;

import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Created by Kateryna Zora  on 22.03.2017.
 */
public class DataDrivenTestJunit1 {
    @Test
    public void testAdd() {
        // test data
        int num = 6;
        String temp = null;
        String str = "Junit is working fine";
        //check for equality
        assertEquals("Junit is working fine", str);
        //check for false condition
        assertFalse(num > 6);
        //check for not null value
        assertNotNull(str);
    }

    @Test
    public void testAdd2() {
        int rooms = 2;
        String str = "I need no more two rooms";
        assertEquals("I need no more two rooms", str);
        assertFalse(rooms > 3);
        System.out.println("I need no more two rooms");
    }

    @Test
    public void testAdd3() {
        int numberOfMyRoomFloors = 2;
        String str = "I wont one or max three Floors but not much area";
        System.out.println("I wont one or max three Floors. ");
        assertEquals("I wont one or max three Floors but not much area", str);
        assertFalse(numberOfMyRoomFloors >= 3);
      /*  if (assertEquals(numberOfFloors >= 3) {
            System.out.println("I wont one or max three Floors. " + numberOfFloors + " it's ok");
        }
        else if{
            System.out.println("I wont one or max three Floors but not much area. " + area + " it's too big");
        }*/
    }

    @Test
    public void testAdd4(){
        int area = 60;
        String str = "I need small area";
        assertEquals("I need small area", str);
        assertFalse(area > 60);
        System.out.println("I need small area. No more 60");
    }
    @Test
    public void testAdd5(){
        int notFarFromCenter = 15;
        String str = "It's going to be not far from center";
        assertEquals("It's going to be not far from center", str);
        assertFalse(notFarFromCenter > 20);
        System.out.println("It's going to be not far from center");
    }
    @Test
    public void testAdd6(){
        int numberOfFloors= 5;
        String str = "I don't wont live on first or second floor.";
        assertEquals("I don't wont live on first or second floor.", str);
        assertFalse(numberOfFloors > 20);
        System.out.println("I don't wont live on first or second floor.");
    }
}