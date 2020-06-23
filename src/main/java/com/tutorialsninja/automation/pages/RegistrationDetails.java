package com.tutorialsninja.automation.pages;
import org.openqa.selenium.WebElement;
import com.tutorialsninja.automation.base.Base;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationDetails {
	
	public RegistrationDetails() {
		
		PageFactory.initElements(Base.driver, this);
		
	}
	
		@FindBy(id="input-firstname")
		public static WebElement firstName;
		
		@FindBy(id="input-lastname")
		public static WebElement lastName;
		
		@FindBy(id="input-email")
		public static WebElement email;
		
		@FindBy(id="input-telephone")
		public static WebElement telephone;
		
		@FindBy(id="input-password")
		public static WebElement password;
		
		@FindBy(id="input-confim")
		public static WebElement confirmPassword;
		
		
		

	
	

}
