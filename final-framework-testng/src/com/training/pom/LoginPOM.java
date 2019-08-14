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


public class LoginPOM {
	private WebDriver driver; 
	
	public LoginPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="login")
	private WebElement userName; 
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id="form-login_submitAuth")
	private WebElement loginBtn; 
	
	@FindBy(xpath="//strong[text()='Poornima Sabari']")
	private WebElement content;
	
	@FindBy(xpath="//a[@href='main/create_course/add_course.php']")
	private WebElement course;
	
	@FindBy(xpath="//legend[text()='Add a new course']")
	private WebElement coursedisplay;
	
	@FindBy(xpath="//input[@name='title']")
	private WebElement name;
	
	@FindBy(id="advanced_params")
	private WebElement settings;
	
	@FindBy(xpath="//label[@class='col-sm-2 control-label  ']")
	private WebElement categ;
	
	@FindBy(xpath="//label[@for='add_course_wanted_code']")
	private WebElement ccode;
	
	@FindBy(xpath="//label[@for='add_course_course_language']")
	private WebElement language;
	
	@FindBy(xpath="//button[@data-id='add_course_category_code']")
	private WebElement category;
	
	@FindBy(xpath="//li//a//span[text()='Language skills (LANG)']")
	private WebElement lang;
	
	@FindBy(xpath="//input[@name='wanted_code']")
	private WebElement coursecode;
	
	@FindBy(xpath="//em[@class='fa fa-file-text']")
	private WebElement introtext;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement coursecreate;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement button;
	
	@FindBy(xpath="//div[@class='alert alert-success']")
	private WebElement expected1;
		
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
	public String contentmessage() {
		return this.content.getText();
		}
	public void createcourse() {
		this.course.click();	
	}
	public String courseMessage() {
		return this.coursedisplay.getText();
	}
	public void courseName() {
		this.name.sendKeys("couy022");
	}
	public void advanceSettings() {
		this.settings.click();
	}
	public void selections() {
		Actions action = new Actions(driver);
		action.moveToElement(category).click().build().perform();
		}
	public void selectlang() {
		Actions action = new Actions(driver);
		action.moveToElement(lang).click().build().perform();
	}
	public void courses() {
		this.coursecode.sendKeys("seleniumyyy099");
		this.coursecreate.click();
	} 
	public void textintro() {
		this.introtext.click();
	}
	
	public void frame() throws InterruptedException {
		System.out.println("frames");
		Thread.sleep(6000);
		WebElement x;
		x = driver.findElement(By.xpath("//iframe[@class='cke_wysiwyg_frame cke_reset']"));
		driver.switchTo().frame(x);
		System.out.println("inside frame");
		Thread.sleep(6000);
		WebElement content = driver.findElement(By.xpath("//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']"));
		content.click();
		System.out.println("inside text");
		Thread.sleep(2000);
		content.sendKeys("selenium is important");
		driver.switchTo().defaultContent();
	}	
	
	public void savebutton() {
		this.button.click();
		System.out.println("passed");
	}
	public String expected1confirmation() {
		return this.expected1.getText();
	}
}
	
   
	
