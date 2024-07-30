package popUp;

import java.util.Arrays;

import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserPopUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("excludeSwitches",Arrays.asList("disable-popup-blocking"));
		//https://developer.chrome.com/docs/chromedriver/capabilities
		//https://grotechminds.com/automate-me/
	}

}
