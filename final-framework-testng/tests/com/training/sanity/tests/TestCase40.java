package com.training.sanity.tests;

import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

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

public class TestCase40 {

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
	public void validLoginTest() throws InterruptedException {
		loginPOM.sendUserName("poornis");
		loginPOM.sendPassword("Baskar@1");
		loginPOM.clickLoginBtn(); 
        projectcreatePOM.courseselection();
        projectcreatePOM.projectlink();
        projectcreatePOM.newprojectcreate();
        projectcreatePOM.titlepage();
        projectcreatePOM.saveblog();
        projectcreatePOM.projectlinkk();
        projectcreatePOM.newtask();
        projectcreatePOM.projectitlee();
        projectcreatePOM.savebutton();
        projectcreatePOM.rolemanagement();
        projectcreatePOM.newroleadd();
        projectcreatePOM.roletitle();
        projectcreatePOM.rolesubmitbutton();
        projectcreatePOM.assignrole();
        projectcreatePOM.userdropdown();
        projectcreatePOM.validate();
        projectcreatePOM.usermanage();
        projectcreatePOM.clickcheckbox();
        projectcreatePOM.registerlick();
        Thread.sleep(6000);
        String titlees = projectcreatePOM.titleget();
        Assert.assertEquals("test3", titlees);
        System.out.println("title is "  +titlees);
        String message = projectcreatePOM.alertcheck();
        Assert.assertEquals("The user has been registered"  , message);
        System.out.println("text is displayed as "  +message);
        
		
		screenShot.captureScreenShot("second");
	}
}
