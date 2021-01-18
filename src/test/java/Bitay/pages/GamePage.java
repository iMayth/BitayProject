package Bitay.pages;

import Bitay.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GamePage extends BasePage{
    public GamePage(){
        PageFactory.initElements(Driver.get(), this);
    }

@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/h1[1]")
    public WebElement gamePageTitle;

}
