package amazon;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test1 extends LaunchQuit {
	
	@Test
	public void steps() throws InterruptedException {
		WebElement srch=driver.findElement(By.id("twotabsearchtextbox"));
		srch.sendKeys("shoes");
		srch.sendKeys(Keys.ENTER);
		WebElement shoe1=driver.findElement(By.xpath("(//a[@class='a-link-normal s-no-outline'])[1]"));	
		//WebElement shoe1=driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]"));
		shoe1.click();
		Set<String> s1=driver.getWindowHandles();//in order to do all the next process like addToCart etc.. we need to switch to child tab
		Iterator<String> pcid=s1.iterator();
		String parentId=pcid.next();// first next method always gives parent id
		String childId=pcid.next();// 2nd next method gives child id
		driver.switchTo().window(childId);
		
	}

}
