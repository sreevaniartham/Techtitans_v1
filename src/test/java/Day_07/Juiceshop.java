package Day_07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Juiceshop {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://juiceshop.myspreadshop.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id(""));
		driver.findElement(By.name(""));
		driver.findElement(By.className(""));
		
		driver.findElement(By.linkText(""));
		driver.findElement(By.partialLinkText(""));
		driver.findElement(By.xpath(""));
		driver.findElement(By.cssSelector(""));
		driver.findElements(By.tagName(""));
	
	}
}
