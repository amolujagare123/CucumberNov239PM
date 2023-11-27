package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleSD {
    WebDriver driver;
    @Given("Login page should be opened")
    public void login_page_should_be_opened() {
        System.out.println("Login page should be opened");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.org/");

    }
    @When("I enter username and password")
    public void i_enter_username_and_password() {
        System.out.println("I enter username and password");

        driver.findElement(By.id("login-username")).sendKeys("admin");
        driver.findElement(By.id("login-password")).sendKeys("admin");

    }
    @When("I click on login button")
    public void i_click_on_login_button() {
        System.out.println("I click on login button");
        driver.findElement(By.name("submit")).click();
    }

    @Then("I should be redirected to home page")
    public void i_should_be_redirected_to_home_page() {
        System.out.println("I should be redirected to home page");

        Assert.assertEquals("this is not a dashboard",
                "https://stock.scriptinglogic.org/dashboard.php",
        driver.getCurrentUrl());

    }

    @When("I enter incorrect username and password")
    public void iEnterIncorrectUsernameAndPassword() {
        driver.findElement(By.id("login-username")).sendKeys("ffdf");
        driver.findElement(By.id("login-password")).sendKeys("fdfdf");

    }

    @Then("I should get an error message")
    public void iShouldGetAnErrorMessage() {
        Assert.assertEquals("this is not a dashboard",
                "https://stock.scriptinglogic.org/index.php?msg=Wrong%20Username%20or%20Password&type=error",
                driver.getCurrentUrl());

    }

    @When("I enter blank username and password")
    public void iEnterBlankUsernameAndPassword() {
        driver.findElement(By.id("login-username")).sendKeys("");
        driver.findElement(By.id("login-password")).sendKeys("");

    }

    @Then("I should get an another error message")
    public void iShouldGetAnAnotherErrorMessage() {
        Assert.assertEquals("this is not a dashboard",
                "https://stock.scriptinglogic.org/",
                driver.getCurrentUrl());
    }

    @When("I enter {string} and {string}")
    public void iEnterAnd(String username, String password) {
        System.out.println("Parameterization using double quotes");
        driver.findElement(By.id("login-username")).sendKeys(username);
        driver.findElement(By.id("login-password")).sendKeys(password);

    }
}
