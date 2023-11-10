package com.vn.Assignment2.example;

import org.junit.jupiter.api.Test;

import com.vn.Assignment2.examples.PrimeNo;
import static org.junit.jupiter.api.Assertions.*;

public class PrimeNoTest {
    @Test 
    public void testIsPrime() {
        int[] primeNumbers = {2, 3, 5, 7, 11, 13, 17, 19, 23};
        int[] nonPrimeNumbers = {1, 4, 6, 8, 9, 15, 21, 25, 100};

        System.out.println("Testing isPrime() method:");
        for (int prime : primeNumbers) {
            assertTrue(PrimeNo.isPrime(prime) == 1, prime + " is prime");
        }

        for (int nonPrime : nonPrimeNumbers) {
            assertTrue(PrimeNo.isPrime(nonPrime) == 0, nonPrime + " is not prime");
        }
    }

    @Test
    public void testFactors() {
        int[] numbers = {2, 6, 10, 15, 20, 25, 30};

        System.out.println("Testing factors() method:");
        for (int number : numbers) {
            System.out.print("Factors of " + number + ": ");
            PrimeNo.factors(number);
            System.out.println();
        }
    }
}
