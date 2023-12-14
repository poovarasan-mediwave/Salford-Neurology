package com.Page_object_model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Lip_Global.Base_class;

public class Clinician_profile extends Base_class{

	public Clinician_profile(){
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//a[text()='Profile']")
	private WebElement Select_profileicon;
	
	@FindBy(xpath = "//input[@placeholder='Enter a preference name']")
	private WebElement name_liketocall;
	
	@FindBy(xpath = "//input[@name='mobileNumber']")
	private WebElement phone_number;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div[2]/div[2]/div[2]/form/div/div[1]/div/div[2]/div[17]/div/div/div[1]/div[2]")
	private WebElement Gender_selection;
	
	@FindBy(xpath = "	//div[text()='Male']")
	private WebElement Male_selection;
	
	@FindBy(xpath = "//div[text()='Female']")
	private WebElement Female_selection;	

	@FindBy(xpath = "//*[@id=\"root\"]/div[2]/div[2]/div[2]/form/div/div[1]/div/div[2]/div[19]/div/div/div[1]/div[2]")
	private WebElement Martial_status;
	
	@FindBy(xpath = "//div[text()='Single']")
	private WebElement Martial_single;
	
	@FindBy(xpath = "//div[text()='Cohabiting']")
	private WebElement Martial_cobaiting;
	
	@FindBy(xpath = "//div[text()='Married']")
	private WebElement Martial_married;
	
	@FindBy(xpath = "//div[text()='Divorced']")
	private WebElement Martial_divorced;
	
	@FindBy(xpath = "//div[text()='Widowed']")
	private WebElement Martial_widowed;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div[2]/div[2]/div[2]/form/div/div[1]/div/div[2]/div[21]/div/div/div[1]/div[2]")
	private WebElement Ethnicity_select;
	
	@FindBy(xpath = "//div[text()='Asian or Asian British - Indian']")
	private WebElement Ethnicity_Asian;
	
	@FindBy(xpath = "//input[@placeholder='Search']")
	private WebElement Language_spoken;
	
	@FindBy(xpath = "(//div[@class='dropdown-content']/div/div/ul/li/label/div/input)[1]")
	private WebElement Language_choose;
	
	public WebElement getLanguage_choose() {
		return Language_choose;
	}
	@FindBy(xpath = "//button[text()='update']")
	private WebElement Update_profile;

	
	public WebElement getSelect_profileicon() {
		return Select_profileicon;
	}

	public WebElement getName_liketocall() {
		return name_liketocall;
	}

	public WebElement getPhone_number() {
		return phone_number;
	}

	public WebElement getGender_selection() {
		return Gender_selection;
	}

	public WebElement getMale_selection() {
		return Male_selection;
	}

	public WebElement getFemale_selection() {
		return Female_selection;
	}

	public WebElement getMartial_status() {
		return Martial_status;
	}

	public WebElement getMartial_single() {
		return Martial_single;
	}

	public WebElement getMartial_cobaiting() {
		return Martial_cobaiting;
	}

	public WebElement getMartial_married() {
		return Martial_married;
	}

	public WebElement getMartial_divorced() {
		return Martial_divorced;
	}

	public WebElement getMartial_widowed() {
		return Martial_widowed;
	}

	public WebElement getEthnicity_select() {
		return Ethnicity_select;
	}

	public WebElement getEthnicity_Asian() {
		return Ethnicity_Asian;
	}

	public WebElement getLanguage_spoken() {
		return Language_spoken;
	}

	public WebElement getUpdate_profile() {
		return Update_profile;
	}
}
