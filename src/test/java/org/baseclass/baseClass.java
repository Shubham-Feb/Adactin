package org.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.stepdefi.Hooks;

public class baseClass {
	
	public static void type(WebElement w, String s)
	{
		w.sendKeys(s);
		
	}
	
	public static void launch(String url)

	
	{
		Hooks.driver.get(url);
	}
	
	public static void klik(WebElement w)
	{
		w.click();
	}
	
	public static void drop(WebElement w, String s1)
	
	{
		Select s=new Select(w);
		s.selectByVisibleText(s1);
		
	}

}
