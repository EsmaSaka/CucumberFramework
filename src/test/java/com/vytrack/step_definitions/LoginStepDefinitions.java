package com.vytrack.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginStepDefinitions {
    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        System.out.println("i am on the login page");
//        throw new cucumber.api.PendingException();
    }

    @Then("user logs in as  store manager")
    public void user_logs_in_as_store_manager() {
        // Write code here that turns the phrase above into concrete actions
       // throw new cucumber.api.PendingException();
        System.out.println("store Manager");
    }

    @Then("user verifies that {string} page subtitle is displayed")
    public void user_verifies_that_page_subtitle_is_displayed(String string) {
        System.out.println("verifying page sun title"+string);
     //   throw new cucumber.api.PendingException();
    }
    @Then("user logs in as  driver")
    public void user_logs_in_as_driver() {
        // Write code here that turns the phrase above into concrete actions
      //  throw new cucumber.api.PendingException();
        System.out.println("driver");
    }
    @Then("user logs in as sales manager")
    public void user_logs_in_as_sales_manager() {
        // Write code here that turns the phrase above into concrete actions
       // throw new cucumber.api.PendingException();
        System.out.println("logged in as sales manager");
    }





    }
