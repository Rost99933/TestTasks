package libs;

import junit.framework.Assert;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.ParentPage;

public class ActionsWithWebElements extends ParentPage {

    WebDriver driver;
    Logger log;
    WebDriverWait webDriverWait;

    public ActionsWithWebElements(WebDriver webDriver) {
        this.driver = webDriver;
        log = Logger.getLogger(getClass());
        webDriverWait = new WebDriverWait(driver, 3);
    }

    /** this method input text into text field
     */
    public void inputTextToField(WebElement inputField, String inputText) {
        try {
            inputField.clear();
            inputField.sendKeys(inputText);
            log.info("text is inputted");
        } catch (Exception ex) {
            ex.printStackTrace();
            log.error("Text is not input");
            Assert.fail("Cannot work input");
        }
    }

    public void clickButton(WebElement SubmitBtn) {
        try {
            SubmitBtn.click();
            log.info("Button is clicked");
        } catch (Exception ex) {
            ex.printStackTrace();
            log.error("Button is not clicked");
            Assert.fail("Cannot click button");
        }
    }

    public void selectElementFromDropdownByText(String locatorDropdownXPath, String textInDropDown) {
        try {
            Select selectDropdown = new Select(driver.findElement(By.xpath(locatorDropdownXPath)));
            selectDropdown.selectByVisibleText(textInDropDown);
            log.info("Element is selected");
        } catch (Exception ex) {
            ex.printStackTrace();
            log.error("Element is not selected");
            Assert.fail("Cannot find Element");
        }
    }

    public void selectElementFromDropdownByValue(String locatorDropdownXPath, String valueInDropDown) {
        try {
            Select selectDropdown = new Select(driver.findElement(By.xpath(locatorDropdownXPath)));
            selectDropdown.selectByValue(valueInDropDown);
            log.info("Value is selected");
        } catch (Exception ex) {
            ex.printStackTrace();
            log.error("Value is not selected");
            Assert.fail("Cannot find Element");
        }
    }

    // выбор чекбоска
    public void tickCheckBox(String checkBoxXPath, boolean statusCheckBox) {
        try {
            if ((statusCheckBox) && (!driver.findElement(By.xpath(checkBoxXPath)).isSelected())) {
                driver.findElement(By.xpath(checkBoxXPath)).click();
                log.info("CheckBox is ticked");
            } else {
                log.info("CheckBox is already ticked");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            log.error("CheckBox is not ticked");
            Assert.fail("Cannot tick checkBox");
        }
    }

    public void tickCheckBox2(String checkBoxXPath, boolean statusCheckBox) {
        try {
            if ((statusCheckBox) && (!driver.findElement(By.xpath(checkBoxXPath)).isSelected())) {
                driver.findElement(By.xpath(checkBoxXPath)).click();
            } else if ((!statusCheckBox) && (driver.findElement(By.xpath(checkBoxXPath)).isSelected())) {
                driver.findElement(By.xpath(checkBoxXPath)).click();
            }
            log.error("CheckBox is ticked");
        } catch (Exception ex) {
            ex.printStackTrace();
            log.error("CheckBox is not ticked");
            Assert.fail("Cannot tick checkBox");
        }
    }

    public void tickCheckBox3(String checkBoxXPath, boolean statusCheckBox) {
        try {
            if ((statusCheckBox) && (!driver.findElement(By.xpath(checkBoxXPath)).isSelected())
                    || ((!statusCheckBox) && (driver.findElement(By.xpath(checkBoxXPath)).isSelected()))) {
                driver.findElement(By.xpath(checkBoxXPath)).click();
            }
            log.error("CheckBox is ticked");
        } catch (Exception ex) {
            ex.printStackTrace();
            log.error("CheckBox is not ticked");
            Assert.fail("Cannot tick checkBox");
        }
    }

    public String getText (WebElement element) {

        return element.getText();
    }


}
