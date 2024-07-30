package timeoutProgram;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TimeoutEx {
	
	@Test(timeOut=10000)
	public void login() {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in");
	}
}
