package com.vn.Assignment2.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.vn.Assignment2.examples.AnagramDeletion;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class AnagramDeletionTest {

	@Test
	public void anagramDeletiontest() {

		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outputStream));

		AnagramDeletion.anagramDeletion("sshgdg", "aasghh");

		System.setOut(System.out);

		String expectedOutput = "1\n";
		String actualOutput = outputStream.toString();
		assertEquals(expectedOutput, actualOutput);
	}
}
