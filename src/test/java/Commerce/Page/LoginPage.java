package Commerce.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginPage {
    WebDriver driver;
    By Email = By.name("Email1");
    By Password = By.name("Password");
    By login = By.xpath("//div[@class='buttons']/button");


    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void login()  {
//        driver.findElement(Email).clear();
//        driver.findElement(Password).clear();
//        driver.findElement(Email).sendKeys("admin@yourstore.com");
//        driver.findElement(Password).sendKeys("admin");
        driver.findElement(login).click();
        Assert.assertEquals(driver.findElement(By.xpath("//div[@class='content-header']/h1")).getText(), "Dashboard");
    }

}
