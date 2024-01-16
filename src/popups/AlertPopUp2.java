package popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp2 {

	public static void main(String[] args) throws Exception {
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demoapps.qspiders.com/?scenario=1");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//section[text()='Popups']")).click();
		driver.findElement(By.xpath("//section[text()='Javascript']")).click();
		driver.findElement(By.xpath("//a[text()='Prompt']")).click();
		driver.findElement(By.xpath("//button[text()='Prompt Alert Box']")).click();
		
		Alert alt = driver.switchTo().alert();
		alt.sendKeys("yes");
		Thread.sleep(3000);
		
		String alertMsg = alt.getText();
		System.out.println(alertMsg);
		alt.accept();
		
		driver.close();

	}

}
