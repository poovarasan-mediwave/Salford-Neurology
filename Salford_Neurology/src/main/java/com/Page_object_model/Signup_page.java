package com.Page_object_model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Lip_Global.Base_class;

public class Signup_page extends Base_class{

	
	public Signup_page() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[text()='Sign up']")
    private WebElement Signup_click;
	
	@FindBy(xpath = "//input[@type='email']")
    private WebElement Signup_email;

	@FindBy(xpath = "//input[@type='password']")
    private WebElement Signup_password;
	
	@FindBy(xpath = "//button[text()='Next']")
    private WebElement next_button;
	
	@FindBy(xpath = "//input[@name='name']")
    private WebElement first_name;
	
	@FindBy(xpath = "//input[@name='lastName']")
    private WebElement last_name;
	
	@FindBy(xpath = "//label[text()='I agree to the Terms of Service*']")
    private WebElement Terms_services;
	
	@FindBy(xpath = "//button[text()='Create account']")
    private WebElement create_account;

	public WebElement getSignup_click() {
		return Signup_click;
	}

	public WebElement getSignup_email() {
		return Signup_email;
	}

	public WebElement getSignup_password() {
		return Signup_password;
	}

	public WebElement getNext_button() {
		return next_button;
	}

	public WebElement getFirst_name() {
		return first_name;
	}

	public WebElement getLast_name() {
		return last_name;
	}

	public WebElement getTerms_services() {
		return Terms_services;
	}

	public WebElement getCreate_account() {
		return create_account;
	}
	
	
}
