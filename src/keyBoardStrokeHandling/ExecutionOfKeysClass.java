package keyBoardStrokeHandling;
/**
 * Access demo qspiders app
 * click on keyborad actions
 * click on keyboard
 */

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExecutionOfKeysClass {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/?scenario=1");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//section[text()='Keyboard Actions']")).click();
		driver.findElement(By.xpath("//section[text()='Keyboard']")).click();

		driver.findElement(By.xpath("//input[@id=\'email\']")).sendKeys("manu@gmail.com" , Keys.TAB , "Welcome@123" , 
				Keys.TAB , "Welcome@123" , Keys.ENTER);
		driver.close();

	}

}
