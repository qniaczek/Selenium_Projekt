package selenium.test.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends DefaultPage {

    @FindBy(xpath = "//html/body/div[1]/div[1]/div[10]/ul/li[4]/a")
    private WebElement logoutButton;

    @FindBy(xpath = "//html/body/div[1]/div[2]/ul/li[1]/a/b")
    private WebElement adminButton;

    @FindBy(xpath = "//html/body/div[1]/div[2]/ul/li[5]/a/b")
    private WebElement recruitmenButton;

    public DashboardPage(WebDriver driver) {
        super(driver);
    }

    public boolean isLogoutButtonHidden() {
        return isElementHidden(logoutButton);
    }

    public void goToAdminPage() {
        clickElement(adminButton);
    }

    public void goToVersionListPage() {
        clickElement(recruitmenButton);
    }
}