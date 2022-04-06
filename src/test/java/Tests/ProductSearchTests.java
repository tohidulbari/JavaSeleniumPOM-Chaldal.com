package Tests;

import Base.Base;
import Pages.ProductSearch;
import org.testng.annotations.Test;

public class ProductSearchTests extends Base {

    @Test
    public void product_search() throws InterruptedException {
        ProductSearch product = homePage.SearchProduct();
        product.clickSignBtn();
        product.setEmailId();
        product.clickEmail("pavelalfadanga@gmail.com");
        product.setPassWord("987654321");
        product.clickLogin();
        product.setProductSearch("fruits");
        product.clk3dotBtn();
    }





}
