package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.nio.file.WatchEvent;

public class CheckCareerPage {

    WebDriver driver;
    private  By clkHelp = By.xpath("//*[@id=\"page\"]/div/div[3]/div/div[1]/div[1]/div[3]/a/span");
    private By careerPage = By.xpath("//*[@id=\"page\"]/div/div[5]/section/div/div/div/div[1]/div[3]/ul/li[4]/a");
    public CheckCareerPage(WebDriver driver) {this.driver = driver;
    }

    public void clcikHlp() throws InterruptedException {driver.findElement(clkHelp).click();
        Thread.sleep(2000);
    }
    public void setCareerPage() throws InterruptedException{driver.findElement(careerPage).click();
    }


}

