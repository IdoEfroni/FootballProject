package businessLayer.Tournament;

import businessLayer.Team.Team;
import businessLayer.Tournament.Match.Match;
import businessLayer.userTypes.Administration.Referee;
import businessLayer.userTypes.SystemController;

import java.util.*;

public class League {

    private String leagueName;
    private Map<Team, Integer> scoreTable;
    //private Map<Season,MatchingPolicy> matchingPolicy; // probably not needed
    //private Map<Season,RankingPolicy> rankingPolicy; // probably not needed
    private SystemController systemController;
    private HashMap<Integer, Season> seasons;
    private List<Match> matches;

    /**
     * @param leagueName
     */
    public League(String leagueName) {
        this.leagueName = leagueName;
        scoreTable = new HashMap<>();
        seasons = new HashMap<>();
        matches = new ArrayList<>();
    }
/*
    /**
     * @return
     */
/*
    public String getLeagueName() {
        return leagueName;
    }
  */
    /*
    /**
     * @param leagueName
     */
    /*
    public void setLeagueName(String leagueName) {
        this.leagueName = leagueName;
    }
    */

/*
    /**
     * @return
     */
/*
    public Map<Team, Integer> getScoreTable() {
        return scoreTable;
    }
*/
    /*
    /**
     * @param scoreTable
     */
    /*
    public void setScoreTable(Map<Team, Integer> scoreTable) {
        this.scoreTable = scoreTable;
    }
*/
    /**
     * @return
     */
    public SystemController getSystemController() {
        return systemController;
    }

    /**
     * @param systemController
     */
    public void setSystemController(SystemController systemController) {
        this.systemController = systemController;
    }
/*
    /**
     * @return
     */
/*
    public HashMap<Integer, Season> getSeasons() {
        return seasons;
    }

    /**
     * @param seasons
     */
/*
    public void setSeasons(HashMap<Integer, Season> seasons) {
        this.seasons = seasons;
    }
*/

    /**
     * @return
     */

    public List<Match> getMatches() {
        return matches;
    }

    /**
     * @param matches
     */
    public void setMatches(List<Match> matches) {
        this.matches = matches;
    }


    /**
     * The function creates a season and adds it to the league then returns whether the creation was successful or not
     *
     * @param seasonID
     * @param startingDate
     * @param endingDate
     * @return
     */
    public boolean addSeasonToLeague(int seasonID, Date startingDate, Date endingDate) {

        if (seasons.containsKey(seasonID) || startingDate.after(endingDate)) {
            return false;
        }
        seasons.put(seasonID, new Season(seasonID, startingDate, endingDate, this));
        return true;
    }


    /**
     * The function receives referee and season's ID and assigns the referee to the season, returns whether the assignment was successful or not
     * @param refereeToAdd
     * @param seasonID
     * @return true/false
     */
    public boolean addRefereeToSeason(Referee refereeToAdd, int seasonID) {

        if (refereeToAdd == null || !seasons.containsKey(seasonID)) {
            return false;
        }
        Season seasonToAddRef = seasons.get(seasonID);
        return seasonToAddRef.addReferee(refereeToAdd);
    }
}