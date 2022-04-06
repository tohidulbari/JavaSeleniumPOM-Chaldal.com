package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ChaldalProfileSettings  {


    WebDriver driver;
    //Log in path//
    private  By getGetSignClk = By.xpath("//*[@id=\"page\"]/div/div[3]/div/div[1]/div[1]/div[5]/button");
    private  By emailSing = By.xpath("//*[@id=\"page\"]/div/div[1]/div/div/div/div[2]/div/button/span/b");
    private  By emailId = By.xpath("//*[@id=\"page\"]/div/div[1]/div/div/div/div[2]/div/form/div[1]/input");
    private  By passWord = By.xpath("//*[@id=\"page\"]/div/div[1]/div/div/div/div[2]/div/form/div[2]/input");
    private  By logInBtn = By.xpath("//*[@id=\"page\"]/div/div[1]/div/div/div/div[2]/div/form/div[3]/button");

    private  By profileSetting = By.xpath("//*[@id=\"page\"]/div/div[3]/div/div[1]/div[1]/div[5]/div[2]/p");
    private  By clkOrder = By.xpath("//*[@id=\"page\"]/div/div[3]/div/div[1]/div[1]/div[5]/ul/li[2]/a");
    private  By clkPayment = By.xpath("//*[@id=\"page\"]/div/div[3]/div/div[1]/div[1]/div[5]/ul/li[3]/a/span[2]");
    private  By clkChangePass = By.xpath("//*[@id=\"page\"]/div/div[3]/div/div[1]/div[1]/div[5]/ul/li[3]/a/span[2]");


    public ChaldalProfileSettings(WebDriver driver) {this.driver = driver;
    }

    public void setLogfInBtn() throws InterruptedException {driver.findElement(getGetSignClk).click();
    Thread.sleep(2000);
    }

    public void setLoggInBtn() throws InterruptedException {driver.findElement(emailSing).click();
    Thread.sleep(2000);
    }
    public void setEmailId() throws InterruptedException {driver.findElement(emailId).sendKeys("pavelalfadanga@gmail.com");
    Thread.sleep(2000);
    }
    public void setPassWord() throws InterruptedException {driver.findElement(passWord).sendKeys("987654321");
    Thread.sleep(2000);
    }
    public void setLogInBtn() throws InterruptedException {driver.findElement(logInBtn).click();
    Thread.sleep(2000);
    }

    public void setProfileSetting() throws InterruptedException {driver.findElement(profileSetting).click();
    Thread.sleep(2000);
    }
    public void setClkOrder() throws InterruptedException {driver.findElement(clkOrder).click();
    Thread.sleep(2000);
    }
    public void setClkPayment() throws InterruptedException {driver.findElement(clkPayment).click();
    Thread.sleep(2000);
    }
    public void setClkChangePass() throws InterruptedException {driver.findElement(clkChangePass).click();
    Thread.sleep(2000);
    }
}






