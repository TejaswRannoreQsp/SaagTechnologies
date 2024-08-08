package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	public RegisterPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="FirstName")
	private WebElement firstnametextfield;
	
	@FindBy(id="LastName")
	private WebElement lastnametextfield;
	
	@FindBy(id="Email")
	private WebElement emailtextfield;
	
	@FindBy(id="Password")
	private WebElement passwordTextfield;
	
	@FindBy(id="ConfirmPassword")
	private WebElement confirmpasswordTextfield;
	
	@FindBy(id="register-button")
	private WebElement registerbutton;

	public WebElement getFirstnametextfield() {
		return firstnametextfield;
	}

	public WebElement getLastnametextfield() {
		return lastnametextfield;
	}

	public WebElement getEmailtextfield() {
		return emailtextfield;
	}

	public WebElement getPasswordTextfield() {
		return passwordTextfield;
	}

	public WebElement getConfirmpasswordTextfield() {
		return confirmpasswordTextfield;
	}

	public WebElement getRegisterbutton() {
		return registerbutton;
	}

}
