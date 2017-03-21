package com.zora.app.classwork.lesson5;

import com.zora.app.classwork.lesson3.MathFunc;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by Kateryna Zora  on 21.03.2017.
 */
@RunWith(JUnitParamsRunner.class)
public class DataProviderMathFunctionTest {
   // MathFunc mathFunc = new MathFunc(); static on MathFunc class(lesson3)
    @Test
    @FileParameters(value = "src/test/resources/testdata.csv",
    mapper = CsvWithHeaderMapper.class)
    public void dataProviderTestAdd(int argA, int argB, int expOut){
       // MathFunc mathFunc = new MathFunc(); if not found multiply = static on MathFunc class(lesson3)
        Assert.assertEquals(expOut, MathFunc.multiply(argA, argB));
      //  Assert.assertEquals(expOut, mathFunc.plus(argA, argB));
        System.out.println("actual " + MathFunc.multiply(argA,argB)); // if I wont I can write
        System.out.println("expected " + expOut);
    }
    @Test
    @FileParameters(value = "src/test/resources/testdataone.csv",
            mapper = CsvWithHeaderMapper.class)
    public void dataProviderDivisionTest(int argA, int argB, int expOut) {
        Assert.assertEquals (expOut, MathFunc.division(argA, argB));
        System.out.println("actual " + MathFunc.division(argA, argB));
        System.out.println("expected " + expOut);
    }

}
