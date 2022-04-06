package Tests;
import Base.Base;
import Pages.ChaldalLogin;

import org.testng.annotations.Test;

public class LoginTest extends Base {

    @Test
    public void loginPage () throws InterruptedException {
        ChaldalLogin login = homePage.clickOnlogin();

        login.enter_site();
        login.view_Site();
        login.set_logId();
        login.enter_pass();
        login.setLogInBtn();




    }
}