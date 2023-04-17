package demo;


import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver", "C:\\Mozaffar\\Selenium\\SeleniumYoutube\\drivers\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver(); // A blank chrome browser will be launched
		
//		System.setProperty("webdriver.gecko.driver", "C:\\Mozaffar\\Selenium\\SeleniumYoutube\\drivers\\geckodriver.exe");
//		WebDriver driver = new FirefoxDriver(); // A blank firefox browser will be launched
		
		System.setProperty("webdriver.edge.driver", "C:\\Mozaffar\\Selenium\\SeleniumYoutube\\drivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver(); // A blank edge browser will be launched
		driver.get("http://omayo.blogspot.com/"); // This url will be opened in the above browser
		driver.manage().window().maximize(); // Maximizing the browser window
		
//		WebElement element = driver.findElement(By.id("confirm"));
//		element.click(); // To click the web element
		
//		WebElement element = driver.findElement(By.name("q"));
//		element.sendKeys("Arun Motoori"); // To give input to the web element which can accept an input
		
//		WebElement element = driver.findElement(By.id("textbox1"));
//		Thread.sleep(5000); // To perform the action after halting it for some time
//		element.clear(); // To clear the text of a web element
		
//		WebElement element = driver.findElement(By.className("classone"));
//		Thread.sleep(5000);
//		element.sendKeys("Arun Motoori");
		
//		WebElement element = driver.findElement(By.linkText("compendiumdev")); // We have to provide complete text present between tags
//		WebElement element = driver.findElement(By.partialLinkText("compendium")); // Don't need to provide complete text
//		WebElement element = driver.findElement(By.cssSelector("#confirm")); //Two step process
//		driver.findElement(By.xpath("//*[@id=\"confirm\"]")).click(); //One step process
		
//		String text = driver.findElement(By.id("pah")).getText(); // To get the text of the web element that is between tags on the output screen
//		System.out.println(text);
		
//		String  title = driver.getTitle(); // To get the title of the web page on the output screen
//		System.out.println("Title of the page: " + title);
		
//		String url = driver.getCurrentUrl();
//		System.out.println("url of the page: " + url);
		
//		driver.findElement(By.linkText("compendiumdev")).click(); // First it will click on the link then that link will be opened
//		String url2 = driver.getCurrentUrl();
//		System.out.println("Current url of the page: " + url2); // Show the link which is opened above, on the output screen
		
//		driver.findElement(By.linkText("Open a popup window")).click();
//		driver.findElement(By.linkText("Blogger")).click();
//		driver.close(); // By this only main window got closed not the child windows
		
//		String text = driver.findElement(By.id("textbox1")).getAttribute("value");
//		System.out.println(text);
		
//		boolean displayed = driver.findElement(By.id("but2")).isDisplayed();
//		boolean displayed = driver.findElement(By.id("hbutton")).isDisplayed();
//		System.out.println("Button is displayed on the page: " + displayed);
		
//		boolean enable = driver.findElement(By.id("but2")).isEnabled();
//		boolean enable = driver.findElement(By.id("but1")).isEnabled();
//		System.out.println("Button is enabled on the page: " + enable);
		
//		boolean select = driver.findElement(By.id("checkbox1")).isSelected();
//		boolean select = driver.findElement(By.id("checkbox2")).isSelected();
//		System.out.println("Checkbox is selected on the page: " + select);
		
//		driver.navigate().to("https://www.facebook.com");
//		Thread.sleep(3000);
//		driver.navigate().back();
//		Thread.sleep(3000);
//		driver.navigate().forward();
//		Thread.sleep(3000);
//		driver.navigate().refresh();
		
//		String source = driver.getPageSource();
//		System.out.println(source);
		
//		driver.quit(); // Every window got closed
		
// Tutorialsninja Web Application
//		driver.get("http://tutorialsninja.com/demo/index.php?route=account/login");
//		driver.manage().window().maximize();
		
//		driver.findElement(By.id("input-email")).sendKeys("arunmotoori3@gmail.com");
//		driver.findElement(By.id("input-password")).sendKeys("12345");
//		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).submit();
		
//		String tagname = driver.findElement(By.id("input-email")).getTagName();
//		System.out.println(tagname);
// Tutorialsninja Web Application
		
//		String value = driver.findElement(By.id("home")).getCssValue("line-height");
//		System.out.println(value);
		
//		Dimension d = driver.findElement(By.id("but2")).getSize();
//		System.out.println("Width of the button is: "+d.height);
//		System.out.println("Height of the button is: "+d.width);
		
//		Point d = driver.findElement(By.id("but2")).getLocation();
//		System.out.println("X coordinate of the button is: "+d.x);
//		System.out.println("Y coordinate of the button is: "+d.y);
		
//		driver.manage().window().fullscreen();
		
		List<WebElement> elements = driver.findElements(By.tagName("a"));
		
		for(WebElement j:elements) {
			if(j.getText().length() > 0)
				System.out.println(j.getText());
		}
		
//		for (int i = 0; i < elements.size(); i++) {
//			if(elements.get(i).getText().length() > 0)
//				System.out.println(elements.get(i).getText());
//		}
		
		Thread.sleep(3000);
		driver.quit();
		
		
		
	}

}
