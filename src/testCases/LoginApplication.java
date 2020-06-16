package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectRepository.RediffHomePage;
import objectRepository.RediffLoginPage;

public class LoginApplication {

	@Test
	public void login() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		
		Thread.sleep(300);
		
		RediffLoginPage rd = new RediffLoginPage(driver);
		rd.emailID().sendKeys("mosbah.alnawashi@gmail.com");
		rd.enterPassword().sendKeys("Mypassword012!@#");
		rd.submit().click();
		
		
		rd.homepage().click();
		
		
		RediffHomePage homePage = new RediffHomePage(driver);
		homePage.search().sendKeys("Trump news");
		homePage.searchIcon().click();
		


	}

}
