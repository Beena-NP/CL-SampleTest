package tests;

import org.testng.annotations.Test;
import pages.BasePage;
import pages.HomePage;
import pages.LoginPage;
import suite.SuiteManager;
import util.ConfigFileReader;

public class LoginTest extends SuiteManager {

    BasePage base;
    LoginPage login;
    HomePage home;

    @Test(priority=0)
    public void loginToApplication()
    {
        base = new BasePage();
        login = base.clickLogin();
        ConfigFileReader config = new ConfigFileReader();
        String loginId = config.getProperty("username");
        String loginPasswd = config.getProperty("password");
        home=login.login(loginId,loginPasswd);

    }

}
