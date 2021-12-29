package Week5.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnSupressBrowserNotification {

	@Test
	public void runLearnSupressBrowserNotification() {
		WebDriverManager.chromedriver().setup();
				
		ChromeOptions chromeOptions = new ChromeOptions();
		//FirefoxOptions options = new FirefoxOptions();
		chromeOptions.addArguments("--disable-notifications");
		
		ChromeDriver driver = new ChromeDriver(chromeOptions);
		driver.get("https://www.airship.com/resources/explainer/web-push-notifications-explained/");
		driver.manage().window().maximize();
		
		System.out.println("I have successfully suppressed the Browser Notifications");
		
		
		

	}

}
