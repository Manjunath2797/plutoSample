package windowHandle;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WindowHandle1 {

	public static void main(String[] args) throws Exception {
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("q")).sendKeys("iphone11" , Keys.ENTER);
		
		List<WebElement> mobiles = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		int i=1;
		for (WebElement webElement : mobiles) {
			webElement.click();
			if (i==24) {
				break;
			}
			i=i+1;
			
			
		}
		
		//driver.findElement(By.xpath("//div[text()='APPLE iPhone 11 (White, 64 GB)']")).click();
		
	//	driver.findElement(By.xpath("//div[text()='APPLE iPhone 11 (Black, 64 GB)']")).click();
		
		
		String parentId=driver.getWindowHandle();
		Set<String> allIds = driver.getWindowHandles();
		
		
		
		for (String newIds : allIds) {
			if (!parentId.equals(newIds)) {
				Thread.sleep(3000);
				driver.switchTo().window(newIds);
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Add to cart']")));
				WebElement ele = driver.findElement(By.xpath("//button[text()='Add to cart']"));
				String add = ele.getText();
				//if (add.equals("Add to cart")) {
					ele.click();
				//}
				driver.close();
				driver.switchTo().window(parentId);	
			}
		}
		
		
		
		
	}

}
