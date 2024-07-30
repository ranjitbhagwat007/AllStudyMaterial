package listeners;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ITestListenerEx1.class)
public class TestCase1 extends ITestListenerEx1{

		@Test
		public static void addToCart() throws InterruptedException {
			
			driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.amazon.in");
			WebElement srch=	driver.findElement(By.id("twotabsearchtextbox"));
			srch.sendKeys("shoes");
			srch.sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			WebElement srch1=	driver.findElement(By.xpath("(//a[@class='a-link-normal s-no-outline'])[1]"));
			srch1.click();
			
		}
}
