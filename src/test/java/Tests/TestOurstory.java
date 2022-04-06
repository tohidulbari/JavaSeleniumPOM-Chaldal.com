package Tests;

import Base.Base;
import Pages.CheckStory;
import org.testng.annotations.Test;

public class TestOurstory extends Base {

    @Test
    public void Our_story() throws InterruptedException {

        CheckStory story = homePage.story();
        story.helpBtn();
        story.our_Story_Btn();


    }


}
