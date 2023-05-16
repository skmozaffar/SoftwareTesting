package FindElementsAssignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeywordAutoSuggestionGoogle {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		// Open the chrome browser
		WebDriver driver = new ChromeDriver();
		// Enter the url
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		// Enter java into the search text box
		driver.findElement(By.name("q")).sendKeys("java");
		Thread.sleep(2000);
		// Store all the suggestions inside the list matching with the word java
		List<WebElement> autoSuggestions = driver.findElements(By.xpath("//span[contains(.,'java')]"));
		int count = autoSuggestions.size();
		System.out.println(count);
		// Printing text of all the suggestions
//		for(int i=0;i<count;i++) {
//			String text = autoSuggestins.get(i).getText();
//			System.out.println(text);
//		}
		// Printing text of all the suggestions using for-each loop
		for(WebElement auto:autoSuggestions) {
			String text = auto.getText();
			System.out.println(text);
		}
		// Clicking on the 1st suggestion
		autoSuggestions.get(0).click();
		driver.close();
	}
}
