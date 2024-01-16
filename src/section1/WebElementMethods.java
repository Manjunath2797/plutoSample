package section1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethods {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demoapps.qspiders.com/?scenario=1");
		driver.manage().window().maximize();
		
		
		
		//driver.findElement(By.xpath("//section[text()='Web Elements']")).click();
		driver.findElement(By.xpath("//section[text()='Check Box']")).click();
		WebElement element = driver.findElement(By.xpath("//input[@id='domain1']"));
		
		
		System.out.println(element.isDisplayed());
		System.out.println(element.isEnabled());
		System.out.println(element.isSelected());
		
		System.out.println("title "+driver.getTitle());
		System.out.println("page source "+ driver.getPageSource());
		System.out.println("current url "+ driver.getCurrentUrl());
		System.out.println("element size "+element.getSize());
		System.out.println("element location "+element.getLocation());
		System.out.println("element attribute value- "+element.getAttribute("id"));
		System.out.println("accessible name "+element.getAccessibleName());
		
		driver.close();
		
		

	}

}
