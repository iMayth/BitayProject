package Bitay.pages;

import Bitay.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BuyNowPage extends BasePage{
    public BuyNowPage(){ PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]")
    public WebElement odemeTitle;

}
