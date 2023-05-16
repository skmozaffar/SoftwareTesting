package ListboxAssignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDeselectReverseMtr {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://skmozaffar.github.io/HotelMenu/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement mtrList = driver.findElement(By.id("mtr"));
		Select s = new Select(mtrList);
		List<WebElement> allOpt = s.getOptions();
		int count = allOpt.size();
		for(int i=0; i<count; i++) {
			s.selectByIndex(i);
			Thread.sleep(1000);
		}
		for(int i=count-1; i>=0; i--) {
			s.deselectByIndex(i);
			Thread.sleep(1000);
		}
		driver.close();
	}
}
