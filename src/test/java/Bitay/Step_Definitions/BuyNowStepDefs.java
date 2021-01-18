package Bitay.Step_Definitions;

import Bitay.pages.BuyNowPage;
import Bitay.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class BuyNowStepDefs {

    @When("user clicks BuyNow button")
    public void user_clicks_BuyNow_button()  {

    new BuyNowPage().buyNow.click();

    }

    @Then("the user should be able to see ödeme yöntemini seçin title")
    public void the_user_should_be_able_to_see_ödeme_yöntemini_seçin_title() {
        BrowserUtils.waitForVisibility(new BuyNowPage().odemeTitle,10);
        String expectedTitle = "Ödeme yöntemini seçin";
        String actualTitle = new BuyNowPage().odemeTitle.getText();
        Assert.assertEquals(expectedTitle,actualTitle);

    }




}
