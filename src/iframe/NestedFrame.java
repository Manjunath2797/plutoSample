package iframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrame {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demoapps.qspiders.com/?scenario=1");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//section[text()='Frames']")).click();
		driver.findElement(By.xpath("//section[text()='iframes']")).click();
		driver.findElement(By.xpath("//a[text()='Nested iframe']")).click();
		
		driver.switchTo().frame(0);
		
		String email = driver.findElement(By.xpath("//p[text()='Admin@gmail.com']")).getText();
		String password = driver.findElement(By.xpath("(//p[text()='Admin@1234'])[1]")).getText();
		String cPassword = driver.findElement(By.xpath("(//p[text()='Admin@1234'])[2]")).getText();
		
	//	driver.switchTo().defaultContent();
		
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys(email);
		
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@id='confirm-password']")).sendKeys(cPassword , Keys.ENTER);
		
		driver.switchTo().parentFrame();
		String Note = driver.findElement(By.xpath("//p[contains(text(),'          Note')]")).getText();
		System.out.println(Note);
		
		driver.switchTo().defaultContent();
		
		driver.close();
		
		

	}

}
