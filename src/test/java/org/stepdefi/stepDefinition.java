package org.stepdefi;

import org.baseclass.baseClass;
import org.loacter.Pom1;
import org.loacter.Pom2;
import org.loacter.Pom3;
import org.loacter.Pom4;
import org.loacter.Pom5;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDefinition extends baseClass {
	
	Pom1 p1=new Pom1();   //POM1
	Pom2 p2=new Pom2();   //Pom2
	Pom3 p3=new Pom3();   //Pom3
	Pom4 p4=new Pom4();   //Pom4
	Pom5 p5=new Pom5();   //Pom5
	

@Given("Launch the browser and give adactin url")
public void launch_the_browser_and_give_adactin_url() {
	launch("https://www.adactin.com/HotelApp/index.php");
}

@When("User enter valid credentials")
public void user_enter_valid_credentials(io.cucumber.datatable.DataTable dataTable) {
   type(p1.getUsername(),"shubhasi");
   type(p1.getPassword(),"Singh@12");
   
}

@When("click to login button")
public void click_to_login_button() {
	klik(p1.getLogin());
}

@When("then user need to search hotel")
public void then_user_need_to_search_hotel() {
   drop(p2.getLoc(),"Brisbane");
   drop(p2.getAdult(),"1 - One");
   drop(p2.getChild(),"1 - One");
   drop(p2.getHot(),"Hotel Sunshine");
   drop(p2.getRnum(),"1 - One");
   drop(p2.getRtype(),"Standard");
   klik(p2.getSearch());
}

@When("select the hotel and then continue")
public void select_the_hotel_and_then_continue() {
   klik(p3.getRadio());
   klik(p3.getCont());
}

@When("Book a hotel with client details")
public void book_a_hotel_with_client_details() throws Throwable {
  type(p4.getBilling(),"Sirihira Sewapuri");
  type(p4.getCc(),"1234567891234567");
  drop(p4.getCct(),"American Express");
  type(p4.getCvv(),"357");
  type(p4.getFirstname(),"Shubham");
  type(p4.getLastname(),"Singh");
  drop(p4.getYear(),"2022");
  drop(p4.getMonth(),"March");
 Thread.sleep(5000);
  
}

@When("click to Book now tab")
public void click_to_Book_now_tab() throws Throwable {
   klik(p4.getBooknow());
   Thread.sleep(5000);
}

@Then("then click to logout tab")
public void then_click_to_logout_tab() {
  klik(p5.getLogout());
}

}
