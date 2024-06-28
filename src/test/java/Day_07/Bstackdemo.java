package Day_07;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bstackdemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://bstackdemo.com/");
		
		driver.manage().window().maximize();
		
		WebElement SignEle = driver.findElement(By.id("signin"));
		SignEle.click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement UsernamEle = driver.findElement(By.id("username"));
		UsernamEle.click();
		
		WebElement UserEle = driver.findElement(By.xpath("//div//*[contains(text(),'demouser')]"));
		UserEle.click();
		
		WebElement PassnamEle = driver.findElement(By.id("password"));
		PassnamEle.click();
		
		WebElement PassEle = driver.findElement(By.xpath("//div//*[contains(text(),'testingisfun99')]"));
		PassEle.click();
		
		WebElement LoginEle = driver.findElement(By.id("login-btn"));
		LoginEle.click();
		
		WebElement Prodone = driver.findElement(By.xpath("//*[@id=\"1\"]/div[4]"));
		Prodone.click();
		
		WebElement Prodtwo = driver.findElement(By.xpath("//*[@id=\"5\"]/div[4]"));
		Prodtwo.click();
		
		WebElement CheckoutEle = driver.findElement(By.className("buy-btn"));
		CheckoutEle.click();
		
		WebElement FirstnameEle = driver.findElement(By.id("firstNameInput"));
		FirstnameEle.sendKeys("Testone");
		
		WebElement LastnameEle = driver.findElement(By.id("lastNameInput"));
		LastnameEle.sendKeys("Data");
		
		WebElement AddressEle = driver.findElement(By.id("addressLine1Input"));
		AddressEle.sendKeys("ABC St.");
		
		WebElement StateEle = driver.findElement(By.id("provinceInput"));
		StateEle.sendKeys("AZ");
		
		WebElement PcodeEle = driver.findElement(By.id("postCodeInput"));
		PcodeEle.sendKeys("85297");		
		
		WebElement SubmitEle = driver.findElement(By.id("checkout-shipping-continue"));
		SubmitEle.click();
		
		WebElement SuccessEle = driver.findElement(By.id("confirmation-message"));
		System.out.println(SuccessEle.getText());
		
		WebElement OrderNum = driver.findElement(By.xpath("//ol[@class='checkout-steps']/li/div/div/div[2]/strong"));
		System.out.println("Order number is :" +OrderNum.getText());
		
		WebElement ReceiptEle = driver.findElement(By.id("downloadpdf"));
		ReceiptEle.click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement ContShoppEle = driver.findElement(By.className("button"));
		ContShoppEle.click();
		
		WebElement LogoutEle = driver.findElement(By.id("logout"));
		LogoutEle.click();
		
	}
}
