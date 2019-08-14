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


public class ProjectCreatePOM {
	private WebDriver driver; 
	
	public ProjectCreatePOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@href='http://elearningm1.upskills.in/courses/SELENIUM77/index.php?id_session=0']")
	private WebElement course;
	@FindBy(linkText="Projects")
	private WebElement project;
	@FindBy(xpath="//img[@title='Create a new project']")
	private WebElement title;
	@FindBy(name="blog_name")
	private WebElement title1;
	@FindBy(name ="submit")
	private WebElement save;
	@FindBy(linkText="test3")
	private WebElement titletest;
	@FindBy(xpath="//img[@title='New task']")
	private WebElement task;
	@FindBy(name="title")
	private WebElement projecttitle;
	@FindBy(name="save")
	private WebElement savebutton;
	@FindBy(xpath="//img[@title='Roles management']")
	private WebElement role;
	@FindBy(xpath="//*[@id='main_content']/div/div/div/div/a[1]")
	private WebElement newrole;
	@FindBy(name="task_name")
	private WebElement titlerole;
	@FindBy(name="Submit")
	private WebElement rolesavebutton;
	@FindBy(xpath="//*[@id='main_content']/div/div/div/div/a[2]")
	private WebElement rolesassign;
	@FindBy(xpath="//div[@class='filter-option-inner-inner']")
	private WebElement userdrop;
	@FindBy(xpath="//button[@name='submit']")
	private WebElement saverole;
	@FindBy(xpath="//img[@title='Users management']")
	private WebElement user;
	@FindBy(xpath="//input[@type='checkbox']")
	private WebElement checkbox;
	@FindBy(xpath="//a[@class='btn btn-primary']")
	private WebElement register;
	@FindBy(xpath="//div[@class='alert alert-success']")
	private WebElement alert;
   public void courseselection() {
	   this.course.click();
   }
   public void projectlink() {
	   this.project.click();
   }
   public void newprojectcreate() {
	   this.title.click();
   }
   public void titlepage() {
	   this.title1.sendKeys("test3");
   }
   public void saveblog() {
	   this.save.click();
   }
   public void projectlinkk() {
	   this.titletest.click();
   }
  
   public void newtask() {
	   this.task.click();
   }
   public void projectitlee() {
	   this.projecttitle.sendKeys("Testing");
   }
   public void savebutton() {
	   this.savebutton.click();
   }
   public void rolemanagement() {
	   this.role.click();
   }
   public void newroleadd() {
	   this.newrole.click();
   }
   public void roletitle() {
	   this.titlerole.sendKeys("SeleniumTesting");
   }
   public void rolesubmitbutton() {
	   this.rolesavebutton.click();
   }
   public void assignrole() {
	   this.rolesassign.click();
   }
   public String titleget() {
	   return this.titletest.getText();
   }
   public void userdropdown() { 
   Actions action = new Actions(driver);
 action.moveToElement(userdrop).click().sendKeys("poorni s").build().perform();
 
   }
   public void validate() {
	   this.saverole.click();
   }
   public void usermanage() {
	   this.user.click();
   }
   public void clickcheckbox() {
	   this.checkbox.click();
   }
   public void registerlick() {
	   this.register.click();
   }
   public String alertcheck() {
	   return this.alert.getText();
   }
}


	
   
	
