package com.Step_defenition;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.Singleton_Design_pattern.Singleton_class;
import com.configuration_reader.Filereader_manager;

import Lip_Global.Base_class;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class My_health extends Base_class {

	Singleton_class su = new Singleton_class();

	@Given("Patient login using valid credentials")
	public void patient_login_using_valid_credentials() throws Throwable {
		browserlaunch(Filereader_manager.getinstantconfi().getconf().getbrowser(),
				Filereader_manager.getinstantconfi().getconf().getURL());
		Thread.sleep(5000);

		Getinputvalues(su.getLogin_page().getEmail_field(), Filereader_manager.getinstantconfi().getconf().getemail());
		Thread.sleep(3000);
		Getinputvalues(su.getLogin_page().getPassword_field(),
				Filereader_manager.getinstantconfi().getconf().getpassword());
		Thread.sleep(3000);

		clickElement(su.getLogin_page().getLogin_click());
		Thread.sleep(5000);
	}

	@Given("patient is adding new diagnosis")
	public void patient_is_adding_new_diagnosis() throws Throwable {

		clickElement(su.getMy_health().getMy_healthclick());
		Thread.sleep(3000);
		scrolldown(su.getMy_health().getAdd_newdiagnosis());
		Thread.sleep(3000);

		clickElement(su.getMy_health().getAdd_newdiagnosis());
		Thread.sleep(2000);

		Getinputvalues(su.getMy_health().getCondition_Symptom(),
				Filereader_manager.getinstantconfi().getconf().getdiagnosis());
		Thread.sleep(2000);

		clickElement(su.getMy_health().getDateof_diagnosis());
		Thread.sleep(4000);

		clickElement(su.getMy_health().getSelectingMonth_Date_diagnosis());
		Thread.sleep(2000);
		clickElement(su.getMy_health().getSelectingMonth_FinalDate_diagnosis());

		clickElement(su.getMy_health().getSave_button());
		Thread.sleep(5000);

	}

	@Given("patient is adding new medication")
	public void patient_is_adding_new_medication() throws Throwable {

		// clickon_ListElement_indexbased((List<WebElement>)
		// su.getMy_health().getADD_NEW_MEDICATION(), 21);

		List<WebElement> enabledElements = driver.findElements(By.xpath("(//button[text()='ADD NEW MEDICATION'])"));
		System.out.println(enabledElements.size());
	Thread.sleep(3000);
		if (enabledElements.size() > 0) {
			
			WebElement lastEnabledElement = enabledElements.get(enabledElements.size()-1);
			Thread.sleep(2000);
			scrolldown(lastEnabledElement);
			Thread.sleep(2000);
			
			Actions action = new Actions(driver);
			action.moveToElement(lastEnabledElement).click().perform();
		//	lastEnabledElement.click();
		}

//		clickElement(su.getMy_health().getADD_NEW_MEDICATION());
		Thread.sleep(2000);

		Getinputvalues(su.getMy_health().getMedication_name(),
				Filereader_manager.getinstantconfi().getconf().getdiagnosis());

		Thread.sleep(2000);

		clickElement(su.getMy_health().getMedication_type());

		clickElement(su.getMy_health().getMedication_Tablet());

		scrolldown(su.getMy_health().getDosage());
		Getinputvalues(su.getMy_health().getDosage(), Filereader_manager.getinstantconfi().getconf().getdosage());
		Thread.sleep(2000);

		clickElement(su.getMy_health().getFrequency_dropdown_click());

		Thread.sleep(2000);
		clickElement(su.getMy_health().getFrequency_doses_3());
		Thread.sleep(4000);

		clickElement(su.getMy_health().getNumber_of_times());
		Thread.sleep(2000);

		clickElement(su.getMy_health().getNumber_of_times_dropdown());
		clickElement(su.getMy_health().getDosage_Frequency());
		Thread.sleep(2000);

		clickElement(su.getMy_health().getDosage_frequency_dropdown());
		Thread.sleep(2000);
		Getinputvalues(su.getMy_health().getSymptom(), Filereader_manager.getinstantconfi().getconf().getsymptom());
		Thread.sleep(2000);
		clickElement(su.getMy_health().getSpecific_Diagnosis());
		clickElement(su.getMy_health().getSpecific_Diagnosis_Dropdown());
		Thread.sleep(2000);
		clickElement(su.getMy_health().getSave_button());
		Thread.sleep(5000);

	}

	@Given("patient is archiving and unarchiving the diagnosis")
	public void patient_is_archiving_and_unarchiving_the_diagnosis() throws Throwable {

		clickElement(su.getMy_health().getArchive());
		Thread.sleep(2000);
		clickElement(su.getMy_health().getHealth_History());

		Thread.sleep(5000);

		clickElement(su.getMy_health().getUNArchive());
		Thread.sleep(5000);
		clickElement(su.getMy_health().getCurrent_Health());

	}

	@Then("patient logout")
	public void patient_logout() throws Throwable {

		clickElement(su.getMy_health().getProfile_Icon());
		Thread.sleep(2000);
		clickElement(su.getMy_health().getLogout());
	}
}
