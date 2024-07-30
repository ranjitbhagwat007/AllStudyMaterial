package testNGAmazon;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test8 extends LaunchQuit {
	
	@Test
	
	public void steps() throws InterruptedException {
		WebElement dropDown=driver.findElement(By.id("searchDropdownBox"));	
		dropDown.click();
		WebElement book=driver.findElement(By.xpath("//option[.='Books']"));	
		book.click();
		Thread.sleep(2000);
		WebElement srch=driver.findElement(By.id("twotabsearchtextbox"));
		srch.sendKeys("Power of mind");
		srch.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		WebElement book1=driver.findElement(By.xpath("(//div[@class='puisg-col-inner'])[1]"));
		book1.click();
		


	}

}