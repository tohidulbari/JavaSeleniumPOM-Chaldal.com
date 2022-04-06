package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ChaldalHelp {

    WebDriver driver;

    private final By getGetSignClk = By.xpath("//*[@id=\"page\"]/div/div[3]/div/div[1]/div[1]/div[5]/button");
    private final By emailSing = By.xpath("//*[@id=\"page\"]/div/div[1]/div/div/div/div[2]/div/button/span/b");
    private final By emailID = By.xpath("//*[@id=\"page\"]/div/div[1]/div/div/div/div[2]/div/form/div[1]/input");
    private final By passWord = By.xpath("//*[@id=\"page\"]/div/div[1]/div/div/div/div[2]/div/form/div[2]/input");
    private final By logInBtn = By.xpath("//*[@id=\"page\"]/div/div[1]/div/div/div/div[2]/div/form/div[3]/button");

    private final By helpBtn = By.xpath("//*[@id=\"page\"]/div/div[3]/div/div[1]/div[1]/div[3]/a");
    private final By livechat = By.xpath("//*[@id=\"page\"]/div/span/a/span/span[1]");
    private final By getLivechat = By.xpath("//*[@id=\"crisp-chatbox\"]/div/div/div[2]/div/div[6]/form/textarea");
    private final By clkEnter = By.xpath("//*[@id=\"crisp-chatbox\"]/div/div/div[2]/div/div[6]/div/div/div[2]/span/input");


    public ChaldalHelp(WebDriver driver) {this.driver = driver;}

    public ChaldalHelp() {
    }

    public void enter_Site() throws InterruptedException {driver.findElement(getGetSignClk).click();
    Thread.sleep(2000);
    }
    public void view_Site() throws InterruptedException {driver.findElement(emailSing).click();
    Thread.sleep(2000);
    }
    public void setLog_Btn() throws InterruptedException {driver.findElement(emailID).sendKeys("pavelalfadanga@gmail.com");
    Thread.sleep(2000);
    }
    public void enter_email() throws InterruptedException {driver.findElement(passWord).sendKeys("987654321");
    Thread.sleep(2000);
    }
    public void setLogInBtn() throws InterruptedException {driver.findElement(logInBtn).click();
    Thread.sleep(2000);
    }
    public void click_Help() throws InterruptedException {driver.findElement(helpBtn).click();
    Thread.sleep(2000);
    }
    public void Chat_btn() throws InterruptedException {driver.findElement(livechat).click();
    Thread.sleep(2000);
    }
    public void setGetLivechat(String name) throws InterruptedException {driver.findElement(getLivechat).sendKeys(name);
    Thread.sleep(2000);
    }
    public void enterClk() throws InterruptedException {driver.findElement(clkEnter).click();
    Thread.sleep(2000);
    }

}






