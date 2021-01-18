package Bitay.Step_Definitions;

import Bitay.pages.AcademyPage;
import Bitay.utilities.BrowserUtils;
import Bitay.utilities.ConfigurationReader;
import Bitay.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AcademyPageStepDefs {

    @Given("the user is on the main page")
    public void the_user_is_on_the_main_page()  {

        String url = ConfigurationReader.get("url");
        BrowserUtils.waitForVisibility(new AcademyPage().pageTitle,10);

        Driver.get().get(url);

    }

    @When("user clicks Academy button")
    public void user_clicks_Academy_button()  {
        BrowserUtils.waitForClickablility(new AcademyPage().academy,10);
        new AcademyPage().academy.click();

    }
    @Then("the user should be able to see academy page")
    public void the_user_should_be_able_to_see_academy_page() {
        BrowserUtils.waitForVisibility(new AcademyPage().pageTitle,10);
        String expectedPageTitle = "Bitay Akademi";
        String actualPageTitle = new AcademyPage().pageTitle.getText();

        Assert.assertEquals(expectedPageTitle,actualPageTitle);

    }
}
