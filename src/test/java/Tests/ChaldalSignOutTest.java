package Tests;

import Base.Base;

import Pages.SignOutNew;
import org.testng.annotations.Test;

public class ChaldalSignOutTest extends Base {

    @Test
    public void SingOut() throws InterruptedException {

              SignOutNew sign = homePage.signOut();
              sign.Enter_Site();
              sign.View_Site();
              sign.Enter_Email();
              sign.Enter_Pass();
              sign.SetLoginBtn();
              sign.setGetGetSignClk();
              sign.clkLogOut();
    }

}
