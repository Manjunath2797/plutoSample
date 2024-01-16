package practice;
import java.time.Duration;

import org.openqa.selenium.By;
/**
 * Access flipkart
 * search for iphone11
 * fetch result
 * fetch the first product name and price
 * close the window
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VerifyUserIsAbleToFetechNameAndPrice {
	public static void main(String[] args) {
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("q")).sendKeys("iphone11");
		driver.findElement(By.className("_2iLD__")).click();
		//explicitly wait
				WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(10));
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("_10Ermr")));
		
		System.out.println(driver.findElement(By.className("_10Ermr")).getText());
		System.out.println(driver.findElement(By.xpath("//div[text()='APPLE iPhone 11 (Black, 64 GB)']")).getText());
		
		System.out.println(driver.findElement(By.xpath("//div[text()='APPLE iPhone 11 (White, 128 GB)']/../following-sibling::div/div/div/div")).getText());
		driver.close();
		
		
	}

}
