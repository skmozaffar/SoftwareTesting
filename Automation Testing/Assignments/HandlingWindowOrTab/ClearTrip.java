package HandlingWindowOrTab;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearTrip {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.cleartrip.com/");
		driver.findElement(By.xpath("//input[@placeholder='Where from?']")).sendKeys("blr");
		driver.findElement(By.xpath("//p[contains(.,'BLR')]")).click();
		driver.findElement(By.xpath("//input[@placeholder='Where to?']")).sendKeys("blr");
		driver.findElement(By.xpath("//p[contains(.,'GOI')]")).click();
//		driver.findElement(By.xpath("//div[@class='fs-4 fw-500 c-inherit flex flex-nowrap ml-4']")).click();
//		driver.findElement(By.xpath("//div[@aria-label='Tue May 30 2023']")).click();
		driver.findElement(By.xpath("//span[.='Search flights']")).click();
	    List<WebElement> flights = driver.findElements(By.xpath("//img[@class and @alt]"));
	    List<WebElement> time = driver.findElements(By.xpath("//img[@class and @alt]/../../../../../div[2]/div/div[1]/p"));
	    int countFlight = flights.size();
	    System.out.println(countFlight);
	    for(int i=0;i<countFlight;i++) {
	    	String flightName = flights.get(i).getAttribute("Alt");
	    	String departuretime = time.get(i).getText();
	    	System.out.println("Flight Name: "+ flightName + "--> " + "Departure Time: "+ departuretime);
	    }
		driver.close();
	}
}
