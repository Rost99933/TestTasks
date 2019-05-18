package pages;

import libs.ActionsWithWebElements;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;


public class ParrentPage {

    WebDriver driver;
    Logger log;
    ActionsWithWebElements actionsWithWebElements;

    public ParrentPage(WebDriver driver) {
        this.driver = driver;
        log = Logger.getLogger(getClass());
        actionsWithWebElements = new ActionsWithWebElements(driver);
    }

    public ParrentPage() {
    }
}
