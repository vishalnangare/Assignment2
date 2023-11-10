package com.vn.Assignment2.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.vn.Assignment2.examples.RectangleExample;

public class RectangleExampleTest {
 
    @Test
    public void testCalculateArea() {
        RectangleExample[] rectangles = new RectangleExample[3];
        rectangles[0] = new RectangleExample(3, 4);
        rectangles[1] = new RectangleExample(5, 6);
        rectangles[2] = new RectangleExample(2, 7);

        int expectedMaxArea = 42; // The expected maximum area among the rectangles

        int maxArea = RectangleExample.calculate_Area(rectangles, 3);

        assertEquals(expectedMaxArea, maxArea);
    }
}
