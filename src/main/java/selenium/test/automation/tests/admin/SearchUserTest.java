package selenium.test.automation.tests.admin;

import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.test.automation.pages.environment.AddEnvironmentPage;
import selenium.test.automation.pages.DashboardPage;
import selenium.test.automation.pages.environment.AdminPage;
import selenium.test.automation.tests.DefaultTest;

import java.util.Date;

public class SearchUserTest extends DefaultTest {

    @Test
    public void successAddEnvironmentTest() {
        DashboardPage dashboardPage = new DashboardPage(driver);
        dashboardPage.goToAdminPage();

        AdminPage adminPage = new AdminPage(driver);
        adminPage.fillSearchField("RandomText");
        adminPage.clickSearchButton();

        /*AddEnvironmentPage addEnvironmentPage = new AddEnvironmentPage(driver);
        addEnvironmentPage.fillAddEnvironmentForm(new Date().getTime() + "_env", baseGenerator.generateString(255));
        addEnvironmentPage.submitAddEnvironmentForm();

        adminPage = new AdminPage(driver);
        Assert.assertTrue(adminPage.isInfoBoxDisplayed());*/
    }
}
