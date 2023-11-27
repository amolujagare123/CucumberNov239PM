package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SubscribeSD {

    @Given("I am on user subscription page")
    public void i_am_on_user_subscription_page() {
        System.out.println("I am on user subscription page");
    }

    @When("I click on subscribe button")
    public void i_click_on_subscribe_button() {
        System.out.println("I click on subscribe button");
    }
    @Then("User should be subscribed")
    public void user_should_be_subscribed() {
        System.out.println("User should be subscribed");
    }

    @When ("I Enter data (.+) , (.+) , (.+)")
    public void IEnterData(String name,String email,String contact) {

        System.out.println("name="+name);
        System.out.println("email="+email);
        System.out.println("contact="+contact);
    }
}
