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


public class AdminPOM {
	private WebDriver driver; 
	
	public AdminPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText="Administration")
	private WebElement admin;
	@FindBy(linkText="Add a user")
	private WebElement useradd;
	@FindBy(id="firstname")
	private WebElement firstname;
	@FindBy(id="lastname")
	private WebElement lastname;
	
	public void adminselect() {
		this.admin.click();
	}
	public void Adduser() {
		this.useradd.click();
	}
	public void fstnameenter(String firstname) {
		this.firstname.sendKeys(firstname);
	}
	public void lstnameenter(String lastname) {
		this.lastname.sendKeys(lastname);
	}
	
	
		
	
	

	
	
}
	
   
	
