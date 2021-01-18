package Bitay.Step_Definitions;

import Bitay.pages.MyAccountPage;
import Bitay.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class MyAccountStepDefs {

    @Given("the user is on the my account page")
    public void the_user_is_on_the_my_account_page()  {

    }

    @Then("the title of the page should be Hesabım")
    public void the_title_of_the_page_should_be_Hesabım() {

        String expectedTitle = "Hesabım | Bitay";
        String actualTitle = Driver.get().getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
    }


    @Then("the user should be able to see bakiye")
    public void the_user_should_be_able_to_see_bakiye() {
        String expectedTitle = "0,00 TRY";
        String actualTitle = new MyAccountPage().bakiye.getText();
        Assert.assertEquals(expectedTitle,actualTitle);
    }
}
