package org.Ailrline;

import org.base.Baseclass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AirBaltic extends Baseclass {
	

	@BeforeSuite
	private void BeforeSuite() {
		System.out.println("Before class ");
	}

	@BeforeTest
	private void BeforeTest() {
		Browserlaunch();

	}

	@BeforeGroups
	private void BeforeGrops() {
		Implicity(10);
	}

	@Test
	private void Testcase1() throws InterruptedException {
	Geturl("https://www.tarom.ro/en");
	Locaters l = new Locaters();
	Thread.sleep(2000);
	Click(l.getAccept());
	Thread.sleep(2000);
	Click(l.getOneway());
	Thread.sleep(2000);
	Click(l.getOrgin());
	Thread.sleep(2000);
	Click(l.getStartingpoint());
	Thread.sleep(2000);
	Click(l.getDestination());
	Thread.sleep(2000);
	Click(l.getEndpoint());
	}
	
	@Test
	private void testcase2() throws InterruptedException {
		Locaters l = new Locaters();
		Thread.sleep(2000);
		Click(l.getDeparture());
		Thread.sleep(2000);
		Click(l.getDate());
		Thread.sleep(2000);
		Click(l.getAdult());
		Thread.sleep(2000);
		Click(l.getAdultperson());
		Thread.sleep(2000);
		Click(l.getBook());
		Thread.sleep(7000);
		Click(l.getVerify());
		Thread.sleep(10000);
		System.out.println("Click to verify ");
		Thread.sleep(8000);
		Click(l.getChooseflight());
		Thread.sleep(2000);
		Click(l.getNext());
		Thread.sleep(8000);
		Click(l.getContinues());
		System.out.println("personal Information ");
		Thread.sleep(7000);
		SelectByValue(l.getNames(), "MR");
		Thread.sleep(2000);
		Click(l.getGender());
		Thread.sleep(2000);
		Sendkeys(l.getLastname(), "Senthilkumar");
		Thread.sleep(2000);
		Sendkeys(l.getFirstname(), "kaaviyan");
		Thread.sleep(2000);
		Sendkeys(l.getDates(), "02");
		Thread.sleep(2000);
		SelectByValue(l.getMonth(), "4");
		Thread.sleep(2000);
		Sendkeys(l.getYear(), "1998");
		Thread.sleep(2000);
		SelectByValue(l.getNation(), "IN");

	}
	
	@AfterGroups
	private void AfterGroups() {
		System.out.println("After Groups ");
	}

	@AfterTest
	private void AfterTest() {
		System.out.println("After Test ");
	}

	@AfterSuite
	private void Aftersuite() {
		System.out.println("After Suite ");
	}
}
