package StepDefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MxNumSteps {
    @Before
    public static void setUpClass(){ WebDriverManager.chromedriver().setup();}
    WebDriver driver = new ChromeDriver();
    @Given("The browser open facebook")
    public void the_browser_open_facebook() {
        driver.navigate().to("https://www.facebook.com");
    }
    @When("We use {string} and {string} as credentials")
    public void we_use_and_as_credentials(String email, String password) {
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(email);
        driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys(password);
    }
    @Then("Click the log in button")
    public void click_the_log_in_button() {
        driver.findElement(By.name("login")).click();
    }
}
