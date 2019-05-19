package loginTest;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import parentTests.ParentTests;

public class LoginTest extends ParentTests {

    public LoginTest(String browser) {
        super(browser);
    }
    @Test
    public void loginWithValidCreds() {
        loginPage.OpenLoginPage();
        loginPage.InputValueToEmailField("Student");
        loginPage.InputValueToFieldPassword("909090");
        loginPage.ClickBtnSubmit();

    }

}
