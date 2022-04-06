package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckStory {

        WebDriver driver;
        private  By clkHelp = By.xpath("//*[@id=\"page\"]/div/div[3]/div/div[1]/div[1]/div[3]/a/span");
        private  By clkOnStory = By.xpath("//*[@id=\"page\"]/div/div[5]/section/div/div/div/div[1]/div[3]/ul/li[2]/a");

        public CheckStory(WebDriver driver){this.driver = driver;}

        public void helpBtn () throws InterruptedException {driver.findElement(clkHelp ).click();
            Thread.sleep(3000);
        }

        public void our_Story_Btn () throws InterruptedException {driver.findElement(clkOnStory).click();
            Thread.sleep(2000);
        }


    }
