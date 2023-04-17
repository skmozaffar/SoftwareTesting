package demo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTables {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Mozaffar\\Selenium\\SeleniumYoutube\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // A blank chrome browser will be launched
		driver.get("https://omayo.blogspot.com/"); // This url will be opened in the above browser
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
//		List<WebElement> heading = driver.findElements(By.xpath("//table[@id='table1']//th"));
//		List<WebElement> data = driver.findElements(By.xpath("//table[@id='table1']//td"));
//		List<WebElement> heading = driver.findElements(By.xpath("//table[@id='table1']//tr[1]/th"));
//		List<WebElement> firstrow = driver.findElements(By.xpath("//table[@id='table1']//tr[1]/td"));
//		
//		for(int i=0; i<firstrow.size(); i++) {
//			System.out.println(firstrow.get(i).getText());
//		}
		
//		To found one data based on another data
//		---------------------------------------
//		String place = driver.findElement(By.xpath("//td[text()='Manish']/../td[3]")).getText();
//		System.out.println(place);
		
//		String givenName = "Manish";
//		List<WebElement> names = driver.findElements(By.xpath("//table[@id='table1']//td[1]"));
//		int row = 0;
//		for(int i=0; i<names.size(); i++) {
//			if(names.get(i).getText().equals(givenName)) {
//				row = i;
//			}
//		}
//		String path = "//table[@id='table1']//tr["+(row+1)+"]//td[3]";
//		System.out.println(driver.findElement(By.xpath(path)).getText());
		
//		Rows and Column number
//		----------------------
		System.out.println("Rows :" + driver.findElements(By.xpath("//table[@id='table1']/tbody/tr")).size());
		System.out.println("Columns :" + driver.findElements(By.xpath("//table[@id='table1']/tbody/tr[1]//td")).size());
		
		driver.quit();
	}

}
