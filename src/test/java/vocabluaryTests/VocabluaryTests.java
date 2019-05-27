package vocabluaryTests;

import org.junit.Test;
import parentTests.ParentTests;



public class VocabluaryTests extends ParentTests {

    public VocabluaryTests(String browser) {

        super(browser);
    }

    @Test
    public void checkButtonText() throws InterruptedException {
        loginPage.LoginUser("Student", "909090");
        Thread.sleep(5000);
        vocabluaryPage.clickOnTheElement();
//        checkAcceptanceCriteria("Not match", vocabluaryPage.getButtonName(),"Словари");
//        checkAcceptanceCriteria("Not present",vocabluaryPage.isTextPresent(), true);
        }
}
