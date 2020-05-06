package businessLayer.userTypes.Administration;

import businessLayer.Team.Team;
import org.junit.*;
import businessLayer.userTypes.SystemController;

import java.util.HashSet;

import static org.junit.Assert.*;

public class CoachTest {

    private SystemController systemController;
    private Coach henry;
    private TeamOwner teamOwner;

    @Before
    public void createTestValues() {
        henry = new Coach("Henry", "Henry123", "Henry", "manager", "assistent manager",0,systemController);
        teamOwner = new TeamOwner("HenryFictive", "HenryF123", "HenryF", systemController);
    }

    @Test
    public void IT_isOwner(){
        assertFalse(henry.isOwner());
        henry.setTeamOwner(teamOwner);
        assertTrue(henry.isOwner());
    }

    @Test
    public void IT_checkSetGetName(){
        henry.setName("ido");
        assertEquals(henry.getName(),"ido");
        henry.setName("Henrys");
    }
    @Test
    public void IT_checkGetTeamOwner(){
        henry.setTeamOwner(teamOwner);
        assertEquals(henry.getTeamOwner(),teamOwner);

    }
    @Test
    public void IT_checkGetTraining(){
        assertEquals(henry.getTraining(),"manager");
    }
    @Test
    public void IT_checkGetTeamJob(){
        assertEquals(henry.getTeamJob(),"assistent manager");
    }
    @Test
    public void IT_checkSetGetTeams(){
        HashSet<Team> teams = new HashSet<>();
        Team team = new Team("Hpoel",teamOwner,0);
        teams.add(team);
        henry.setTeamS(teams);
        assertEquals(henry.getTeamS(),teams);
    }
}