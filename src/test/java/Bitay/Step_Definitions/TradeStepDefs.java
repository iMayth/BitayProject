package Bitay.Step_Definitions;

import Bitay.pages.TradePage;
import Bitay.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class TradeStepDefs {

    @When("user clicks buy_sell button")
    public void user_clicks_buy_sell_button()  {
        new TradePage().buySellBtn.click();

    }

    @Then("user should see be able to see orders")
    public void user_should_see_be_able_to_see_orders()  {
        BrowserUtils.waitForVisibility(new TradePage().tradePageTitle,10);
        String expectedTitle = "Emirler";
        String actualTitle = new TradePage().tradePageTitle.getText();

        Assert.assertEquals(expectedTitle,actualTitle);


    }
}
