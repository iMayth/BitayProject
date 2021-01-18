package Bitay.Step_Definitions;

import Bitay.pages.AnalysisPage;
import Bitay.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AnalysisPageStepDefs {

    @When("user clicks Analysis button")
    public void user_clicks_Analysis_button()  {
    new AnalysisPage().analysis.click();

    }

    @Then("the user should be able to see teknik indikatörler title")
    public void the_user_should_be_able_to_see_teknik_indikatörler_title() {
        BrowserUtils.waitForVisibility(new AnalysisPage().analysisPageTitle,10);
        String expectedTitle = "Teknik İndikatörler";
        String actualTitle = new AnalysisPage().analysisPageTitle.getText();

        Assert.assertEquals(expectedTitle,actualTitle);

    }

}
