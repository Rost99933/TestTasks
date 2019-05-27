package pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends ParentPage {


    @FindBy(xpath = ".//div[@class='pull-left image']//img[@class='img-circle']")
    WebElement avatar;

    @FindBy(id = "spares")
    private WebElement subMenuSpare;

    @FindBy(id="apparat")
    private WebElement subMenuApparat;

    @FindBy(className = "dropdown-toggle")
    private WebElement avatarStudent;

    @FindBy(xpath = ".//a[@href='/logout']")
    private WebElement buttonLogout;

    @FindBy(id = "deal_type")
    private WebElement subMenuTypeSdelki;

    @FindBy (className = "logo")
    private WebElement titleLogo;

    @FindBy (xpath = "//div[@class='pull-left info']")
    private WebElement studentNameGeneralMenu;

    @FindBy (id = "dashboard")
    private WebElement buttonMain;

    @FindBy (id = "dictionary")
    private WebElement menuDictionary;

    @FindBy (id = "service_apparat")
    private WebElement buttonObsluzhivanie;

    @FindBy (id = "installation")
    private WebElement buttonYstanovka;

    @FindBy (id = "deal")
    private WebElement buttonSdelki;

    @FindBy (id = "report")
    private WebElement Sdelki;




    public HomePage(WebDriver driver) {

        super(driver);
    }

    public boolean isAvatarPresent() {

        return actionsWithWebElements.isElementPresent(avatar);
    }


//    public void clickOnMenuDictionary() {
//        actionsWithWebElements.ClickToElements(menuDictionary);
//    }

//    public void clickOnSubMenuApparat() {
//        actionsWithWebElements.ClickToElements(subMenuApparat);
//    }
}
