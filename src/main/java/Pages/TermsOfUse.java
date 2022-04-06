package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TermsOfUse {
    WebDriver driver;
    private By clkHelp = By.xpath("//*[@id=\"page\"]/div/div[3]/div/div[1]/div[1]/div[3]/a/span");
    private By termPath = By.xpath("//*[@id=\"page\"]/div/div[5]/section/div/div/div/div[1]/div[3]/ul/li[7]/a");
    public TermsOfUse(WebDriver driver) {
        this.driver = driver;
    }


    public void clcikHlp() throws InterruptedException {
        driver.findElement(clkHelp).click();
        Thread.sleep(2000);

    }
    public void setTermPath() throws InterruptedException{
        driver.findElement(termPath).click();
    }

}