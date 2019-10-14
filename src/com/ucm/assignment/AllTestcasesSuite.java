package com.ucm.assignment;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


@RunWith(Suite.class)
@SuiteClasses({ PrimeNumber.class, TestPrintTriangle.class, TestCalculator.class, com.ucm.testexecution.TestFactorialNumber.class, com.ucm.testexecution.TestPalindrome.class })
public class AllTestcasesSuite {

}
