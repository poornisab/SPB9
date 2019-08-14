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
import com.training.pom.ReportStudentPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class TestCase39 {
	private WebDriver driver;
	private String baseUrl;
	private ReportStudentPOM reportstudentPOM;
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
		reportstudentPOM = new ReportStudentPOM(driver);
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
		reportstudentPOM.reportinglink();
		reportstudentPOM.followstudent();
		reportstudentPOM.keywordsearch();
		reportstudentPOM.searchbutton();
		reportstudentPOM.detailslink();
		reportstudentPOM.detailslinkclick();
		reportstudentPOM.quizicon();
		//reportstudentPOM.sendemail();
		//reportstudentPOM.submitbutton();
		//reportstudentPOM.courselinkclick();
		Thread.sleep(6000);
	    

	}
	

}
