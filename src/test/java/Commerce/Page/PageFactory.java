package Commerce.Page;

import org.openqa.selenium.WebDriver;

public class PageFactory
{
    WebDriver driver;
    private LoginPage loginPage;

    public PageFactory(WebDriver driver)
    {
        this.driver = driver;
    }
    public LoginPage loginPage()
    {
        if(loginPage ==null)
        {
            loginPage = new LoginPage(driver);
        }
        return loginPage;
    }
}
