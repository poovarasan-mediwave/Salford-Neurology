package com.Runner_Class;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Mediwae Digital\\eclipse-workspace\\Salford_neurology\\src\\test\\resources\\com.Feature_file", glue = "com.Step_defenition", dryRun = false, monochrome = true, tags = "@LifestyleMyealthFcators", plugin = {
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" })

public class Runner_class {
	simply

}
