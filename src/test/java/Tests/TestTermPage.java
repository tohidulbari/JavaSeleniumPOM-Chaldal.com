package Tests;

import Base.Base;
import Pages.TermsOfUse;
import org.testng.annotations.Test;

public class TestTermPage extends Base {

    @Test
    public void testTerm() throws InterruptedException {
        TermsOfUse termsOfUse = homePage.terms();
        termsOfUse.clcikHlp();
        termsOfUse.setTermPath();
    }
}
