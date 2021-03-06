package dataLayer;

import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Result;
import org.jooq.SQLDialect;
import org.jooq.exception.DataAccessException;
import org.jooq.impl.DSL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static dataLayer.Tables.Tables.UNCONFIRMED_TEAMS;

public class DBUnconfirmedTeams implements DB_Inter {

    String username = "root";
    String password = "Messi1Ronaldo2";
    String myDriver = "org.mariadb.jdbc.Driver";
    //String myUrl = "jdbc:mysql://132.72.65.33:3306/SoccerProject";
    String myUrl = "jdbc:mysql://132.72.65.33:3306/demodb";
    Connection connection = null;



    public DBUnconfirmedTeams(){
        //connect to DB and save to field in class.
        try {
            Class.forName(myDriver);
            connection = DriverManager.getConnection(myUrl,username,password);
            System.out.println("Successful connection to server db ");
        } catch (SQLException e) {
            System.out.println("error connecting to server. connection is now null");
        } catch (ClassNotFoundException e) {
            System.out.println("error connecting to driver");
        }
    }

    @Override
    public boolean containInDB(String objectName,String arg2,String arg3) {
        try {
            DSLContext create = DSL.using(connection, SQLDialect.MARIADB);
            Result<?> result = create.select().from(UNCONFIRMED_TEAMS).where(UNCONFIRMED_TEAMS.TEAMID.eq(objectName)).fetch();
            return (!result.isEmpty());
        } catch (DataAccessException e) {
            System.out.println("error searching unconfirmed team in DB");
            return false;
        }
    }

    @Override
    public Map<String, ArrayList<String>> selectFromDB(String objectName,String arg2,String arg3) {
        try {
            return selectUnconfirmedTeamFromDB(objectName);
        } catch (Exception e) {
            System.out.println("error selecting unconfirmed teams from DB");
            return new HashMap<>();
        }
    }

    public HashMap<String,ArrayList<String>> selectUnconfirmedTeamFromDB(String teamID){
        HashMap<String,ArrayList<String>> details = new HashMap<>();
        if(containInDB(teamID,null,null)) {
            DSLContext create = DSL.using(connection, SQLDialect.MARIADB);
            Result <?> result = create.select().from(UNCONFIRMED_TEAMS).where(UNCONFIRMED_TEAMS.TEAMID.eq(teamID)).fetch();
            String year  = result.get(0).get(UNCONFIRMED_TEAMS.ESTABLISHEDYEAR)+"";
            String teamOwner = result.get(0).get(UNCONFIRMED_TEAMS.OWNERID);

            ArrayList<String> yearA = new ArrayList<>();
            yearA.add(year);
            ArrayList<String> teamOwnerA = new ArrayList<>();
            teamOwnerA.add(teamOwner);
            ArrayList<String> teamIDA = new ArrayList<>();
            teamIDA.add(teamID);

            details.put("year",yearA);
            details.put("owner",teamOwnerA);
            details.put("teamID",teamIDA);
            return details;
        }
        return null;
    }


    @Override
    public boolean removeFromDB(String objectName,String arg2,String arg3) {
        try {
            if(containInDB(objectName,null,null)) {
                DSLContext create = DSL.using(connection, SQLDialect.MARIADB);
                create.delete(UNCONFIRMED_TEAMS).where(UNCONFIRMED_TEAMS.TEAMID.eq(objectName)).execute();
                return true;
            }
            return false;
        } catch (DataAccessException e) {
            System.out.println("error removing unconfirmed teams from DB");
            return false;
        }
    }

    @Override
    public boolean addToDB(String teamID, String establishedYear, String ownerName, String str4, Map<String, ArrayList<String>> objDetails) {
        try {
            return addRequestForTeam(teamID,Integer.parseInt(establishedYear),ownerName);
        } catch (Exception e) {
            System.out.println("error adding unconfirmed teams from DB");
            return false;
        }
    }

    @Override
    public int countRecords() {
        return -1;
    }

    @Override
    public ArrayList<Map<String, ArrayList<String>>> selectAllRecords(Enum<?> e,Map<String,String> arguments) {
        if(e==TEAMUPDATES.UNCONONFIRMED){
            try {
                DSLContext create = DSL.using(connection, SQLDialect.MARIADB);
                Result<?> result = create.select(UNCONFIRMED_TEAMS.TEAMID).from(UNCONFIRMED_TEAMS).fetch();
                ArrayList<Map<String,ArrayList<String>>> details = new ArrayList<>();
                for (Record record : result){
                    HashMap<String,ArrayList<String>> seasonDetails = new HashMap <>();
                    ArrayList<String> temp = new ArrayList<>();
                    temp.add(record.get(UNCONFIRMED_TEAMS.TEAMID));
                    seasonDetails.put("unconfirmedID",temp);
                    details.add(seasonDetails);
                }
                return details;
            } catch (DataAccessException e1) {
                System.out.println("error selecting all unconfirmed teams ID from DB");
                return new ArrayList<>();
            } catch (IllegalArgumentException e1) {
                System.out.println("error selecting all unconfirmed teams ID from DB");
                return new ArrayList<>();
            }
        }
        return null;
    }

    @Override
    public boolean update(Enum<?> e, Map<String, String> arguments) {
        return false;
    }

    @Override
    public boolean TerminateDB() {
        try {
            connection.close();
        } catch (Exception e) {
            System.out.println("error closing connection of DB");
            return false;
        }

        return true;
    }

    public boolean addRequestForTeam(String teamID, int establishedYear, String ownerName) {
        if (!containInDB(teamID,null,null)) {
            DSLContext create = DSL.using(connection, SQLDialect.MARIADB);
            create.insertInto(UNCONFIRMED_TEAMS
                    ,UNCONFIRMED_TEAMS.TEAMID
                    ,UNCONFIRMED_TEAMS.ESTABLISHEDYEAR
                    ,UNCONFIRMED_TEAMS.OWNERID)
                    .values(teamID
                    ,establishedYear
                    ,ownerName)
                    .execute();
            return true;
        }
        return false;
    }
}
