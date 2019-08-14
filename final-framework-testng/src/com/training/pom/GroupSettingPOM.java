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


public class GroupSettingPOM {
	private WebDriver driver; 
	
	public GroupSettingPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@href='http://elearningm1.upskills.in/courses/SELENIUM77/index.php?id_session=0']")
	private WebElement course;
	@FindBy(linkText="Groups")
	private WebElement groups;
	@FindBy(xpath="//img[@title='Create new group(s)']")
	private WebElement newgroup;
	@FindBy(id="create_groups_number_of_groups")
	private WebElement groupscreate;
	@FindBy(xpath="//button[@type='submit']")
	private WebElement proceed;
	@FindBy(name="group_0_name")
	private WebElement name;
	@FindBy(name="submit")
	private WebElement groupcreate;
	@FindBy(xpath="//table//tbody//tr[2]//td[4]//img[@title='Group members']")
	private WebElement membericon;

   public void courseselection() {
	   this.course.click();
   }
   public void groupsselect() {
	   this.groups.click();
   }
   public void newgroupcreate() {
	   this.newgroup.click();
   }
   public void groupscreateno() {
	   this.groupscreate.sendKeys("1");
   }
   
   public void groupcreate() {
	   this.groupcreate.click();
   }
   public void groupname() {
	   this.name.sendKeys("group1");
   }
   public void proceedcreategroups() {
	   this.proceed.click();
   }
   public void groupmembers() {
	   this.membericon.click();
   }
}

	
   
	
