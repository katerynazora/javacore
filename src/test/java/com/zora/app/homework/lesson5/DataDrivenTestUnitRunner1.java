package com.zora.app.homework.lesson5;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * Created by Kateryna Zora  on 22.03.2017.
 */
public class DataDrivenTestUnitRunner1 {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(DataDrivenTestJunit1.class);
        for (Failure failure : result.getFailures()){
            System.out.println(failure.toString());
        }
        System.out.println(result.wasSuccessful());
    }
}
