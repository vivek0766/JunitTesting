package com.ucm.testexecution;

import org.junit.Test;

public class TestFactorialNumber {

	@Test
	public void factorialNumber(){
	int number =5;
	int factorial =1;
	for (int i=1;i<=number;i++){
		factorial = factorial*i;
	}System.out.println(" The Factorial of given Number "+number+" is "+factorial);
	}	
}
