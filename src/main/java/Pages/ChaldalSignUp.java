package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ChaldalSignUp {

    WebDriver driver;

    private By clickSigIn = By.xpath("//*[@id=\"page\"]/div/div[3]/div/div[1]/div[1]/div[5]/button");
    private By getClickSigUp = By.xpath("//*[@id=\"page\"]/div/div[1]/div/div/div/div[2]/div/form/div[3]/button");
    private By enter_number = By.xpath("//*[@id=\"page\"]/div/div[1]/div/div/div/div[2]/div/form/div[1]/div/div[1]/input");
    private By closeBtn = By.xpath("//*[@id=\"page\"]/div/div[1]/div/div/div/button");


    public ChaldalSignUp (WebDriver driver) {this.driver=driver;
    }
    public void setClickSigIn() throws InterruptedException {driver.findElement(clickSigIn).click();
    Thread.sleep(5000);
    }
    public void setClickSignup() throws InterruptedException {driver.findElement(getClickSigUp).click();
    Thread.sleep(5000);
    }

    public void setEnter_number(String number) throws InterruptedException {driver.findElement(enter_number).sendKeys(number);
    Thread.sleep(3000);
    }

    public void setCloseBtn() throws InterruptedException {driver.findElement(closeBtn).click();
    Thread.sleep(2000);
    }

}

