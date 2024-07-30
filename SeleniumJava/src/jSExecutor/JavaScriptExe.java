package jSExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JavaScriptExe {
	
	@Test
	public void step() {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		WebElement abtUs= driver.findElement(By.linkText("About Us"));
		Point p1=abtUs.getLocation();
		int x=p1.getX();
		int y=p1.getY();		
		System.out.println(x);
		System.out.println(y);
		
		JavascriptExecutor j1=driver;
		j1.executeScript("window.scrollBy(0,"+y+")");
		
		
	}
}
