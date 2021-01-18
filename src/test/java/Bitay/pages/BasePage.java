package Bitay.pages;

import Bitay.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//*[@id=\"app-header\"]/div/nav/div[2]/div[1]/div/a/strong")
    public WebElement buySellBtn;

    @FindBy(xpath = "//strong[contains(text(),'Hemen Al')]")
    public WebElement buyNow;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/header[1]/div[1]/nav[1]/div[2]/div[3]/a[1]/strong[1]")
    public WebElement analysis;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/header[1]/div[1]/nav[1]/div[2]/div[4]/a[1]/strong[1]")
    public WebElement academy;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/header[1]/div[1]/nav[1]/div[2]/div[5]/a[1]/strong[1]")
    public WebElement game;

    @FindBy(xpath = "//a[contains(text(),'My Account')]")
    public WebElement myAccount;


}