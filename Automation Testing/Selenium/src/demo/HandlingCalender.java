package demo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCalender {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Mozaffar\\Selenium\\SeleniumYoutube\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // A blank chrome browser will be launched
		driver.get("https://www.path2usa.com/travel-companions"); // This url will be opened in the above browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		Thread.sleep(5000);
		
		driver.findElement(By.id("travel_date")).click();
		
		while(driver.findElement(By.className("datepicker-switch")).getText().contains("december")) {
			driver.findElement(By.xpath("(//th[@class='next'])[1]")).click();
		}
		
		List<WebElement> days = driver.findElements(By.className("day"));
		for(int i=0; i<days.size(); i++) {
			if(days.get(i).getText().equalsIgnoreCase("15")) {
				days.get(i).click();
				break;
			}
		}
	}

}
