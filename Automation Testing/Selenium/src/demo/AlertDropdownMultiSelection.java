package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AlertDropdownMultiSelection {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Mozaffar\\Selenium\\SeleniumYoutube\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // A blank edge browser will be launched
		
		driver.get("http://omayo.blogspot.com/"); // This url will be opened in the above browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		// Handling Alert
//		------------------
//		driver.findElement(By.id("alert1")).click();
//		Thread.sleep(2000);
//		Alert alert = driver.switchTo().alert();
//		String textDisplayOnAlert = alert.getText();
//		System.out.println(textDisplayOnAlert);
//		
//		alert.accept();
		
		// Handling Dropdown
//		---------------------
		Thread.sleep(2000);
//		driver.findElement(By.id("drop1")).sendKeys("doc 3"); // This can be used but not the exact way
		
//		WebElement dropdownfield = driver.findElement(By.id("drop1"));
//		Select select = new Select(dropdownfield);
//		select.selectByVisibleText("doc 3");
//		select.selectByIndex(1);
		
		
		// Handling Multiselectionbox
//		---------------------
		Thread.sleep(2000);
		WebElement multiSelectionBoxField = driver.findElement(By.id("multiselect1"));
		Select select = new Select(multiSelectionBoxField);
		select.selectByVisibleText("Volvo");
		select.selectByVisibleText("Audi");
		select.selectByVisibleText("Hyundai");
		Thread.sleep(2000);
		select.deselectByVisibleText("Audi");
		
		Thread.sleep(2000);
		driver.quit();
	}

}
