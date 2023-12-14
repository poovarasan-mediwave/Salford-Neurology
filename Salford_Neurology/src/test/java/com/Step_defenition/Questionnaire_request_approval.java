package com.Step_defenition;

import org.openqa.selenium.interactions.ClickAction;

import com.Singleton_Design_pattern.Singleton_class;
import com.configuration_reader.Filereader_manager;

import Lip_Global.Base_class;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Questionnaire_request_approval extends Base_class{
	
	Singleton_class ra = new Singleton_class();
	

@Given("Clinician login with the valid credentialss")
public void clinician_login_with_the_valid_credentials() throws Throwable {
	   browserlaunch(Filereader_manager.getinstantconfi().getconf().getbrowser(), Filereader_manager.getinstantconfi().getconf().getURL());
	   Thread.sleep(5000);
	   
	   Getinputvalues(ra.getLogin_page().getEmail_field(), Filereader_manager.getinstantconfi().getconf().getClinicianemail2());
	   Thread.sleep(3000);
	   Getinputvalues(ra.getLogin_page().getPassword_field(), Filereader_manager.getinstantconfi().getconf().getpassword());
	   Thread.sleep(3000);
	   
	   clickElement(ra.getLogin_page().getLogin_click());
	   Thread.sleep(5000);
}

@Then("Clinician accepting the request")
public void clinician_accepting_the_request() throws Throwable {
	
	 clickElement(ra.getQuestionnaires().getQuestionnaire_builder());
	 Thread.sleep(3000);
	 clickElement(ra.getQuestionnaire_approverequest().getForm_approvals());
	 Thread.sleep(3000);
	 
	 clickElement(ra.getQuestionnaire_approverequest().getReceived_forms());
	 Thread.sleep(3000);
	 
	 clickElement(ra.getQuestionnaire_approverequest().getApprove_button());
	 Thread.sleep(2000);
}
}
