package Week4.day2;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnScreenShotWIndow {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		driver.manage().window().maximize();

		Date date = new Date();
		String newDate = date.toString().replace(":", "");
		
		//Step 1: Get the source screen shot as output file
		File sourceScreenShot = driver.getScreenshotAs(OutputType.FILE);
		File targetScreenShot = new File("./snap/frame" + newDate +".jpg");
		FileUtils.copyFile(sourceScreenShot, targetScreenShot);
		
		
		driver.close();
	}

}
