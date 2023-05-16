package HandlingWindowOrTab;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTabActitime {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.linkText("actiTIME Inc.")).click();
		Set<String> allWh=driver.getWindowHandles();
		// Printing address of all the tabs opened
		int count = allWh.size();
		System.out.println(count);
		// Printing address of all the tabs opened
		for(String wh:allWh) {
			System.out.println(wh);
		}
		// Printing title of all the tabs opened
		for(String wh:allWh) {
			driver.switchTo().window(wh);
			System.out.println(driver.getTitle());
			// Closing all the tabs without using quit()
			driver.close();
		}
//		driver.close(); // for closing current tab
//		driver.quit(); // for closing all the tabs
	}
}
