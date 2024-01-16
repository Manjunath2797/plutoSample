package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Access qspiders demo app
 * click on web elements
 * click on textbox
 * fetch the value of register page
 * provide name , email id , password and click on register
 * click()
 * sendKeys("")
 * getText()
 */
public class VerifyUserIsAbleToResgisterInQspidersDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.drive.window", "C:\\\\selenium folder\\\\chromedriver-win64 (1)\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/?scenario=1");
		Thread.sleep(2000);
		
		WebElement element=driver.findElement(By.xpath("//section[text()='Web Elements']"));
		//element.click();
		Thread.sleep(2000);
		
		element=driver.findElement(By.xpath("//section[text()='Text Box']"));
		element.click();
		Thread.sleep(2000);
		
		element=driver.findElement(By.xpath("//h1[text()='Register ']"));
		System.out.println(element.getText());
		Thread.sleep(2000);
		
		element = driver.findElement(By.id("name"));
		element.sendKeys("manju");
		
		element = driver.findElement(By.id("email"));
		element.sendKeys("manju@gmail.com");
		
		element=driver.findElement(By.id("password"));
		element.sendKeys("123abc");
		
		element=driver.findElement(By.xpath("//button[text()='Register']"));
		element.click();
		
		driver.close();	

	}

}
