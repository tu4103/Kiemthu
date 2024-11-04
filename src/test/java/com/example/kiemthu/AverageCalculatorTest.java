package com.example.kiemthu;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class AverageCalculatorTest {

    private AverageCalculator calculator;

    @Before
    public void setUp() throws Exception {
        calculator = new AverageCalculator();
    }

    @Test
    public void testCase_TC1() {
        int[] values = {-999,10,20,30};
        int result = calculator.average(values, 1, 9);
        assertEquals(-999, result);
    }

    @Test
    public void testCase_TC2() {
        int[] values = {1,2,5,30, -999};
        int result = calculator.average(values, 50, 100);
        assertEquals(-999, result);
    }

    @Test
    public void testCase_TC3() {
        int[] values = {100, 20, 20, -999};
        int result = calculator.average(values, 5, 10); 
        assertEquals(-999, result);
    }

    @Test
    public void testCase_TC4() {
        int[] values = {10, 20, 30, -999};
        int result = calculator.average(values, 10, 50);
        assertEquals(25, result);
    }

    
}
