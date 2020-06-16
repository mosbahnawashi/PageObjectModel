package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffHomePage {

	WebDriver driver;

	public RediffHomePage(WebDriver driver) {
		this.driver = driver;
	}

	By searchBox = By.id("srchquery_tbox");
	By clickSearch = By.xpath("/html/body/div[5]/div/form/input[2]");
	
	public WebElement search()
	{
		return driver.findElement(searchBox);
	}
	
	public WebElement searchIcon()
	{
		return driver.findElement(clickSearch);
	}

}