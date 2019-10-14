package com.ucm.assignment;

import org.junit.Assert;
import org.junit.Test;

public class TestCalculator {

	int A;
	int B;
	int C;
	int D;
	int E;
	int F;

	@Test
	public void addition() {
		A = 10;
		B = 15;
		C = A + B;
		Assert.assertEquals(25, C);
		System.out.println(" The result value of Addition numbers is -> " + C);

	}

	@Test
	public void subtraction() {
		A = 20;
		B = 18;
		D = A - B;
		Assert.assertEquals(2, D);
		System.out.println(" The result value of Substraction numbers is -> " + D);
	}

	@Test
	public void multiplication() {
		A = 5;
		B = 20;
		E = A * B;
		Assert.assertEquals(100, E);
		System.out.println("The result value of Multiplication numbers is -> " + E);
	}

	@Test
	public void division() {
		A = 20;
		B = 5;
		F = A / B;
		Assert.assertEquals(4, F);
		System.out.println(" The result value of Division numbers is -> " + F);
	}

}
