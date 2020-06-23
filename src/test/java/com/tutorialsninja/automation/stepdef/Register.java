package com.tutorialsninja.automation.stepdef;

import com.gargoylesoftware.htmlunit.javascript.host.Map;
import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.pages.HeaderSection;
import com.tutorialsninja.automation.pages.RegistrationDetails;

import cucumber.api.DataTable;
import cucumber.api.java.en.*;
import java.util.*;


public class Register {
	
	HeaderSection header=new HeaderSection();
	
	@Given("^I launch the application$")
	public void i_launch_the_application() {
		
		Base.driver.get(Base.reader.getUrl());
	   
	}

	@And("^Navigate to Register page$")
	public void navigate_to_Register_page()  {
		
		Elements.click(header.myAccountlink);
		Elements.click(header.register);	
	    
	}

	@And("^I fill all the Registration Details$")
	public void i_fill_all_the_Registration_Details(DataTable dataTable) {
		java.util.Map<String, String> map= dataTable.asMap(String.class, String.class);
		Elements.TypeText(RegistrationDetails.firstName, map.get("FirstName"));
		Elements.TypeText(RegistrationDetails.lastName, map.get("LastName"));
		Elements.TypeText(RegistrationDetails.email, map.get("Email"));
		Elements.TypeText(RegistrationDetails.telephone, map.get("Telephone"));
		Elements.TypeText(RegistrationDetails.password, map.get("Password"));
		Elements.TypeText(RegistrationDetails.confirmPassword, map.get("ConfirmPassword"));
	    
	}

	@And("^I click on privacy Policy$")
	public void i_click_on_privacy_Policy()  {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@And("^I click on continue button$")
	public void i_click_on_continue_button() throws Throwable {
	    
	}

	@Then("^the User account should be created successfully$")
	public void the_User_account_should_be_created_successfully()  {
	    
	}


}
