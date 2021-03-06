package com.qa.demo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

// Telling Spring I am creating a test file
@SpringBootTest
public class DemoTest {
	
	// Start Testing
	
	// Tests are public methods we're creating, with a name of what we're testing
	// I want to create a test that validates 2 + 2 = 4
	
	// @Test annotation above the method
	// Method is public and doesnt return anything
	@Test
	public void twoPlusTwoIsFour() {
		
		// Arrange - Grabbing and creating any resources we need
		int startNum = 2;
		int addNum = 2;
		
		int result;
		
		// Act	   - Doing the thing we're testing
		result = startNum + addNum;
		
		// Assert  - Checking if what we expect is what we recieved
		//assertEquals(What is to be displayed with test, what is the expected value, what is the recieved value)
		assertEquals("2 + 2 is 4", 4, result);
	
		// Run the test by right clicking the project, and selecting `Run as` and choosing JUnit Test
		
	}
	
	@Test
	public void twoTimesThreeIsSix() {
		
		int startNum = 2;
		int multiplyNum = 3;
		
		int result = startNum * multiplyNum;
		
		assertEquals("2 * 3 = 6", 6, result);
		
	}
	
	@Test
	public void whenAddToDatabaseGetStringBack() {
		
		String response = "Item added";
		
	}
	
	// Test whether a testString is the colour "red"
	
	@Test
	public void isStringRed() {
		
		// Arrange
		String colour = "blue";
		
		// Act
		
		// You will be running a method, a service
		colour = "red";
		
		// Assert
//		assertEquals("The string should be red", "red", colour);
	}
	
	@Test
	public void isBoolTrue() {
		
		// Arrange
		boolean boolTest = true;
		
		// Act
		
		// Assert
		assertTrue("Expect boolTest to be true", boolTest);
	}
	
	

}
