package com.zora.app.classwork.lesson3;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Катерина on 15.03.2017.
 */
public class MathFuncTest {
    @Test
    public void multiplyTest() {
        int a = 1;
        int b = 2;
        MathFunc mathFunc = new MathFunc();
        int actualResult = mathFunc.multiply(a, b);
        int expectedResult = 2;
        Assert.assertEquals(expectedResult, actualResult);

    }
    @Test
    public void plusTest(){
        int a = 3;
        int b = 3;
        MathFunc mathFunc = new MathFunc();
        int actualResult = mathFunc.plus(a, b);
        int expectedResult = 6;
        Assert.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void minusTest(){
        int a = 5;
        int b = 3;
        MathFunc mathFunc = new MathFunc();
        int actualResult = mathFunc.minus(a, b);
        int expectedResult = 2;
        Assert.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void divisionTest(){
        int a = 6;
        int b = 3;
        MathFunc mathFunc = new MathFunc();
        int actualResult = mathFunc.division(a, b);
        int expectedResult = 2;
        Assert.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void mathAbc(){
        int a =10;
        double actualResult = Math.abs(a);
        double expectedResult = 10.0;
        System.out.println(actualResult + "--"+ expectedResult);
        Assert.assertEquals(expectedResult,actualResult,0);
    }
}
