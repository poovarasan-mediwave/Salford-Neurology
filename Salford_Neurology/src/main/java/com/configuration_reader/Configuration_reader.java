package com.configuration_reader;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;



public class Configuration_reader {
	public static Properties proper;

	public Configuration_reader() throws Throwable {
		File f = new File("C:\\Users\\Mediwae Digital\\eclipse-workspace\\Salford_neurology\\src\\main\\java\\com\\Configuration_Properties\\Configuration_properties.properties");
		FileInputStream f1 = new FileInputStream(f);
		proper = new Properties();
		proper.load(f1);
	}

	public String getbrowser() {
		String property = proper.getProperty("Browser");
		return property;

	}
	
	public String getURL() {
		String property = proper.getProperty("URL");
		return property;

	}

	public String getclinicianemail() {
		String property = proper.getProperty("clinicianemail");
		return property;

	}
	
	public String getClinicianemail2() {
		String property = proper.getProperty("Clinicianemail2");
		return property;

	}
	
	public String getemail() {
		String property = proper.getProperty("email");
		return property;

	}
	
	public String getpassword() {
		String property = proper.getProperty("password");
		return property;

	}
	
	public String getMedicationname() {
		String property = proper.getProperty("Medicationname");
		return property;

	}
	
	public String getdiagnosis() {
		String property = proper.getProperty("diagnosis");
		return property;

	}
	
	public String getdosage() {
		String property = proper.getProperty("dosage");
		return property;

	}
	
	public String getfrequency() {
		String property = proper.getProperty("frequency");
		return property;

	}
	
	public String getsymptom() {
		String property = proper.getProperty("symptom");
		return property;

	}
	
	public String getnameliketocall() {
		String property = proper.getProperty("nameliketocall");
		return property;

	}
	
	public String getphonenumber() {
		String property = proper.getProperty("phonenumber");
		return property;
	}
	
	public String getLanguagespoken() {
		String property = proper.getProperty("Languagespoken");
		return property;
	}
	
	public String getQuestionnairename() {
		String property = proper.getProperty("Questionnairename");
		return property;
	}
	
	public String gettags() {
		String property = proper.getProperty("tags");
		return property;
	}
	
	public String getQuestionnaireCategory() {
		String Property = proper.getProperty("QuestionnaireCategory");
		return Property;
		
	}
	public String getFirstquestion() {
		String property = proper.getProperty("Firstquestion");
		return property;
	}
	public String getTextareapatient() {
		String property = proper.getProperty("Textareapatient");
		return property;
	}
	public String getResponse1() {
		String property = proper.getProperty("Response1");
		return property;
	}
	public String getResponse2() {
		String property = proper.getProperty("Response2");
		return property;
	}
	public String getResponse3() {
		String property = proper.getProperty("Response3");
		return property;
	}
	public String getEnterstatement() {
		String property = proper.getProperty("Enterstatement");
		return property;
	}
	public String getEnterfreetext() {
		String property = proper.getProperty("Enterfreetext");
		return property;
	}
	public String getEnterpicturechoice() {
		String property = proper.getProperty("Enterpicturechoice");
		return property;
	}
	public String getEnteryesorno() {
		String property = proper.getProperty("Enteryesorno");
		return property;
	}
	public String getRatingquestion() {
		String property = proper.getProperty("Ratingquestion");
		return property;
	}
	public String getLikertquestion() {
		String property = proper.getProperty("Likertquestion");
		return property;
	}
	public String getDropdownquestion() {
		String property = proper.getProperty("Dropdownquestion");
		return property;
	}
	public String getResponse9() {
		String property = proper.getProperty("Response9");
		return property;
	}
	public String getResponse10() {
		String property = proper.getProperty("Response10");
		return property;
	}
	public String getSection() {
		String property = proper.getProperty("Section");
		return property;
	}
	public String getOpeningstatement() {
		String property = proper.getProperty("Openingstatement");
		return property;
	}
	public String getClosingstatement() {
		String property = proper.getProperty("Closingstatement");
		return property;
	}
	public String getSubmitapproval() {
		String property = proper.getProperty("Submitapproval");
		return property;
	}
	
}

