package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactUS{

    WebDriver driver;
    private By clkHelp = By.xpath("//*[@id=\"page\"]/div/div[3]/div/div[1]/div[1]/div[3]/a/span");
    private By contectBtn = By.xpath("//*[@id=\"page\"]/div/div[5]/section/div/div/div/div[1]/div[3]/ul/li[5]/a");


    public ContactUS(WebDriver driver) {
        this.driver = driver;
    }

    public void helpBtn() throws InterruptedException {
        driver.findElement(clkHelp).click();
        Thread.sleep(3000);
    }

    public void our_Contect_Btn() throws InterruptedException {
        driver.findElement(contectBtn).click();
        Thread.sleep(2000);
    }
}