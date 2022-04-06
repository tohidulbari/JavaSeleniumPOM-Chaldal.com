package Tests;

import Base.Base;
import Pages.ContactUS;
import org.testng.annotations.Test;

public class TestContactPage extends Base {

    @Test
    public void ContactPage() throws InterruptedException {
        ContactUS contactUS = homePage.contectUS();
        contactUS.helpBtn();
        contactUS.our_Contect_Btn();
    }
}
