package com.Page_object_model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Lip_Global.Base_class;

public class Questionnaires extends Base_class{
	
	public Questionnaires() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//*[text()='Questionnaires']")
	private WebElement Questionnaire_builder;
	
	@FindBy(xpath = "//button[text()='CREATE NEW']")
	//@FindBy(xpath = "//div[@class='search-block']/following-sibling::div[2]/button[text()='CREATE NEW']")
	
	private WebElement Create_new;
	
	@FindBy(xpath = "//input[@name='name']")
	private WebElement Questionnaire_name;
	
	@FindBy(xpath = "(//div[@class='react-select__input-container css-19bb58m'])[1]")
	private WebElement Questionnaire_category;
	
	
	@FindBy(xpath = "//div[text()='Consultation']")
	private WebElement Category_consulation;
	
	@FindBy(xpath = "//div[text()='Medical history']")
	private WebElement Category_medicalhistory;
	
	@FindBy(xpath = "//div[text()='Demographic']")
	private WebElement Category_demographic;
	
	@FindBy(xpath = " //div[text()='Patient report']")
	private WebElement Category_patientreport;
	
	//@FindBy(xpath = "//div[text()='Select an age group']")
	@FindBy(xpath = "//label[text()='Age group']/following-sibling::div//following-sibling::span/following-sibling::div/div/div[2]")
	private WebElement Age_group;
	
	@FindBy(xpath = " //div[text()='Child']")
	private WebElement Age_child;
	
	@FindBy(xpath = " //div[text()='Teenager']")
	private WebElement Age_teenager;
	
	@FindBy(xpath = "//div[text()='Young people']")
	private WebElement Age_youngpeople;
	
	@FindBy(xpath = " //div[text()='Adult']")
	private WebElement Age_adult;
	
	//@FindBy(xpath = "//*[@id=\"root\"]/div/main/section/div[2]/div/div/div[1]/form/div[6]/div/div[1]/div[1]/div[2]")
	

	@FindBy(xpath = "(//label[text()='Choose tags']/following-sibling::div//div//div//following-sibling::div//input)[1]")
	private WebElement Choose_tags;
	
	@FindBy(xpath = "(//input[@class='react-select__input'])[3]")
	private WebElement Trust;
	
	@FindBy(xpath = "//div[text()='salford']")
	private WebElement Trust_salford;
	
	@FindBy(xpath = "//button[text()='NEXT']")
	private WebElement Next_button;
	
	@FindBy(xpath = "//button[text()='ADD YOUR FIRST QUESTION']")
	private WebElement Add_firstquestion;
	
	@FindBy(xpath = "//button[text()='ADD YOUR NEXT QUESTION']")
	private WebElement Add_nextquestion;
	
	@FindBy(xpath = "//p[text()='Multiple choice question']")
	private WebElement Multiple_choice_question;
	
	@FindBy(xpath = "//textarea[@name='notes']")
	private WebElement Enter_notes;
	
	@FindBy(xpath = "(//input[@name='Dropdown'])[1]")
	private WebElement Add_responses1;
	
	@FindBy(xpath = "(//input[@name='Dropdown'])[2]")
	private WebElement Add_responses2;
	
	@FindBy(xpath = "//button[text()='ADD ANOTHER RESPONSE']")
	private WebElement ADD_ANOTHER_RESPONSE;
	
	@FindBy(xpath = "(//input[@name='Dropdown'])[3]")
	private WebElement Add_responses3;
	
	@FindBy(xpath = "//p[text()='Statement']")
	private WebElement statement_question;
	
	@FindBy(xpath = "//textarea[@placeholder='Enter your statement here']")
	private WebElement Enter_statement;
	
	@FindBy(xpath = "//p[text()='Free text']")
	private WebElement Free_text;
	
	@FindBy(xpath = "//textarea[@placeholder='Enter your freetext here']")
	private WebElement Enter_freetext;
	
	@FindBy(xpath = "//p[text()='Yes/No question']")
	private WebElement Yesorno_question;
	
	@FindBy(xpath = "//textarea[@name='YesNo']")
	private WebElement Enter_YesorNo_question;
	
	@FindBy(xpath = "//p[text()='Rating scale']")
	private WebElement Rating_scale;
	
	@FindBy(xpath = "//textarea[@name='Rating']")
	private WebElement Enter_rating_questions;
	
	@FindBy(xpath = "//div[@id='react-select-6-placeholder']")
	private WebElement Add_stars;
	
	@FindBy(xpath = "//p[text()='Likert']")
	private WebElement Likert_button;
	
	@FindBy(xpath = "//textarea[@name='scale']")
	private WebElement Enter_scalenote;
	
	@FindBy(xpath = "(//input[@name='lowerRangeDescription'])[1]")
	private WebElement Enter_response1;
	
	@FindBy(xpath = "(//input[@name='lowerRangeDescription'])[2]")
	private WebElement Enter_response2;
	
	@FindBy(xpath = "(//input[@name='lowerRangeDescription'])[3]")
	private WebElement Enter_response3;
	
	@FindBy(xpath = "(//input[@name='lowerRangeDescription'])[4]")
	private WebElement Enter_response4;
	
	@FindBy(xpath = "(//input[@name='lowerRangeDescription'])[5]")
	private WebElement Enter_response5;
	
	@FindBy(xpath = "//p[text()='Dropdown']")
	private WebElement Dropdown_questions;
	
	@FindBy(xpath = "//textarea[@name='notes']")
	private WebElement Dropdown_note_question;
	
	@FindBy(xpath = "(//input[@name='Dropdown'])[1]")
	private WebElement dropdown_response1;
	
	@FindBy(xpath = "(//input[@name='Dropdown'])[2]")
	private WebElement dropdown_response2;
	
	@FindBy(xpath = "//p[text()='Section']")
	private WebElement Section_question;
	
	@FindBy(xpath = "//textarea[@name='Rating']")
	private WebElement Section_notes;
	
	@FindBy(xpath = "//p[text()='Opening statement']")
	private WebElement Opening_statement;
	
	@FindBy(xpath = "//div[@class='ql-editor ql-blank']")
	private WebElement Opening_statementnotes;
	
	@FindBy(xpath = "//p[text()='Closing statement']")
	private WebElement Closing_statement;
	
	@FindBy(xpath = "//div[@class='ql-editor ql-blank']")
	private WebElement Closing_statementnotes;
	
	@FindBy(xpath = "//p[text()='Picture choice question']")
	private WebElement Picture_choice_questions;
	
	@FindBy(xpath = "//textarea[@name='picture']")
	private WebElement Picture_choice;
	
	@FindBy(xpath = "//button[text()='Upload Image']")
	private WebElement Upload_image_button;
	
	@FindBy(xpath = "//span[text()='PREVIEW']")
	private WebElement Preview_button;
	
	@FindBy(xpath = "//div[@id='popup_focus']")
	private WebElement Close_button;
	
	@FindBy(xpath = "//button[text()='SAVE DRAFT']")
	private WebElement Save_draft;
	
	@FindBy(xpath = "//button[text()='BACK TO FORM & QUESTIONNAIRES']")
	private WebElement Back_to_questionnaires;
	
	@FindBy(xpath = "//button[text()='Continue Editing']")
	private WebElement Continue_editing;
	
	@FindBy(xpath = "(//*[text()='EDIT'])[1]")
	private WebElement edit_button;
	
	@FindBy(xpath = "//button[text()='SUBMIT FOR APPROVAL']")
	private WebElement Submitapproval_button;
	
	@FindBy(xpath = "//div[@class='react-select-container css-b62m3t-container']/div/div/div[2]/input") 
	private WebElement Searchapproval_button;
	
	@FindBy(xpath = "//button[text()='CONFIRM & SUBMIT']")
	private WebElement Confirmsubmmit_button;

	public WebElement getTrust_salford() {
		return Trust_salford;
	}

	public WebElement getQuestionnaire_builder() {
		return Questionnaire_builder;
	}

	public WebElement getCreate_new() {
		return Create_new;
	}

	public WebElement getQuestionnaire_name() {
		return Questionnaire_name;
	}

	public WebElement getQuestionnaire_category() {
		return Questionnaire_category;
	}

	public WebElement getCategory_consulation() {
		return Category_consulation;
	}

	public WebElement getCategory_medicalhistory() {
		return Category_medicalhistory;
	}

	public WebElement getCategory_demographic() {
		return Category_demographic;
	}

	public WebElement getCategory_patientreport() {
		return Category_patientreport;
	}

	public WebElement getAge_group() {
		return Age_group;
	}

	public WebElement getAge_child() {
		return Age_child;
	}

	public WebElement getAge_teenager() {
		return Age_teenager;
	}

	public WebElement getAge_youngpeople() {
		return Age_youngpeople;
	}

	public WebElement getAge_adult() {
		return Age_adult;
	}

	public WebElement getChoose_tags() {
		return Choose_tags;
	}

	public WebElement getTrust() {
		return Trust;
	}

	public WebElement getNext_button() {
		return Next_button;
	}

	public WebElement getAdd_firstquestion() {
		return Add_firstquestion;
	}

	public WebElement getAdd_nextquestion() {
		return Add_nextquestion;
	}

	public WebElement getMultiple_choice_question() {
		return Multiple_choice_question;
	}

	public WebElement getEnter_notes() {
		return Enter_notes;
	}

	public WebElement getAdd_responses1() {
		return Add_responses1;
	}

	public WebElement getAdd_responses2() {
		return Add_responses2;
	}

	public WebElement getADD_ANOTHER_RESPONSE() {
		return ADD_ANOTHER_RESPONSE;
	}

	public WebElement getAdd_responses3() {
		return Add_responses3;
	}

	public WebElement getStatement_question() {
		return statement_question;
	}

	public WebElement getEnter_statement() {
		return Enter_statement;
	}

	public WebElement getFree_text() {
		return Free_text;
	}

	public WebElement getEnter_freetext() {
		return Enter_freetext;
	}

	public WebElement getYesorno_question() {
		return Yesorno_question;
	}

	public WebElement getEnter_YesorNo_question() {
		return Enter_YesorNo_question;
	}

	public WebElement getRating_scale() {
		return Rating_scale;
	}

	public WebElement getEnter_rating_questions() {
		return Enter_rating_questions;
	}

	public WebElement getAdd_stars() {
		return Add_stars;
	}

	public WebElement getLikert_button() {
		return Likert_button;
	}

	public WebElement getEnter_scalenote() {
		return Enter_scalenote;
	}

	public WebElement getEnter_response1() {
		return Enter_response1;
	}

	public WebElement getEnter_response2() {
		return Enter_response2;
	}

	public WebElement getEnter_response3() {
		return Enter_response3;
	}

	public WebElement getEnter_response4() {
		return Enter_response4;
	}

	public WebElement getEnter_response5() {
		return Enter_response5;
	}

	public WebElement getDropdown_questions() {
		return Dropdown_questions;
	}

	public WebElement getDropdown_note_question() {
		return Dropdown_note_question;
	}

	public WebElement getDropdown_response1() {
		return dropdown_response1;
	}

	public WebElement getDropdown_response2() {
		return dropdown_response2;
	}

	public WebElement getSection_question() {
		return Section_question;
	}

	public WebElement getSection_notes() {
		return Section_notes;
	}

	public WebElement getOpening_statement() {
		return Opening_statement;
	}

	public WebElement getOpening_statementnotes() {
		return Opening_statementnotes;
	}

	public WebElement getClosing_statement() {
		return Closing_statement;
	}

	public WebElement getClosing_statementnotes() {
		return Closing_statementnotes;
	}

	public WebElement getPicture_choice_questions() {
		return Picture_choice_questions;
	}

	public WebElement getPicture_choice() {
		return Picture_choice;
	}

	public WebElement getUpload_image_button() {
		return Upload_image_button;
	}

	public WebElement getPreview_button() {
		return Preview_button;
	}

	public WebElement getClose_button() {
		return Close_button;
	}

	public WebElement getSave_draft() {
		return Save_draft;
	}

	public WebElement getBack_to_questionnaires() {
		return Back_to_questionnaires;
	}

	public WebElement getContinue_editing() {
		return Continue_editing;
	}

	public WebElement getEdit_button() {
		return edit_button;
	}

	public WebElement getSubmitapproval_button() {
		return Submitapproval_button;
	}

	public WebElement getSearchapproval_button() {
		return Searchapproval_button;
	}

	public WebElement getConfirmsubmmit_button() {
		return Confirmsubmmit_button;
	}

	
	
	

}
