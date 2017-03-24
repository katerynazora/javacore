package com.zora.app.classwork.lesson5;

import org.junit.Ignore;
import org.junit.Test;

/**
 * Created by Kateryna Zora  on 21.03.2017.
 */
public class TestTimeout {
   @Ignore("Not ready yet")
    @Test(timeout = 1000)
    public void infinityTest(){
        while (true);
    }
}
