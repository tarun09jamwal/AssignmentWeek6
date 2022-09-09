package Commerce.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class LoginPage

{
    WebDriver driver;

    By Email = By.name("Email");
    By Password = By.name("Password");
    By login = By.xpath("//div[@class='buttons']/button");



    public LoginPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void logIN()
    {
        driver.findElement(Email).clear();
        driver.findElement(Email).sendKeys("admin@yourstore.com");
        driver.findElement(Password).clear();
        driver.findElement(Password).sendKeys("admin");
        driver.findElement(login).click();
        Assert.assertEquals(driver.findElement(By.xpath("//div[@class='content-header']/h1")).getText(), "Dashboard");

    }

}
