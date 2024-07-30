package softHardAssertion;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

public class SoftHardAssertEx209 {
	
	@Test
	public void assertion() {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.findElement(By.name("email")).sendKeys("ranjitbhagwat007@gmail.com",Keys.ENTER);
		driver.findElement(By.name("pass")).sendKeys("ranjit",Keys.ENTER);

		
		SoftAssert a1=new SoftAssert();
		//Title assertion
		String actualTitle =driver.getTitle();
		String expectedTitle="Log in to Facebookk";
		a1.assertEquals(actualTitle, expectedTitle, "Title mismatched");
		a1.assertAll();
		Assertion a2=new Assertion();
		//Url assertion
		String actualUrl =driver.getCurrentUrl();
		String expectedUrl="https://www.facebook.com";
		a2.assertNotEquals(actualUrl, expectedUrl, "Url mismatched");
		
		driver.quit();
		
		}
}
