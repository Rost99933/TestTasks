package pages;


import libs.ConfigData;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class LoginPage extends ParrentPage {

    String inputUsername = "_username";
    String inputPassword = "password";
    String clickSubmitBtn = "//button[@class='btn btn-primary btn-block btn-flat']";

    By inputUsername1 = By.name("_username");
    By inputPassword1 = By.id("password");
    By clickSubmitBtn1 = By.xpath("//button[@class='btn btn-primary btn-block btn-flat']");

    WebElement inputUsername2 = driver.findElement(By.xpath("//input[@placeholder='Email']"));
    WebElement inputPassword2 = driver.findElement(By.id("password"));
    WebElement clickSubmitBtn2 = driver.findElement(By.xpath("//button[@class='btn btn-primary btn-block btn-flat']"));

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void OpenPageLogin() {
        try {
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

    public void InputValueToNameField(String LoginValue) {
        actionsWithWebElements.inputTextToField(inputUsername2, LoginValue);
    }

    public void InputValueToFieldPassword(String LoginValue) {
        actionsWithWebElements.inputTextToField(inputPassword2, LoginValue);
    }

    public void ClickButtonSubmit(String LoginValue) {
        actionsWithWebElements.clickButton(clickSubmitBtn2, LoginValue);
    }



}
