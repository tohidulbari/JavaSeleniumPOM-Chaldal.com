package Tests;

import Base.Base;
import Pages.CheckCareerPage;
import org.testng.annotations.Test;

public class TestsCaeerPage extends Base {

    @Test
    public void TestsCaeer_Page() throws InterruptedException {
        CheckCareerPage careerPage = homePage.careerPage();
        careerPage.clcikHlp();
        careerPage.setCareerPage();
    }
}
