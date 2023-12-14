package com.Page_object_model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Lip_Global.Base_class;

public class My_health extends Base_class {

	public My_health() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[text()='My health']")
	private WebElement My_healthclick;

	private WebElement selecting_Date_diagnosis;
	
	public WebElement getMy_healthclick() {
		return My_healthclick;
	}


	public void setMy_healthclick(WebElement my_healthclick) {
		My_healthclick = my_healthclick;
	}


	public WebElement getAdd_newdiagnosis() {
		return Add_newdiagnosis;
	}


	public void setAdd_newdiagnosis(WebElement add_newdiagnosis) {
		Add_newdiagnosis = add_newdiagnosis;
	}


	public WebElement getCondition_Symptom() {
		return condition_Symptom;
	}


	public void setCondition_Symptom(WebElement condition_Symptom) {
		this.condition_Symptom = condition_Symptom;
	}


	public WebElement getDateof_diagnosis() {
		return Dateof_diagnosis;
	}


	public void setDateof_diagnosis(WebElement dateof_diagnosis) {
		Dateof_diagnosis = dateof_diagnosis;
	}


	public WebElement getSelecting_Date_diagnosis() {
		return getSelecting_Date_diagnosis();
	}


	public void setSelecting_Date_diagnosis(WebElement selecting_Date_diagnosis) {
		this.selecting_Date_diagnosis = selecting_Date_diagnosis;
	}


	public WebElement getSave_button() {
		return Save_button;
	}


	public void setSave_button(WebElement save_button) {
		Save_button = save_button;
	}


	public WebElement getADD_NEW_MEDICATION() {
		return ADD_NEW_MEDICATION;
	}


	public void setADD_NEW_MEDICATION(WebElement aDD_NEW_MEDICATION) {
		ADD_NEW_MEDICATION = aDD_NEW_MEDICATION;
	}


	public WebElement getMedication_name() {
		return Medication_name;
	}


	public void setMedication_name(WebElement medication_name) {
		Medication_name = medication_name;
	}


	public WebElement getMedication_type() {
		return Medication_type;
	}


	public void setMedication_type(WebElement medication_type) {
		Medication_type = medication_type;
	}


	public WebElement getMedication_Tablet() {
		return Medication_Tablet;
	}


	public void setMedication_Tablet(WebElement medication_Tablet) {
		Medication_Tablet = medication_Tablet;
	}


	public WebElement getDosage() {
		return Dosage;
	}


	public void setDosage(WebElement dosage) {
		Dosage = dosage;
	}

	@FindBy(xpath = "//button[text()='ADD NEW DIAGNOSIS']")
	private WebElement Add_newdiagnosis;
	
	@FindBy(xpath = "//input[@placeholder='Type condition']")
	private WebElement condition_Symptom;

	@FindBy(xpath="//input[@name='addDiagnosis.diagnosedDate']")
	private WebElement Dateof_diagnosis;
	
//	@FindBy(xpath="//select[@class='react-datepicker__month-select']")
//	private WebElement selecting_Date_diagnosis;
	
	
	@FindBy(xpath="(//div[@class='react-datepicker__month-container']/div/div[2]/div[1])[1]/select[@class='react-datepicker__month-select']/option[@value='4']")
	private WebElement selectingMonth_Date_diagnosis;
	
	@FindBy(xpath="//div[@class='react-datepicker__month']/div[2]/div[@aria-label='Choose Monday, May 8th, 2023']")
	private WebElement selectingMonth_FinalDate_diagnosis;
	
	public WebElement getSelectingMonth_Date_diagnosis() {
		return selectingMonth_Date_diagnosis;
	}


	public void setSelectingMonth_Date_diagnosis(WebElement selectingMonth_Date_diagnosis) {
		this.selectingMonth_Date_diagnosis = selectingMonth_Date_diagnosis;
	}


	public WebElement getSelectingMonth_FinalDate_diagnosis() {
		return selectingMonth_FinalDate_diagnosis;
	}


	public void setSelectingMonth_FinalDate_diagnosis(WebElement selectingMonth_FinalDate_diagnosis) {
		this.selectingMonth_FinalDate_diagnosis = selectingMonth_FinalDate_diagnosis;
	}

	@FindBy(xpath="//button[text()='SAVE']")
	private WebElement Save_button;
	
	@FindBy(xpath="(//button[text()='ADD NEW MEDICATION'])")
	private WebElement ADD_NEW_MEDICATION;
	

	@FindBy(xpath="//input[@name='name']")
	private WebElement Medication_name;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]")
	private WebElement Medication_type;
    	

	@FindBy(xpath="//div[@class='react-select__menu css-lkh0o5-menu']/div/div[text()='Tablet']")
	private WebElement Medication_Tablet;
	
	
	@FindBy(xpath="(//div[@class='react-select__control css-1im77uy-control'])[2]/div[2]")
	private WebElement Frequency_dropdown_click;
	
	//@FindBy(xpath="//div[@id='react-select-34-placeholder']")4
	
	public WebElement getFrequency_dropdown_click() {
		return Frequency_dropdown_click;
	}


	public void setFrequency_dropdown_click(WebElement frequency_dropdown_click) {
		Frequency_dropdown_click = frequency_dropdown_click;
	}


	public WebElement getFrequency_doses_3() {
		return frequency_doses_3;
	}


	public void setFrequency_doses_3(WebElement frequency_doses_3) {
		this.frequency_doses_3 = frequency_doses_3;
	}

	@FindBy(xpath="(//div[@class='react-select__menu css-lkh0o5-menu'])/div/div[3]")
	private WebElement frequency_doses_3;

	@FindBy(xpath="//input[@name='dosage']")
	private WebElement Dosage;
	
	
//	@FindBy (xpath="(//div[@class='react-select__control css-1im77uy-control'])[3]/div[2]")
//	private WebElement Number_of_times;
	
//	@FindBy (xpath="//div[@id='react-select-34-listbox']/div/div[4]")
//	private WebElement Number_of_times_dropdown;
//	
	
	@FindBy (xpath="/html[1]/body[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[7]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]")
	private WebElement Number_of_times;
	@FindBy (xpath="/html[1]/body[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[7]/div[3]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[4]")
	private WebElement Number_of_times_dropdown;
	
	
	@FindBy (xpath="(//div[@class='react-select__control css-1im77uy-control'])[3]/div[2]")
	private WebElement Dosage_Frequency;
	
	@FindBy (xpath="/html[1]/body[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[7]/div[3]/div[3]/div[1]/div[1]/div[2]/div[1]/div[2]")
	private WebElement Dosage_frequency_dropdown;
	
	@FindBy (xpath="//input[@name='symptom']")
	private WebElement Symptom;
	
	@FindBy (xpath="(//div[@class='react-select__indicator react-select__dropdown-indicator css-1xc3v61-indicatorContainer'])[5]")
	private WebElement Specific_Diagnosis;
	
	@FindBy (xpath="/html[1]/body[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[13]/div[1]/div[2]/div[1]/div[2]")
	private WebElement Specific_Diagnosis_Dropdown;
	
	@FindBy (xpath="(//button[@type='button'][normalize-space()='ARCHIVE'])[1]")
	private WebElement Archive;
	
	
	@FindBy (xpath="(//button[@type='button'][normalize-space()='UNARCHIVE'])[1]")
	private WebElement UNArchive;

	@FindBy (xpath="//a[text()='HEALTH HISTORY']")
	private WebElement Health_History;
	
	@FindBy (xpath="//a[text()='CURRENT HEALTH']")
	private WebElement Current_Health;
	
	@FindBy(xpath="//button[@id='dropdown-toggle']")
	private WebElement Profile_Icon;
	
	@FindBy(xpath="//a[text()='Logout']")
    private WebElement Logout;

	public WebElement getProfile_Icon() {
		return Profile_Icon;
	}


	public void setProfile_Icon(WebElement profile_Icon) {
		Profile_Icon = profile_Icon;
	}


	public WebElement getLogout() {
		return Logout;
	}


	public void setLogout(WebElement logout) {
		Logout = logout;
	}


	public WebElement getArchive() {
		return Archive;
	}


	public void setArchive(WebElement archive) {
		Archive = archive;
	}


	public WebElement getUNArchive() {
		return UNArchive;
	}


	public void setUNArchive(WebElement uNArchive) {
		UNArchive = uNArchive;
	}


	public WebElement getHealth_History() {
		return Health_History;
	}


	public void setHealth_History(WebElement health_History) {
		Health_History = health_History;
	}


	public WebElement getCurrent_Health() {
		return Current_Health;
	}


	public void setCurrent_Health(WebElement current_Health) {
		Current_Health = current_Health;
	}


	public WebElement getNumber_of_times() {
		return Number_of_times;
	}


	public void setNumber_of_times(WebElement number_of_times) {
		Number_of_times = number_of_times;
	}


	public WebElement getNumber_of_times_dropdown() {
		return Number_of_times_dropdown;
	}


	public void setNumber_of_times_dropdown(WebElement number_of_times_dropdown) {
		Number_of_times_dropdown = number_of_times_dropdown;
	}


	public WebElement getDosage_Frequency() {
		return Dosage_Frequency;
	}


	public void setDosage_Frequency(WebElement dosage_Frequency) {
		Dosage_Frequency = dosage_Frequency;
	}


	public WebElement getDosage_frequency_dropdown() {
		return Dosage_frequency_dropdown;
	}


	public void setDosage_frequency_dropdown(WebElement dosage_frequency_dropdown) {
		Dosage_frequency_dropdown = dosage_frequency_dropdown;
	}


	public WebElement getSymptom() {
		return Symptom;
	}


	public void setSymptom(WebElement symptom) {
		Symptom = symptom;
	}


	public WebElement getSpecific_Diagnosis() {
		return Specific_Diagnosis;
	}


	public void setSpecific_Diagnosis(WebElement specific_Diagnosis) {
		Specific_Diagnosis = specific_Diagnosis;
	}


	public WebElement getSpecific_Diagnosis_Dropdown() {
		return Specific_Diagnosis_Dropdown;
	}


	public void setSpecific_Diagnosis_Dropdown(WebElement specific_Diagnosis_Dropdown) {
		Specific_Diagnosis_Dropdown = specific_Diagnosis_Dropdown;
	}
	
}
