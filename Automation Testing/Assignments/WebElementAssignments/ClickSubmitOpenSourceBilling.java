package WebElementAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickSubmitOpenSourceBilling {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opensourcebilling.org/users/sign_in");
		driver.manage().window().maximize();
		driver.findElement(By.id("user_login_btn")).submit();
		Thread.sleep(2000);
		driver.close();
	}

}
