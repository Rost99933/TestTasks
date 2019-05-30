package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ApparatePage extends ParentPage {

    public ApparatePage (WebDriver driver){

        super(driver);
    }

    @FindBy (id = "apparat")
    private WebElement apparateBtn;

    @FindBy (xpath = "//i[@class='fa fa-plus']")
    private WebElement addBtn;

    @FindBy (id = "apparat_apparatNumber")
    private WebElement aparatNumberField;

    @FindBy (id = "apparat_apparatComment")
    private WebElement apparatCommentField;

    @FindBy (name = "add")
    private WebElement btnCreate;



    public void ClickBtnApparateVocabluary() {

        actionsWithWebElements.clickButton(apparateBtn);
    }

    public void ClickBtnAddNewApparateVocabluary() {


        actionsWithWebElements.clickButton(addBtn);
    }

    public void InputValueToApparatNumberField(String ApparatNumber) {

        actionsWithWebElements.inputTextToField(aparatNumberField, ApparatNumber);
    }

    public void InputValueToApparatCommentField(String ApparatComment) {

        actionsWithWebElements.inputTextToField(apparatCommentField, ApparatComment);
    }

    public void ClickBtnCreateNewVocabluary() {

        actionsWithWebElements.clickButton(btnCreate);
    }

    public void AddNewApparateVocabluaryItem (String number, String comment){

        ClickBtnApparateVocabluary();
        ClickBtnAddNewApparateVocabluary();
        InputValueToApparatNumberField(number);
        InputValueToApparatCommentField(comment);
        ClickBtnCreateNewVocabluary();
    }

    public String getButtonName() {

        String s = apparateBtn.getText();
        System.out.println(s);
        return s;
    }

    public boolean isTextPresent() {

        return actionsWithWebElements.isElementPresent(apparateBtn);
    }


}
