package Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private final WebDriver driver;
    private By search = By.xpath("//*[@id=\"page\"]/div/div[3]/div/div[1]/div[1]/form/div/button/svg");
    private final By loginicon = By.cssSelector("#page > div > div.headerWrapper > div > div:nth-child(1) > div.top-header > div.loginArea.authButtons.area.hidden-xs > button");
    public HomePage(WebDriver driver) {this.driver = driver;}

    public Home clickOnSearch(){driver.findElement(search).sendKeys("https://chaldal.com/");
        return new Home(driver);
    }
     //test 1
    public ChaldalLogin clickOnlogin(){return new ChaldalLogin(driver);
    }

    //test 2
    public ProductSearch SearchProduct(){return new ProductSearch (driver);
    }
    //test 3
    public ChaldalHelp helpPage(){
        return new ChaldalHelp(driver);
    }

    //test 4
    public SignOutNew  signOut(){ return new SignOutNew (driver);
    }
    //test 5
    public CheckStory story(){return new CheckStory(driver);
    }
    //test 6
    public ChaldalSignUp signUp(){
        return new ChaldalSignUp(driver);
    }
    //test 7
    public ChaldalProfileSettings proSettings(){return new ChaldalProfileSettings(driver);
    }
    //test 8
    public Home home(){
        return new Home(driver);
    }
    //test 9
    public ChangeCity city (){
        return new ChangeCity(driver);
    }
    //test 10
    public ChangeLanguage changeLanguage() {return new ChangeLanguage(driver);
    }
    //test 11
    public Team team() {return new Team(driver);
    }
    //test 12
    public CheckCareerPage careerPage(){return new CheckCareerPage(driver);
    }
    //test 13
    public ContactUS contectUS(){return new ContactUS(driver);
    }
    //test 14
    public PrivecyPage privecy(){return new PrivecyPage(driver);
    }
    //test 15
    public TermsOfUse terms(){return new TermsOfUse(driver);
    }
    //test 16
    public ItemsPage itemsPage(){return new ItemsPage(driver);
    }
    //test 17
    public OffersPage offer(){return new OffersPage(driver);
    }
    //test 18
    public FoodAidPage foodAid(){return new FoodAidPage(driver);
    }


}

