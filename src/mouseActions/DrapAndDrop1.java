package mouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DrapAndDrop1 {

	public static void main(String[] args) throws Exception {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("q")).sendKeys("iphone11");
		driver.findElement(By.className("_2iLD__")).click();
		
		System.out.println(driver.findElement(By.className("_10Ermr")).getText());
		
		WebElement slider1=driver.findElement(By.xpath("(//div[@class='_3FdLqY'])[1]"));
		WebElement slider2=driver.findElement(By.xpath("(//div[@class='_3FdLqY'])[2]"));
		Thread.sleep(2000);
		
		Actions act = new Actions(driver);
		act.dragAndDropBy(slider1, 40, 0).perform();
		Thread.sleep(2000);
		act.dragAndDropBy(slider2, -40, 0).perform();
		
		driver.close();

	}

}
