package testNGAmazon;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test2 extends LaunchQuit {
	
	@Test
	
	public void steps() {
		WebElement srch=driver.findElement(By.id("twotabsearchtextbox"));
		srch.sendKeys("mobile");
		srch.sendKeys(Keys.ENTER);
		WebElement shoe1=driver.findElement(By.xpath("(//a[@class='a-link-normal s-no-outline'])[1]"));	
		shoe1.click();
		

		
	}

}