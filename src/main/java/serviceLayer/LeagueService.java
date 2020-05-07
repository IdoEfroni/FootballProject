package serviceLayer;

import businessLayer.Tournament.LeagueController;
import businessLayer.userTypes.SystemController;

import java.util.Date;
import java.util.LinkedList;

public class LeagueService {

    private SystemController systemController;
    private LeagueController leagueController;


    /**
     * Constructor
     */
    public LeagueService() {
        systemController = SystemController.SystemController();
        leagueController = systemController.getLeagueController();
    }


    //-----------------------------AssociationRepresentative------------------------

    /**
     * The function receives username and leagueID from the interface layer and calls the creation function in the business layer
     *
     * @param leagueID
     * @param username
     * @return
     */
    public boolean addLeagueThroughRepresentative(String leagueID, String username) {

        if (leagueID != null && username != null) {
            return leagueController.addLeagueThroughRepresentative(leagueID, username);
        }
        return false;
    }


    /**
     * The function receives username, leagueID, seasonID and dates from the interface layer and calls the creation function in the business layer
     * @param leagueID
     * @param seasonID
     * @param startingDate
     * @param endingDate
     * @param win
     * @param lose
     * @param tie
     * @param matchingPolicy
     * @param username
     * @return
     */
    public boolean addSeasonThroughRepresentative(String leagueID, int seasonID, Date startingDate, Date endingDate, String win, String lose, String tie, String matchingPolicy, String username) {

        if (leagueID != null && username != null && matchingPolicy != null) {
            if(tryParseInt(win) && tryParseInt(tie) && tryParseInt(lose)) {
                return leagueController.addSeasonThroughRepresentative(leagueID, seasonID, startingDate, endingDate, Integer.parseInt(win),  Integer.parseInt(lose),  Integer.parseInt(tie), matchingPolicy, username);
            }
        }
        return false;
    }


    /**
     * The function receives a referee's username and the representative's username from the interface layer and calls the creation function in the business layer
     *
     * @param refUsername
     * @param username
     * @return
     */
    public boolean createRefereeThroughRepresentative(String refUsername, String username) {

        if (refUsername != null && username != null) {
            return leagueController.createRefereeThroughRepresentative(refUsername, username);
        }
        return false;
    }


    /**
     * The function receives a referee's username and the representative's username from the interface layer and calls the removal function in the business layer
     *
     * @param refUsername
     * @param username
     * @return
     */
    public boolean removeRefereeThroughRepresentative(String refUsername, String username) {

        if (refUsername != null && username != null) {
            return leagueController.removeRefereeThroughRepresentative(refUsername, username);
        }
        return false;
    }


    /**
     * The function receives a referee's username, leagueID, seasonID and the representative's username from the interface layer and calls the assigning function in the business layer
     *
     * @param refUsername
     * @param leagueName
     * @param seasonID
     * @param username
     * @return
     */
    public boolean assignRefereeThroughRepresentative(String refUsername, String leagueName, int seasonID, String username) {

        if (refUsername != null && leagueName != null && username != null) {
            return leagueController.assignRefereeThroughRepresentative(refUsername, leagueName, seasonID, username);
        }
        return false;
    }

    /**
     * The function receives a team's name and the representative's username from the interface layer and calls the assigning function in the business layer
     *
     * @param teamName
     * @param username
     * @return
     */
    public boolean confirmTeamRequestThroughRepresentative(String teamName, String username) {

        if (teamName != null && username != null) {
            return leagueController.confirmTeamRequestThroughRepresentative(teamName, username);
        }
        return false;
    }

    /**
     * The function receives a stadium's identifier, number of seats and the representative's username from the interface layer and calls the creating function in the business layer
     *
     * @param nameStadium
     * @param numberOfSeats
     * @return
     */
    public boolean createNewStadiumThroughRepresentative(String nameStadium, String numberOfSeats, String username) {

        if (nameStadium != null && numberOfSeats != null && username != null) {
            return leagueController.createNewStadiumThroughRepresentative(nameStadium, numberOfSeats, username);
        }
        return false;
    }

    /**
     * the function lets the AR to choose teams and add them to the season
     * @param teamsNames the teams the AR wants to add
     * @param leagueID the league ID
     * @param seasonID the season ID
     * @param username the username
     * @return true if it done successfully
     */
    public boolean chooseTeamForSeason(LinkedList<String> teamsNames, String leagueID , String seasonID, String username){
        if(teamsNames!=null && teamsNames.size()>0 && tryParseInt(seasonID) && username!=null){
            return leagueController.chooseTeamForSeason(teamsNames,leagueID,seasonID,username);
        }
        return false;
    }

    /**
     * the function lets the AR to activate the match policy of a season
     * @param leagueID
     * @param seasonID
     * @param userName
     * @return
     */
    public boolean activateMatchPolicyForSeason(String leagueID, String seasonID, String userName){
        if(tryParseInt(leagueID) && tryParseInt(seasonID) && userName!=null){
            return leagueController.activateMatchPolicy(leagueID,seasonID,userName);
        }
        return false;
    }


    /**
     * private function that checks that a string represents an interger
     * @param value the string
     * @return true if it an integer
     */
    protected boolean tryParseInt(String value) {
        try {
            Integer.parseInt(value);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }


}