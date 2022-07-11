package com.company;

import static org.junit.Assert.*;

import org.junit.Test;

public class SimpleCalculatorTest {
	
	/*Step 1: Create a VERY descriptive method name regarding
	 * what you wish to accomplish. Here, it's 2 + 2 should = 4
	 
	 *Step 2: Create an instance of the class you're testing
	 
	 *Step 3: Have that object call the method you're looking to test
	 
	 *Step 4: We need to use an "Assert" statement which will assert
	 *		  that in our add method, 2 + 2 does indeed = 4. 
	 
	 *Step 5: We pass "4" as our first parameter, what's "expected".
	 *		  We pass the actual method call as second parameter and
	 *		  it will be our "actual" parameter for the .asserEquals method.
	 *Step 6: 	
	 *				
	*/
 
	@Test
	public void twoPlusTwoShouldEqualFour() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(4, calc.add(2,2));
	}

}
