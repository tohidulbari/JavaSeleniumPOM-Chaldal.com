package Tests;

import Base.Base;
import Pages.Home;
import org.testng.annotations.Test;

public class HomeTest extends Base {

    @Test
    public void Home_test() throws InterruptedException {
        Home hom = homePage.home();

        hom.clk_Btn();
        hom.setChaldalClk();
    }

}
