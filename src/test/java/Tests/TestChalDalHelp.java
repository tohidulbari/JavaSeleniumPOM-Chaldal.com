package Tests;

import Base.Base;
import Pages.ChaldalHelp;
import org.testng.annotations.Test;

public class TestChalDalHelp extends Base  {


 @Test
 public void Test_chaldal_Help() throws InterruptedException {

      ChaldalHelp chaldalHelp = homePage.helpPage();

      chaldalHelp.enter_Site();
      chaldalHelp.view_Site();
      chaldalHelp.setLog_Btn();
      chaldalHelp.enter_email();
      chaldalHelp.setLogInBtn();
      chaldalHelp.click_Help();
      chaldalHelp.Chat_btn();
      chaldalHelp.setGetLivechat("hello anybody there");
      chaldalHelp.enterClk();



 }

}
