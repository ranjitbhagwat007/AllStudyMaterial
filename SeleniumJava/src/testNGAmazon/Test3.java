package testNGAmazon;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test3 extends LaunchQuit {
	
	@Test
	
	public void steps() throws InterruptedException {
		WebElement srch=driver.findElement(By.id("twotabsearchtextbox"));
		srch.sendKeys("mouse");
		srch.sendKeys(Keys.ENTER);
		WebElement chkbox=driver.findElement(By.xpath("//span[.='Get It in 2 Days']"));	
		chkbox.click();
		Thread.sleep(2000);
		WebElement mouse1=driver.findElement(By.xpath("(//div[@class='puisg-col-inner'])[1]"));	
		mouse1.click();
		

		
	}

}