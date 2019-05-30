package loginTest;

import libs.ConfigData;
import libs.SpreadsheetData;
import org.junit.Test;
import org.junit.runners.Parameterized;
import parentTests.ParentTests;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.Map;

public class ValidLoginWithEXL extends ParentTests {

    String login, pass;

    public ValidLoginWithEXL(String browser) {
        super(browser);
    }

    @Test
    public void ValidLogin () throws IOException {

        Map dataFromValidLogin = excelDriver.getData(ConfigData.getCfgValue("DATA_FILE"), "validLogOn");
        loginPage.OpenLoginPage();
        loginPage.InputValueToEmailField(dataFromValidLogin.get("login").toString());
        loginPage.InputValueToFieldPassword(dataFromValidLogin.get("pass").toString());
        loginPage.ClickBtnSubmit();
        checkAcceptanceCriteria("Title no match", loginPage.getTitle(), "Учет запчастей");
    }

    @Parameterized.Parameters
    public static Collection testData() throws IOException {

        InputStream spreadsheet = new FileInputStream(ConfigData.getCfgValue("DATA_FILE_PATH") + testData());
        return (Collection) new SpreadsheetData(spreadsheet, "InvalidLogOn");
    }


    @Test
    public void invalidLogIn(){

        loginPage.LoginUser(login, pass);
        checkAcceptanceCriteria("Checked", homePage.getTitle(), "Учет запчастей");
    }
}
