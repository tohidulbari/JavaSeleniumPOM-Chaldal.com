package Base;
import Pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class  Base {

    public WebDriver driver;
    protected HomePage homePage;


    @BeforeClass
    public void setUP() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Pavel\\Downloads\\Selenium\\SeleniumJava\\Java-Selenium-Chaldal\\Driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://chaldal.com/");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        homePage = new HomePage(driver);


    }

    @AfterClass
    public void Down(){
    driver.quit();

    }

}
