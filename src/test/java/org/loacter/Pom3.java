package org.loacter;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.stepdefi.Hooks;

public class Pom3 


{
	public Pom3()
	{
		
		PageFactory.initElements(Hooks.driver, this);
		
	}
	
	
	@FindBy(xpath="//input[@name='radiobutton_0']")
	public WebElement radio;


	public WebElement getRadio() {
		return radio;
	}
	@FindBy(id="continue")
	private WebElement cont;


	public WebElement getCont() {
		return cont;
	}
}
