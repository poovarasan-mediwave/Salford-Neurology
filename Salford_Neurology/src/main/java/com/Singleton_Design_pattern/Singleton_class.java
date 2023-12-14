package com.Singleton_Design_pattern;


import com.Page_object_model.Clinician_profile;
import com.Page_object_model.Lifestyle_Alcohol;
import com.Page_object_model.Login_page;
import com.Page_object_model.My_health;
import com.Page_object_model.Patient_profile;
import com.Page_object_model.Questionnaire_approverequest;
import com.Page_object_model.Questionnaires;
import com.Page_object_model.Signup_page;
import com.Page_object_model.Trackers_module;


import Lip_Global.Base_class;

public class Singleton_class extends Base_class{
	
	
	private Signup_page Signup_page;
	private My_health My_health;
	private Login_page Login_page;
	private Patient_profile Patient_profile;
	private Clinician_profile Clinician_profile;
	private Questionnaires Questionnaires;
	private Questionnaire_approverequest Questionnaire_approverequest;
	private Trackers_module Trackers_module;
	private Lifestyle_Alcohol Lifestyle_alcohol;
	
	
	
	public Signup_page getSignPage() {
		Signup_page = new Signup_page();
		return Signup_page;
	}
	
		
	public My_health getMy_health() {
		My_health = new My_health();
		return My_health;
	}
		
	public Login_page getLogin_page() {
	   Login_page = new Login_page();
	   return Login_page;
	   
	}
		 
	public Patient_profile getPatient_profile() {
		Patient_profile = new Patient_profile();
		return Patient_profile;
	}

	public Clinician_profile getclinician_profile() {
		Clinician_profile = new Clinician_profile();
		return Clinician_profile;
	}
	

   public Questionnaires getQuestionnaires() {
	   Questionnaires = new Questionnaires();
	   return Questionnaires;
   }
   
   public Questionnaire_approverequest getQuestionnaire_approverequest() {
	   Questionnaire_approverequest = new Questionnaire_approverequest();
	   return Questionnaire_approverequest;
	   
   }
   
   public Trackers_module getTrackers_module() {
	   Trackers_module = new Trackers_module();
	   return Trackers_module;
	   
   }
   
   public Lifestyle_Alcohol getLifestyle_Alcohol() {
		Lifestyle_alcohol = new Lifestyle_Alcohol();
		return Lifestyle_alcohol;
	}
   
}
