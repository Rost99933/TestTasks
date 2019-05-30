package pages;

import libs.ConfigData;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;

public class VocabluaryPage extends ParentPage {

    @FindBy(id = "dictionary")
    private WebElement buttonVocabularyMainMenu;

    @FindBy(id = "apparat")
    private WebElement subMenuButtonApparat;

    @FindBy(id = "workers")
    private WebElement subMenuButtonWorkers;

    @FindBy(id = "spareType")
    private WebElement subMenuButtonSpareType;

    @FindBy(id = "spares")
    private WebElement subMenuButtonSparese;

    @FindBy(id = "prov_cus'")
    private WebElement subMenuButtonProv_cus;

    @FindBy(id = "deal_type'")
    private WebElement subMenuButtonDeal_type;

    public VocabluaryPage(WebDriver driver) {

        super(driver);
    }

    public void clickBtnVocabluary() {
        try {
            driver.findElement(By.id("dictionary")).click();
            log.info("Button is clicked");
        } catch (Exception e) {
            System.out.println("Problem");
            log.error("Button not clicked");
        }
    }

    public String getButtonName() throws InterruptedException {

        String s = buttonVocabularyMainMenu.getText();
        System.out.println(s);
        return s;
   }

    public boolean isTextPresent() {

        return actionsWithWebElements.isElementPresent(buttonVocabularyMainMenu);
    }

    public void OpenTheDropDownElement() throws InterruptedException {
        Thread.sleep(3000);
        clickBtnVocabluary();
        Thread.sleep(5000);
    }

}
