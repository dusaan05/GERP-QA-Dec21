package Week5.day1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LearnTestNGTestCase2 {

	@Test
	public void runMod2TestCase2() {
		System.out.println("Test Case 2");
	}
	
	@BeforeMethod
	public void runBeforeMethod2() {
		System.out.println("Test Case 2 - Before Method 2");
	}
	
	@AfterMethod
	public void runAfterMethod1() {
		System.out.println("Test Case 2 - Before Method 2");
	}
	
	@BeforeClass
	public void runBeforeClass1() {
		System.out.println("Test Case 2 - Before Class 2");
	}

}
