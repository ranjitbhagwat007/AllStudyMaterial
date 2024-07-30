package assertionPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert198{
	
	@Test
	public void test1() throws InterruptedException {
	ChromeDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.google.com");
	driver.findElement(By.name("q")).sendKeys("India");
	driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	Thread.sleep(2000);
	
	Assert.assertEquals(driver.getTitle(), "India - Google Search","sorry");
	System.out.println(driver.getTitle());
}
}