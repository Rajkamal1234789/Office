package Dummy;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.google.common.io.Files;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class NewTest {
	WebDriver driver;
	ExtentReports report;
	ExtentTest test;
  @Test
 public void login() throws Exception {
	  report=new ExtentReports("F:\\MavenVenkat\\StockAccounting\\Reports\\raj.html");
	  test=report.startTest("login");
	  System.setProperty("webdriver.chrome.driver", "F:\\MavenVenkat\\StockAccounting\\drivers\\chromedriver.exe");
	  driver=new ChromeDriver();
	 
	  test.log(LogStatus.PASS, "browser opened");
	  driver.get("http://www.google.com");
	  test.log(LogStatus.PASS, "url opened");
	  driver.manage().window().maximize();
	  test.log(LogStatus.PASS, "window maximized");
      driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
      TakesScreenshot ts=(TakesScreenshot)driver;
     File src=ts.getScreenshotAs(OutputType.FILE);
     String screenpath="F:\\MavenVenkat\\StockAccounting\\Screenshots\\rajkamal1.png";
     Files.copy(src, new File(screenpath));
     test.log(LogStatus.PASS, "screenshot taken");
     report.flush();
     report.endTest(test);
     
      
      
      
		  
	  
  }
}
