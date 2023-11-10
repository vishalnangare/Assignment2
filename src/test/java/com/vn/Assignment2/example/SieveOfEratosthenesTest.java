package com.vn.Assignment2.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import com.vn.Assignment2.examples.SieveOfEratosthenes;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class SieveOfEratosthenesTest {

	@Test
	public void testSieveOfEratosthenes() {

		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outputStream));

		SieveOfEratosthenes.sieveOfEratosthenes(10);

		System.setOut(System.out);

		String expectedOutput = "2 3 5 7 ";
		String actualOutput = outputStream.toString();
		assertEquals(expectedOutput, actualOutput);
	}
}
