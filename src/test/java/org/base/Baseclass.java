package org.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	
	public static WebDriver driver ;
	
	public static  void Browserlaunch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	public static  void Geturl(String url ) {
		driver.get(url);
	}
	
	public static  void Maximize() {
		driver.manage().window().maximize();
	}
	
	public static  void Implicity(long sec) {
		driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
	}
	
	public static void Sendkeys(WebElement e , String value) {
		e.sendKeys(value);
	}
	
	public static  void Click(WebElement e ) {
		e.click();
	}
	
	public static  void Quit() {
		driver.quit();
	}
	
	public static  void Close() {
		driver.close();
	}
	
	public static  String Currenturl () {
		String curl = driver.getCurrentUrl();
		return curl;
	}
	
	public static String GetAttribute(WebElement e , String value) {
		String attribute = e.getAttribute(value );
		return attribute;
	}
	
	public static  String Getext(WebElement e) {
		String text = e.getText();
		return text ;
	}
	
	public static  void MovetoElement(WebElement target) {
		Actions  a = new Actions(driver);
		a.moveToElement(target).perform();
	}
	
	public static  void Contextclick() {
		Actions a = new Actions(driver);
		a.contextClick();
	}
	
	public static  void SelectByIndex(WebElement value , int index ) {
		Select s = new Select(value);
		s.selectByIndex(index);
	}
	
	public static  void SelectByValue(WebElement Element , String value) {
		Select s = new Select(Element);
		s.selectByValue(value);
	}
	
	public static  void Deselect(WebElement Value ) {
		Select s = new Select(Value);
		s.deselectAll();
	}
}
