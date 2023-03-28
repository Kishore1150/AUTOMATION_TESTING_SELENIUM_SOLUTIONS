package com.example.testng.TestNG;

import org.testng.annotations.Test;

import java.util.Scanner;

import org.testng.Assert;



public class TestNGTaskTwoCalculator {

	public int add(int x, int y) {
		return x + y;
	}

	public int subtract(int x, int y) {
		return x - y;
	}

	public int multiply(int x, int y) {
		return x * y;
	}

	public int divide(int x, int y) {
		if (y == 0) {
			System.out.println("cannot divide by zero");
		}

		return x / y;
	}

	Scanner sc = new Scanner(System.in);

	@Test(priority = 1)
	public void testAddition() {

		System.out.println("Enter the values for addition:");
		int value1 = sc.nextInt();
		int value2 = sc.nextInt();
		System.out.println("Enter the expected values :");
		int expectedvalue = sc.nextInt();
		int actualvalue = add(value1, value2);
		String result = "failed";
		try {

			Assert.assertEquals(actualvalue, expectedvalue);
			result = "passed";
			System.out.println("The added values is " + actualvalue + " and the result is " + result);

		} catch (AssertionError e) {
			result = "failed";
			System.out.println("The added values is " + actualvalue + " and the result is " + result);
		}

	}

	@Test(priority = 2)
	public void testSubtraction() {

		System.out.println("Enter the values for Subtraction:");
		int value1 = sc.nextInt();
		int value2 = sc.nextInt();
		System.out.println("Enter the expected values :");
		int expectedvalue = sc.nextInt();

		int actualvalue = subtract(value1, value2);
		String result = "failed";
		try {

			Assert.assertEquals(actualvalue, expectedvalue);
			result = "passed";
			System.out.println("The subtracted values is " + actualvalue + " and the result is " + result);

		} catch (AssertionError e) {
			result = "failed";
			System.out.println("The subtracted values is " + actualvalue + " and the result is " + result);
		}

	}

	@Test(priority = 3)
	public void testMultiplication() {
		System.out.println("Enter the values for multiplication:");
		int value1 = sc.nextInt();
		int value2 = sc.nextInt();
		System.out.println("Enter the expected values :");
		int expectedvalue = sc.nextInt();

		int actualvalue = multiply(value1, value2);
		String result = "failed";
		try {

			Assert.assertEquals(actualvalue, expectedvalue);
			result = "passed";
			System.out.println("The multiplied values are " + actualvalue + " and the result is " + result);

		} catch (AssertionError e) {
			result = "failed";
			System.out.println("The multiplied values is " + actualvalue + " and the result is " + result);
		}

	}

	@Test(priority = 4)
	public void testDivision() {

		System.out.println("Enter the values for Division:");
		int value1 = sc.nextInt();
		int value2 = sc.nextInt();
		System.out.println("Enter the expected values :");
		int expectedvalue = sc.nextInt();

		int actualvalue = divide(value1, value2);
		String result = "failed";
		try {

			Assert.assertEquals(actualvalue, expectedvalue);
			result = "passed";
			System.out.println("The divided values are " + actualvalue + " and the result is " + result);

		} catch (AssertionError e) {
			result = "failed";
			System.out.println("The divided values are " + actualvalue + " and the result is " + result);
		}

	}

}
