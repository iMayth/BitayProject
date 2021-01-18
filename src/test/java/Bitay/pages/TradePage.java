package Bitay.pages;

import Bitay.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TradePage extends BasePage {
    public TradePage(){
        PageFactory.initElements(Driver.get(), this); }

        @FindBy(className = "e-wrapper-title")
        public WebElement tradePageTitle;

    }

