package FindElementAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckSizeUsernamePasswordActitime {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		WebElement usernameField = driver.findElement(By.id("username"));
		WebElement passwordField = driver.findElement(By.xpath("//input[@type='password']"));
		int usernameHeight = usernameField.getSize().getHeight();
		int usernameWidht = usernameField.getSize().getWidth();
		int passwordHeight = passwordField.getSize().getHeight();
		int passwordWidht = passwordField.getSize().getHeight();
		if(usernameHeight == passwordHeight) {
			System.out.println("Both have same height");
		}
		else {
			System.out.println("Both have different heights");
		}
		if(usernameWidht == passwordWidht) {
			System.out.println("Both have same width");
		}
		else {
			System.out.println("Both have different widths");
		}
		driver.close();
	}
}
