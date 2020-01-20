package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import suite.SuiteManager;
import util.DriverManager;

public class LoginPage extends SuiteManager {

    @FindBy(id="spree_user_email")
    private WebElement email;
    @FindBy(id="spree_user_password")
    private WebElement password;
    @FindBy(name="commit")
    private WebElement login;

    public LoginPage()
    {
        PageFactory.initElements(DriverManager.driver,this);
    }
/*
    public void enterDetails()
    {
        email.sendKeys();
        password.sendKeys();
        login.click();
    }  */

    public void enterDetails(WebElement field, String value)
    {
        field.click();
        field.clear();
        field.sendKeys(value);
    }
    public HomePage login(String username, String passwod)
    {
        enterDetails(email,username);
        enterDetails(password,passwod);
        login.click();
        return new HomePage();
    }

}
