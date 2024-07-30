package browserless;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessBrowser {

	public static void main(String[] args) {
		ChromeOptions co=new ChromeOptions();
		co.addArguments("headless");
		ChromeDriver driver= new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		WebElement srch=	driver.findElement(By.id("twotabsearchtextbox"));
		srch.sendKeys("shoes");
		srch.sendKeys(Keys.ENTER);
		System.out.println("URL is "+driver.getCurrentUrl());
	}

}
