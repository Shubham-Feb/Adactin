package org.loacter;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.stepdefi.Hooks;

public class Pom4 
{
	public Pom4()
	{
		
		PageFactory.initElements(Hooks.driver, this);
		
	}
	
	public WebElement getFirstname() {
		return firstname;
	}
	public WebElement getLastname() {
		return lastname;
	}
	public WebElement getBilling() {
		return billing;
	}
	public WebElement getCc() {
		return cc;
	}
	public WebElement getYear() {
		return year;
	}
	public WebElement getCvv() {
		return cvv;
	}
	public WebElement getCct() {
		return cct;
	}

	public WebElement getMonth() {
		return month;
	}

	@FindBy(id="first_name")
	private WebElement firstname;
	
	public WebElement getBooknow() {
		return booknow;
	}

	@FindBy(id="last_name")
	private WebElement lastname;
	
	@FindBy(id="address")
	private WebElement billing;
	
	@FindBy(id="cc_num")
	private WebElement cc;
	
	@FindBy(id="cc_exp_year")
	private WebElement year ;
	@FindBy(id="cc_cvv")
	private WebElement cvv ;
	@FindBy(id="cc_type")
	private WebElement cct;
	@FindBy(id="cc_exp_month")
	private WebElement month ;
	@FindBy(id="book_now")
	private WebElement booknow;
	
	
}
