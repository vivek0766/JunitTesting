package com.ucm.assignment;

import org.junit.Test;

public class PrimeNumber {

	@Test
	public void prime() throws Exception{
		String input = "9";
		int number = Integer.parseInt(input);

		boolean isPrime = true;
		//int temp;
		for (int i = 2; i < number / 2; i++) {
			//temp = ;
			if (number % i == 0) {
				isPrime = false;
				break;
			}
		} if(isPrime)
			System.out.println("The given number "+ number +" is Prime Number");
		else
		System.out.println("The given number "+ number +" is Not a prime Number");

	}
	
}
