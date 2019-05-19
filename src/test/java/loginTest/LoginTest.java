package loginTest;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import parentTests.ParentTests;

public class LoginTest extends ParentTests {

    WebDriver driver;

    public LoginTest(String browser) {

        super(browser);
    }

    @Test
    public void loginWithValidCreds() {
        loginPage.OpenLoginPage();
        loginPage.InputValueToEmailField("Student");
        loginPage.InputValueToFieldPassword("909090");
        loginPage.ClickBtnSubmit();
        checkAcceptanceCriteria("Checked", homePage.isAvatarPresent(), true);
        checkAcceptanceCriteria("Checked", homePage.getTitle(), "Учет запчастей");

    }


}
