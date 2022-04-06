package Tests;

import Base.Base;
import Pages.ItemsPage;
import org.testng.annotations.Test;

public class ItemFormTest extends Base {

    @Test
    public void itemForm() throws InterruptedException {
        ItemsPage itemsPage = homePage.itemsPage();
        itemsPage.setItemIcon();
        itemsPage.setClkCpon();
        itemsPage.setCloseCpn();
        itemsPage.setCloseItem();
    }

}
