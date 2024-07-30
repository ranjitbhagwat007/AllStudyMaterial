package testNGAmazon;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test6 extends LaunchQuit {
	
	@Test
	
	public void steps() throws InterruptedException {
		WebElement electro = driver.findElement(By.xpath("//a[.=' Electronics ']"));
		electro.click();
		WebElement chkbox = driver.findElement(By.xpath("(//span[.='Redmi'])[2]"));
		chkbox.click();
		
		 

		
		
	}

}