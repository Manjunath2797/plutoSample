package dropDown;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DropDown2 {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		WebElement element=driver.findElement(By.xpath("//span[text()='Electronics']"));
		Actions act=new Actions(driver);
		act.moveToElement(element).perform();
		
		List<WebElement> audio= driver.findElements(By.xpath("//a[@class=\"_3490ry\"]"));
		//TreeSet<String> alist= new TreeSet<String>();
		ArrayList <String> alist=new ArrayList<String>();
		
		Iterator<WebElement> itr = audio.iterator();
		while (itr.hasNext()) {
			String values=itr.next().getText();
			alist.add(values);
			
			 
			
			
			
		}
		Collections.sort(alist);
		System.out.println(alist);
	//	Collections.reverseOrder(alist);
		driver.close();
	}

}
