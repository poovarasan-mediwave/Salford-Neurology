package com.Step_defenition;

import com.Singleton_Design_pattern.Singleton_class;
import com.configuration_reader.Filereader_manager;
import com.fasterxml.jackson.databind.deser.Deserializers.Base;

import Lip_Global.Base_class;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Lifestyle_Alcohol extends Base_class {
	
	Singleton_class la = new Singleton_class();
	
	@Given("Login as Patient user")
	public void login_as_patient_user() throws Throwable {
		browserlaunch(Filereader_manager.getinstantconfi().getconf().getbrowser(), Filereader_manager.getinstantconfi().getconf().getURL());
		   Thread.sleep(5000);
		   
		   Getinputvalues(la.getLogin_page().getEmail_field(), Filereader_manager.getinstantconfi().getconf().getemail());
		   Thread.sleep(3000);
		   Getinputvalues(la.getLogin_page().getPassword_field(), Filereader_manager.getinstantconfi().getconf().getpassword());
		   Thread.sleep(3000);
		   
		   clickElement(la.getLogin_page().getLogin_click());
		   Thread.sleep(5000);
		
	    
	}
	@When("Navigating to MYhealth")
	public void navigating_to_m_yhealth() throws InterruptedException {
		clickElement(la.getLifestyle_Alcohol().getClicking_Myhealth());
		Thread.sleep(4000);
	
	   
	}
	@When("Clicking Lifestyle and navigating to Alcohol tracker")
	public void clicking_lifestyle_and_navigating_to_alcohol_tracker() throws InterruptedException {
		clickElement(la.getLifestyle_Alcohol().getSelect_lifeStyle());
		Thread.sleep(5000);
		clickElement(la.getLifestyle_Alcohol().getNavigate_AlcoholIntake());
		Thread.sleep(2000);
		
	   
	}
	@When("In Alcohol tracker adding new entry")
	public void in_alcohol_tracker_adding_new_entry() throws InterruptedException {
		clickElement(la.getLifestyle_Alcohol().getAddAnother_Entry());
		Thread.sleep(2000);
		clickElement(la.getLifestyle_Alcohol().getSelectDate_field());
		Thread.sleep(2000);
//		clickElement(la.getLifestyle_Alcohol().getDate_5());
//		Thread.sleep (2000);
//		clickElement(la.getLifestyle_Alcohol().getSelectmonth());
//		clickElement(la.getLifestyle_Alcohol().getMarch());
		clickElement(la.getLifestyle_Alcohol().getSelectYear());
		clickElement(la.getLifestyle_Alcohol().getYear2022());
	    clickElement(la.getLifestyle_Alcohol().getDate_Alcohol());
		Thread.sleep(4000);
		clickElement(la.getLifestyle_Alcohol().getDrink_spirit());
		clickElement(la.getLifestyle_Alcohol().getDrink_spirit());
		Thread.sleep(2000);
		clickElement(la.getLifestyle_Alcohol().getDrink_spirit());
		Thread.sleep(2000);

//		clickElement(la.getLifestyle_Alcohol().getManageon_date());
//		Thread.sleep(2000);
		
	  
	}
	@When("clikcing save button")
	public void clikcing_save_button() {
		clickElement(la.getLifestyle_Alcohol().getSave());
	   
	}
	@When("Clikcing My health")
	public void clikcing_my_health() throws InterruptedException {
		Thread.sleep(2000);
        clickElement(la.getLifestyle_Alcohol().getClicking_Myhealth());
	  
	}
	@Then("Navigating to Lifestyle")
	public void navigating_to_lifestyle() throws InterruptedException {
		
        Thread.sleep(2000);
        clickElement(la.getLifestyle_Alcohol().getSelect_lifeStyle());


		
	   
	}
	@Given("Login as Patient user")
	public void login_as_patient_user() throws Throwable {
		browserlaunch(Filereader_manager.getinstantconfi().getconf().getbrowser(), Filereader_manager.getinstantconfi().getconf().getURL());
		   Thread.sleep(5000);
		   
		   Getinputvalues(la.getLogin_page().getEmail_field(), Filereader_manager.getinstantconfi().getconf().getemail());
		   Thread.sleep(3000);
		   Getinputvalues(la.getLogin_page().getPassword_field(), Filereader_manager.getinstantconfi().getconf().getpassword());
		   Thread.sleep(3000);
		   
		   clickElement(la.getLogin_page().getLogin_click());
		   Thread.sleep(5000);
	}



}
