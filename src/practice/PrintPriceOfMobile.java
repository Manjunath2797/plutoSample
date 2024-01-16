package practice;

import java.util.Iterator;
import java.util.List;

import org.bouncycastle.util.Iterable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintPriceOfMobile {
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("q")).sendKeys("iphone11");
		driver.findElement(By.className("_2iLD__")).click();
		
		System.out.println(driver.findElement(By.className("_10Ermr")).getText());
		List <WebElement> prices=driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
		System.out.println(prices.get(5));
		Iterator<WebElement> itr = prices.iterator();
		while(itr.hasNext()) {
			String productPrices=itr.next().getText();
			String modifiedProductPrices=productPrices.replace(",","").substring(1);
		
			int price=Integer.parseInt(modifiedProductPrices);
			if (price<50000) {
				System.out.println(price);
			}
		}
		driver.close();	
	}
}
