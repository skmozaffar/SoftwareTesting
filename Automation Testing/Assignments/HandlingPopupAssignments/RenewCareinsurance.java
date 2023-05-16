package HandlingPopupAssignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RenewCareinsurance {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("policynumber")).sendKeys("123");
		driver.findElement(By.id("dob")).click();
		
		WebElement year = driver.findElement(By.className("ui-datepicker-year"));
		Select y = new Select(year);
		y.selectByValue("2002");
		
		WebElement month = driver.findElement(By.className("ui-datepicker-month"));
		Select m = new Select(month);
		m.selectByIndex(2);
		
		driver.findElement(By.xpath("//a[.='22']")).click();
		
		driver.findElement(By.id("alternative_number")).sendKeys("1234567890");
		
		driver.findElement(By.id("renew_policy_submit")).click();
		
		driver.close();
	}
}
