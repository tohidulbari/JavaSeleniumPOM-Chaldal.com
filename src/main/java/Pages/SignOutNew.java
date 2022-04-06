package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignOutNew {

    WebDriver driver;


    //Log in path//
    private final By getGetSignClk = By.xpath("//*[@id=\"page\"]/div/div[3]/div/div[1]/div[1]/div[5]/button");
    private final By emailSing = By.xpath("//*[@id=\"page\"]/div/div[1]/div/div/div/div[2]/div/button/span/b");
    private final By emailId = By.xpath("//*[@id=\"page\"]/div/div[1]/div/div/div/div[2]/div/form/div[1]/input");
    private final By passWord = By.xpath("//*[@id=\"page\"]/div/div[1]/div/div/div/div[2]/div/form/div[2]/input");
    private final By logInBtn = By.xpath("//*[@id=\"page\"]/div/div[1]/div/div/div/div[2]/div/form/div[3]/button");
    private final By setProfile = By.xpath("//*[@id=\"page\"]/div/div[3]/div/div[1]/div[1]/div[5]/div[2]/p");
    private final By logOutBtn = By.xpath("//*[@id=\"page\"]/div/div[3]/div/div[1]/div[1]/div[5]/ul/li[6]/a");


    public  SignOutNew (WebDriver driver) {
        this.driver = driver;
    }

    public void Enter_Site() throws InterruptedException {driver.findElement(getGetSignClk).click();
    Thread.sleep(5000);
    }

    public void View_Site() throws InterruptedException {driver.findElement(emailSing).click();
    Thread.sleep(5000);

    }

    public void Enter_Email() throws InterruptedException {driver.findElement(emailId).sendKeys("pavelalfadanga@gmail.com");
    Thread.sleep(5000);
    }

    public void Enter_Pass() throws InterruptedException {driver.findElement(passWord).sendKeys("987654321");
    Thread.sleep(5000);
    }

    public void SetLoginBtn() throws InterruptedException {driver.findElement(logInBtn).click();
    Thread.sleep(5000);
    }

    public void setGetGetSignClk() throws InterruptedException{driver.findElement(setProfile).click();
    Thread.sleep(2000);
    }
    public void clkLogOut() throws InterruptedException {driver.findElement(logOutBtn).click();
    Thread.sleep(4000);
    }
}





