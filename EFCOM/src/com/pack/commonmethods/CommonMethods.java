package com.pack.commonmethods;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CommonMethods 
{
    
    
	private WebDriver driver;   
	                    
	public By login = By.id("gohomepagetoggleModal");
	public By username = By.id("loginusername");
	public By password = By.id("loginpassword");
	public By loginSubmit = By.xpath("html/body/div[1]/div/div/header/div[2]/div/div/div/div/div[2]/div[2]/form/div/div/div/div[4]/input");
	public By commercioLogo = By.xpath("html/body/header/div[1]/div[2]/div[1]/a/img[1]");
	public By locationBar = By.xpath("html/body/div[2]/div[1]/div/div/div[1]/div[2]/div[1]/div/div/input");
	public By sizeCriteria = By.xpath("html/body/div[2]/div[1]/div/div/div[1]/div[2]/div[2]/div[3]/div/span");
	public By sizeCriteriaSquareFeet = By.xpath("html/body/div[2]/div[1]/div/div/div[1]/div[2]/div[2]/div[3]/div/ul/li[2]");
	public By squareFeetRange = By.xpath("html/body/div[2]/div[1]/div/div/div[1]/div[2]/div[2]/div[4]/div[1]/span[1]");
	public By minValue = By.xpath("html/body/div[2]/div[1]/div/div/div[1]/div[2]/div[2]/div[4]/div[3]/div/div[1]/div[1]/input[1]");
	public By maxValue = By.xpath("html/body/div[2]/div[1]/div/div/div[1]/div[2]/div[2]/div[4]/div[3]/div/div[1]/div[1]/input[2]");
	public By findSpaces = By.xpath("html/body/div[2]/div[1]/div/div/div[1]/div[2]/div[1]/input");
	
	
	public CommonMethods(WebDriver driver){
		this.driver = driver;
	}
	
	public void navigateBack(){
		driver.navigate().back();
	}
	
	public void waitTenSec() throws InterruptedException{
		Thread.sleep(10000);
	}
	
	public void waitNineSec() throws InterruptedException{
		Thread.sleep(9000);
	}
	
	public void waitEightSec() throws InterruptedException{
		Thread.sleep(8000);
	}
	
	public void waitSevenSec() throws InterruptedException{
		Thread.sleep(7000);
	}
	public void waitSixSec() throws InterruptedException{
		Thread.sleep(6000);
	}
	public void waitFiveSec() throws InterruptedException{
		Thread.sleep(5000);
	}
	public void waitFourSec() throws InterruptedException{
		Thread.sleep(4000);
	}
	public void waitThreeSec() throws InterruptedException{
		Thread.sleep(3000);
	}
	public void waitTwoSec() throws InterruptedException{
		Thread.sleep(2000);
	}
	public void waitOneSec() throws InterruptedException{
		Thread.sleep(1000);
	}
	public void hardRefresh() throws AWTException{
		Robot hardRef = new Robot();
		hardRef.keyPress(KeyEvent.VK_CONTROL);
		hardRef.keyPress(KeyEvent.VK_F5);
		hardRef.keyRelease(KeyEvent.VK_F5);
		hardRef.keyRelease(KeyEvent.VK_CONTROL);
	}
	
	public void pressDownButton() throws AWTException{
		Robot downButtonOnce = new Robot();
		downButtonOnce.keyPress(KeyEvent.VK_DOWN);
		downButtonOnce.keyRelease(KeyEvent.VK_DOWN);
		
		
	}
	public void scrolDown_150Pixcels()
	{
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,2500)");
	}
	public void scrolDown_To_BottomofPage()
	{
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,150)");
	}
	public void scrolup_150Pixcels()
	{
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-150)");
	}
	
	public void pressTabButton() throws AWTException{
		Robot downButtonOnce = new Robot();
		downButtonOnce.keyPress(KeyEvent.VK_TAB);
		downButtonOnce.keyRelease(KeyEvent.VK_TAB);
	}
	
	public void openNewTab() throws AWTException{
		Robot pressControlPlusTButton = new Robot();
		pressControlPlusTButton.keyPress(KeyEvent.VK_CONTROL);
		pressControlPlusTButton.keyPress(KeyEvent.VK_T);
		pressControlPlusTButton.keyRelease(KeyEvent.VK_CONTROL);
		pressControlPlusTButton.keyRelease(KeyEvent.VK_T);
	}
	public void openNewBrowserWindow() throws AWTException{
		Robot pressControlPlusTButton = new Robot();
		pressControlPlusTButton.keyPress(KeyEvent.VK_CONTROL);
		pressControlPlusTButton.keyPress(KeyEvent.VK_N);
		pressControlPlusTButton.keyRelease(KeyEvent.VK_CONTROL);
		pressControlPlusTButton.keyRelease(KeyEvent.VK_T);
	}
	public void shuffleTab() throws AWTException{
		Robot pressControlPlusTab = new Robot();
		pressControlPlusTab.keyPress(KeyEvent.VK_CONTROL);
		pressControlPlusTab.keyPress(KeyEvent.VK_TAB);
		pressControlPlusTab.keyRelease(KeyEvent.VK_CONTROL);
		pressControlPlusTab.keyRelease(KeyEvent.VK_TAB);
	}
	
	public void pasteEmail() throws AWTException{
		Robot pressControlPlusV = new Robot();
		pressControlPlusV.keyPress(KeyEvent.VK_CONTROL);
		pressControlPlusV.keyPress(KeyEvent.VK_V);
		pressControlPlusV.keyRelease(KeyEvent.VK_CONTROL);
		pressControlPlusV.keyRelease(KeyEvent.VK_V);
	}
	
	public void refreshPage() throws AWTException{
		Robot pressF5 = new Robot();
		pressF5.keyPress(KeyEvent.VK_F5);
		pressF5.keyRelease(KeyEvent.VK_F5);
	
	}
	
	public void pressEscapeButton () throws AWTException {
		Robot pressEscape = new Robot();
		pressEscape.keyPress(KeyEvent.VK_ESCAPE);
		pressEscape.keyRelease(KeyEvent.VK_ESCAPE);
	}
	
	public void loginToNormalAccount(){
		
		WebElement loginLink = driver.findElement(login);
		loginLink.click();
		
		WebElement usernameField = driver.findElement(username);
		usernameField.sendKeys("7204245021");
		
		WebElement passwordField = driver.findElement(password);
		passwordField.sendKeys("123456");
		
		WebElement loginButton = driver.findElement(loginSubmit);
		loginButton.click();
		
	}
	
	public void moveToHomepage(){
		
		WebElement commercioLogoHeader = driver.findElement(commercioLogo);
		if (commercioLogoHeader.isDisplayed()||commercioLogoHeader.isEnabled())
			commercioLogoHeader.click();
		else System.out.println("INCORRECT -X-> Commercio Logo is not present");
	}
	
	public void singleLocationSearch () throws AWTException, InterruptedException{
		
		WebElement locationSearch = driver.findElement(locationBar);
		if (locationSearch.isDisplayed() || locationSearch.isEnabled()){
			locationSearch.sendKeys("KORAMA");
		System.out.println("CORRECT -----> Location search bar is present ");}
			else System.out.println("INCORRECT -X-> Locaton search bar is not present");
			
		Robot pressDown = new Robot();
		
		pressDown.keyPress(KeyEvent.VK_DOWN);
		pressDown.keyRelease(KeyEvent.VK_DOWN);
		
		Thread.sleep(2500);
		
		pressDown.keyPress(KeyEvent.VK_ENTER);
		pressDown.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(1500);
		
		WebElement sizeCriteriaButton = driver.findElement(sizeCriteria);
		sizeCriteriaButton.click();
		
		WebElement squareFeetOption = driver.findElement(sizeCriteriaSquareFeet);
		squareFeetOption.click();
		
		WebElement squareFeetRangeButton = driver.findElement(squareFeetRange);
		squareFeetRangeButton.click();
		
		WebElement minValueEnter = driver.findElement(minValue);
		minValueEnter.sendKeys("2000");
		
		WebElement maxValueEnter = driver.findElement(maxValue);
		maxValueEnter.sendKeys("10000");
		
		WebElement findSpaceButton = driver.findElement(findSpaces);
		findSpaceButton.click();
		
		
		
	}
	

}
