package Week4.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWindowHandling {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Click Here")).click();

		// Step 1: Get the reference of multipleWindows
		
		Set<String> multipleWindows = driver.getWindowHandles();
		List<String> copyMultipleWindows = new ArrayList<String>(multipleWindows);
		
		
		String firstWindow = copyMultipleWindows.get(0);
		String secondWindow = copyMultipleWindows.get(1);
		
		// Step 2: Switching to the second window through the reference
		driver.switchTo().window(secondWindow);
		
		driver.findElement(By.name("emailid")).sendKeys("test@test.com");
		driver.findElement(By.name("btnLogin")).click();
		
		String text = driver.findElement(By.xpath("//h2[text()='Access details to demo site.']")).getText();
		
		if (text.equals("Access details to demo site."))
		{
			System.out.println("Successfully retrieved user login credentials");
		}
		
		else
		{
			System.out.println("Failed - Not a valid page of user credential");
		}
	}

}
