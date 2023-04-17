package demo;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

public class WaitingMechanism {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Mozaffar\\Selenium\\SeleniumYoutube\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // A blank edge browser will be launched
		driver.get("http://omayo.blogspot.com/"); // This url will be opened in the above browser
		driver.manage().window().maximize();
		
//		driver.findElement(By.className("dropbtn")).click();
//		Thread.sleep(3000); // Drawback, when the option will come we don't know, suppuse we gave 10000 in our program but the
		// option came in 3 seconds, for clicking on that option we have to wait for 10 seconds, here we will be wasting 7 seconds
		
//		It is better to go with selenium waiting mechanism - ImplicitWait
//		------------------------------------------------------------------
		// It also have some drawbacks that is, since it is a global wait it will be applied for all the elements, for some number of
		// elements we are applying this to all the elements, which is a bad process and also suppose an element is not coming because
		// of some reason that means for that element we have to wait till 30 second(given time), here we will be wasting our time
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		
//		// 0 seconds - immediately click
//		driver.findElement(By.className("dropbtn")).click();
//		// 3 seconds - 3 seconds it only wait
//		driver.findElement(By.linkText("Facebook")).click();	
		
//		It is better to go with selenium waiting mechanismm - ExplicitWait
//		-------------------------------------------------------------------
//		WebDriverWait
//		--------------
//		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS); // This is global wait -- applied for all the elements
//		// 0 seconds - immediately click
//		driver.findElement(By.className("dropbtn")).click();
//		
//		WebDriverWait wait = new WebDriverWait(driver, 30); // This is individual wait -- applied to only specific element
//		WebElement fbElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Facebook")));
//		fbElement.click();
		
//		FluentWait - Advance concept
//		-----------------------------
		// Waiting 30 seconds for an element to be present on the page, checking
		   // for its presence once every 5 seconds.
		   Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
		       .withTimeout(Duration.ofSeconds(30))
		       .pollingEvery(Duration.ofSeconds(1))
		       .ignoring(NoSuchElementException.class);

		   WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
		     public WebElement apply(WebDriver driver) {
		       return driver.findElement(By.linkText("Facebook"));
		     }
		   });
		
		driver.quit();
	}

}
