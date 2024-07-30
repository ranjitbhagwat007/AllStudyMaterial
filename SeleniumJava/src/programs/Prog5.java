package programs;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Prog5 {
	@Test
	public static void logout() throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F%26tag%3Dgooghydrabk1-21%26ref%3Dnav_ya_signin%26adgrpid%3D155259815513%26hvpone%3D%26hvptwo%3D%26hvadid%3D674842289437%26hvpos%3D%26hvnetw%3Dg%26hvrand%3D15040880216219234610%26hvqmt%3De%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D9062237%26hvtargid%3Dkwd-10573980%26hydadcr%3D14453_2316415%26gad_source%3D1&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		WebElement phn1=	driver.findElement(By.id("ap_email"));
		phn1.sendKeys("7507051822");
		WebElement cont1=	driver.findElement(By.id("continue"));
		cont1.click();
		WebElement pass1=	driver.findElement(By.name("password"));
		pass1.sendKeys("Jobs@123");
		WebElement sign1=	driver.findElement(By.id("signInSubmit"));
		sign1.click();
		WebElement wb=driver.findElement(By.id("twotabsearchtextbox"));
		wb.sendKeys("shoes");
		wb.sendKeys(Keys.ENTER);
		WebElement srch1=	driver.findElement(By.xpath("(//a[@class='a-link-normal s-no-outline'])[1]"));
		srch1.click();
		Set<String> s1= driver.getWindowHandles();
		System.out.println(s1);
		Iterator<String> pcid= s1.iterator();
		String parentId= pcid.next();
		String childId= pcid.next();
		System.out.println(parentId);
		System.out.println(childId);
		
		driver.switchTo().window(childId);
		WebElement addToWishlist=	driver.findElement(By.xpath("//input[@id='add-to-wishlist-button-submit']"));
		addToWishlist.click();
		Thread.sleep(2000);
		WebElement viewList=	driver.findElement(By.xpath("//a[.='View Your List']"));
		viewList.click();
		WebElement addToCart1=	driver.findElement(By.linkText("Add to Cart"));
		addToCart1.click();
		WebElement acc=	driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		Actions a1= new Actions(driver);
		a1.moveToElement(acc).perform();
		WebElement logout1=	driver.findElement(By.linkText("Sign Out"));
		logout1.click();
		
	}
}
