package com.training.pom;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Alert;
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


public class RegisterUnsubscribePOM {
	private WebDriver driver; 
	
	public RegisterUnsubscribePOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="login")
	private WebElement userName; 
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id="form-login_submitAuth")
	private WebElement loginBtn; 
	
	@FindBy(linkText="Selenium98")
	private WebElement course;
	
	@FindBy(linkText="Users")
	private WebElement user;
	
	@FindBy(xpath="//input[@value='16']")
	private WebElement select;
	
	@FindBy(xpath="//a[@title='Unsubscribe ']")
	private WebElement unsubscribe;
		
	public void sendUserName(String userName) {
		this.userName.clear();
		this.userName.sendKeys(userName);
	}
	
	public void sendPassword(String password) {
		this.password.clear(); 
		this.password.sendKeys(password); 
	}
	
	public void clickLoginBtn() {
		this.loginBtn.click(); 
	}
	public void courseselect() {
		this.course.click();
	}
	public void users() {
		this.user.click();
	}
	public void userselect() {
		this.select.click();
	}
	public void unsubscribeuser() {
		this.unsubscribe.click();
	}
	
	}
	
   
	
