package dropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/?scenario=1");
		Thread.sleep(2000);
		
	//	driver.findElement(By.xpath("//section[text()='Web Elements']")).click();
		driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
		
		WebElement element=driver.findElement(By.xpath("//select[@id=\"select1\"]"));
		
		Select sel= new Select(element);
		sel.selectByValue("+44");
		
		element=driver.findElement(By.xpath("//select[@id=\"select2\"]"));
		sel=new Select(element);
		sel.selectByIndex(2);
		
		element=driver.findElement(By.xpath("//select[@id=\"select3\"]"));
		sel=new Select(element);
		sel.selectByVisibleText("India");  
		
	}
}
