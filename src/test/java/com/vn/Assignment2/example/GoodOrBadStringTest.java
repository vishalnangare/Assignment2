package com.vn.Assignment2.example;

import org.junit.jupiter.api.Test;

import com.vn.Assignment2.examples.GoodOrBadString;

import org.junit.jupiter.api.Assertions;

public class GoodOrBadStringTest { 

    @Test
    public void testIsGoodOrBadBadString() {
        String S1 = "bcdaeiou??";
        int result1 = GoodOrBadString.isGoodOrBad(S1);
        Assertions.assertEquals(0, result1);
    }

    @Test
    public void testIsGoodOrBadGoodString() {
        String S2 = "aeioup??";
        int result2 = GoodOrBadString.isGoodOrBad(S2);
        Assertions.assertEquals(1, result2);
    }

    @Test
    public void testIsGoodOrBadEmptyString() {
        String S3 = "";
        int result3 = GoodOrBadString.isGoodOrBad(S3);
        Assertions.assertEquals(1, result3);
    }
}
