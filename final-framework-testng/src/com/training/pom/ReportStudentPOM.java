package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReportStudentPOM {
private WebDriver driver; 
	
	public ReportStudentPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText="Reporting")
	private WebElement link;
	@FindBy(linkText="Followed students")
	private WebElement student;
	@FindBy(name="keyword")
	private WebElement keyword;
	@FindBy(name="submit")
	private WebElement search;
	@FindBy(xpath="//img[@title='Details poornisab']")
	private WebElement details;
	@FindBy(xpath="//table//tbody//tr[2]//td[7]//img[@title='Details']")
	private WebElement detailslink;
	@FindBy(xpath="//table//tbody//tr[1]//td[5]//img[@title='Test']")
	private WebElement quiz;
    @FindBy(xpath="//input[@type='checkbox']")
    private WebElement email;
    @FindBy(name="submit")
    private WebElement correcttest;
    @FindBy(xpath="//a[@href='http://elearningm1.upskills.in/courses/SELENIUM77/index.php?id_session=0']")
    private WebElement courselink;
	public void reportinglink() {
		this.link.click();
	}
	public void followstudent() {
		this.student.click();
	}
	public void keywordsearch() {
		this.keyword.sendKeys("poorni");
	}
	public void searchbutton() {
		this.search.click();
	}
	public void detailslink() {
		this.details.click();
	}
	public void detailslinkclick() {
		this.detailslink.click();
	}
	public void quizicon() {
		this.quiz.click();
	}
	public void sendemail() {
		this.email.click();
	}
	public void submitbutton() {
		this.correcttest.click();
	}
	public void courselinkclick() {
		this.courselink.click();
	}
}
