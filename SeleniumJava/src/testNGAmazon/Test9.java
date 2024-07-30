package testNGAmazon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test9 extends LaunchQuit {
	
	@Test
	
	public void steps() throws InterruptedException {
		/*
		 * WebElement todayDeal=driver.findElement(By.linkText("Today's Deals"));
		 * todayDeal.click();
		 * 
		 * WebElement dealOfTheDay = driver.findElement(By.xpath(
		 * "(//button[@class='Bubble-module__bubble_HMAsFLoooPgV9bEqZsLu'])[2]"));
		 * dealOfTheDay.click();
		 * 
		 * WebElement selectProduct = driver.findElement(By.
		 * xpath("(//div[@class='a-section ProductCardImage-module__wrapper_YgLz4kq6ekChj01qeqOf'])[1]"
		 * )); selectProduct.click();
		 */
		driver.findElement(By.xpath("(//a[@class='nav-a  '])[6]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		driver.findElement(By.xpath("(//button[@class='Bubble-module__bubble_HMAsFLoooPgV9bEqZsLu'])[2]")).click();
	}

}
