package iframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleIFrame {

	public static void main(String[] args) {

		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demoapps.qspiders.com/?scenario=1");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//section[text()='Frames']")).click();
		driver.findElement(By.xpath("//section[text()='iframes']")).click();
		driver.findElement(By.xpath("//a[text()='Multiple iframe']")).click();
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("ma@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Welcome@123");
		driver.findElement(By.xpath("//input[@id='confirm-password']")).sendKeys("Welcome@123");
		driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(1);
		driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("ma@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Welcome@123");
		driver.findElement(By.xpath("//button[text()='Sign In']")).click();
		
		driver.switchTo().defaultContent();
		
		String ele=driver.findElement(By.xpath("//span[text()='Write a script to handle frames in web page?']")).getText();
		System.out.println(ele);
		
	
	}

}
