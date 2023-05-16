package HandlingWindowOrTab;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowOpenedNaukri {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		String parentWh = driver.getWindowHandle();
		Set<String> allWh = driver.getWindowHandles();
		// Counting number of windows opened
		int count = allWh.size();
		System.out.println(count);
		// Printing address of all the windows opened
		for(String wh:allWh) {
			System.out.println(wh);
		}
		// Printing title of all the windows opened
		for(String wh:allWh) {
			driver.switchTo().window(wh);
			System.out.println(driver.getTitle());
			// Closing all the browsers without using quit()
//			driver.close();
			// Closing all the browsers except parent browser
			if(!(wh.equals(parentWh))) {
				driver.close();
			}
		}
//		driver.close();
	}
}
