package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FoodAidPage { WebDriver driver;


    private By foodAid =By.xpath("//*[@id=\"page\"]/div/div[3]/div/div[2]/div/div/div[2]/ul[1]/li[2]/div/a");
    private By reqfood = By.xpath("//*[@id=\"page\"]/div/div[5]/section/div/div/div[2]/div[3]/div[2]/a");
    public FoodAidPage(WebDriver driver) {
        this.driver = driver;
    }



    public void setFooodAid () throws InterruptedException {driver.findElement(foodAid).click();
        Thread.sleep(2000);
    }
    public void setReqfood() throws InterruptedException {driver.findElement(reqfood).click();
    Thread.sleep(2000);
    }
}
