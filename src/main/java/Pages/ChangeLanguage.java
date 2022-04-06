package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ChangeLanguage {

    WebDriver driver;

    private By clkBangla = By.xpath("//*[@id=\"page\"]/div/div[3]/div/div[1]/div[1]/div[4]/p[3]");
    private By clickEN  = By.xpath("//*[@id=\"page\"]/div/div[3]/div/div[1]/div[1]/div[4]/p[1]");

    public ChangeLanguage (WebDriver driver){this.driver=driver;
    }
   public void checkBNBtn () throws InterruptedException {driver.findElement(clkBangla);
    Thread.sleep(3000);
    }
   public void setClickEN () throws InterruptedException {driver.findElement(clickEN);
    Thread.sleep(3000);
    }


}
