package org.stepdefi;

import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.Before;

public class Hooks {
	
	public static WebDriver driver;
	
	@Before
	public void launch()
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\JAVA_Workspace\\Adactin\\lib\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	@After
	public void kill()
	{
		driver.quit();
	}

}
