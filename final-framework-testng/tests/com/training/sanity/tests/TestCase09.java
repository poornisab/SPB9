package com.training.sanity.tests;

import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.pom.RegisterUnsubscribePOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class TestCase09 {

	private WebDriver driver;
	private String baseUrl;
	private RegisterUnsubscribePOM registerunsubscribePOM;
	private static Properties properties;
	private ScreenShot screenShot;
	

	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		registerunsubscribePOM = new RegisterUnsubscribePOM(driver); 
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}
	@Test
	public void validLoginTest() {
		registerunsubscribePOM.sendUserName("poornis");
		registerunsubscribePOM.sendPassword("Baskar@1");
		registerunsubscribePOM.clickLoginBtn(); 
		registerunsubscribePOM.courseselect();
		registerunsubscribePOM.users();
		registerunsubscribePOM.userselect();
		registerunsubscribePOM.unsubscribeuser();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		screenShot.captureScreenShot("second");
	}
}
