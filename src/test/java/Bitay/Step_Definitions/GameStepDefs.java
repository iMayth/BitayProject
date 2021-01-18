package Bitay.Step_Definitions;

import Bitay.pages.GamePage;
import Bitay.utilities.BrowserUtils;
import Bitay.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class GameStepDefs {

    @When("user clicks game button")
    public void user_clicks_game_button()  {

        new GamePage().game.click();

    }

    @Then("the user should be able to see Bitay Game title")
    public void the_user_should_be_able_to_see_Bitay_Game_title() {
        BrowserUtils.waitForVisibility(new GamePage().gamePageTitle,10);
        String expectedTitle = new GamePage().gamePageTitle.getText();
        String actualTitle = Driver.get().getTitle();

        if(expectedTitle.contains(actualTitle)) {
            System.out.println("titles are matching");
        }

        Driver.closeDriver();
    }

}
