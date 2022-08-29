package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class LoginSteps {
    WebDriver driver = null;
    String projectPath = System.getProperty("user.dir");

    @Given("browser is open")
    public  void browser_is_open(){

        System.setProperty("webdriver.chrome.driver",projectPath + "/src/main/resources/drivers/chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
    }

   @And("user is on ROAR login page")
    public void user_is_on_ROAR_login_page() {

        driver.navigate().to("https://test.projectroar.cn/");
    }

    @When("user enters username and password")
    public void user_enters_username_and_password() {
        WebElement UserNameInput = driver.findElement(By.id("username"));
        UserNameInput.sendKeys("linwang2");

        WebElement PasswordInput =  driver.findElement(By.id("password"));
        PasswordInput.sendKeys("123456");
    }

    @And("clicks on login button")
    public void clicks_on_login_button() throws InterruptedException {
        WebElement LoginButton = driver.findElement(By.tagName("button"));
        LoginButton.click();
        Thread.sleep(50000);
    }

    @Then("user is navigated to the home page")
    public void user_is_navigated_to_the_home_page() {
        driver.findElement(By.xpath("//*[@id='vue-admin-index']/section/header/div[1]/img")).isDisplayed();

        driver.close();
        //driver.quit();
    }
}
