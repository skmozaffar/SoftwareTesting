package WebElementAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsernamePasswordAlingedActitime {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		int x1 = driver.findElement(By.name("username")).getLocation().getX();
		System.out.println(x1);
		int x2 = driver.findElement(By.name("pwd")).getLocation().getX();
		System.out.println(x2);
		if(x1 == x2) {
			System.out.println("Username and Password field aligned properly");
		}
		else {
			System.out.println("Username and Password field not aligned properly");
		}
		driver.close();
	}
}
