package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class UserEnquirySD {

    WebDriver driver;
    @Given("I am on user enquiry page")
    public void i_am_on_user_enquiry_page() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://amolujagare.com/contact/");
    }
    @When("I Enter below data for equiry")
    public void i_enter_below_data_for_equiry(DataTable dataTable) {

        List<List<String>> data = dataTable.asLists();

        driver.findElement(By.xpath("//input[@id='field_rgden']")).sendKeys(data.get(0).get(0));
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys(data.get(0).get(1));
        driver.findElement(By.xpath("//input[@type='tel']")).sendKeys(data.get(0).get(2));
        driver.findElement(By.xpath("//input[@id='field_es5y1']")).sendKeys(data.get(0).get(3));
        driver.findElement(By.xpath("//textarea[@id='field_e166e']")).sendKeys(data.get(0).get(4));

    }
    @When("I click on submit button of enquiry")
    public void i_click_on_submit_button_of_enquiry() {
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }
    @Then("enquiry should be submitted")
    public void enquiry_should_be_submitted() {

    }
}
