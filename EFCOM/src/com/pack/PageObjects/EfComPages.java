package com.pack.PageObjects;

import java.awt.AWTException;
import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.pack.Excelsheets.EFcomFormsFillingExcel;
import com.pack.Excelsheets.ReadExcelforEFcomForms;
import com.pack.commonmethods.CommonMethods;
import com.pack.testBase.testBase;

public class EfComPages 
{
	private WebDriver driver;
	public EfComPages(WebDriver driver)
	{ 
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}    
	
	
//FirstName
	private By firstname = By.id("FirstName");
	public boolean enterFirstName(String FirstName)
	{
		try
		{
			WebElement Element = driver.findElement(firstname);
			WebDriverWait wait = new WebDriverWait(driver,60);
			Element = wait.until(ExpectedConditions.visibilityOf(Element));
			if(Element.isDisplayed()||Element.isEnabled())
			{
				Element.clear();
				Element.sendKeys(FirstName);
				System.out.println(" CORRECT -----> FIRST NAME ENTERED  ->"+FirstName);
			}
			else
				System.out.println(" INCORRECT -X-> FIRST NAME NOT ENTERED");
			return true;
		}
		catch (NoSuchElementException ignored)
		{
				System.out.println(" INCORRECT -X-> FIRST NAME TEXT BOX NOT FOUND <ELEMENT NOT FOUND>");
			return false;
		}
	}
//LAST NAME
	private By lastname = By.id("LastName");
	public boolean enterLastName(String LastName)
	{
		try
		{
			WebElement Element = driver.findElement(lastname);
			WebDriverWait wait = new WebDriverWait(driver,60);
			Element = wait.until(ExpectedConditions.visibilityOf(Element));
			if(Element.isDisplayed()||Element.isEnabled())
			{
				Element.clear();
				Element.sendKeys(LastName);
				System.out.println(" CORRECT -----> LAST NAME ENTERED  ->"+LastName);
			}
			else
				System.out.println(" INCORRECT -X-> LAST NAME NOT ENTERED");
			return true;
		}
		catch (NoSuchElementException ignored)
		{
				System.out.println(" INCORRECT -X-> LAST NAME TEXT BOX NOT FOUND <ELEMENT NOT FOUND>");
			return false;
		}
	}	
//STREET
	private By address = By.id("AddressLine1");
	public boolean enterStreet(String Street)
	{
		try
		{
			WebElement Element = driver.findElement(address);
			WebDriverWait wait = new WebDriverWait(driver,60);
			Element = wait.until(ExpectedConditions.visibilityOf(Element));
			if(Element.isDisplayed()||Element.isEnabled())
			{
				Element.clear();
				Element.sendKeys(Street);
				System.out.println(" CORRECT -----> STREET IS ENTERED  ->"+Street);
			}
			else
				System.out.println(" INCORRECT -X-> STREET NOT ENTERED");
			return true;
		}
		catch (NoSuchElementException ignored)
		{
				System.out.println(" INCORRECT -X-> STREET TEXT BOX NOT FOUND <ELEMENT NOT FOUND>");
			return false;
		}
	}	
	public boolean verifyPresenceOfStreet()
	{
		try
		{
			WebElement Element = driver.findElement(address);
//			WebDriverWait wait = new WebDriverWait(driver,10);
//			Element = wait.until(ExpectedConditions.visibilityOf(Element));
			if(Element.isDisplayed()||Element.isEnabled())
			{
				System.out.println(" CORRECT -----> STREET IS visible");
			}
			else
				System.out.println(" INCORRECT -X-> STREET NOT visible");
			return true;
		}
		catch (NoSuchElementException ignored)
		{
				System.out.println(" INCORRECT -X-> STREET TEXT BOX NOT VISIBLE <ELEMENT NOT FOUND>");
			return false;
		}
	}	
//HouseNumber
	private By housenumber = By.id("HouseNumber");
	public boolean enterHouseNumber(String HouseNumber)
	{
		try
		{
			WebElement Element = driver.findElement(housenumber);
			WebDriverWait wait = new WebDriverWait(driver,60);
			Element = wait.until(ExpectedConditions.visibilityOf(Element));
			if(Element.isDisplayed()||Element.isEnabled())
			{
				Element.clear();
				Element.sendKeys(HouseNumber);
				System.out.println(" CORRECT -----> HouseNumber IS ENTERED  ->"+HouseNumber);
			}
			else
				System.out.println(" INCORRECT -X-> HouseNumber NOT ENTERED");
			return true;
		}
		catch (NoSuchElementException ignored)
		{
				System.out.println(" INCORRECT -X-> HouseNumber TEXT BOX NOT FOUND <ELEMENT NOT FOUND>");
			return false;
		}
	}	
	public boolean verifyPresenceOfHouseNumber()
	{
		try
		{
			WebElement Element = driver.findElement(housenumber);
//			WebDriverWait wait = new WebDriverWait(driver,10);
//			Element = wait.until(ExpectedConditions.visibilityOf(Element));
			if(Element.isDisplayed()||Element.isEnabled())
			{
				System.out.println(" CORRECT -----> HouseNumber IS NOT VISIBLE");
			}
			else
				System.out.println(" INCORRECT -X-> HouseNumber NOT VISIBLE");
			return true;
		}
		catch (NoSuchElementException ignored)
		{
				System.out.println(" INCORRECT -X-> HouseNumber TEXT BOX NOT VISIBLE <ELEMENT NOT FOUND>");
			return false;
		}
	}	
//PostalCode
	private By postalcode = By.id("PostalCode");
	public boolean enterPostalCode(String PostalCode)
	{
		try
		{
			WebElement Element = driver.findElement(postalcode);
			WebDriverWait wait = new WebDriverWait(driver,60);
			Element = wait.until(ExpectedConditions.visibilityOf(Element));
			if(Element.isDisplayed()||Element.isEnabled())
			{
				Element.clear();
				Element.sendKeys(PostalCode);
				System.out.println(" CORRECT -----> PostalCode IS ENTERED  ->"+PostalCode);
			}
			else
				System.out.println(" INCORRECT -X-> PostalCode NOT ENTERED");
			return true;
		}
		catch (NoSuchElementException ignored)
		{
				System.out.println(" INCORRECT -X-> PostalCode TEXT BOX NOT FOUND <ELEMENT NOT FOUND>");
			return false;
		}
	}	
	public boolean verifyPresenceOfPostalCode()
	{
		try
		{
			WebElement Element = driver.findElement(postalcode);
//			WebDriverWait wait = new WebDriverWait(driver,10);
//			Element = wait.until(ExpectedConditions.visibilityOf(Element));
			if(Element.isDisplayed()||Element.isEnabled())
			{
				System.out.println(" CORRECT -----> PostalCode IS VISIBLE");
			}
			else
				System.out.println(" INCORRECT -X-> PostalCode NOT VISIBLE");
			return true;
		}
		catch (NoSuchElementException ignored)
		{
				System.out.println(" INCORRECT -X-> PostalCode TEXT BOX NOT VISIBLE <ELEMENT NOT FOUND>");
			return false;
		}
	}	
//City
	private By city = By.id("City");
	public boolean verifyPresenceOfCity()
	{
		try
		{
			WebElement Element = driver.findElement(city);
//			WebDriverWait wait = new WebDriverWait(driver,10);
//			Element = wait.until(ExpectedConditions.visibilityOf(Element));
			if(Element.isDisplayed()||Element.isEnabled())
			{
				System.out.println(" CORRECT -----> City TEXTBOX IS FOUND");
			}
			else
				System.out.println(" INCORRECT -X-> City TEXTBOX NOT FOUND");
			return true;
		}
		catch (NoSuchElementException ignored)
		{
				System.out.println(" INCORRECT -X-> City TEXT BOX NOT FOUND <ELEMENT NOT FOUND>");
			return false;
		}
	}	
	public boolean enterCity(String City)
	{
		try
		{
			WebElement Element = driver.findElement(city);
			WebDriverWait wait = new WebDriverWait(driver,60);
			Element = wait.until(ExpectedConditions.visibilityOf(Element));
			if(Element.isDisplayed()||Element.isEnabled())
			{
				Element.clear();
				Element.sendKeys(City);
				System.out.println(" CORRECT -----> City IS ENTERED  ->"+City);
			}
			else
				System.out.println(" INCORRECT -X-> City NOT ENTERED");
			return true;
		}
		catch (NoSuchElementException ignored)
		{
				System.out.println(" INCORRECT -X-> City TEXT BOX NOT FOUND <ELEMENT NOT FOUND>");
			return false;
		}
	}	
//MobileNumber
	private By mobilenumber = By.id("MobilePhone");
	public boolean enterMobileNumber(String MobileNumber)
	{
		try
		{
			WebElement Element = driver.findElement(mobilenumber);
			WebDriverWait wait = new WebDriverWait(driver,60);
			Element = wait.until(ExpectedConditions.visibilityOf(Element));
			if(Element.isDisplayed()||Element.isEnabled())
			{
				Element.clear();
				Element.sendKeys(MobileNumber);
				System.out.println(" CORRECT -----> MobileNumber IS ENTERED  ->"+MobileNumber);
			}
			else
				System.out.println(" INCORRECT -X-> MobileNumber NOT ENTERED");
			return true;
		}
		catch (NoSuchElementException ignored)
		{
				System.out.println(" INCORRECT -X-> MobileNumber TEXT BOX NOT FOUND <ELEMENT NOT FOUND>");
			return false;
		}
	}	
//MobileNumber
	private By email = By.id("Email");
	public boolean enterEmail(String Email)
	{
		try
		{
			WebElement Element = driver.findElement(email);
			WebDriverWait wait = new WebDriverWait(driver,60);
			Element = wait.until(ExpectedConditions.visibilityOf(Element));
			if(Element.isDisplayed()||Element.isEnabled())
			{
				Element.clear();
				Element.sendKeys(Email);
				System.out.println(" CORRECT -----> Email IS ENTERED  ->"+Email);
			}
			else
				System.out.println(" INCORRECT -X-> Email NOT ENTERED");
			return true;
		}
		catch (NoSuchElementException ignored)
		{
				System.out.println(" INCORRECT -X-> Email TEXT BOX NOT FOUND <ELEMENT NOT FOUND>");
			return false;
		}
	}	
//Date
	private By date = By.id("Days");
	public boolean enterDate(String Date)
	{
		try
		{
			WebElement Element = driver.findElement(date);
			WebDriverWait wait = new WebDriverWait(driver,60);
			Element = wait.until(ExpectedConditions.visibilityOf(Element));
			if(Element.isDisplayed()||Element.isEnabled())
			{
				Select day = new Select(Element);
				day.selectByVisibleText(Date);
				
				System.out.println(" CORRECT -----> Date IS SELECTED  ->"+Date);
			}
			else
				System.out.println(" INCORRECT -X-> Date NOT SELECTED");
			return true;
		}
		catch (NoSuchElementException ignored)
		{
				System.out.println(" INCORRECT -X-> Date DROPDOWN BOX NOT FOUND <ELEMENT NOT FOUND>");
			return false;
		}
	}		
//Month
	private By month = By.id("Months");
	public boolean enterMonth(String Month)
	{
		try
		{
			WebElement Element = driver.findElement(month);
			WebDriverWait wait = new WebDriverWait(driver,60);
			Element = wait.until(ExpectedConditions.visibilityOf(Element));
			if(Element.isDisplayed()||Element.isEnabled())
			{
				Select day = new Select(Element);
				day.selectByVisibleText(Month);
				
				System.out.println(" CORRECT -----> Month IS SELECTED  ->"+Month);
			}
			else
				System.out.println(" INCORRECT -X-> Month NOT SELECTED");
			return true;
		}
		catch (NoSuchElementException ignored)
		{
				System.out.println(" INCORRECT -X-> Month DROPDOWN BOX NOT FOUND <ELEMENT NOT FOUND>");
			return false;
		}
	}		
//Year
	private By year = By.id("Year");
	public boolean enterYear(String Year)
	{
		try
		{
			WebElement Element = driver.findElement(year);
			WebDriverWait wait = new WebDriverWait(driver,60);
			Element = wait.until(ExpectedConditions.visibilityOf(Element));
			if(Element.isDisplayed()||Element.isEnabled())
			{
				Select day = new Select(Element);
				day.selectByVisibleText(Year);
				
				System.out.println(" CORRECT -----> Year IS SELECTED  ->"+Year);
			}
			else
				System.out.println(" INCORRECT -X-> Year NOT SELECTED");
			return true;
		}
		catch (NoSuchElementException ignored)
		{
				System.out.println(" INCORRECT -X-> Year DROPDOWN BOX NOT FOUND <ELEMENT NOT FOUND>");
			return false;
		}
	}	
//How u Heard about me
	private By howuheard = By.id("UserSelectedSourceCode");
	public boolean enterHowUHeard(String HowUHeard)
	{
		try
		{
			WebElement Element = driver.findElement(howuheard);
			WebDriverWait wait = new WebDriverWait(driver,60);
			Element = wait.until(ExpectedConditions.visibilityOf(Element));
			if(Element.isDisplayed()||Element.isEnabled())
			{
				Select day = new Select(Element);
				day.selectByVisibleText(HowUHeard);
				
				System.out.println(" CORRECT -----> HowUHeard IS SELECTED  ->"+HowUHeard);
			}
			else
				System.out.println(" INCORRECT -X-> HowUHeard NOT SELECTED");
			return true;
		}
		catch (NoSuchElementException ignored)
		{
				System.out.println(" INCORRECT -X-> HowUHeard DROPDOWN BOX NOT FOUND <ELEMENT NOT FOUND>");
			return false;
		}
	}	
//SEND BUTTON
	private By send = By.id("form-submit-button");
	public boolean clickSendButton()
	{
		try
		{
			WebElement Element = driver.findElement(send);
			WebDriverWait wait = new WebDriverWait(driver,60);
			Element = wait.until(ExpectedConditions.visibilityOf(Element));
			if(Element.isDisplayed()||Element.isEnabled())
			{
				Element.click();
				System.out.println(" CORRECT -----> SEND BUTTON IS CLICKED");
			}
			else
				System.out.println(" INCORRECT -X-> SEND BUTTON IS NOT CLICKED");
			return true;
		}
		catch (NoSuchElementException ignored)
		{
				System.out.println(" INCORRECT -X-> SEND BUTTON NOT FOUND <ELEMENT NOT FOUND>");
			return false;
		}
	}	
//CONFIRMATION WINDOW
	private By confirmationWindow = By.id("overlay-ConfirmationAddress");
	public boolean verifyPresenceofConfirmationWindow()
	{
		try
		{
			WebElement Element = driver.findElement(confirmationWindow);
			WebDriverWait wait = new WebDriverWait(driver,60);
			Element = wait.until(ExpectedConditions.visibilityOf(Element));
			if(Element.isDisplayed()||Element.isEnabled())
			{
				System.out.println(" CORRECT -----> CONFIRMATION WINDOW IS DISPLAYED");
			}
			else
				System.out.println(" INCORRECT -X-> CONFIRMATION WINDOW IS NOT DISPLAYED");
			return true;
		}
		catch (NoSuchElementException ignored)
		{
				System.out.println(" INCORRECT -X-> CONFIRMATION WINDOW NOT FOUND <ELEMENT NOT FOUND>");
			return false;
		}
	}	
//SEND BUTTON
	private By update = By.id("btnUpdate");
	public boolean clickUpdateButton()
	{
		try
		{
			WebElement Element = driver.findElement(update);
			WebDriverWait wait = new WebDriverWait(driver,60);
			Element = wait.until(ExpectedConditions.visibilityOf(Element));
			if(Element.isDisplayed()||Element.isEnabled())
			{
				Element.click();
				System.out.println(" CORRECT -----> UpdateButton BUTTON IS CLICKED");
			}
			else
				System.out.println(" INCORRECT -X-> UpdateButton BUTTON IS NOT CLICKED");
			return true;
		}
		catch (NoSuchElementException ignored)
		{
				System.out.println(" INCORRECT -X-> UpdateButton BUTTON NOT FOUND <ELEMENT NOT FOUND>");
			return false;
		}
	}
//Male gender
	private By male = By.id("Gender_0");
	public boolean clickMaleGenderCheckbox()
	{
		try
		{
			WebElement Element = driver.findElement(male);
			WebDriverWait wait = new WebDriverWait(driver,60);
			Element = wait.until(ExpectedConditions.visibilityOf(Element));
			if(Element.isDisplayed()||Element.isEnabled())
			{
				Element.click();
				System.out.println(" CORRECT -----> Male Gender Checkbox BUTTON IS CLICKED");
			}
			else
				System.out.println(" INCORRECT -X-> Male Gender Checkbox BUTTON IS NOT CLICKED");
			return true;
		}
		catch (NoSuchElementException ignored)
		{
				System.out.println(" INCORRECT -X-> Male Gender Checkbox BUTTON NOT FOUND <ELEMENT NOT FOUND>");
			return false;
		}
	}	
//Female gender
	private By female = By.id("Gender_1");
	public boolean clickFemaleGenderCheckbox()
	{
		try
		{
			WebElement Element = driver.findElement(female);
			WebDriverWait wait = new WebDriverWait(driver,60);
			Element = wait.until(ExpectedConditions.visibilityOf(Element));
			if(Element.isDisplayed()||Element.isEnabled())
			{
				Element.click();
				System.out.println(" CORRECT -----> Female Gender Checkbox BUTTON IS CLICKED");
			}
			else
				System.out.println(" INCORRECT -X-> Female Gender Checkbox BUTTON IS NOT CLICKED");
			return true;
		}
		catch (NoSuchElementException ignored)
		{
				System.out.println(" INCORRECT -X-> Female Gender Checkbox BUTTON NOT FOUND <ELEMENT NOT FOUND>");
			return false;
		}
	}
//Destination dropdown
	private By destination = By.xpath("//select[@id='Destination']/../button");
	public boolean clickDestination()//Ashridge
	{
		try
		{
			WebElement Element = driver.findElement(destination);
			WebDriverWait wait = new WebDriverWait(driver,60);
			Element = wait.until(ExpectedConditions.visibilityOf(Element));
			if(Element.isDisplayed()||Element.isEnabled())
			{
				Element.click();
				System.out.println(" CORRECT -----> Destination IS SELECTED  ->");
			}
			else
				System.out.println(" INCORRECT -X-> Destination Dropdown IS NOT SELECTED");
			return true;
		}
		catch (NoSuchElementException ignored)
		{
				System.out.println(" INCORRECT -X-> DESTINATINO DROPDOWN BOX NOT FOUND <ELEMENT NOT FOUND>");
			return false;
		}
	}
	private By destinationDropdownList = By.xpath("//select[@name='Destination']/..//div");
	public boolean verifyPresenceOfDestinationDropdownList()//Ashridge
	{
		try
		{
			WebElement Element = driver.findElement(destinationDropdownList);
			WebDriverWait wait = new WebDriverWait(driver,60);
			Element = wait.until(ExpectedConditions.visibilityOf(Element));
			if(Element.isDisplayed()||Element.isEnabled())
			{
				System.out.println(" CORRECT -----> Destination Dropdown list Found");
			}
			else
				System.out.println(" INCORRECT -X-> Destination Dropdown list IS NOT Found");
			return true;
		}
		catch (NoSuchElementException ignored)
		{
				System.out.println(" INCORRECT -X-> DESTINATINO Dropdown list IS NOT Found <ELEMENT NOT FOUND>");
			return false;
		}
	}
	public boolean clickDestinationDropdownListOption(String Destination)//Ashridge
	{
		try
		{
			String xpath = "//button[text()='"+Destination+"']";
			By destinationOption = By.xpath(xpath);
			WebElement Element = driver.findElement(destinationOption);
			WebDriverWait wait = new WebDriverWait(driver,60);
			Element = wait.until(ExpectedConditions.visibilityOf(Element));
			if(Element.isDisplayed()||Element.isEnabled())
			{
				Element.click();
				System.out.println(" CORRECT -----> Destination is selected -> "+Destination);
			}
			else
				System.out.println(" INCORRECT -X-> Destination Dropdown list IS NOT Found");
			return true;
		}
		catch (NoSuchElementException ignored)
		{
				System.out.println(" INCORRECT -X-> DESTINATINO Dropdown list IS NOT Found <ELEMENT NOT FOUND>");
			return false;
		}
	}
//Course dropdown
	private By course = By.xpath("//select[@id='Course']/../button");
	public boolean selectCourse()//General|G
	{
		try
		{
			WebElement Element = driver.findElement(course);
			WebDriverWait wait = new WebDriverWait(driver,60);
			Element = wait.until(ExpectedConditions.visibilityOf(Element));
			if(Element.isDisplayed()||Element.isEnabled())
			{
				Element.click();
				System.out.println(" CORRECT -----> Course IS clicked  ->");
			}
			else
				System.out.println(" INCORRECT -X-> Course Dropdown IS NOT clicked");
			return true;
		}
		catch (NoSuchElementException ignored)
		{
				System.out.println(" INCORRECT -X-> Course DROPDOWN BOX NOT FOUND <ELEMENT NOT FOUND>");
			return false;
		}
	}
	private By courselist = By.xpath("//select[@id='Course']/../div");
	public boolean verifyPresenceOfCourseList()//General|G
	{
		try
		{
			WebElement Element = driver.findElement(courselist);
			WebDriverWait wait = new WebDriverWait(driver,100);
			Element = wait.until(ExpectedConditions.visibilityOf(Element));
			if(Element.isDisplayed()||Element.isEnabled())
			{
				System.out.println(" CORRECT -----> Course list is displyed  ->");
			}
			else
				System.out.println(" INCORRECT -X-> Course list is not displayed");
			return true;
		}
		catch (NoSuchElementException ignored)
		{
				System.out.println(" INCORRECT -X-> Course list is not displayed <ELEMENT NOT FOUND>");
			return false;
		}
	}
	public boolean clickCourseOption(String course)//General|G
	{
		try
		{
			System.out.println(course);
			String xpath = "//button[text()='"+course+"']";
			By courseoption = By.xpath(xpath);
			WebElement Element = driver.findElement(courseoption);
			WebDriverWait wait = new WebDriverWait(driver,80);
			Element = wait.until(ExpectedConditions.visibilityOf(Element));
			if(Element.isDisplayed()||Element.isEnabled())
			{
				Element.click();
				System.out.println(" CORRECT -----> Course list option is selected  ->"+course);
			}
			else
				System.out.println(" INCORRECT -X-> Course list option is not selected");
			return true;
		}
		catch (NoSuchElementException ignored)
		{
				System.out.println(" INCORRECT -X-> Course list is not displayed <ELEMENT NOT FOUND>");
			return false;
		}
	}
//Period dropdown
	private By period = By.xpath("//select[@id='Period']/../button");
	public boolean selectPeriod()//3 weeks
	{
		try
		{
			WebElement Element = driver.findElement(period);
			WebDriverWait wait = new WebDriverWait(driver,60);
			Element = wait.until(ExpectedConditions.visibilityOf(Element));
			if(Element.isDisplayed()||Element.isEnabled())
			{
				Element.click();
				System.out.println(" CORRECT -----> Period IS clicked  ");
			}
			else
				System.out.println(" INCORRECT -X-> Period Dropdown IS NOT clicked");
			return true;
		}
		catch (NoSuchElementException ignored)
		{
				System.out.println(" INCORRECT -X-> Period DROPDOWN BOX NOT FOUND <ELEMENT NOT FOUND>");
			return false;
		}
	}	
	private By periodlist = By.xpath("//select[@id='Period']/../div");
	public boolean verifyPresenceOfPeriod()//3 weeks
	{
		try
		{
			WebElement Element = driver.findElement(periodlist);
			WebDriverWait wait = new WebDriverWait(driver,60);
			Element = wait.until(ExpectedConditions.visibilityOf(Element));
			if(Element.isDisplayed()||Element.isEnabled())
			{
				System.out.println(" CORRECT -----> Period option list is not displayed");
			}
			else
				System.out.println(" INCORRECT -X-> Period option list is not displayed");
			return true;
		}
		catch (NoSuchElementException ignored)
		{
				System.out.println(" INCORRECT -X-> Period option list NOT FOUND <ELEMENT NOT FOUND>");
			return false;
		}
	}	
	public boolean clickPeriodOption(String Period)//3 weeks
	{
		try
		{
			String xpath = "//button[text()='"+Period+"']";
			By periodoption = By.xpath(xpath);
			WebElement Element = driver.findElement(periodoption);
			WebDriverWait wait = new WebDriverWait(driver,60);
			Element = wait.until(ExpectedConditions.visibilityOf(Element));
			if(Element.isDisplayed()||Element.isEnabled())
			{
				System.out.println(" CORRECT -----> Period option list is clicked"+Period);
			}
			else
				System.out.println(" INCORRECT -X-> Period option list is not displayed");
			return true;
		}
		catch (NoSuchElementException ignored)
		{
				System.out.println(" INCORRECT -X-> Period option list NOT FOUND <ELEMENT NOT FOUND>");
			return false;
		}
	}	
//Accommodation dropdown
	private By accommodation = By.xpath("//select[@id='Accommodation']/../button");
	public boolean selectAccommodation()//EF Vertsfamilie
	{
		try
		{
			WebElement Element = driver.findElement(accommodation);
			WebDriverWait wait = new WebDriverWait(driver,60);
			Element = wait.until(ExpectedConditions.visibilityOf(Element));
			if(Element.isDisplayed()||Element.isEnabled())
			{
				
				System.out.println(" CORRECT -----> Accommodation IS clicked  ->");
			}
			else
				System.out.println(" INCORRECT -X-> Accommodation Dropdown IS NOT clicked");
			return true;
		}
		catch (NoSuchElementException ignored)
		{
				System.out.println(" INCORRECT -X-> Accommodation DROPDOWN BOX NOT FOUND <ELEMENT NOT FOUND>");
			return false;
		}
	}
	private By accommodationlist = By.xpath("//select[@id='Accommodation']/../div");
	public boolean verifyPresenceOFAccommodationList()//EF Vertsfamilie
	{
		try
		{
			WebElement Element = driver.findElement(accommodationlist);
			WebDriverWait wait = new WebDriverWait(driver,60);
			Element = wait.until(ExpectedConditions.visibilityOf(Element));
			if(Element.isDisplayed()||Element.isEnabled())
			{
				System.out.println(" CORRECT -----> Accommodation IS present  ->");
			}
			else
				System.out.println(" INCORRECT -X-> Accommodation Dropdown IS NOT present");
			return true;
		}
		catch (NoSuchElementException ignored)
		{
				System.out.println(" INCORRECT -X-> Accommodation DROPDOWN BOX NOT FOUND <ELEMENT NOT FOUND>");
			return false;
		}
	}
	public boolean clickAccommodationOption(String Accomodation)//EF Vertsfamilie
	{
		try
		{
			String xpath = "//button[text()='"+Accomodation+"']";
			By accomodationoption = By.xpath(xpath);
			WebElement Element = driver.findElement(accomodationoption);
			WebDriverWait wait = new WebDriverWait(driver,60);
			Element = wait.until(ExpectedConditions.visibilityOf(Element));
			if(Element.isDisplayed()||Element.isEnabled())
			{
				Element.click();
				System.out.println(" CORRECT -----> Accommodation option IS present and clicked->");
			}
			else
				System.out.println(" INCORRECT -X-> Accommodation Dropdown option IS NOT present/clicked");
			return true;
		}
		catch (NoSuchElementException ignored)
		{
				System.out.println(" INCORRECT -X-> Accommodation DROPDOWN BOX NOT FOUND <ELEMENT NOT FOUND>");
			return false;
		}
	}
//StartDate dropdown
	private By startDate = By.xpath("//select[@id='StartDate']/../button");
	public boolean selectStartDate()//1-3 måneder
	{
		try
		{
			WebElement Element = driver.findElement(startDate);
			WebDriverWait wait = new WebDriverWait(driver,60);
			Element = wait.until(ExpectedConditions.visibilityOf(Element));
			if(Element.isDisplayed()||Element.isEnabled())
			{
				Element.click();
				System.out.println(" CORRECT -----> StartDate IS clicked  ");
			}
			else
				System.out.println(" INCORRECT -X-> StartDate Dropdown IS NOT clicked");
			return true;
		}
		catch (NoSuchElementException ignored)
		{
				System.out.println(" INCORRECT -X-> StartDate DROPDOWN BOX NOT FOUND <ELEMENT NOT FOUND>");
			return false;
		}
	}	
	private By startDateoption = By.xpath("//select[@id='StartDate']/../div");
	public boolean verifyPresenceOfStartDateList()//1-3 måneder
	{
		try
		{
			WebElement Element = driver.findElement(startDateoption);
			WebDriverWait wait = new WebDriverWait(driver,60);
			Element = wait.until(ExpectedConditions.visibilityOf(Element));
			if(Element.isDisplayed()||Element.isEnabled())
			{
				System.out.println(" CORRECT -----> StartDate LIst IS displayed->");
			}
			else
				System.out.println(" INCORRECT -X-> StartDate Dropdown IS NOT DISPLAYED");
			return true;
		}
		catch (NoSuchElementException ignored)
		{
				System.out.println(" INCORRECT -X-> StartDate DROPDOWN BOX NOT FOUND <ELEMENT NOT FOUND>");
			return false;
		}
	}	
	public boolean clickStartDateOption(String StartDate)//1-3 måneder
	{
		try
		{
			String xpath = "//button[text()='"+StartDate+"']";
			By startdateoption = By.xpath(xpath);
			WebElement Element = driver.findElement(startdateoption);
			WebDriverWait wait = new WebDriverWait(driver,60);
			Element = wait.until(ExpectedConditions.visibilityOf(Element));
			if(Element.isDisplayed()||Element.isEnabled())
			{
				Element.click();
				System.out.println(" CORRECT -----> StartDate IS clicked  ->"+StartDate);
			}
			else
				System.out.println(" INCORRECT -X-> StartDate Dropdown IS NOT SELECTED");
			return true;
		}
		catch (NoSuchElementException ignored)
		{
				System.out.println(" INCORRECT -X-> StartDate DROPDOWN BOX NOT FOUND <ELEMENT NOT FOUND>");
			return false;
		}
	}	
//SEND BUTTON
	private By pqsubmit = By.xpath("//div[@class='pqform-next-button-wrap'");
	public boolean clickPQsubmitButton()
	{
		try
		{
			WebElement Element = driver.findElement(pqsubmit);
			WebDriverWait wait = new WebDriverWait(driver,60);
			Element = wait.until(ExpectedConditions.visibilityOf(Element));
			if(Element.isDisplayed()||Element.isEnabled())
			{
				Element.click();
				System.out.println(" CORRECT -----> SUBMIT BUTTON IS CLICKED");
			}
			else
				System.out.println(" INCORRECT -X-> SUBMIT BUTTON IS NOT CLICKED");
			return true;
		}
		catch (NoSuchElementException ignored)
		{
				System.out.println(" INCORRECT -X-> SUBMIT BUTTON NOT FOUND <ELEMENT NOT FOUND>");
			return false;
		}
	}		
	
	
	
	
	
	
	
	
//BR form
	CommonMethods comm = new CommonMethods(driver);
	testBase basee = new testBase();
	public void fillBrochureForms() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	{
		ReadExcelforEFcomForms excel = new ReadExcelforEFcomForms();
		List<EFcomFormsFillingExcel> datas = excel.readExcel("C:\\Users\\praveen.h\\workspace\\EFCOM\\Datas", "EfComDatas.xls", "FormDetails");
		for(EFcomFormsFillingExcel m: datas)
		{
			if(m.getFormType().contains("BR"))
			{
				driver.get(m.getURL());
				Thread.sleep(2000);
				enterFirstName(m.getfirstname());
				enterLastName(m.getlastname());
				if(verifyPresenceOfStreet())
				{
					enterStreet(m.getStreetAddress());
				}
				if(verifyPresenceOfHouseNumber())
				{
					enterHouseNumber(m.getHouseNumber());
				}
				if(verifyPresenceOfPostalCode())
				{
					enterPostalCode(m.getZip());
				}
				enterMobileNumber(m.getMobileNumber());
				if(verifyPresenceOfCity())
				{
					enterCity(m.getcityname());
				}
				enterEmail(m.getEmail());
				enterDate(m.getDate());
				enterMonth(m.getMonth());
				enterYear(m.getYear());
				enterHowUHeard(m.getHowUHeard());
				if(m.getGender().equals("Male"))
				{
					if(clickMaleGenderCheckbox())
					{}
				}
				else if(m.getGender().equals("Female"))
				{
					if(clickFemaleGenderCheckbox())
					{}
				}
				enterHowUHeard(m.getHowUHeard());
				clickSendButton();
				if(verifyPresenceofConfirmationWindow())
				{
					clickUpdateButton();
				}
			}
			driver.close();
			basee.setDriver("chrome", ""); 
			this.driver=basee.driver;
		}
	}
//Fill PQ Form
	public void fillPriceQuotationForms() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	{
		ReadExcelforEFcomForms excel = new ReadExcelforEFcomForms();
		List<EFcomFormsFillingExcel> datas = excel.readExcel("C:\\Users\\praveen.h\\workspace\\EFCOM\\Datas", "EfComDatas.xls", "FormDetails");
		for(EFcomFormsFillingExcel m: datas)
		{
			if(m.getFormType().contains("PQ"))
			{
				
				driver.get(m.getURL());
				Thread.sleep(2000);
				
				clickDestination();
				if(verifyPresenceOfDestinationDropdownList())
				{
					clickDestinationDropdownListOption(m.getDestination());
				}
				selectCourse();
				if(verifyPresenceOfCourseList())
				{
					System.out.println(m.getCourse());
					clickCourseOption(m.getCourse());
				}
				selectPeriod();
				if(verifyPresenceOfPeriod())
				{
					clickPeriodOption(m.getPeriod());
				}
				selectAccommodation();
				if(verifyPresenceOFAccommodationList())
				{
					clickAccommodationOption(m.getAccomodation());
				}
				selectStartDate();
				if(verifyPresenceOfStartDateList())
				{
					clickStartDateOption(m.getStartDate());
				}

				
				Thread.sleep(3000);
				enterFirstName(m.getfirstname());
				enterLastName(m.getlastname());
				if(verifyPresenceOfStreet())
				{
					enterStreet(m.getStreetAddress());
				}
				if(verifyPresenceOfHouseNumber())
				{
					enterHouseNumber(m.getHouseNumber());
				}
				if(verifyPresenceOfPostalCode())
				{
					enterPostalCode(m.getZip());
				}
				enterMobileNumber(m.getMobileNumber());
				if(verifyPresenceOfCity())
				{
					enterCity(m.getcityname());
				}
				enterEmail(m.getEmail());
				enterDate(m.getDate());
				enterMonth(m.getMonth());
				enterYear(m.getYear());
				enterHowUHeard(m.getHowUHeard());
				if(m.getGender().equals("Male"))
				{
					if(clickMaleGenderCheckbox())
					{}
				}
				else if(m.getGender().equals("Female"))
				{
					if(clickFemaleGenderCheckbox())
					{}
				}
				enterHowUHeard(m.getHowUHeard());
				clickSendButton();
				if(verifyPresenceofConfirmationWindow())
				{
					clickUpdateButton();
				}
				
				driver.close();
				basee.setDriver("chrome", ""); 
				this.driver=basee.driver;
			}
			
		}
	}
	
	
}
