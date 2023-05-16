package FindElementsAssignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestionFlipkartSearch {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		// Open the chrome browser
		WebDriver driver = new ChromeDriver();
		// Enter the url
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		// Enter java into the search text box
		driver.findElement(By.xpath("//button[.='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("iphone");
		Thread.sleep(2000);
		// Store all the suggestions inside the list matching with the word java
		List<WebElement> autoSuggestions = driver.findElements(By.xpath("//span[contains(.,'iphone')]"));
		int count = autoSuggestions.size();
		System.out.println(count);
		// Printing text of all the suggestions
		// Printing text of all the suggestions using for-each loop
		for(WebElement auto:autoSuggestions) {
			String text = auto.getText();
			System.out.println(text);
		}
		// Clicking on the 1st suggestion
		autoSuggestions.get(count - 1).click();
//		driver.close();
	}
}
