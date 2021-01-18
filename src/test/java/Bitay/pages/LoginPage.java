package Bitay.pages;

import Bitay.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {
    public LoginPage(){
        PageFactory.initElements(Driver.get(), this);
    }
    @FindBy(name = "phone-number")
    public WebElement username;

    @FindBy(css = "#password")
    public WebElement password;

    @FindBy(xpath ="/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/button[1]")
    public WebElement loginButton;

    @FindBy(xpath = "//*[@id=\"app-wrapper\"]/div/div[1]/div/div[3]/div/div[1]/span")
    public WebElement title;

    @FindBy(className = "btn-submit")
    public WebElement sendButton;

}