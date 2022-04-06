package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductSearch {

    WebDriver driver;
    //Login
    private  By getGetSignClk = By.xpath("//*[@id=\"page\"]/div/div[3]/div/div[1]/div[1]/div[5]/button");
    private  By emailSing = By.xpath("//*[@id=\"page\"]/div/div[1]/div/div/div/div[2]/div/button/span/b");
    private  By emailId = By.xpath("//*[@id=\"page\"]/div/div[1]/div/div/div/div[2]/div/form/div[1]/input");
    private  By passWord = By.xpath("//*[@id=\"page\"]/div/div[1]/div/div/div/div[2]/div/form/div[2]/input");
    private  By logInBtn = By.xpath("//*[@id=\"page\"]/div/div[1]/div/div/div/div[2]/div/form/div[3]/button");

    private  By productSearch = By.xpath("//*[@id=\"page\"]/div/div[3]/div/div[1]/div[1]/form/div/input");
    private  By dotbtn = By.xpath("//*[@id=\"page\"]/div/div[3]/div/div[1]/div[1]/button/svg");

    public  ProductSearch(WebDriver driver) {
        this.driver = driver;
    }

    //Search product //

    public void clickSignBtn() throws InterruptedException {
        driver.findElement(getGetSignClk).click();
    Thread.sleep(5000);
    }

    public void setEmailId() throws InterruptedException {
        driver.findElement(emailSing).click();
    Thread.sleep(3000);
    }

    public void clickEmail(String email) throws InterruptedException {
        driver.findElement(emailId).sendKeys(email);
    Thread.sleep(3000);
    }

    public void setPassWord(String password) throws InterruptedException {
        driver.findElement(passWord).sendKeys(password);
    Thread.sleep(2000);
    }

    public void clickLogin() throws InterruptedException {
        driver.findElement(logInBtn).click();
        Thread.sleep(3000);
    }
    public void setProductSearch(String name) throws InterruptedException {
        driver.findElement(productSearch).sendKeys(name);
      Thread.sleep(3000);
    }
    public void clk3dotBtn() throws InterruptedException {
        driver.findElement(dotbtn).click();
    Thread.sleep(2000);

    }

}
