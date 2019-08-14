package com.training.sanity.tests;

import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.ReportSubmitPOM;
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class TestCase037 {
	private WebDriver driver;
	private String baseUrl;
	private ReportSubmitPOM reportsubmitPOM;
	private LoginPOM loginPOM;
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
		loginPOM = new LoginPOM(driver); 
		reportsubmitPOM = new ReportSubmitPOM(driver);
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
	public void validLoginTest() throws InterruptedException {
		loginPOM.sendUserName("poornis");
		loginPOM.sendPassword("Baskar@1");
		loginPOM.clickLoginBtn(); 
		reportsubmitPOM.reportinglink();
		reportsubmitPOM.coursesassigned();
		reportsubmitPOM.keywordsearch();
		reportsubmitPOM.submitbutton();
		reportsubmitPOM.detailsclick();
		reportsubmitPOM.details2click();
		reportsubmitPOM.quiztest();
		reportsubmitPOM.sendcheckbox();
		reportsubmitPOM.submitbutton1();
		String expected = reportsubmitPOM.expectedconfirmation();
		assertEquals("Message Sent", expected);
		System.out.println("text is present");
		String expected1 = reportsubmitPOM.validateaction();
		assertEquals("Validated", expected1);
		System.out.println("Validated is present");
		Thread.sleep(6000);
	    

	}
	

}
