package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames_Lightbox {
	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "C:\\Mozaffar\\Selenium\\SeleniumYoutube\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // A blank chrome browser will be launched
//		driver.get("http://omayo.blogspot.com"); // This url will be opened in the above browser
		driver.get("http://omayo.blogspot.com/p/lightbox.html"); // This url is for lightbox
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
//		Handling Frames
//		---------------
//		WebElement iframe2 = driver.findElement(By.id("iframe2"));
//		driver.switchTo().frame(iframe2);
//		driver.findElement(By.id("q")).sendKeys("Arun motoori"); // Web problem
//		driver.switchTo().defaultContent(); // Focusing on default window
//		driver.findElement(By.id("ta1")).sendKeys("Arun motoori");
		
//		System.out.println(driver.findElements(By.tagName("iframe")).size());
		
//		Handling Lightbox
//		-----------------
		driver.findElement(By.id("lightbox1")).click();
		// No need to swith to the lightbox as it looks separate thing but it is a part of same page
		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@class='close cursor']")).click();
//		driver.findElement(By.cssSelector("[class='close cursor']")).click();
		driver.findElement(By.cssSelector(".close.cursor")).click();
		
		Thread.sleep(2000);
		driver.quit();
	}
}
