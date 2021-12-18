package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Google {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		
		
		WebElement countryElement = driver.findElement(By.name("country"));
		Select selectCountry = new Select(countryElement);
		
		//3 ways of selecting value in the drop down - a) By Index b) By AttributeValue c) By AttributeText
		//selectCountry.selectByVisibleText("CANADA");
		
		//selectCountry.selectByIndex(20);
		
		selectCountry.selectByValue("ARUBA");
		
		
		
		

	}

}
