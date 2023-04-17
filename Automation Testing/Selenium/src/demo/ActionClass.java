package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {
	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "C:\\Mozaffar\\Selenium\\SeleniumYoutube\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // A blank chrome browser will be launched
		driver.get("http://omayo.blogspot.com"); // This url will be opened in the above browser
//		driver.get("http://omayo.blogspot.com/p/page3.html"); // This url is for drag and drop based on axis
//		driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html"); // for drag and drop
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
// Action Class
// ------------
		Actions a = new Actions(driver);
//   Mouse simulation
//	 ----------------	
//		Moving cursor
//		-------------
//		WebElement menu = driver.findElement(By.id("blogsmenu"));
//		a.moveToElement(menu).perform();
		
//		WebElement selenium143 = driver.findElement(By.xpath("//a/span[text()='Selenium143']"));
//		a.moveToElement(selenium143).click(selenium143).build().perform();
//		a.moveToElement(selenium143).click().build().perform(); // Use build when you have multiple commands in a single line
		
//		a.moveToElement(selenium143).perform();
//		a.click(selenium143).perform();
		
//		Drag and drop based on axis
//		---------------------------
//		WebElement minPrice = driver.findElement(By.xpath("//a[@aria-labelledby='price-min-label']"));
//		Thread.sleep(2000);
//		a.dragAndDropBy(minPrice, 100, 0).perform(); // forward x-axis
//		Thread.sleep(2000);
//		a.dragAndDropBy(minPrice, -200, 0).perform(); // backward x-axis
		
//		Right click
//		-----------
//		WebElement searchBox = driver.findElement(By.name("q"));
//		a.contextClick(searchBox).perform();
		
//		Double click
//		------------
//		WebElement searchfield = driver.findElement(By.name("q"));
//		Thread.sleep(2000);
//		searchfield.sendKeys("Arun");
//		Thread.sleep(2000);
//		a.doubleClick(searchfield).perform();
		
//		Drag and Drop
//		-------------
//		WebElement oslo = driver.findElement(By.id("box1"));
//		WebElement norway = driver.findElement(By.id("box101"));
//		a.dragAndDrop(oslo, norway).perform();
		
//   Keyboard simulation
//   -------------------	
//		Open in a new tab
//		-----------------
//		WebElement compandiumdevlink = driver.findElement(By.linkText("compendiumdev"));
//		Thread.sleep(2000);
//		a.keyDown(Keys.CONTROL).click(compandiumdevlink).keyUp(Keys.CONTROL).build().perform(); // build is optional
		
//		Send Keys
//		---------
		WebElement usernamefield = driver.findElement(By.name("userid"));
		WebElement passwordfield = driver.findElement(By.name("pswrd"));
		WebElement loginbutton = driver.findElement(By.xpath("//input[@value='Login']"));
		usernamefield.sendKeys("arunmotoori1");
		a.sendKeys(Keys.TAB).perform();
		passwordfield.sendKeys("12345");
		a.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).build().perform();
		
		Thread.sleep(2000);
		driver.quit();
	}
}
