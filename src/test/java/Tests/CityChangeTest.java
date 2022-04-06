package Tests;

import Base.Base;
import Pages.ChangeCity;
import org.testng.annotations.Test;

public class CityChangeTest extends Base {

    @Test
    public void change_Location () throws InterruptedException {

        ChangeCity city = homePage.city();
        city.setHomeIcon();
        city.setChange_city();
        city.setSlctKnla();

    }

}
