package testNGAmazon;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test5 extends LaunchQuit {
	
	@Test
	
	public void steps()  {
		WebElement srch=driver.findElement(By.id("twotabsearchtextbox"));
		srch.sendKeys("camera");
		srch.sendKeys(Keys.ENTER);
		WebElement nextPage =driver.findElement(By.xpath("//a[@aria-label='Go to next page, page 2']"));
		nextPage.click();
		WebElement camera35=driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[12]"));	
		camera35.click();
		


		
		
	}

}