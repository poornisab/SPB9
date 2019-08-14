package demoTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstJS {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumDownloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//String pagetitle=js.executeScript("return document.URL").toString();
		//System.out.println("page title is " +pagetitle);
		js.executeScript("document.getElementById(\"email\").value='vmansoor@gmail.com'");
		js.executeScript("document.getElementById(\"enterimg\").click();");
		
		WebElement firstname= driver.findElement(By.xpath("//input[@ng-model='FirstName']"));
		//js.executeScript("arguments[0].value='Poornima'", firstname);
		
		//js.executeScript("window.scrollBy(0,300)");
		//completely scroll page down
		//js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		//js.executeScript("document.getElementByID(\"firstpassword\").scrollIntoView()");
		//to generate pop up window on screen
		//js.executeScript("alert('Welcome to manipal training')");
		js.executeScript("confirm('welcome to manipal')");
		//js.executeScript("prompt('welcome to manipal','yes/No')");
		
		}

}
