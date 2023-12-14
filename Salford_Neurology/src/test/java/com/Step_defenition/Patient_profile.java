//package com.Step_defenition;
//
//import java.awt.Robot;
//import java.awt.event.KeyEvent;
//
//import com.Singleton_Design_pattern.Singleton_class;
//import com.configuration_reader.Filereader_manager;
//
//import Lip_Global.Base_class;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//
//public class Patient_profile extends Base_class {
//
//	Singleton_class pp = new Singleton_class();
//
//	@Given("Patient logging in with valid credentialss")
//	public void patient_logging_in_with_valid_credentialss() throws Throwable {
//		browserlaunch(Filereader_manager.getinstantconfi().getconf().getbrowser(),
//				Filereader_manager.getinstantconfi().getconf().getURL());
//		Thread.sleep(5000);
//
//		Getinputvalues(pp.getLogin_page().getEmail_field(), Filereader_manager.getinstantconfi().getconf().getemail());
//		Thread.sleep(3000);
//		Getinputvalues(pp.getLogin_page().getPassword_field(),
//				Filereader_manager.getinstantconfi().getconf().getpassword());
//		Thread.sleep(3000);
//
//		clickElement(pp.getLogin_page().getLogin_click());
//		Thread.sleep(5000);
//	}
//
//	@And("Patient is navigating to profile and updating the value and logging out")
//	public void patient_is_navigating_to_profile_and_updating_the_value_and_logging_out() throws Throwable {
//
//		clickElement(pp.getMy_health().getClick_profile());
//
//		clickElement(pp.getPatient_profile().getSelect_profileicon());
//		Thread.sleep(5000);
//		scrolldown(pp.getPatient_profile().getName_liketocall());
//		Getinputvalues(pp.getPatient_profile().getName_liketocall(),
//				Filereader_manager.getinstantconfi().getconf().getnameliketocall());
//		Thread.sleep(2000);
//
//		scrolldown(pp.getPatient_profile().getPhone_number());
//		Getinputvalues(pp.getPatient_profile().getPhone_number(),
//				Filereader_manager.getinstantconfi().getconf().getphonenumber());
//		Thread.sleep(2000);
//
//		scrolldown(pp.getPatient_profile().getGender_selection());
//		clickElement(pp.getPatient_profile().getGender_selection());
//		Thread.sleep(3000);
//
//		clickElement(pp.getPatient_profile().getMale_selection());
//
//		scrolldown(pp.getPatient_profile().getMartial_status());
//		clickElement(pp.getPatient_profile().getMartial_status());
//		Thread.sleep(2000);
//		clickElement(pp.getPatient_profile().getMartial_married());
//
//		scrolldown(pp.getPatient_profile().getEthnicity_select());
//		clickElement(pp.getPatient_profile().getEthnicity_select());
//		clickElement(pp.getPatient_profile().getEthnicity_Asian());
//
////    scrolldown(pp.getPatient_profile().getLanguage_spoken());
//		scrolldown(pp.getPatient_profile().getLanguage_dropdown());
//		clickElement(pp.getPatient_profile().getLanguage_dropdown());
//
//		clickElement(pp.getPatient_profile().getLanguage_spoken());
//		Thread.sleep(2000);
//		Getinputvalues(pp.getPatient_profile().getLanguage_spoken(),
//				Filereader_manager.getinstantconfi().getconf().getLanguagespoken());
//		Thread.sleep(2000);
//		clickElement(pp.getPatient_profile().getLanguage_choose());
//
//
//
//	scrolldown(pp.getPatient_profile().getUpdate_profile());
//	clickElement(pp.getPatient_profile().getUpdate_profile());
//	
//	Thread.sleep(3000);
//
//	}
//
//}
