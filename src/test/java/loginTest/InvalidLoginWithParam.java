package loginTest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import parentTests.ParentTests;

import java.util.Arrays;
import java.util.Collection;

@RunWith(value = Parameterized.class)

public class InvalidLoginWithParam extends ParentTests {

    String login;
    String password;

    public InvalidLoginWithParam(String browser, String login, String password) {
        super(browser);
        this.login = login;
        this.password = password;
    }


    @Parameterized.Parameters
    public static Collection testData() {
        return Arrays.asList(new Object[][]{
                {"chrome", "Students", "909090"},
                {"chrome", "tudents", "909090"}
        });
    }


    @Test
    public void InvalidLogin() {
        loginPage.LoginUser(login, password);
        checkAcceptanceCriteria("Title no match", loginPage.getTitle(), "Account of spare:Авторизация");

    }

}


