package com.javarzn.base;

import org.junit.Test;

public class TestClassFTimeout {

    @Test(timeout=1000)
    public void testWithTimeoutGood() throws Exception{
        Thread.sleep(100);
        System.out.println("Good");
    }

    @Test(timeout=1000)
    public void testWithTimeoutBad() throws Exception{
        Thread.sleep(10000);
    }

}
