package WebElementAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginButtonWorking {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		boolean logo = driver.findElement(By.xpath("//button[@type='submit']")).isEnabled();
		if(logo == true) {
			System.out.println("Login button is working");
		}
		else {
			System.out.println("Login button is not working");
		}
		driver.close();
	}
}
