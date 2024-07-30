package assertionPrograms;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class AssertEx4 {

	
	@Test
	public void test1() {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		WebElement srch=driver.findElement(By.id("twotabsearchtextbox"));
		srch.sendKeys("shoes");
		srch.sendKeys(Keys.ENTER);
		WebElement shoe1=driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-tall-aspect'])[1]"));
		shoe1.click();
		Set<String> s1=driver.getWindowHandles();
		int count= s1.size();
		System.out.println("Count of Tabs: " +count);
		Assert.assertEquals(s1.size(),2,"Sorry");
		Iterator<String> pcid=s1.iterator();
		String pid=pcid.next();
		String cid=pcid.next();
		driver.switchTo().window(cid);
		WebElement addToCartBtn=driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
		Assert.assertEquals(addToCartBtn.isDisplayed(), true, "Sorry1");
		WebElement buyNow=driver.findElement(By.xpath("//input[@id='buy-now-button']"));
		Assert.assertEquals(buyNow.isEnabled(), true, "Sorry2");
		
		
		
	}
}
