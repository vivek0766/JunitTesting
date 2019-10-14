package com.ucm.testexecution;

import org.junit.Test;

public class TestPalindrome {

	String word;

	@Test
	public void isPalindrome() {
		word = "amma";
		String str = word.toString().toLowerCase();
		int length = str.length() - 1;
		for (int i = 0; i < length / 2; i++) {
			if (str.charAt(i) != str.charAt(length - i)) {
				System.out.println("The given String " + word + " is not a palindrome ");
			}
		}
		System.out.println("The given String "+ word + " is a Palindrome ");
	}

	
}
