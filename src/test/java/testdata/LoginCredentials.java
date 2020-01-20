package testdata;

import org.testng.annotations.DataProvider;

public class LoginCredentials {

    @DataProvider(name="LoginCredentials")

    public static Object[][] loginData()
    {
        return new Object[][]
                {
                        {"beenabioinfo@gmail.com","abc123"},

                };
    }

}
// {"beena.np@gmail.com","xyz123"}