package ListboxAssignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DOBFacebook {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Create new account")).click();
		WebElement daylist = driver.findElement(By.id("day"));
		Select d = new Select(daylist);
		d.selectByVisibleText("22");
		WebElement monlist = driver.findElement(By.id("month"));
		Select m = new Select(monlist);
		m.selectByVisibleText("Mar");
		WebElement yearlist = driver.findElement(By.id("year"));
		Select y = new Select(yearlist);
		y.selectByVisibleText("2002");
	}
}
