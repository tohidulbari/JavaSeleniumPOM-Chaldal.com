package Tests;

import Base.Base;
import Pages.OffersPage;
import org.testng.annotations.Test;

public class TestOfferPage extends Base {

    @Test
    public void Offer_page() throws InterruptedException {

        OffersPage offersPage = homePage.offer();

        offersPage.getOffer();
    }
}
