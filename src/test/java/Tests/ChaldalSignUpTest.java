package Tests;

import Base.Base;
import Pages.ChaldalSignUp;
import org.testng.annotations.Test;

public class ChaldalSignUpTest extends Base {

    @Test
    public void signUpSuccess() throws InterruptedException {

        ChaldalSignUp chaldalSignUp = homePage.signUp();
        chaldalSignUp.setClickSigIn();
        chaldalSignUp.setClickSignup();
        chaldalSignUp.setEnter_number("0176523142");
        chaldalSignUp.setCloseBtn();


    }

}
