package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * access naukri.com
 * maximize the window
 * access flipkart
 * minimize the window
 * again maximize the window
 * go back to naukri
 * refresh the current webpage
 * go forward to flipkart
 * close the window
 * 
 */

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.driver.window", "C:\\selenium folder\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.naukri.com/");
		
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().minimize();
		driver.manage().window().maximize();
		Navigation n= driver.navigate();
		
		n.back();
		Thread.sleep(2000);
		n.refresh();
		Thread.sleep(2000);
		n.forward();
		Thread.sleep(2000);
		
		driver.close();
		

	}

}
