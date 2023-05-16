package HandlingMouseAction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickVtiger {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.vtiger.com/home/");
		Actions a = new Actions(driver);
		WebElement resources = driver.findElement(By.linkText("Resources"));
		a.moveToElement(resources).perform();
		driver.findElement(By.linkText("Customers")).click();
//		WebElement rtc = driver.findElement(By.xpath("//a[.='READ THE CASE'])[1]"));
//		a.moveToElement(rtc).perform();
	}
}
