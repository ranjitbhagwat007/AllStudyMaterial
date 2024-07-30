package testNGAmazon;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test4 extends LaunchQuit {
	
	@Test

	public void steps() throws InterruptedException {
		WebElement srch=driver.findElement(By.id("twotabsearchtextbox"));
		srch.sendKeys("mobile cover");
		srch.sendKeys(Keys.ENTER);
		WebElement chkbox=driver.findElement(By.xpath("//span[.='Include Out of Stock']"));	
		chkbox.click();
		Thread.sleep(2000);

		
	}

}