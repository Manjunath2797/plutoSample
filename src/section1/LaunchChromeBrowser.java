package section1;
/**
 * Access flipkart
 * Access amazon
 * perform maximization and minimization operations
 * perform navigation operations (back() , forward() , refresh())
 * close window
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;


public class LaunchChromeBrowser {

	public static void main(String[] args) throws InterruptedException {
		/* configuration*/
		/* from google version 112 set properties is optional step.*/
		System.setProperty("webdriver.chrome.driver","C:\\selenium folder\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		
		/* launching browser*/
		WebDriver driver=new ChromeDriver();
		
		/* Access to a web application */
		driver.get("https://www.flipkart.com/");
		driver.get("https://www.amazon.com/");
		
		/* maximize the window */
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		/* minimize the window*/
		driver.manage().window().minimize();
		driver.manage().window().maximize();
		
		/* navigation methods*/
		Navigation n=driver.navigate();
		
		/*go back to previous application*/
		n.back();
		Thread.sleep(2000);
		
		/* go to next application*/
		n.forward();
		Thread.sleep(2000);
		
		/*refresh the page*/
		n.refresh();
		Thread.sleep(2000);
		
		driver.close();	
	}
}
