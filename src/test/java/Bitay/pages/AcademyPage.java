package Bitay.pages;

import Bitay.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AcademyPage extends BasePage{
    public AcademyPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy (tagName = "h1")
    public WebElement pageTitle;


}
