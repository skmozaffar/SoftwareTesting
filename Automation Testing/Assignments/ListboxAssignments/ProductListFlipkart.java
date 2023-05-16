package ListboxAssignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProductListFlipkart {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//button)[2]")).click();
		driver.findElement(By.name("q")).sendKeys("iphone 12" + Keys.ENTER);
		List<WebElement> productName = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		List<WebElement> productPrice = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
		int count = productName.size();
		System.out.println(count);
		for(int i=0; i<count; i++) {
			String nameText = productName.get(i).getText();
			String priceText = productPrice.get(i).getText();
			System.out.println(nameText + " --> " + priceText);
		}
		driver.close();
	}
}
