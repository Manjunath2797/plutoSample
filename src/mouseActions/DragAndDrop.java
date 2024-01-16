package mouseActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/?scenario=1");
		
		WebElement element=driver.findElement(By.xpath("//section[text()='Mouse Actions']"));
		Actions act=new Actions(driver);
		act.click(element).perform();
		
		element=driver.findElement(By.xpath("//section[text()='Drag & Drop']"));
		act.moveToElement(element).click().perform();
		
		element=driver.findElement(By.xpath("//a[text()='Drag Position']"));
		act.moveToElement(element).click().perform();
		
		WebElement srcMobileCharge=driver.findElement(By.xpath("//div[text()='Mobile Charger']"));
		WebElement destMobileAccessories=driver.findElement(By.xpath("//div[text()='Mobile Accessories']"));
		act.dragAndDrop(srcMobileCharge, destMobileAccessories).perform();
		
		WebElement srcMobileCover=driver.findElement(By.xpath("//div[text()='Mobile Cover']"));
		act.dragAndDrop(srcMobileCover, destMobileAccessories).perform();
		
		WebElement destLaptopAccessories=driver.findElement(By.xpath("//div[text()='Laptop Accessories']"));
		WebElement srcLaptopCharger=driver.findElement(By.xpath("//div[text()='Laptop Charger']"));
		act.dragAndDrop(srcLaptopCharger, destLaptopAccessories).perform();
		
		WebElement srcLaptopCover=driver.findElement(By.xpath("//div[text()='Laptop Cover']"));
		act.dragAndDrop(srcLaptopCover, destLaptopAccessories).perform();
		
		 
		
		
		
		

	}

}
