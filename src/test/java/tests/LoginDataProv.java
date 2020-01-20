package tests;

import org.testng.annotations.Test;
import pages.BasePage;
import pages.HomePage;
import pages.LoginPage;
import suite.SuiteManager;
import testdata.LoginCredentials;

public class LoginDataProv extends SuiteManager {

    public BasePage base;
    public LoginPage login;
    public HomePage home;

    @Test(priority = 0, dataProvider = "LoginCredentials", dataProviderClass = LoginCredentials.class)
    public void loginDataProvider(String loginId, String loginPwd)
    {
        base = new BasePage();
        login = base.clickLogin();
        home = login.login(loginId,loginPwd);
        System.out.println("User has logged into the application successfully!");

    }
}
