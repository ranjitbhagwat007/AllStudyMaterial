package testNGAmazon;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test7 extends LaunchQuit {
	
	@Test
	
	public void steps() throws InterruptedException {
		WebElement dropDown=driver.findElement(By.id("searchDropdownBox"));	
		dropDown.click();
		WebElement amznfrsh=driver.findElement(By.xpath("//option[.='Amazon Fresh']"));	
		amznfrsh.click();
		Thread.sleep(2000);
		WebElement srch=driver.findElement(By.id("twotabsearchtextbox"));
		srch.sendKeys("mango");
		srch.sendKeys(Keys.ENTER);
		

		
	}

}
