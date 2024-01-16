package practice;


import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCompare {

	public static void main(String[] args) throws Exception {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();

		WebElement search=driver.findElement(By.name("q"));
		search.sendKeys("iphone11");
		search.submit();

		System.out.println(driver.findElement(By.className("_10Ermr")).getText());
		List <WebElement> add=driver.findElements(By.xpath("//span[text()='Add to Compare']"));


		for(int i = 0 ; i<=add.size()-1 ; i++)
		{
			if(i%2==0 && i<=7)
			add.get(i).click();
			Thread.sleep(1000);
		}
		driver.close();
	}
}



