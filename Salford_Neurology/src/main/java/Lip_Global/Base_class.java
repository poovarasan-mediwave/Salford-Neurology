package Lip_Global;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_class {

	public static WebDriver driver;

	public static void browserlaunch(String browser, String URL) {
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Mediwae Digital\\eclipse-workspace\\Salford_neurology\\driver1\\chromedriver.exe");
			driver = new ChromeDriver();

		}

		else if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

		} else {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}

		driver.manage().window().maximize();
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public static void Getinputvalues(WebElement element, String value) {
		element.sendKeys(value);
	}

	public static void clickElement(WebElement element) {
		element.click();
	}

	public static void scrolldown(WebElement element) {
		JavascriptExecutor qn = (JavascriptExecutor) driver;
		qn.executeScript("arguments[0].scrollIntoView(true)", element);

	}

	public static void scrollup(WebElement element) {
		JavascriptExecutor qn = (JavascriptExecutor) driver;
		qn.executeScript("arguments[0].scrollIntoView(false)", element);

	}

	public static void screenshot(String filepath) throws Throwable {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		File f = new File(filepath);
		FileUtils.copyFile(screenshotAs, f);

	}

	public void dropdownSelectByVisibleText(WebElement element, String a) {
		Select s = new Select(element);
		s.selectByVisibleText(a);
	}

	public void dropdownSelectByValue(WebElement element, String a) {
		Select s = new Select(element);
		s.selectByValue(a);
	}
	
	public void clickon_ListElement_indexbased(List<WebElement> element, int num) throws Throwable {
		try {

			// declare the variable
			int desiredElementIndex = num;
			if (desiredElementIndex >= 0 && desiredElementIndex < element.size()) {
				WebElement desiredElement = element.get(desiredElementIndex);
				desiredElement.click();

				System.out.println("Performed action after clicking element at index: " + desiredElementIndex);
			} else {
				System.out.println("Invalid index: " + desiredElementIndex);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
