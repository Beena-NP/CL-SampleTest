package suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import util.ConfigFileReader;
import util.DriverManager;

public class SuiteManager
{
    DriverManager driverManager;
    public ConfigFileReader config = new ConfigFileReader();

    @BeforeSuite
    public void startDriver()
    {
        driverManager = new DriverManager();
    }

    @AfterSuite
    public void closeDriver()
    {
        driverManager.driver.quit();
    }
    @BeforeClass
    public void launchUrl()
    {
        driverManager.driver.manage().window().maximize();
        String url = config.getProperty("base_url");
        driverManager.driver.get(url);
    }

}
