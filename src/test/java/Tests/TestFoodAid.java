package Tests;

import Base.Base;
import Pages.FoodAidPage;
import org.testng.annotations.Test;

public class TestFoodAid extends Base {

    @Test
    public void Food_Aid_test() throws InterruptedException {
        FoodAidPage foodAidPage = homePage.foodAid();
        foodAidPage.setFooodAid();
        foodAidPage.setReqfood();
    }
}
