package Week4.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWindowHandlingTwo {
	
	public static ChromeDriver driver;
	
	public void windowHandle(int index)
	{
		Set<String> multipleWindows = driver.getWindowHandles();
		List<String> copyMultipleWindows = new ArrayList<String>(multipleWindows);
		
		driver.switchTo().window(copyMultipleWindows.get(index));		
				
	}
	
	

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Click Here")).click();
		
		LearnWindowHandlingTwo lwh = new LearnWindowHandlingTwo();
		
		lwh.windowHandle(1);
		driver.findElement(By.name("emailid")).sendKeys("test@test.com");
		driver.findElement(By.name("btnLogin")).click();
		String text = driver.findElement(By.xpath("//h2[text()='Access details to demo site.']")).getText();
		System.out.println(text);
		driver.close();
		
		
		lwh.windowHandle(0);
		System.out.println(driver.getTitle());
		
	}

}
