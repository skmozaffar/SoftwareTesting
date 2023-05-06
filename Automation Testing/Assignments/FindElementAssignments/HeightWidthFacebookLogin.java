package FindElementAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HeightWidthFacebookLogin {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement loginbtn = driver.findElement(By.name("login"));
		int height = loginbtn.getSize().getHeight();
		int width = loginbtn.getSize().getWidth();
		System.out.println("Height "+ height);
		System.out.println("Widht "+ width);
		driver.close();
	}
}
