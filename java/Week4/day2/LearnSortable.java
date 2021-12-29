package Week4.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnSortable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/sortable/");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		
		WebElement item1 = driver.findElement(By.xpath("(//li[@class='ui-state-default ui-sortable-handle'])[1]"));
		WebElement item2 = driver.findElement(By.xpath("(//li[@class='ui-state-default ui-sortable-handle'])[2]"));
		WebElement item3 = driver.findElement(By.xpath("(//li[@class='ui-state-default ui-sortable-handle'])[3]"));
		WebElement item4 = driver.findElement(By.xpath("(//li[@class='ui-state-default ui-sortable-handle'])[4]"));
		WebElement item5 = driver.findElement(By.xpath("(//li[@class='ui-state-default ui-sortable-handle'])[5]"));
		WebElement item6 = driver.findElement(By.xpath("(//li[@class='ui-state-default ui-sortable-handle'])[6]"));
		WebElement item7 = driver.findElement(By.xpath("(//li[@class='ui-state-default ui-sortable-handle'])[7]"));
		
		Actions builder = new Actions(driver);
		
//		Point item3Location = item3.getLocation();
//		int x = item3Location.getX();
//		int y = item3Location.getY();
		builder.clickAndHold(item6).moveToElement(item3).release().perform();
	}

}
