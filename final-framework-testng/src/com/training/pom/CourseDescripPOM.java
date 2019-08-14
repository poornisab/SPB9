package com.training.pom;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;


public class CourseDescripPOM {
	private WebDriver driver; 
	
	public CourseDescripPOM(WebDriver driver) {
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
	
	@FindBy(linkText="Course description")
	private WebElement coursedes;
	
	@FindBy(xpath="//img[@src='http://elearningm1.upskills.in/main/img/icons/32/info.png']")
	private WebElement descrip;
		
	@FindBy(id="course_description_title")
	private WebElement title;
	
	@FindBy(name="submit")
	private WebElement button;
	
	@FindBy(xpath="//div[@class='alert alert-info']")
	private WebElement expected;
			
	
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
	public void coursedescrip() {
		this.coursedes.click();
	}
	public void descriplink() {
	this.descrip.click();
	}
	public void titleinput() {
		this.title.sendKeys("selenium course for beginners");
	}
	public void frames() throws InterruptedException {
		System.out.println("frame");
	Thread.sleep(6000);
	//WebDriver frame = new WebDriver();
		WebElement x;
		x = driver.findElement(By.xpath("//iframe[@class='cke_wysiwyg_frame cke_reset']"));
    driver.switchTo().frame(x);
    System.out.println("inside frame");
    WebElement content=driver.findElement(By.xpath("//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']"));
    content.click();
    System.out.println("inside text");
    Thread.sleep(2000);
    content.sendKeys("hello india");
    driver.switchTo().defaultContent();
	}
	public void savebutton() {
		this.button.click();
	}
	public String finalcondition() {
		return this.expected.getText();
	}
   }
	
