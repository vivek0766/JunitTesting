package com.ucm.assignment;

import org.junit.Test;

public class TestPrintTriangle {


	@Test
	public void printTriangle(){
		int noofLines = 5;
		System.out.println(" Below is the Triangle: ");
		for (int a=0; a<=noofLines; a++){
			for(int b=0; b<=noofLines-a;b++){
				System.out.print(" ");
			}for (int c= 0; c<a;c++){
				System.out.print("* ");
			}System.out.println();
		}
	}
}
