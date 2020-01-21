package org.loacter;

import org.baseclass.baseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.stepdefi.Hooks;

public class Pom1 
{
	
	
public Pom1()
{
	
	PageFactory.initElements(Hooks.driver, this);
	
}

@FindBy(id="username")
private WebElement username;

public WebElement getUsername() {
	return username;
}
public WebElement getPassword() {
	return password;
}
public WebElement getLogin() {
	return login;
}

@FindBy(id="password")
private WebElement password;
@FindBy(id="login")
private WebElement login;


}
