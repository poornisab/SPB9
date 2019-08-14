package com.training.sanity.tests;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.AssignmentPOM;
import com.training.pom.LoginPOM;
import com.training.pom.ProjectCreatePOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class Testinggg {

	private WebDriver driver;
	private String baseUrl;
	private ProjectCreatePOM projectcreatePOM;
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
		projectcreatePOM = new ProjectCreatePOM(driver);
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
	public void validLoginTest() throws InterruptedException, IOException {
		loginPOM.sendUserName("poornis");
		loginPOM.sendPassword("Baskar@1");
		loginPOM.clickLoginBtn();
        projectcreatePOM.courseselection();
        projectcreatePOM.projectlink();
        String titlees = projectcreatePOM.titleget();
        System.out.println("title is " +titlees);
        Thread.sleep(6000);
        Assert.assertEquals("test1", titlees);
        File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File("c://Poornima"));
		
		screenShot.captureScreenShot("second");
	}
}
