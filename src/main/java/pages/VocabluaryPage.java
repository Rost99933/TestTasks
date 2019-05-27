package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VocabluaryPage extends ParentPage {

    @FindBy(className = "treeview")
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

    public String getButtonName() throws InterruptedException {
        String s = buttonVocabularyMainMenu.getText();
        System.out.println(s);
        return s;
   }

    public boolean isTextPresent() {

        return actionsWithWebElements.isElementPresent(buttonVocabularyMainMenu);
    }

    public void clickOnTheElement() throws InterruptedException {
        buttonVocabularyMainMenu.click();
        Thread.sleep(5000);
        buttonVocabularyMainMenu.click();
    }

}
