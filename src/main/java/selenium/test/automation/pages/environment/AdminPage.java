package selenium.test.automation.pages.environment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import selenium.test.automation.pages.DefaultPage;

public class AdminPage extends DefaultPage {

    @FindBy(id = "searchSystemUser_userName")
    private WebElement searchUserField;

    @FindBy(id="searchBtn")
    private WebElement searchButton;

    public AdminPage(WebDriver driver) {
        super(driver);
    }

    public void fillSearchField(String value) {
        fillElement(searchUserField,value);
    }

    public boolean isInfoBoxDisplayed(){
        return isElementHidden(searchButton);
    }

    public void clickSearchButton() {
        clickElement(searchButton);
    }
}