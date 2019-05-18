package pages;

import libs.ActionsWithWebElements;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public class ParentPage {

    WebDriver driver;
    Logger log;
    ActionsWithWebElements actionsWithWebElements;


    public ParentPage(WebDriver driver) {
        this.driver = driver;
        log = Logger.getLogger(getClass());
        actionsWithWebElements = new ActionsWithWebElements(driver);
        PageFactory.initElements(driver, this);
    }

    public ParentPage() {
    }
}
