package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Home {

    WebDriver driver;
    private final By productSearch = By.xpath("//*[@id=\"page\"]/div/div[3]/div/div[1]/div[1]/form/div/input");
    private final By chaldalClk = By.xpath("//*[@id=\"page\"]/div/div[3]/div/div[1]/div[1]/div[1]/a/img");

    public Home(WebDriver driver){this.driver = driver;}

    public void clk_Btn() throws InterruptedException {driver.findElement(productSearch).sendKeys("mach");
    Thread.sleep(8000);
    }

    public void setChaldalClk () throws InterruptedException {driver.findElement(chaldalClk).click();
    Thread.sleep(2000);
    }


}
