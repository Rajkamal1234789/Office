package CommonFUnctionalLibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Utilities.PropertyFileUtil;

public class FunctionalLibrary {

	static WebDriver driver;
	public static void main(String[] args) throws Exception {
		if(PropertyFileUtil.getValueKey("browser").equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//drivers//chromedriver.exe+");
		driver=new ChromeDriver();
			
		}
		
		

	}

}


