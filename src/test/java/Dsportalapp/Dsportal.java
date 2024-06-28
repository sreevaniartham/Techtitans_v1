package Dsportalapp;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dsportal {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://dsportalapp.herokuapp.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.className("btn")).click();
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.id("id_username")).sendKeys("techtitans");
		driver.findElement(By.id("id_password")).sendKeys("Time2fly$");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("/html/body/div[3]/div[4]/div/div/a")).click();
		driver.findElement(By.className("list-group-item")).click();
	
		driver.findElement(By.xpath("//*[@id=\"content\"]/li[1]/a")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/a")).click();
		driver.findElement(By.xpath("//div[@class='input']/div/div/textarea")).sendKeys("print \"Hello World\";");
		driver.findElement(By.xpath("//*[@id=\"answer_form\"]/button")).click();
		
		WebElement outputtext = driver.findElement(By.id("output"));
		System.out.println("Code executed correctly :" +outputtext.getText());
		
		driver.navigate().back();
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/a")).click();
		
		driver.findElement(By.xpath("//div[@class='input']/div/div/textarea")).sendKeys("Hello");
		driver.findElement(By.xpath("//*[@id=\"answer_form\"]/button")).click();
		
		Alert alert = driver.switchTo().alert();
		System.out.println("Code was not executed correctly :" +alert.getText());
		alert.accept();
		
		Thread.sleep(4000);
		
		driver.navigate().back();
		
		driver.findElement(By.xpath("//*[@id=\"content\"]/li[2]/a")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/a")).click();
		
		driver.findElement(By.xpath("//div[@class='input']/div/div/textarea")).sendKeys("print \"Hello World\";");
		driver.findElement(By.xpath("//*[@id=\"answer_form\"]/button")).click();
		
		WebElement outputtext1 = driver.findElement(By.id("output"));
		System.out.println("Code executed correctly :" +outputtext1.getText());
		
		driver.navigate().back();
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/a")).click();
		
		driver.findElement(By.xpath("//div[@class='input']/div/div/textarea")).sendKeys("Hello");
		driver.findElement(By.xpath("//*[@id=\"answer_form\"]/button")).click();
		
		Alert alert1 = driver.switchTo().alert();
		System.out.println("Code was not executed correctly :" +alert1.getText());
		alert.accept();
		
		Thread.sleep(4000);
		
		driver.navigate().back();
		
	}

}
