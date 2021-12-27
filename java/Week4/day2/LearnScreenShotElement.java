package Week4.day2;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnScreenShotElement {

	public static void main(String[] args) throws IOException {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();

		Date date = new Date();
		String newDate = date.toString().replace(":", "");
		
		WebElement findElement = driver.findElement(By.xpath("//span[@class='searchTextSpan']"));
		//Step 1: Get the source screen shot as output file
		File sourceScreenShot = findElement.getScreenshotAs(OutputType.FILE);

		File targetScreenShot = new File("./snap/element" + newDate +".png");
		FileUtils.copyFile(sourceScreenShot, targetScreenShot);
		
		
		driver.close();

	}

}
