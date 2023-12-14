package com.Page_object_model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Lip_Global.Base_class;

public class Questionnaire_approverequest extends Base_class{
	public Questionnaire_approverequest() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[text()='Questionnaires']")
	private WebElement Questionnaire_builder;
	
	@FindBy(xpath = "//a[text()='Form approvals']")
	private WebElement Form_approvals;
	
	@FindBy(xpath = "//span[text()='Received forms']")
	private WebElement Received_forms;
	
	@FindBy(xpath = "//button[text()='APPROVE']")
	private WebElement Approve_button;

	public WebElement getQuestionnaire_builder() {
		return Questionnaire_builder;
	}

	public WebElement getForm_approvals() {
		return Form_approvals;
	}

	public WebElement getReceived_forms() {
		return Received_forms;
	}

	public WebElement getApprove_button() {
		return Approve_button;
	}
	

}
