package wait;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FluentWaitEx {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		//WebDriverWait wb=new WebDriverWait(driver, Duration.ofSeconds(10));
		//wb.until(ExpectedConditions.titleIs("Google"));
		//wb.until(ExpectedConditions.titleIs("food"));//if title is given anything then it gives TimeoutException
		FluentWait f1=new FluentWait(driver).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofMillis(500)).ignoring(NoSuchElementException.class);
		f1.until(ExpectedConditions.titleIs("Google"));
	}
}
