package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import suite.SuiteManager;
import util.DriverManager;

public class BasePage extends SuiteManager {
    @FindBy(xpath = "//a[@class=\"nav-link text-white\" and text()=\"Login\"]")
    private WebElement loginBtn;

    public BasePage()
    {
        PageFactory.initElements(DriverManager.driver,this);

    }

    public LoginPage clickLogin()
    {
        loginBtn.click();
        return new LoginPage();
    }

}
