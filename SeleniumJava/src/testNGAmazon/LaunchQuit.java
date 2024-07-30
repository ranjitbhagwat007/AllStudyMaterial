package testNGAmazon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class LaunchQuit {
	WebDriver driver;
	@BeforeMethod
	@Parameters("browser")
	public void launch(String nameOfBrowser) {
		if(nameOfBrowser.equals("chrome")) 
		{
			driver=new ChromeDriver();
		}
		if(nameOfBrowser.equals("edge")) 
		{
			driver=new EdgeDriver();
		}
		if(nameOfBrowser.equals("firefox")) 
		{
			driver=new FirefoxDriver();
		}
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
	}	
	
	@AfterMethod
	public  void quit() {
		driver.quit();
		
	}
}

