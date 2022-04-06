package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PrivecyPage {
    WebDriver driver;

    private By clkHelp = By.xpath("//*[@id=\"page\"]/div/div[3]/div/div[1]/div[1]/div[3]/a/span");
    private By checkPrivecy =By.xpath("//*[@id=\"page\"]/div/div[5]/section/div/div/div/div[1]/div[3]/ul/li[6]/a");
    public PrivecyPage(WebDriver driver) {
        this.driver = driver;
    }

    public void helpBtn() throws InterruptedException {
        driver.findElement(clkHelp).click();
        Thread.sleep(3000);{}
    }
    public void setCheckPrivecy() throws InterruptedException{
        driver.findElement(checkPrivecy).click();
        Thread.sleep(2000);
    }
}