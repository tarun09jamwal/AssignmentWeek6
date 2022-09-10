package Commerce.Test;

import org.testng.annotations.Test;

public class SearchCustomer extends BaseClass
{
    @Test
    public void Login() throws InterruptedException {
        pageFactory.loginPage().login();
        Thread.sleep(20000);
    }
}