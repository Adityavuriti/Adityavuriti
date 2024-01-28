import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearch extends Locators {
	
	@Test
	public void textSearch() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(googleSearchBox)).sendKeys("youtube");
		driver.findElement(By.xpath(googleSearchBox)).sendKeys(Keys.ENTER);
		
		Thread.sleep(3000);
		String title = driver.getTitle();
		System.out.print(title);
		
		driver.quit();
	}

}
