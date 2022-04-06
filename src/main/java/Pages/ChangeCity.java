package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ChangeCity {

    WebDriver driver;


  // home page
    private By homeIcon = By.xpath("//*[@id=\"page\"]/div/div[3]/div/div[1]/div[1]/div[2]/div[1]");
    private By change_city = By.xpath("//*[@id=\"page\"]/div/div[3]/div/div[1]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/p");
    private By slctKnla = By.xpath("//*[@id=\"4\"]/div[1]/img");
    private By three_btn = By.xpath("//*[@id=\"page\"]/div/div[3]/div/div[1]/div[1]/button/svg/path");

    public ChangeCity(WebDriver driver) {this.driver = driver;
    }


// homepage connect //
    public void setHomeIcon() throws InterruptedException {driver.findElement(homeIcon).click();
    Thread.sleep(2000);
    }
    public void setChange_city() throws InterruptedException {driver.findElement(change_city).click();
    Thread.sleep(2000);
    }
    public void setSlctKnla() throws InterruptedException {driver.findElement(slctKnla).click();
    Thread.sleep(2000);
    }
    public void setThree_btn() throws InterruptedException {driver.findElement(three_btn).click();
    Thread.sleep(2000);
    }
}






