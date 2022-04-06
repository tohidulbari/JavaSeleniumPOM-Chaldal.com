package Tests;

import Base.Base;
import Pages.ChangeLanguage;
import org.testng.annotations.Test;

public class ChangeLanguageTest extends Base {

    @Test
    public void Change_language() throws InterruptedException {
        ChangeLanguage changeLanguage = homePage.changeLanguage();
        changeLanguage.checkBNBtn();
        changeLanguage.setClickEN();

    }
}
