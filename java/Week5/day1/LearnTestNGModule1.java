package Week5.day1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LearnTestNGModule1 {

	@Test
	public void runMod1TestCase1() {
		System.out.println("Test Case 1");
	}
	
	@BeforeMethod
	public void runBeforeMethod1() {
		System.out.println("Test Case 1 - Before Method 1");
	}
	
	@AfterMethod
	public void runAfterMethod1() {
		System.out.println("Test Case 1 - Before Method 1");
	}
	
	@BeforeClass
	public void runBeforeClass1() {
		System.out.println("Test Case 1 - Before Class 1");
	}

}
