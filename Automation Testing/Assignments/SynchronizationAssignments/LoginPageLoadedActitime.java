package SynchronizationAssignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageLoadedActitime {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		try {
			driver.get("https://demo.actitime.com/login.do");
			System.out.println("The login page is loaded within 15 seconds");
		}
		catch (Exception e) {
			System.out.println("The login page is not loaded within 15 seconds");
		}
		driver.close();
	}
}
