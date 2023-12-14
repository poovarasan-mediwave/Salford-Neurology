//package com.Step_defenition;
//
//import java.awt.Robot;
//import java.awt.event.KeyEvent;
//
//import org.openqa.selenium.interactions.ClickAction;
//
//import com.Singleton_Design_pattern.Singleton_class;
//import com.configuration_reader.Filereader_manager;
//
//import Lip_Global.Base_class;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//
//public class Clinician_profile extends Base_class{
//
//	Singleton_class cp = new Singleton_class();
//	
//	@Given("Clinician logging in with valid credentials")
//	public void clinician_logging_in_with_valid_credentials() throws Throwable {
//		browserlaunch(Filereader_manager.getinstantconfi().getconf().getbrowser(), Filereader_manager.getinstantconfi().getconf().getURL());
//		   Thread.sleep(5000);
//		   
//		   Getinputvalues(cp.getLogin_page().getEmail_field(), Filereader_manager.getinstantconfi().getconf().getclinicianemail());
//		   Thread.sleep(3000);
//		   Getinputvalues(cp.getLogin_page().getPassword_field(), Filereader_manager.getinstantconfi().getconf().getpassword());
//		   Thread.sleep(3000);
//		   
//		   clickElement(cp.getLogin_page().getLogin_click());
//		   Thread.sleep(5000);
//		
//	}
//
//	@And("Clinician is navigating to profile and updating the value and logging out")
//	public void clinician_is_navigating_to_profile_and_updating_the_value_and_logging_out() throws Throwable {
//		clickElement(cp.getMy_health().getClick_profile());
//		
//		clickElement(cp.getclinician_profile().getSelect_profileicon());
//		Thread.sleep(5000);
//		scrolldown(cp.getclinician_profile().getName_liketocall());
//		Getinputvalues(cp.getclinician_profile().getName_liketocall(), Filereader_manager.getinstantconfi().getconf().getnameliketocall());
//		Thread.sleep(2000);
//		
//		scrolldown(cp.getclinician_profile().getPhone_number());
//	    Getinputvalues(cp.getclinician_profile().getPhone_number(), Filereader_manager.getinstantconfi().getconf().getphonenumber());
//	    Thread.sleep(2000);
//	    
//	    scrolldown(cp.getclinician_profile().getGender_selection());
//	    clickElement(cp.getclinician_profile().getGender_selection());
//	    Thread.sleep(3000);
//	    
//	    clickElement(cp.getclinician_profile().getMale_selection());
//	    
//	    scrolldown(cp.getclinician_profile().getMartial_status());
//	    clickElement(cp.getclinician_profile().getMartial_status());
//	    Thread.sleep(2000);
//	    clickElement(cp.getclinician_profile().getMartial_married());
//	    
//	    scrolldown(cp.getclinician_profile().getEthnicity_select());
//	    clickElement(cp.getclinician_profile().getEthnicity_select());
//	    clickElement(cp.getclinician_profile().getEthnicity_Asian());
//	    
//	    scrolldown(cp.getPatient_profile().getLanguage_dropdown());
//	    clickElement(cp.getPatient_profile().getLanguage_dropdown());
//	    Thread.sleep(3000);
//	    
//	    
//	    clickElement(cp.getclinician_profile().getLanguage_spoken());
//	    Thread.sleep(3000);
//	    Getinputvalues(cp.getclinician_profile().getLanguage_spoken(), Filereader_manager.getinstantconfi().getconf().getLanguagespoken());
//	    Thread.sleep(2000);
//	    clickElement(cp.getclinician_profile().getLanguage_choose());
//		
//		scrolldown(cp.getclinician_profile().getUpdate_profile());
//		clickElement(cp.getclinician_profile().getUpdate_profile());
//		Thread.sleep(3000);
//		screenshot("C:\\Users\\Mediwae Digital\\eclipse-workspace\\Salford_neurology\\screenshot\\clinician.png");
//        Thread.sleep(2000);
//	}
//	}