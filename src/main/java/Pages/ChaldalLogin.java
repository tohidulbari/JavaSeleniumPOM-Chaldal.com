package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ChaldalLogin {
    
   WebDriver driver;
 //Log in path//
   private  By gtGetSignClk = By.xpath("//*[@id=\"page\"]/div/div[3]/div/div[1]/div[1]/div[5]/button");
   private  By mailSing = By.xpath("//*[@id=\"page\"]/div/div[1]/div/div/div/div[2]/div/button/span/b");
   private  By mailId = By.xpath("//*[@id=\"page\"]/div/div[1]/div/div/div/div[2]/div/form/div[1]/input");
   private  By passW = By.xpath("//*[@id=\"page\"]/div/div[1]/div/div/div/div[2]/div/form/div[2]/input");
   private  By lgInBtn = By.xpath("//*[@id=\"page\"]/div/div[1]/div/div/div/div[2]/div/form/div[3]/button");

    public ChaldalLogin (WebDriver driver) {this.driver = driver;
    }

    public void enter_site() throws InterruptedException {driver.findElement(gtGetSignClk).click();
    Thread.sleep(2000);
    }

    public void view_Site() throws InterruptedException {driver.findElement(mailSing).click();
    Thread.sleep(2000);
    }
    public void set_logId() throws InterruptedException {driver.findElement(mailId).sendKeys("pavelalfadanga@gmail.com");

    Thread.sleep(2000);}

    public void enter_pass() throws InterruptedException {driver.findElement(passW).sendKeys("987654321");
    Thread.sleep(2000);
    }

    public void setLogInBtn() throws InterruptedException {driver.findElement(lgInBtn).click();
    Thread.sleep(2000);
    }

}






