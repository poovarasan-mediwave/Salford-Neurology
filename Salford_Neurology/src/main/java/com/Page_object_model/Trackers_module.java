package com.Page_object_model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Lip_Global.Base_class;

public class Trackers_module extends Base_class {

	public Trackers_module() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[text()='Tracking']")
	private WebElement Trackers_click;
	
	//sleep
	
	@FindBy(xpath = "(//span[@class='slider round'])[1]")
	private WebElement Trackers_sleepenable;
	
	@FindBy(xpath = "//a[text()='Sleep tracker']")
	private WebElement Trackers_sleepclick;
	
	@FindBy(xpath = "//button[text()='Add new entry']")
	private WebElement Sleep_addentry;
	
	@FindBy(xpath = "(//div[@class='react-datepicker__input-container'])[1]")
	private WebElement Sleep_selectday;
	
//	@FindBy(xpath = "//select[@class='react-datepicker__month-select']")
//	private WebElement Sleep_selectmonth;
	
	@FindBy(xpath = "//div[contains(@aria-label,'January')]")
	private WebElement Sleep_selectmonth;
	
	@FindBy(xpath = "//SELECT[@CLASS='react-datepicker__month-select']")
	private WebElement sleep_month;
	
	
	public WebElement getSleep_month() {
		return sleep_month;
	}
	
	@FindBy(xpath = "//button[@class='btn btn--size-l primary-btn']")
	private WebElement add_anotherentry;
	

	public WebElement getAdd_anotherentry() {
		return add_anotherentry;
	}

	@FindBy(xpath = "//select[@class='react-datepicker__year-select']")
	private WebElement Sleep_selectyear;
	
	@FindBy(xpath = "//label[text()='Very poorly']")
	private WebElement Sleep_moodselect;
	
	@FindBy(xpath = "//button[text()='Save']")
	private WebElement Sleep_save;
	
	@FindBy(xpath = "//button[text()='Edit']")
	private WebElement Sleep_edit;
	
	@FindBy(xpath = "//button[text()='Update']")
	private WebElement Sleep_update;
	
	//mood
	@FindBy(xpath = "(//span[@class='slider round'])[2]")
	private WebElement Trackers_moodenable;
	
	@FindBy(xpath = "//a[text()='Mood tracker']")
	private WebElement Trackers_moodclick;
	
	@FindBy(xpath = "//input[@name='entryDate']")
	private WebElement Mood_selectdate;
	
	@FindBy(xpath = "//label[@for='happy']")
	private WebElement Mood_selectface;
	
	@FindBy(xpath = "//label[text()='A LOT BETTER']")
	private WebElement Mood_lotbetter;
	
	@FindBy(xpath = "//button[text()='save']")
	private WebElement Mood_save;

	//
	public WebElement getTrackers_click() {
		return Trackers_click;
	}

	public WebElement getSleep_selectmonth() {
		return Sleep_selectmonth;
	}

	public WebElement getSleep_selectyear() {
		return Sleep_selectyear;
	}

	public WebElement getMood_selectdate() {
		return Mood_selectdate;
	}

	public WebElement getMood_selectface() {
		return Mood_selectface;
	}

	public WebElement getMood_lotbetter() {
		return Mood_lotbetter;
	}

	public WebElement getTrackers_sleepenable() {
		return Trackers_sleepenable;
	}

	public WebElement getTrackers_sleepclick() {
		return Trackers_sleepclick;
	}

	public WebElement getSleep_addentry() {
		return Sleep_addentry;
	}

	public WebElement getSleep_selectday() {
		return Sleep_selectday;
	}

	public WebElement getSleep_moodselect() {
		return Sleep_moodselect;
	}

	public WebElement getSleep_save() {
		return Sleep_save;
	}

	public WebElement getSleep_edit() {
		return Sleep_edit;
	}

	public WebElement getSleep_update() {
		return Sleep_update;
	}

	public WebElement getTrackers_moodenable() {
		return Trackers_moodenable;
	}

	public WebElement getTrackers_moodclick() {
		return Trackers_moodclick;
	}

	public WebElement getMood_save() {
		return Mood_save;
	}
	
	
//	@FindBy(xpath = "")
//	private WebElement ;
//	
//	@FindBy(xpath = "")
//	private WebElement ;
//	
//	@FindBy(xpath = "")
//	private WebElement ;
//	
//	@FindBy(xpath = "")
//	private WebElement ;
//	
//	@FindBy(xpath = "")
//	private WebElement ;
//	
//	@FindBy(xpath = "")
//	private WebElement ;
//	
	
	
	
	
	
}
