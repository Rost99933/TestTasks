package pages;


import libs.ConfigData;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;

public class LoginPage extends ParentPage {

    @FindBy(name = "_username")
    WebElement EmailField;

    @FindBy(id = "password")
    WebElement PasswordField;

    @FindBy(className = "btn btn-primary btn-block btn-flat")
    WebElement SubmitBtn;


    public LoginPage(WebDriver driver) {

        super(driver);
    }

    public void OpenLoginPage() {
        try
        {
            driver.get(ConfigData.getCfgValue("base_url") + "/login");
            log.info("Page Login was opened");
        } catch (IOException e) {
            log.error("Cant open URL");
            Assert.fail("Cant open URL");
        }
    }

    public void GetPageLink(String link) {
        try {
            driver.get(link);
            log.info("Page is opened");
        } catch (Exception ex) {
            log.error("Page does not open " + ex);
        }
    }

    public void InputValueToEmailField(String LoginValue) {
        actionsWithWebElements.inputTextToField(EmailField, LoginValue);
    }

    public void InputValueToFieldPassword(String Password) {

        actionsWithWebElements.inputTextToField(PasswordField, Password);
    }

    public void ClickBtnSubmit(String SubmitButton) {

        actionsWithWebElements.clickButton(SubmitBtn, SubmitButton);
    }

}
