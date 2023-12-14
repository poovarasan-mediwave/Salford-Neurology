package com.Page_object_model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Lip_Global.Base_class;

public class Login_page extends Base_class{

	public Login_page(){
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "(//button[text()='Log in'])[1]")
	private WebElement login_click;
	
	@FindBy(xpath = "//input[@type='email']")
	private WebElement email_field;
	
	@FindBy(xpath = "//input[@type='password']")
	private WebElement password_field;
	
	@FindBy(xpath = "//span[@class='checkmark']")
	private WebElement remember_me;
	
	@FindBy(xpath = "//button[text()='Log in']")
	private WebElement login_button;

	public WebElement getLogin_click() {
		return login_click;
	}

	public WebElement getEmail_field() {
		return email_field;
	}

	public WebElement getPassword_field() {
		return password_field;
	}

	public WebElement getRemember_me() {
		return remember_me;
	}

	public WebElement getLogin_button() {
		return login_button;
	}
	
	
	
}
