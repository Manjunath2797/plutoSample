package calender;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderPopUp1 {

	public static void main(String[] args) throws Exception {
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DAY_OF_MONTH, 10);
		Date d= cal.getTime();
		
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/YYYY");
		String customDate = sdf.format(d);
		System.out.println(customDate);
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		
		driver.findElement(By.id("datepicker")).sendKeys(customDate);
		Thread.sleep(2000);
	}

}
