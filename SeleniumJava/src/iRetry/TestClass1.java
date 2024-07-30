package iRetry;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass1{
	
	@Test(retryAnalyzer=iRetry.IRetryEx1.class)
	public void launch( ) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		WebElement srch=driver.findElement(By.id("twotabsearchtextbox"));
		srch.sendKeys("shoes");
		srch.sendKeys(Keys.ENTER);
		WebElement shoe1=driver.findElement(By.xpath("(//ab[@class='a-link-normal s-no-outline'])[1]"));//if xpath is given wrong then only the TC will retry & execute	
		shoe1.click();
		Set<String> pid=driver.getWindowHandles();
		
		Assert.assertEquals(pid.size(),2,"TestClass1 failed");
	
	}
}
