package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitAndExplicitWait {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		// implicitly wait
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/?scenario=1");
		
		driver.findElement(By.xpath("//section[text()='Synchronization']")).click();
		
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//section[text()='Progress Bar']")));
		driver.findElement(By.xpath("//section[text()='Progress Bar']")).click();
		
		driver.findElement(By.xpath("//button[text()='Start']")).click();
		
		wait= new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='100%']")));
		
		driver.findElement(By.xpath("//button[text()='Reset']")).click();
		
		driver.close();
		
		

	}

}
