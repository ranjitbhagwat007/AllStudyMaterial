package browsing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class ParallelBrowsing {
	WebDriver driver;
	@Test
	@Parameters("browser")
	public void testCase1(String nameOfBrowser) {
		if(nameOfBrowser.equals("chrome")) 
		{
			driver=new ChromeDriver();
		}
		if(nameOfBrowser.equals("edge")) 
		{
			driver=new EdgeDriver();
		}
		if(nameOfBrowser.equals("firefox")) 
		{
			driver=new FirefoxDriver();
		}
	
	driver.manage().window().maximize();
	driver.get("https://www.google.com");
	WebDriverWait wb=new WebDriverWait(driver, Duration.ofSeconds(10));
	wb.until(ExpectedConditions.titleIs("Google"));
	//wb.until(ExpectedConditions.titleContains("Goog"));
	//wb.until(ExpectedConditions.titleIs("food"));//if title is given anything then it gives TimeoutException

	WebElement wb1=driver.findElement(By.name("q"));
	wb1.sendKeys("shoes");
	wb1.sendKeys(Keys.ENTER);
}
}

