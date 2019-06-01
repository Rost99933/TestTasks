package suites;

import loginTest.InvalidLoginWithParam;
import loginTest.ValidLoginWithEXL;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import pages.LoginPage;
import pages.VocabluaryPage;

@RunWith(Suite.class)
@Suite.SuiteClasses (
        {
                ValidLoginWithEXL.class,
                InvalidLoginWithParam.class,
                LoginPage.class,
                VocabluaryPage.class
        }
)

public class SuitesLogin {



}
