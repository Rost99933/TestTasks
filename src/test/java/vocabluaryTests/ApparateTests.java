package vocabluaryTests;

import org.junit.Test;
import parentTests.ParentTests;

public class ApparateTests extends ParentTests {

    public ApparateTests(String browser) {

        super(browser);
    }

    @Test
    public void addNewVocabluaryApparateItem (){

        loginPage.LoginUser("Student", "909090");
        vocabluaryPage.clickBtnVocabluary();
        checkAcceptanceCriteria("Not match", apparatePage.getButtonName(),"Аппарат");
        checkAcceptanceCriteria("Not present",apparatePage.isTextPresent(), true);
        apparatePage.AddNewApparateVocabluaryItem("44099","Rost Test");
    }
}
