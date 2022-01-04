package Week5.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ErailBaseClass {
	
	public static ChromeDriver driver;
	
	@Parameters ("url")
	
	@BeforeMethod
	public void getURL(String url)
	{
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions chromeOptions = new ChromeOptions();
		//FirefoxOptions options = new FirefoxOptions();
		chromeOptions.addArguments("--disable-notifications");
		
		driver = new ChromeDriver(chromeOptions);
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void closeBrowser() 
	{
		driver.close();
		
	}
}
