package Commerce.Test;

import org.testng.annotations.Test;

public class SearchCustomer extends BaseClass
{
    @Test
    public void Login()
    {
        pageFactory.loginPage().logIN();
    }

}