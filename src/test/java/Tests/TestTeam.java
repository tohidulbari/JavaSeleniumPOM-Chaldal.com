package Tests;

import Base.Base;
import Pages.Team;
import org.testng.annotations.Test;

public class TestTeam extends Base {

    @Test
    public void team_test() throws InterruptedException {

        Team team = homePage.team();
        team.clcikHlp();
        team.clk_Team_Btn();
//        team.clickTeamHead();
    }
}
