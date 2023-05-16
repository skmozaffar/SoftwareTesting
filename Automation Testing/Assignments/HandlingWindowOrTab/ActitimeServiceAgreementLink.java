package HandlingWindowOrTab;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeServiceAgreementLink {
	static{
		System.setProperty("webdriver.chrome.driver",
		"./driver/chromedriver.exe");
		}
		public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text() ='Login ']")).click();
		driver.findElement(By.xpath("(//div[@class='popup_menu_icon'])[4]")).click();
		driver.findElement(By.linkText("About your actiTIME")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(.,'Read Service Agreement')]")).click();
		Set<String> wh = driver.getWindowHandles();
		int count = wh.size();
		System.out.println(count);
		for(String agtab:wh) {
			driver.switchTo().window(agtab);
		}
		List<WebElement> headings = driver.findElements(By.xpath("//h2"));
		for(WebElement allHeadings:headings){
		    System.out.println(allHeadings.getText());
		}
		driver.quit();
	}

}
