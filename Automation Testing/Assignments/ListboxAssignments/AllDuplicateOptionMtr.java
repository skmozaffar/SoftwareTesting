package ListboxAssignments;

import java.util.HashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllDuplicateOptionMtr {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		HashSet<String> hs = new HashSet<>();
		WebDriver driver = new ChromeDriver();
		driver.get("https://skmozaffar.github.io/HotelMenu/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement mtrList = driver.findElement(By.id("mtr"));
		Select s = new Select(mtrList);
		List<WebElement> allOpt = s.getOptions();
		for(WebElement option:allOpt) {
			String text = option.getText();
			if(hs.add(text) == false) {
				System.out.println(text);
			}
		}
		driver.close();
	}
}
