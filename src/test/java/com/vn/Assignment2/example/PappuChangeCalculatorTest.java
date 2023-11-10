package com.vn.Assignment2.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
 
import com.vn.Assignment2.examples.PappuChangeCalculator;

public class PappuChangeCalculatorTest {

    @Test
    public void testMaxExtraAmount() {
       
        assertEquals(43, PappuChangeCalculator.maxExtraAmount(56));
        assertEquals(333, PappuChangeCalculator.maxExtraAmount(669));
        assertEquals(33, PappuChangeCalculator.maxExtraAmount(66));
        assertEquals(876543, PappuChangeCalculator.maxExtraAmount(123456));
        assertEquals(13, PappuChangeCalculator.maxExtraAmount(686));
        assertEquals(9, PappuChangeCalculator.maxExtraAmount(0));
    }
}
