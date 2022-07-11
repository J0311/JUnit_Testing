package com.company;

import static org.junit.Assert.*;

import org.junit.Test;

public class GraderTest {

	// Because our Grader class has numerous scenarios within
	// control flow statements, each scenario will need to be tested
	// separately:

	@Test
	public void fiftyNineShouldReturnF() {
		Grader grader = new Grader();
		assertEquals('F', grader.determineLetterGrade(59));
	}

	@Test
	public void sixtyNineShouldReturnD() {
		Grader grader = new Grader();
		assertEquals('D', grader.determineLetterGrade(69));
	}

	@Test
	public void seventyNineShouldReturnC() {
		Grader grader = new Grader();
		assertEquals('C', grader.determineLetterGrade(79));
	}

	@Test
	public void eightyNineShouldReturnB() {
		Grader grader = new Grader();
		assertEquals('B', grader.determineLetterGrade(89));
	}

	@Test
	public void ninetyNineShouldReturnA() {
		Grader grader = new Grader();
		assertEquals('A', grader.determineLetterGrade(99));
	}

	// when our code "throws and exception", we can utilize the
	// assertThrows method by passing the exception and calling
	// our method using lambda.

	@Test
	public void negativeOneShouldReturnIllegalArgumentException() {
		Grader grader = new Grader();
		assertThrows(IllegalArgumentException.class, () -> {
			grader.determineLetterGrade(-1);

		});
	}
}
