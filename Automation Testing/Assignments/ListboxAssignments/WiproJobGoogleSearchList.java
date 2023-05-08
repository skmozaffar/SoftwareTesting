package ListboxAssignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WiproJobGoogleSearchList {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.name("q")).sendKeys("wipro jobs" + Keys.ENTER);
		List<WebElement> allLinks = driver.findElements(By.xpath("//a[contains(.,'wipro')]"));
		int count = allLinks.size();
		System.out.println(count);
		for(WebElement allUrl:allLinks) {
			String url = allUrl.getAttribute("href");
			System.out.println(url);
		}
		driver.close();
	}
}
