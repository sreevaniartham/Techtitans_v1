package Day_06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Saucedemo {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		driver.manage().window().maximize();
		
		WebElement UserNameEle = driver.findElement(By.name("user-name"));
		UserNameEle.sendKeys("standard_user");
		
		WebElement PassEle = driver.findElement(By.name("password"));
		PassEle.sendKeys("secret_sauce");
		
		WebElement Loginbtn = driver.findElement(By.name("login-button"));
		Loginbtn.click();
		
		WebElement BackpkEle = driver.findElement(By.name("add-to-cart-sauce-labs-backpack"));
		BackpkEle.click();
		
		WebElement TshirtEle = driver.findElement(By.id("item_1_title_link"));
		TshirtEle.click();
		
		WebElement TshirtEleone = driver.findElement(By.id("add-to-cart"));
		TshirtEleone.click();
				
		WebElement cartEle = driver.findElement(By.id("shopping_cart_container"));
		cartEle.click();
		
		WebElement checkEle = driver.findElement(By.id("checkout"));
		checkEle.click();
		
		WebElement FirstNameEle = driver.findElement(By.name("firstName"));
		FirstNameEle.sendKeys("Sreevani");
		
		WebElement LastNameEle = driver.findElement(By.name("lastName"));
		LastNameEle.sendKeys("Artham");
		
		WebElement ZipEle = driver.findElement(By.name("postalCode"));
		ZipEle.sendKeys("85297");
		
		WebElement checkEleone = driver.findElement(By.id("continue"));
		checkEleone.click();
		
		WebElement checkEletwo = driver.findElement(By.id("finish"));
		checkEletwo.click();
				
	    WebElement ThankYouText = driver.findElement(By.cssSelector("h2.complete-header"));
		String confirmationText = ThankYouText.getText();

		System.out.println(confirmationText);
		
		WebElement checkElethree = driver.findElement(By.id("back-to-products"));
		checkElethree.click();
		
		WebElement checkElefour = driver.findElement(By.id("react-burger-menu-btn"));
		checkElefour.click();
		
		Thread.sleep(2000);
		
		WebElement checkElefive = driver.findElement(By.xpath("//a[@data-test='logout-sidebar-link']"));
		checkElefive.click();
	}

}
