package com.training.sanity.tests;

import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class TestCase07 {

	private WebDriver driver;
	private String baseUrl;
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
		loginPOM.createcourse();
		String actual = loginPOM.courseMessage();
		String expected = "Add a new course";
		assertEquals(actual, expected);
		System.out.println("AddNewCourseis Present");
		loginPOM.courseName();
		loginPOM.advanceSettings();
		loginPOM.selections();
		loginPOM.selectlang();
		loginPOM.courses();
		loginPOM.textintro();
		loginPOM.frame();
		loginPOM.savebutton();
		String expected1 = loginPOM.expected1confirmation();
		assertEquals("Intro was updated",expected1);
	System.out.println("text is displayed");
		screenShot.captureScreenShot("five");
	}
}
