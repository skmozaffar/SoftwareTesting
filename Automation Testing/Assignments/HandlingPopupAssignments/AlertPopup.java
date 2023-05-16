package HandlingPopupAssignments;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertPopup {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("alert1")).click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.alertIsPresent());
//		String text = driver.switchTo().alert().getText();
//		System.out.println(text);
//		driver.switchTo().alert().accept();
		
		Alert a = driver.switchTo().alert();
		String text = a.getText();
		a.accept();
		System.out.println(text);
		driver.close();
	}
}
