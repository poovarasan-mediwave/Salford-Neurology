package com.Step_defenition;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Singleton_Design_pattern.Singleton_class;
import com.configuration_reader.Filereader_manager;

import Lip_Global.Base_class;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Questionnaire_steps extends Base_class{

	Singleton_class qs = new Singleton_class();

	@Given("user is logging in with valid credentials")
	public void user_is_logging_in_with_valid_credentialss() throws Throwable {
		browserlaunch(Filereader_manager.getinstantconfi().getconf().getbrowser(), Filereader_manager.getinstantconfi().getconf().getURL());
		   Thread.sleep(5000);
		   
		   Getinputvalues(qs.getLogin_page().getEmail_field(), Filereader_manager.getinstantconfi().getconf().getclinicianemail());
		   Thread.sleep(3000);
		   Getinputvalues(qs.getLogin_page().getPassword_field(), Filereader_manager.getinstantconfi().getconf().getpassword());
		   Thread.sleep(3000);
		   
		   clickElement(qs.getLogin_page().getLogin_click());
		   Thread.sleep(5000);
		
		   
	}

	@And("user is clicking the questionnaire and clicking create new")
	public void user_is_clicking_the_questionnaire_and_clicking_create_new() throws Throwable {
		 clickElement(qs.getQuestionnaires().getQuestionnaire_builder());
		 Thread.sleep(25000);
		 
		// scrolldown(qs.getQuestionnaires().getCreate_new());
	     clickElement(qs.getQuestionnaires().getCreate_new());
         Thread.sleep(2000);	
         scrolldown(qs.getQuestionnaires().getQuestionnaire_name());
	     clickElement(qs.getQuestionnaires().getQuestionnaire_name());
	     Getinputvalues(qs.getQuestionnaires().getQuestionnaire_name(), Filereader_manager.getinstantconfi().getconf().getQuestionnairename());
	     Thread.sleep(3000);
	     
	     scrolldown(qs.getQuestionnaires().getQuestionnaire_category());
	     clickElement(qs.getQuestionnaires().getQuestionnaire_category());
	     clickElement(qs.getQuestionnaires().getCategory_consulation());
	     Thread.sleep(3000);
	     
	     //scrolldown(qs.getQuestionnaires().getAge_group());
	     clickElement(qs.getQuestionnaires().getAge_group());
	     clickElement(qs.getQuestionnaires().getAge_adult());
	     Thread.sleep(3000);
	     
	     scrolldown(qs.getQuestionnaires().getChoose_tags());
	     
//	     WebDriverWait ww = new WebDriverWait(driver, 10);
//	     ww.until(ExpectedConditions.elementToBeClickable(qs.getQuestionnaires().getChoose_tags()));
    
	     clickElement(qs.getQuestionnaires().getChoose_tags());
	     Getinputvalues(qs.getQuestionnaires().getChoose_tags(), Filereader_manager.getinstantconfi().getconf().gettags());
	     
	     Robot ct = new Robot();
	     ct.keyPress(KeyEvent.VK_ENTER);
	     ct.keyRelease(KeyEvent.VK_ENTER);
	     Thread.sleep(4000);
	     
	     scrolldown(qs.getQuestionnaires().getTrust());
	     clickElement(qs.getQuestionnaires().getTrust());
	     clickElement(qs.getQuestionnaires().getTrust_salford());
	     Thread.sleep(4000);
	     
	     clickElement(qs.getQuestionnaires().getNext_button());
	}

	@And("user is entering data for every question")
	public void user_is_entering_data_for_every_question() throws Throwable {
		
		clickElement(qs.getQuestionnaires().getAdd_firstquestion());
		Thread.sleep(2000);
		
		clickElement(qs.getQuestionnaires().getMultiple_choice_question());
		clickElement(qs.getQuestionnaires().getEnter_notes());
		Getinputvalues(qs.getQuestionnaires().getEnter_notes(), Filereader_manager.getinstantconfi().getconf().getEnterstatement());
		
		clickElement(qs.getQuestionnaires().getAdd_responses1());
		Getinputvalues(qs.getQuestionnaires().getAdd_responses1(), Filereader_manager.getinstantconfi().getconf().getResponse1());
		Thread.sleep(2000);
		
		clickElement(qs.getQuestionnaires().getAdd_responses2());
		Getinputvalues(qs.getQuestionnaires().getAdd_responses2(), Filereader_manager.getinstantconfi().getconf().getResponse2());
		Thread.sleep(2000);
		
		clickElement(qs.getQuestionnaires().getAdd_nextquestion());
		
	    clickElement(qs.getQuestionnaires().getDropdown_questions());
	    clickElement(qs.getQuestionnaires().getEnter_notes());
	    Getinputvalues(qs.getQuestionnaires().getEnter_notes(), Filereader_manager.getinstantconfi().getconf().getDropdownquestion());
	    clickElement(qs.getQuestionnaires().getDropdown_response1());
	    Getinputvalues(qs.getQuestionnaires().getDropdown_response1(), Filereader_manager.getinstantconfi().getconf().getResponse9());
	    
	    clickElement(qs.getQuestionnaires().getDropdown_response2());
	    Getinputvalues(qs.getQuestionnaires().getDropdown_response2(), Filereader_manager.getinstantconfi().getconf().getResponse10());
	    Thread.sleep(3000);
	    
	    
	    
	}
	
	

	@Then("user is saving the questionnaire in draft and checking edit and submit approval")
	public void user_is_saving_the_questionnaire_in_draft_and_checking_edit_and_submit_approval() throws Throwable {
		
		scrolldown(qs.getQuestionnaires().getSave_draft());
		clickElement(qs.getQuestionnaires().getSave_draft());
		Thread.sleep(3000);
		
		screenshot("C:\\Users\\Mediwae Digital\\eclipse-workspace\\Salford_neurology\\screenshot.Draft.png");
		
		clickElement(qs.getQuestionnaires().getBack_to_questionnaires());
		Thread.sleep(3000);
		
		scrolldown(qs.getQuestionnaires().getEdit_button());
		clickElement(qs.getQuestionnaires().getEdit_button());
		Thread.sleep(3000);
	    System.out.println("Get edit");
		
		scrolldown(qs.getQuestionnaires().getSubmitapproval_button());
		Thread.sleep(3000);
		System.out.println("scroll down");
		Thread.sleep(3000);
		
		clickElement(qs.getQuestionnaires().getSubmitapproval_button());
		Thread.sleep(3000);
		
		clickElement(qs.getQuestionnaires().getSearchapproval_button());
		Getinputvalues(qs.getQuestionnaires().getSearchapproval_button(), Filereader_manager.getinstantconfi().getconf().getSubmitapproval());
		Thread.sleep(3000);
		screenshot("C:\\Users\\Mediwae Digital\\eclipse-workspace\\Salford_neurology\\screenshot.approve.png");
		
		Robot sa = new Robot();
		sa.keyPress(KeyEvent.VK_ENTER);
		sa.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		
		
		clickElement(qs.getQuestionnaires().getConfirmsubmmit_button());
		screenshot("C:\\Users\\Mediwae Digital\\eclipse-workspace\\Salford_neurology\\screenshot.confirmsubmit.png");
		
		
	}

}
