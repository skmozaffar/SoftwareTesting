package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class KeysClass {

	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "C:\\Mozaffar\\Selenium\\SeleniumYoutube\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // A blank chrome browser will be launched
		driver.get("http://omayo.blogspot.com");
//		driver.get("http://tutorialsninja.com/demo/index.php?route=account/login"); // This is for clicking single key
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
// Keys Class
// ------------
//	  Clicking single key
//	  -------------------
//		driver.findElement(By.id("input-email")).sendKeys("arun.selenium@gmail.com");
//		driver.findElement(By.id("input-password")).sendKeys("Second@123");
//		driver.findElement(By.id("input-email")).sendKeys(Keys.ENTER);
		
//	  Clicking multiple keys
//	  ----------------------
		driver.findElement(By.id("ta1")).sendKeys("Arun motoori");
		Thread.sleep(2000);
		driver.findElement(By.id("ta1")).sendKeys(Keys.chord(Keys.CONTROL, "z")); // for pressing ctrl + z
		
		Thread.sleep(2000);
		driver.quit();
	}

}
