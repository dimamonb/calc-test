package com.javarzn.calc;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class CalculatorTest {
    private Calculator calc;
    private long a = 2;
    private long b = 8;
    @Before
    public void setUp(){
        this.calc = new Calculator();
    }

    @Test
    public void testSummarize() {
       assertEquals("Summarize invalid",10, calc.summarize(a,b));
    }

    @Test
    public void testSubtract() {
        assertThat(calc.subtract(a, b), is(-6L));
    }

    @Test
    public void testMultiply() {
        assertThat(calc.multiply(a, b), is(16L));
    }

    @Test
    public void testDivide() {
        assertThat(calc.divide(b, a), is(4L));
    }


    @Test
    public void testSqrt() {
        assertThat(calc.sqrt(81), is(9.0));
    }

    @Test
    public void testPow() {
        assertThat(calc.pow(a, b), is(256L));
    }

    @Test
    public void testSin() {
    }

    @Test
    public void testCos() {
    }

    @Test
    public void testTan() {
    }
}