package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OffersPage {

    WebDriver driver;


    private By offerIcon =By.xpath("//*[@id=\"page\"]/div/div[3]/div/div[2]/div/div/div[2]/ul[1]/li[1]/div/a/span[2]");
    public OffersPage(WebDriver driver) {
        this.driver = driver;
    }


    public void getOffer () throws InterruptedException {driver.findElement(offerIcon).click();
    Thread.sleep(2000);
    }
}
