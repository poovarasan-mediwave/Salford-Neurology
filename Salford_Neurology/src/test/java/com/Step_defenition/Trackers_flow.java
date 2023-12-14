package com.Step_defenition;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.ClickAction;

import com.Singleton_Design_pattern.Singleton_class;
import com.configuration_reader.Filereader_manager;

import Lip_Global.Base_class;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Trackers_flow extends Base_class {
	Singleton_class tf = new Singleton_class();

	@Given("Patient logging in with valid credentials")
	public void patient_logging_in_with_valid_credentials() throws Throwable  {
		browserlaunch(Filereader_manager.getinstantconfi().getconf().getbrowser(),
				Filereader_manager.getinstantconfi().getconf().getURL());
		Thread.sleep(5000);

		Getinputvalues(tf.getLogin_page().getEmail_field(), Filereader_manager.getinstantconfi().getconf().getemail());
		Thread.sleep(3000);
		Getinputvalues(tf.getLogin_page().getPassword_field(),
				Filereader_manager.getinstantconfi().getconf().getpassword());
		Thread.sleep(3000);

		clickElement(tf.getLogin_page().getLogin_click());
		Thread.sleep(5000);
	}

	@Then("Patient is navigating to trackers and making an entry")
	public void patient_is_navigating_to_trackers_and_making_an_entry() throws Exception {

		// Sleep tracker

		clickElement(tf.getTrackers_module().getTrackers_click());
		Thread.sleep(3000);
	 clickElement(tf.getTrackers_module().getTrackers_sleepenable());
	 Thread.sleep(2000);
		clickElement(tf.getTrackers_module().getTrackers_sleepclick());
		Thread.sleep(3000);
        
		scrolldown(tf.getTrackers_module().getSleep_addentry());
		
		Thread.sleep(3000);
		clickElement(tf.getTrackers_module().getSleep_addentry());
		Thread.sleep(3000);

		clickElement(tf.getTrackers_module().getSleep_selectday());

		Thread.sleep(3000);

		dropdownSelectByVisibleText(tf.getTrackers_module().getSleep_month(), "February");
		Thread.sleep(3000);
		dropdownSelectByVisibleText(tf.getTrackers_module().getSleep_selectyear(), "2022");
		
		Thread.sleep(3000);

		List<WebElement> findElements = driver.findElements(By.xpath("//div[contains(@aria-label,'February ')]"));
		int size = findElements.size();

		for (int i = 0; i < size; i++) {
			
		if (i!=0) {
			
			scrolldown(tf.getTrackers_module().getAdd_anotherentry());
			clickElement(tf.getTrackers_module().getAdd_anotherentry());
			Thread.sleep(2000);
			
			clickElement(tf.getTrackers_module().getSleep_selectday());
			
			Thread.sleep(3000);

			dropdownSelectByVisibleText(tf.getTrackers_module().getSleep_month(), "February");
			Thread.sleep(3000);
			dropdownSelectByVisibleText(tf.getTrackers_module().getSleep_selectyear(), "2022");
			Thread.sleep(3000);
			
		}
	    System.out.println(findElements.get(i).getText());
		clickElement(findElements.get(i));
		
		
		Thread.sleep(3000);
		clickElement(tf.getTrackers_module().getSleep_moodselect());
		Thread.sleep(3000);
		
		clickElement(tf.getTrackers_module().getSleep_save());
		Thread.sleep(3000);
		
		clickElement(tf.getTrackers_module().getTrackers_sleepclick());
		Thread.sleep(2000);
		
		
		
		}



	//	Thread.sleep(3000);

		// Mood tracker

		clickElement(tf.getTrackers_module().getTrackers_click());
		Thread.sleep(3000);

		clickElement(tf.getTrackers_module().getTrackers_moodclick());
		Thread.sleep(2000);
		
		clickElement(tf.getTrackers_module().getSleep_selectday());

		Thread.sleep(3000);

		dropdownSelectByVisibleText(tf.getTrackers_module().getSleep_month(), "May");
		Thread.sleep(3000);
		dropdownSelectByVisibleText(tf.getTrackers_module().getSleep_selectyear(), "2022");
		
		List<WebElement> findElements1 = driver.findElements(By.xpath("//div[contains(@aria-label,'May')]"));
		int size1 = findElements1.size();

		for (int i = 0; i < size1; i++) {
			if (i!=0) {
				
				clickElement(tf.getTrackers_module().getSleep_selectday());

				Thread.sleep(3000);

				dropdownSelectByVisibleText(tf.getTrackers_module().getSleep_month(), "May");
				Thread.sleep(3000);
				dropdownSelectByVisibleText(tf.getTrackers_module().getSleep_selectyear(), "2022");
				
				
			}
			
			 
			 try {
				 clickElement(findElements1.get(i));
				
			} catch (Exception e) {
				clickElement(tf.getTrackers_module().getSleep_selectday());

				Thread.sleep(3000);

				dropdownSelectByVisibleText(tf.getTrackers_module().getSleep_month(), "May");
				Thread.sleep(3000);
				dropdownSelectByVisibleText(tf.getTrackers_module().getSleep_selectyear(), "2022");
				clickElement(findElements1.get(i));
				
			}
			 
			 
				
				
				clickElement(tf.getTrackers_module().getMood_selectface());
				Thread.sleep(3000);
				
				clickElement(tf.getTrackers_module().getMood_lotbetter());
				Thread.sleep(3000);
				
				scrolldown(tf.getTrackers_module().getMood_save());
				
				clickElement(tf.getTrackers_module().getMood_save());
				Thread.sleep(3000);
			
	}
	
	}
}
