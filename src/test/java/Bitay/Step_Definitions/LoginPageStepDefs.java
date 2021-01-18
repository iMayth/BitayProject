package Bitay.Step_Definitions;

import Bitay.pages.LoginPage;
import Bitay.utilities.BrowserUtils;
import Bitay.utilities.ConfigurationReader;
import Bitay.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginPageStepDefs {


    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page()  {
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);

    }

    @When("the user enters valid credentials")
    public void the_user_enters_valid_credentials()  {
        String username = ConfigurationReader.get("username");
        String password = ConfigurationReader.get("password");
        new LoginPage().username.sendKeys(username);
        new LoginPage().password.sendKeys(password);


    }

    @Then("clicks login button")
    public void clicks_login_button()  {
        new LoginPage().loginButton.click();

    }

    @Then("the user should be able to see SMS verification page")
    public void the_user_should_be_able_to_see_SMS_verification_page() {
        BrowserUtils.waitForVisibility(new LoginPage().title,10);
        String expectedTitle = "SMS Doğrulama";

       String actualTitle = new LoginPage().title.getText();
       Assert.assertEquals(expectedTitle, actualTitle);
    }

    @Then("the user enters SMS code and click send button")
    public void the_user_enters_SMS_code_and_click_send_button()  {
        //after user enters SMS verification code, selenium will click only "Gönder" button
        BrowserUtils.waitFor(10);
        new LoginPage().sendButton.click();
        BrowserUtils.waitFor(2);


    }


}
