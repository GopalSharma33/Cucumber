package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
    @Given("user is on login page")
    public void user_is_on_login_page() {
        System.out.println("Step First - user is on login page");
    }
    @When("user enters valid email and password")
    public void user_enters_valid_email_and_password() {
        System.out.println("Step Second - user enters valid email and password ");
    }
    @And("click on login button")
    public void click_on_login_button() {
        System.out.println("Step Third - click on login button ");
    }
    @Then("user should on home page")
    public void user_should_on_home_page() {
        System.out.println("Step Four - user should on home page");
    }

}
