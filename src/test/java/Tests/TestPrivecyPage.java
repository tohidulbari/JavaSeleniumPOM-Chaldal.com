package Tests;

import Base.Base;
import Pages.PrivecyPage;
import org.testng.annotations.Test;

public class TestPrivecyPage extends Base {

    @Test
    public void Privecy_Page() throws InterruptedException {

        PrivecyPage privecyPage = homePage.privecy();
        privecyPage.helpBtn();
        privecyPage.setCheckPrivecy();
    }

}


