package Utils;

import java.io.IOException;

import TestCase.TestCase3_GoogleLogin;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import stepDefinition.BaseClass;

public class StepDef {
	BaseClass bs = new BaseClass();

	@Given("Given load the browser and ZigsWheel Page")
	public void load_the_browser() {
		try {
			bs.invokeBrowser("Windows", "chrome");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

	@Then("Click on New Bikes and Upcoming bike select hond and get the details of Bikes")
	public void click_on_new_bikes_and_upcoming_bike_select_hond_and_get_the_details_of_bikes() {
		TestCase1_UpcomingBikeDetails tc1 = new TestCase1_UpcomingBikeDetails();
		try {
			tc1.clickNewBikes();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		tc1.clickUpcomingBikes();
	}

	@Then("Click on Used Cars and select models and Get the model details")
	public void click_on_used_cars_and_select_models_and_get_the_model_details() {
		TestCase2_UsedCarsDetails tc2 = new TestCase2_UsedCarsDetails();
		try {
			tc2.UsedCarDetails();
		} catch (InterruptedException e) {

		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	@Then("Login/signUp tp google and give invalid details and capture error message")
	public void login_sign_up_tp_google_and_give_invalid_details_and_capture_error_message() {
		TestCase3_GoogleLogin tc3 = new TestCase3_GoogleLogin();
		TestCase4_GoogleSignup tc4 = new TestCase4_GoogleSignup();
		tc3.verifyLoginPage();
		tc4.verifyLoginPage();
	}

	@Then("Close the Browser")
	public void close_the_browser() {
		bs.tearDown();
	}

}