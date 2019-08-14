package com.training.pom;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;


public class AssignmentPOM {
	private WebDriver driver; 
	
	public AssignmentPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@href='http://elearningm1.upskills.in/courses/SELENIUM77/index.php?id_session=0']")
	private WebElement course;
	@FindBy(linkText="Tests")
	private WebElement test;
	@FindBy(xpath="//a[@href='exercise_report.php?cidReq=SELENIUM77&id_session=0&gidReq=0&gradebook=0&origin=&exerciseId=41']")
    private WebElement result;
	@FindBy(xpath="//img[@title='Grade activity']")
	private WebElement grade;
	@FindBy(name="send_notification")
	private WebElement checkbox;
	@FindBy(name="submit")
	private WebElement testcorrect;
	@FindBy(xpath="//div[@class='alert alert-info']")
	private WebElement expected;
	

   public void courseselection() {
	   this.course.click();
   }
   public void tests() {
	   this.test.click();
   }
   public void results() {
	   this.result.click();
   }
   public void gradeactivity() {
	   this.grade.click();
   }
   public void sendemail() {
	   this.checkbox.click();
   }
   public void correcttest() {
	   this.testcorrect.click();
   }
   public String expectedconfirmation() {
	return this.expected.getText();  
   }
}

	
   
	
