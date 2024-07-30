package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class LaunchQuit {
	WebDriver driver;
	@BeforeMethod
	public  void launch() {
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fcss%2Fhomepage.html%3Fpd_rd_w%3Df71HI%26content-id%3Damzn1.sym.20fb3228-1742-4645-94f1-ed05550e6068%3Aamzn1.sym.20fb3228-1742-4645-94f1-ed05550e6068%26pf_rd_p%3D20fb3228-1742-4645-94f1-ed05550e6068%26pf_rd_r%3DCEXH8FVCFV74WM3AX6NM%26pd_rd_wg%3DaBGKe%26pd_rd_r%3D55089753-cdda-49a0-842f-7996e0931cef%26qid%3D1718613811%26ref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		WebElement un=driver.findElement(By.id("ap_email"));
		un.sendKeys("ranjitbhagwat007@gmail.com");
		WebElement continuebtn=driver.findElement(By.id("continue"));
		continuebtn.click();
		WebElement pass=driver.findElement(By.id("ap_password"));
		pass.sendKeys("Jobs@123");
		WebElement sign=driver.findElement(By.id("signInSubmit"));
		sign.click();
		
	}	
	
	@AfterMethod
	public  void quit() {
		WebElement acc=driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
		Actions a1=new Actions(driver);
		a1.moveToElement(acc).perform();
		WebElement signOut=driver.findElement(By.xpath("//span[.='Sign Out']"));
		signOut.click();
		
	}
}

