package wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		WebDriverWait wb=new WebDriverWait(driver, Duration.ofSeconds(10));
		wb.until(ExpectedConditions.titleIs("Google"));
		//wb.until(ExpectedConditions.titleIs("food"));//if title is given anything then it gives TimeoutException

		WebElement wb1=driver.findElement(By.name("q"));
		wb1.sendKeys("shoes");
		wb1.sendKeys(Keys.ENTER);
	}

}
