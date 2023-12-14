package com.Page_object_model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Lip_Global.Base_class;

public class Lifestyle_Alcohol extends Base_class {

	
	public Lifestyle_Alcohol(){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[text()='LIFESTYLE']")
	private WebElement Select_lifeStyle;
	
	
	@FindBy(xpath="//p[text()='Track your alcohol intake']")
	private WebElement Navigate_AlcoholIntake;
	
	@FindBy(xpath="//button[text()='ADD ANOTHER ENTRY']")
	private WebElement AddAnother_Entry;
	
	@FindBy (xpath="//input[@name='mood_date']")
	private WebElement selectDate_field;
	
	@FindBy(xpath = "//select[@class='react-datepicker__month-select']")
	private WebElement selectmonth;
	
	@FindBy(xpath = "//option[text()='March']")
	private WebElement march;
	
	@FindBy(xpath="//select[@class='react-datepicker__year-select']")
	private WebElement selectYear;
	
	@FindBy(xpath="//option[text()='2022']")
	private WebElement Year2022;
	
	@FindBy (xpath="(//div[@aria-label='Choose Sunday, October 2nd, 2022'])[1]")
	private WebElement date_Alcohol;
	
	public WebElement getDate_Alcohol() {
		return date_Alcohol;
	}

	public void setDate_Alcohol(WebElement date_Alcohol) {
		this.date_Alcohol = date_Alcohol;
	}

	public WebElement getYear2022() {
		return Year2022;
	}

	public void setYear2022(WebElement year2022) {
		Year2022 = year2022;
	}

	@FindBy(xpath="//div[@class='react-datepicker__day react-datepicker__day--005']")
	private WebElement Date_5;
	
	@FindBy (xpath="//label[text()='AFTERNOON (FROM 12PM)']")
	private WebElement start_drinkingday;
	
	@FindBy(xpath="(//div[contains(@class,'counter-btn right')])[7]")
	private WebElement drink_spirit;
	
	@FindBy(xpath="//label[text()='ALRIGHT']")
	private WebElement manageon_date;
	
	@FindBy(xpath="//button[text()='Save']")
	private WebElement Save;
	
	@FindBy(xpath="//a[text()='My health']")
	private WebElement clicking_Myhealth;

	public WebElement getSelect_lifeStyle() {
		return Select_lifeStyle;
	}

	public void setSelect_lifeStyle(WebElement select_lifeStyle) {
		Select_lifeStyle = select_lifeStyle;
	}

	public WebElement getNavigate_AlcoholIntake() {
		return Navigate_AlcoholIntake;
	}

	public void setNavigate_AlcoholIntake(WebElement navigate_AlcoholIntake) {
		Navigate_AlcoholIntake = navigate_AlcoholIntake;
	}

	public WebElement getAddAnother_Entry() {
		return AddAnother_Entry;
	}

	public void setAddAnother_Entry(WebElement addAnother_Entry) {
		AddAnother_Entry = addAnother_Entry;
	}

	public WebElement getSelectDate_field() {
		return selectDate_field;
	}

	public void setSelectDate_field(WebElement selectDate_field) {
		this.selectDate_field = selectDate_field;
	}

	public WebElement getSelectmonth() {
		return selectmonth;
	}

	public void setSelectmonth(WebElement selectmonth) {
		this.selectmonth = selectmonth;
	}

	public WebElement getMarch() {
		return march;
	}

	public void setMarch(WebElement march) {
		this.march = march;
	}

	public WebElement getSelectYear() {
		return selectYear;
	}

	public void setSelectYear(WebElement selectYear) {
		this.selectYear = selectYear;
	}

	public WebElement getDate_5() {
		return Date_5;
	}

	public void setDate_5(WebElement date_5) {
		Date_5 = date_5;
	}

	public WebElement getStart_drinkingday() {
		return start_drinkingday;
	}

	public void setStart_drinkingday(WebElement start_drinkingday) {
		this.start_drinkingday = start_drinkingday;
	}

	public WebElement getDrink_spirit() {
		return drink_spirit;
	}

	public void setDrink_spirit(WebElement drink_spirit) {
		this.drink_spirit = drink_spirit;
	}

	public WebElement getManageon_date() {
		return manageon_date;
	}

	public void setManageon_date(WebElement manageon_date) {
		this.manageon_date = manageon_date;
	}

	public WebElement getSave() {
		return Save;
	}

	public void setSave(WebElement save) {
		Save = save;
	}

	public WebElement getClicking_Myhealth() {
		return clicking_Myhealth;
	}

	public void setClicking_Myhealth(WebElement clicking_Myhealth) {
		this.clicking_Myhealth = clicking_Myhealth;
	}

	
	
	
	
}

