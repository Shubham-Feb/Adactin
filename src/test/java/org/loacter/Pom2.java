package org.loacter;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org.stepdefi.Hooks;

public class Pom2 {
	public Pom2()
	{
		
		PageFactory.initElements(Hooks.driver, this);
		
	}
	
	@FindBy(xpath="//select[@name='location']")
	private WebElement loc;
	
	@FindBy(xpath="//select[@name='hotels']")
	private WebElement hot;
	
	@FindBy(xpath="//select[@name='room_type']")
	private WebElement rtype;
	
	@FindBy(xpath="//select[@name='room_nos']")
	private WebElement rnum;
	
	public WebElement getLoc() {
		return loc;
	}

	public WebElement getHot() {
		return hot;
	}

	public WebElement getRtype() {
		return rtype;
	}

	public WebElement getRnum() {
		return rnum;
	}

	public WebElement getAdult() {
		return adult;
	}

	public WebElement getChild() {
		return child;
	}

	public WebElement getSearch() {
		return search;
	}

	@FindBy(xpath="//select[@name='adult_room']")
	private WebElement adult;
	
	@FindBy(xpath="//select[@name='child_room']")
	private WebElement child;
	
	@FindBy(id="Submit")
	private WebElement search;
	
	
	
	
}
