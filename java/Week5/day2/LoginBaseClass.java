package Week5.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginBaseClass {
	
	public ChromeDriver driver;
	
	@Parameters({"username", "url",  "password"})
	
	@BeforeMethod
	public void loginTour(String uname, String url, String pwd)
	{
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions chromeOptions = new ChromeOptions();
		//FirefoxOptions options = new FirefoxOptions();
		chromeOptions.addArguments("--disable-notifications");
		
		driver = new ChromeDriver(chromeOptions);
		driver.get(url);
		driver.manage().window().maximize();
		driver.findElement(By.name("userName")).sendKeys(uname);
		driver.findElement(By.name("password")).sendKeys(pwd);
		driver.findElement(By.name("submit")).click();
	}
	
	@AfterMethod
	public void closeBrowser() 
	{
		driver.close();
		
	}

}
