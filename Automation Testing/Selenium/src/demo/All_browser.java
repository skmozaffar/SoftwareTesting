package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class All_browser {

	public static void main(String[] args) throws InterruptedException {
		String browser = "chrome";
		WebDriver driver = null;
		if(browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Mozaffar\\Selenium\\SeleniumYoutube\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Mozaffar\\Selenium\\SeleniumYoutube\\drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if (browser.equalsIgnoreCase("Edge")) {
			System.setProperty("webdriver.edge.driver", "C:\\Mozaffar\\Selenium\\SeleniumYoutube\\drivers\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
		
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
		List<WebElement> elements = driver.findElements(By.tagName("a"));
		
		for(WebElement j:elements) {
			if(j.getText().length() > 0)
				System.out.println(j.getText());
		}
		
		Thread.sleep(3000);
		driver.quit();
	}

}
