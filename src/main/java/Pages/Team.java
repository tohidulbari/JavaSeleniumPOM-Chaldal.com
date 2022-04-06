package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.WebDriver;

import java.nio.file.WatchEvent;

public class Team {

    WebDriver driver;
    private  By clkHelp = By.xpath("//*[@id=\"page\"]/div/div[3]/div/div[1]/div[1]/div[3]/a/span");
    private By clkTeam = By.xpath("//*[@id=\"page\"]/div/div[5]/section/div/div/div/div[1]/div[3]/ul/li[3]/a");

//    private By headOfPro = By.cssSelector("<img src=\"https://chaldn.com/asset/Egg.Grocery.Fabric/Egg.Grocery.Web/1.5.0+DataCenter-Release-2977/Default/components/page/Team/images/nazimuddaula_v3.png?q=best&amp;m=210&amp;webp=1&amp;alpha=1\" size=\"210\" data-reactid=\".toj0klx3uq.8.2.0.0.0.1.3.0.1.$core_team21.0.0\" style=\"background-color: transparent;\">");

    public Team(WebDriver driver){this.driver = driver;}


    public void clcikHlp() throws InterruptedException {driver.findElement(clkHelp).click();
        Thread.sleep(2000);
    }

    public void clk_Team_Btn() throws InterruptedException {driver.findElement(clkTeam).click();
        Thread.sleep(2000);
    }


//    public void clickTeamHead () throws InterruptedException {driver.findElement(headOfPro).click();
//        JavascriptException js = (JavascriptException) driver;
//        Thread.sleep(2000);
//    }


}
