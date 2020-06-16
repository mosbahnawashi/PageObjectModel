package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class RediffLoginPage {

	WebDriver driver;

	public RediffLoginPage(WebDriver driver) {
		this.driver = driver;
		
		//To use Page Factory Pattern add this line:
		//PageFactory.initElements(driver, this);
	}

	By username = By.xpath("//*[@id=\"login1\"]");
	By password = By.xpath("//*[@id=\"password\"]");
	By login = By.xpath("//input[@name='proceed']");
	By homepagelink = By.xpath("//a[@class='f12']");

	
	/*
	 * Using Page Object Factory Pattern:
	 * @FindBy(xpath="//*[@id=\"login1\"]")
	 * WebElement username;
	 * 
	 * @FindBy(xpath="//*[@id=\"password\"]")
	 * WebElement password
	 */
	public WebElement emailID() {
		return driver.findElement(username);
	}

	public WebElement enterPassword() {
		return driver.findElement(password);
	}

	public WebElement submit() {
		return driver.findElement(login);
	}
	
	public WebElement homepage()
	{
		return driver.findElement(homepagelink);
	}

}