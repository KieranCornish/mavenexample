package com.spartaglobal.mavenexample;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    private Calculator calculator = new Calculator();

    @Test
    public void testAddition(){
        Assert.assertEquals(6, calculator.add(2, 4));
    }
    @Test
    public void testSubtraction(){
        Assert.assertEquals(2, calculator.sub(4, 2));
    }
    @Test
    public void testDivition(){
        Assert.assertEquals(4, calculator.div(8, 2));
    }
    @Test
    public void testMultiplication(){
        Assert.assertEquals(8, calculator.multi(4, 2));
    }
}
