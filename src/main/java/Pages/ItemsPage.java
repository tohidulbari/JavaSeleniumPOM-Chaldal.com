package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ItemsPage{

    WebDriver driver;

    private By itemIcon = By.xpath("//*[@id=\"page\"]/div/div[2]/div/div/section/div[1]/p/span");
    private By clkCpon = By.xpath("//*[@id=\"page\"]/div/div[2]/div/div[2]/div[2]/section/div[1]/button");
    private By closeCpn = By.xpath("//*[@id=\"page\"]/div/div[2]/div/div[2]/div[2]/section/div[2]/form/span/button[2]");
    private By closeItem = By.xpath("//*[@id=\"page\"]/div/div[2]/div/div[2]/div[1]/button");
    public  ItemsPage(WebDriver driver) {this.driver = driver;
    }
    public void setItemIcon () throws InterruptedException {driver.findElement(itemIcon).click();
    Thread.sleep(2000);
    }
    public void setClkCpon() throws InterruptedException {driver.findElement(clkCpon).click();
    Thread.sleep(2000);
    }
    public void setCloseCpn() throws InterruptedException {driver.findElement(closeCpn).click();
    Thread.sleep(2000);
    }
    public void setCloseItem() throws InterruptedException {driver.findElement(closeItem).click();
    Thread.sleep(2000);
    }

}
