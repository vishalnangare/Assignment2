package com.vn.Assignment2.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.vn.Assignment2.examples.Factorial;


public class FactorialTest {

    @Test 
    public void testFactorial() {
        assertEquals("1", Factorial.factorial(0));
        assertEquals("1", Factorial.factorial(1));
        assertEquals("2*1", Factorial.factorial(2));
        assertEquals("3*2*1", Factorial.factorial(3));
        assertEquals("5*4*3*2*1", Factorial.factorial(5));
    }

    @Test
    public void testGetFactorial() {
        assertEquals(1, Factorial.getfactorial(0));
        assertEquals(1, Factorial.getfactorial(1));
        assertEquals(2, Factorial.getfactorial(2));
        assertEquals(6, Factorial.getfactorial(3));
        assertEquals(120, Factorial.getfactorial(5));
    }
}
