package org.selenium.programs;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

public class DriverManager {
	static WebDriver driver;

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", ".//driver/chromedriver.exe");
		// System.setProperty("webdriver.gecko.driver", ".//driver/geckodriver.exe");
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setAcceptInsecureCerts(false);
		ChromeOptions option = new ChromeOptions();
		option.merge(caps);
		option.addArguments("--start-maximized");
		driver = new ChromeDriver(option);
		// driver=new FirefoxDriver();
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		// Get Text from drop down
		Select select = new Select(driver.findElement(By.xpath("//select[@id='first']")));
		WebElement options = select.getWrappedElement();
		String defaultItem = options.getText();
		System.out.println(defaultItem);
		// Capturing the screenshot
		// File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// FileUtils.copyFile(f, new
		// File("C:/Users/Chait/Desktop/Screenshots/screenshot01.png"));
		// Drag And drop
//	     Actions builder = new Actions(driver);
//	     			Action action = builder.clickAndHold("Source_Path").
//	     					moveToElement("target_path").release("target_path").build();
//	     			action.perform();
		newWindow();
		switchToTab(1);

		newWindow();
		switchToTab(2);

		newWindow();
		switchToTab(3);

		newWindow();
		switchToTab(4);

		newWindow();
		switchToTab(5);

		newWindow();
		switchToTab(6);

		newWindow();
		switchToTab(7);

	}

	public static void newWindow() {
		((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));

	}

	public static void switchToTab(int num) {
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(num));

	}
}
