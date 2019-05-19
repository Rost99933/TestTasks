package pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends ParentPage {


    @FindBy(xpath = ".//div[@class='pull-left image']//img[@class='img-circle']")
    WebElement avatar;

    @FindBy (xpath = ".//li[@id='deal']")
    WebElement sdelki;

    @FindBy(xpath =".//*[@id='dictionary']/a")
    private WebElement menuDictionary;

    @FindBy(id = "spares")
    private WebElement subMenuSpare;

    @FindBy(id="apparat")
    private WebElement subMenuApparat;

    @FindBy(xpath = ".//a[@class='dropdown-toggle']")
    private WebElement avatarStudent;

    @FindBy(xpath = ".//a[@href='/logout']")
    private WebElement buttonLogout;

    @FindBy(xpath = ".//a[@ href='/dictionary/deal_type']")
    private WebElement subMenuTypeSdelki;

    String TitleLogo = "//a[@class='logo']";



    public HomePage(WebDriver driver) {

        super(driver);
    }

    public boolean isAvatarPresent() {

        return actionsWithWebElements.isElementPresent(avatar);
    }


    public void clickOnMenuDictionary() {
        actionsWithWebElements.ClickToElements(menuDictionary);
    }

    public void clickOnSubMenuApparat() {
        actionsWithWebElements.ClickToElements(subMenuApparat);
    }
}
