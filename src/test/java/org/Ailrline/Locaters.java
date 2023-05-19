package org.Ailrline;

import org.base.Baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Locaters extends Baseclass {


	public Locaters() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//button[@type='button'])[5]")
	private WebElement Accept ;
	@FindBy (xpath="//a[text()='One way']")
	private WebElement oneway ;
	@FindBy(xpath ="(//span[text()='- City -'])[1]")
	private WebElement orgin ;
	@FindBy(xpath ="(//a[text()='Beirut, Lebanon'])[1]")
	private WebElement Startingpoint ;
	@FindBy(xpath ="(//span[text()='- City -'])[1]")
	private WebElement Destination ;
	@FindBy (xpath="(//a[text()='Amsterdam, Netherlands'])[2]")
	private WebElement Endpoint ;
	@FindBy (xpath="(//label[text()='Departure'])[1]")
	private WebElement departure ;
	@FindBy (xpath="(//a[@href='#'])[15]")
	private WebElement date ;
	@FindBy (xpath ="(//span[@class=\"selectBox-arrow\"])[14]")
	private WebElement adult ;
	@FindBy (xpath ="(//a[text()='1'])[2]")
	private WebElement adultperson ;
	@FindBy (xpath ="//a[@class='submit btn-block btn-secondary readmore']")
	private WebElement book ;
	@FindBy (xpath ="//div[@aria-label='Click to verify']")
	private WebElement verify ;
	@FindBy (xpath ="(//div[@class='availability-schedule-cabin-container row'])[2]")
	private WebElement Chooseflight ;
	@FindBy(xpath="//span[text()='continue']")
	private WebElement next ;
	@FindBy (xpath="//span[text()='continue']")
	private WebElement continues ;
	@FindBy (xpath="//select[@name='IDEN_TitleCode']")
	private WebElement names ;
	@FindBy (name="IDEN_Gender")
	private WebElement Gender ;
	@FindBy(name="IDEN_LastName")
	private WebElement lastname ;
	@FindBy (name="IDEN_FirstName")
	private WebElement firstname ;
	@FindBy(name="DateDay")
	private WebElement Dates ;
	@FindBy (name ="DateMonth")
	private WebElement month ;
	public WebElement getGender() {
		return Gender;
	}
	public WebElement getLastname() {
		return lastname;
	}
	public WebElement getFirstname() {
		return firstname;
	}
	public WebElement getDates() {
		return Dates;
	}
	public WebElement getMonth() {
		return month;
	}
	/**
	 * @return the year
	 */
	public WebElement getYear() {
		return year;
	}
	/**
	 * @return the nation
	 */
	public WebElement getNation() {
		return nation;
	}

	@FindBy (name="DateYear")
	private WebElement year ;
	@FindBy (name="IDEN_Nationality")
	private WebElement nation ;
	public WebElement getNames() {
		return names;
	}
	public WebElement getContinues() {
		return continues;
	}
	public WebElement getNext() {
		return next;
	}
	public WebElement getChooseflight() {
		return Chooseflight;
	}
	public WebElement getVerify() {
		return verify;
	}
	public WebElement getBook() {
		return book;
	}
	public WebElement getAdult() {
		return adult;
	}
	public WebElement getAdultperson() {
		return adultperson;
	}
	public WebElement getDate() {
		return date;
	}
	public WebElement getDeparture() {
		return departure;
	}
	public WebElement getStartingpoint() {
		return Startingpoint;
	}
	public WebElement getDestination() {
		return Destination;
	}
	public WebElement getEndpoint() {
		return Endpoint;
	}

	public WebElement getAccept() {
		return Accept;
	}
	
	public WebElement getOneway() {
		return oneway;
	}
	public WebElement getOrgin() {
		return orgin;
	}
	
}
