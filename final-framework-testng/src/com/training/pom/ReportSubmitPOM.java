package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReportSubmitPOM {
private WebDriver driver; 
	
	public ReportSubmitPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText="Reporting")
	private WebElement link;
	@FindBy(linkText="Assigned courses")
	private WebElement courses;
	@FindBy(name="keyword")
	private WebElement Keyword;
	@FindBy(name="submit")
	private WebElement search;
	@FindBy(xpath="//table//tbody//tr[2]//td[1]//a[@href='http://elearningm1.upskills.in/courses/SELENIUM77/index.php?id_session=0']")
	private WebElement title;
	@FindBy(xpath="//table//tbody//tr[2]//td[10]//a//img[@src='http://elearningm1.upskills.in/main/img/icons/22/2rightarrow.png']")
	private WebElement details1;
	@FindBy(xpath="//table//tbody//tr[2]//td[16]//a//img[@title='Details']")
	private WebElement details2;
	@FindBy(xpath="//table//tbody//tr[1]//td[5]//a//img[@title='Test']")
	private WebElement quiz;
	@FindBy(name="send_notification")
	private WebElement send;
	@FindBy(name="submit")
	private WebElement submitt;
	@FindBy(xpath="//div[@class='alert alert-info']")
	private WebElement expected;
	@FindBy(xpath="//span[@class='label label-success']")
	private WebElement validate;
	
	
	public void reportinglink() {
		this.link.click();
	}
	public void coursesassigned() {
		this.courses.click();
	}
	public void keywordsearch() {
		this.Keyword.sendKeys("coursee");
	}
	public void submitbutton() {
		this.search.click();
	}
	public void detailsclick() {
		this.details1.click();
	}
	public void details2click() {
		this.details2.click();
	}
    public void quiztest() {
    	this.quiz.click();
    }
    public void sendcheckbox() {
    	this.send.click();
    }
    public void submitbutton1() {
    	this.submitt.click();
    }
    public String expectedconfirmation() {
    	return this.expected.getText();  
       }
    public String validateaction() {
    	return this.validate.getText();
    }
}
