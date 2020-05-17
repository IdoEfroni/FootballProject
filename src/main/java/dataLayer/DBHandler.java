package dataLayer;

import dataLayer.Tables.enums.CoachesTraining;
import dataLayer.Tables.enums.PlayersFieldjob;
import dataLayer.Tables.enums.RefereesTraining;
import dataLayer.Tables.enums.TeammanagersPermissions;
import org.jooq.*;
import org.jooq.Record;
import org.jooq.impl.*;

import java.sql.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Stream;

import static dataLayer.Tables.Tables.*;
import static dataLayer.Tables.tables.Subscribers.SUBSCRIBERS;

public class DBHandler implements DB_Inter{

    String username = "root";
    String password = "Messi1Ronaldo2";
    String myDriver = "org.mariadb.jdbc.Driver";
    String myUrl = "jdbc:mysql://132.72.65.33:3306/SoccerProject";
    Connection connection = null;



    public DBHandler(){
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

    /**
     * function to search in db for subscribers
     * @param objectName
     * @return
     */

    @Override
    public boolean containInDB(String objectName) {
        //create sql query to search record in db using ObjectName
        DSLContext create = DSL.using(connection, SQLDialect.MARIADB);
        Result<?> result = create.select().
                from(SUBSCRIBERS)
                .where(SUBSCRIBERS.SUBSCRIBERID.eq(objectName)).fetch();
        if (result.isEmpty()) {
            return false;
        }
        return true;

    }

    /**
     *  function to get a subscriber object from data base
     * @param objectName
     * @return
     */

    @Override
    public Map<String,ArrayList<String>> selectFromDB(String objectName) {
        //create sql query to select record from db using ObjectName
        if(containInDB(objectName)) {
            DSLContext create = DSL.using(connection, SQLDialect.MARIADB);
            Result<?> result = create.select().
                    from(SUBSCRIBERS)
                    .where(SUBSCRIBERS.SUBSCRIBERID.eq(objectName))
                    .fetch();

            Map<String,ArrayList<String>> objDetails = new HashMap<>();
            String username = result.get(0).get(SUBSCRIBERS.SUBSCRIBERID);
            //String password = result.get(0).get(SUBSCRIBERS.PASSWORD); //todo create constructor withoud password to subscriber
            String name = result.get(0).get(SUBSCRIBERS.NAME);
            String type = result.get(0).get(SUBSCRIBERS.TYPE);

            objDetails.put("username",new ArrayList<>());
            objDetails.get("username").add(username);
            objDetails.put("name",new ArrayList<>());
            objDetails.get("name").add(name);
            objDetails.put("type",new ArrayList<>());
            objDetails.get("type").add(type);

            if (type.equalsIgnoreCase("player")) {
                result = create.select().from(PLAYERS).where(PLAYERS.PLAYERID.eq(objectName)).fetch();
                String teamID = result.get(0).get(PLAYERS.TEAMID);
                String birthDay = result.get(0).get(PLAYERS.BIRTHDATE).toString();
                String fieldJob = result.get(0).get(PLAYERS.FIELDJOB).name();
                int salary = result.get(0).get(PLAYERS.SALARY);
                String teamOwnerID = result.get(0).get(PLAYERS.TEAMOWNERID_FICTIVE);

                objDetails.put("teamID",new ArrayList<>());
                objDetails.get("teamID").add(teamID);
                objDetails.put("birthDay",new ArrayList<>());
                objDetails.get("birthDay").add(birthDay);
                objDetails.put("fieldJob",new ArrayList<>());
                objDetails.get("fieldJob").add(fieldJob);
                objDetails.put("salary",new ArrayList<>());
                objDetails.get("salary").add(String.valueOf(salary));
                objDetails.put("teamOwnerID",new ArrayList<>());
                objDetails.get("teamOwnerID").add(teamOwnerID);
            }
            if (type.equalsIgnoreCase("coach")) {
                result = create.select().from(COACHES
                        .join(COACH_TEAM).on(COACHES.COACHID.eq(COACH_TEAM.COACHID)))
                        .where(COACHES.COACHID.eq(objectName)).fetch();
                ArrayList<String> teams = new ArrayList<>();
                String teamID = result.get(0).get(COACHES.TEAMID);
                String training = result.get(0).get(COACHES.TRAINING).name();
                int salary = result.get(0).get(COACHES.SALARY);
                String teamOwnerID = result.get(0).get(COACHES.TEAMOWNERID_FICTIVE);

                for (Record r : result) {
                    teams.add(r.get(COACH_TEAM.TEAMID));
                }

                objDetails.put("teamID",new ArrayList<>());
                objDetails.get("teamID").add(teamID);
                objDetails.put("teams",teams);
                objDetails.put("training",new ArrayList<>());
                objDetails.get("training").add(training);
                objDetails.put("salary",new ArrayList<>());
                objDetails.get("salary").add(String.valueOf(salary));
                objDetails.put("teamOwnerID",new ArrayList<>());
                objDetails.get("teamOwnerID").add(teamOwnerID);
            }
            if (type.equalsIgnoreCase("teammanger")) {
                result = create.select().from(TEAMMANAGERS).where(TEAMMANAGERS.MANAGERID.eq(objectName)).fetch();
                String teamID = result.get(0).get(TEAMMANAGERS.TEAMID);
                String permissions = result.get(0).get(TEAMMANAGERS.PERMISSIONS).name();
                int salary = result.get(0).get(TEAMMANAGERS.SALARY);
                String teamOwnerID = result.get(0).get(TEAMMANAGERS.TEAMOWNERID_FICTIVE);

                objDetails.put("teamID",new ArrayList<>());
                objDetails.get("teamID").add(teamID);
                objDetails.put("permissions",new ArrayList<>());
                objDetails.get("permissions").add(permissions);
                objDetails.put("salary",new ArrayList<>());
                objDetails.get("salary").add(String.valueOf(salary));
                objDetails.put("teamOwnerID",new ArrayList<>());
                objDetails.get("teamOwnerID").add(teamOwnerID);
            }
            if (type.equalsIgnoreCase("teamowner")) {
                //query
                result = create.select().
                        from(TEAMOWNER_OWNERELIGIBLE.
                                join(OWNER_TEAMS).on(TEAMOWNER_OWNERELIGIBLE.OWNERID.eq(OWNER_TEAMS.OWNERID)).
                                join(OWNER_MANAGER_ASSIGNINGS).on(TEAMOWNER_OWNERELIGIBLE.OWNERID.eq(OWNER_MANAGER_ASSIGNINGS.OWNERID)).
                                join(OWNER_OWNER_ASSIGNINGS).on(TEAMOWNER_OWNERELIGIBLE.OWNERID.eq(OWNER_OWNER_ASSIGNINGS.OWNERID))).
                        where(TEAMOWNER_OWNERELIGIBLE.OWNERID.eq(objectName)).
                        fetch();

                //data extraction

                String teamOwnerID = result.get(0).get(TEAMMANAGERS.TEAMOWNERID_FICTIVE);
                String eligible = Stream.of(result.get(0).get(TEAMOWNER_OWNERELIGIBLE.PLAYERID),result.get(0).get(TEAMOWNER_OWNERELIGIBLE.COACHID),result.get(0).get(TEAMOWNER_OWNERELIGIBLE.MANAGERID)).filter(Objects::nonNull).findFirst().orElse(null);
                ArrayList<String> teams = new ArrayList<>();
                ArrayList<String> ownerAssignedByMe = new ArrayList<>();
                ArrayList<String> managersAssignedByMe = new ArrayList<>();

                for (Record r : result) {
                    teams.add(r.get(OWNER_TEAMS.TEAMID));
                    ownerAssignedByMe.add(r.get(OWNER_OWNER_ASSIGNINGS.ASSIGNEEID));
                    managersAssignedByMe.add(r.get(OWNER_MANAGER_ASSIGNINGS.TEAMMANAGERID));
                }

                objDetails.put("teams",teams);
                objDetails.put("ownerAssigned",ownerAssignedByMe);
                objDetails.put("managersAssigned",managersAssignedByMe);
                objDetails.put("eligible",new ArrayList<>());
                objDetails.get("eligible").add(eligible);
            }
            if (type.equalsIgnoreCase("admin")) {
                result = create.select().
                        from(ADMINS).where(ADMINS.ADMINID.eq(objectName)).fetch();
                boolean approved = result.get(0).get(ADMINS.APPROVED);

                objDetails.put("approved",new ArrayList<>());
                objDetails.get("approved").add(Boolean.toString(approved));

            }
            if (type.equalsIgnoreCase("ar")) {
                result = create.select().
                        from(ARS).where(ARS.AR_ID.eq(objectName)).fetch();
                boolean approved = result.get(0).get(ARS.APPROVED);

                objDetails.put("approved",new ArrayList<>());
                objDetails.get("approved").add(Boolean.toString(approved));
            }
            if (type.equalsIgnoreCase("referee")) {
                result = create.select().
                        from(REFEREES
                        .join(REFEREE_MATCHES).on(REFEREES.REFEREEID.eq(REFEREE_MATCHES.REFEREEID)))
                        .where(REFEREES.REFEREEID.eq(objectName)).fetch();
                String training = result.get(0).get(REFEREES.TRAINING).name();
                ArrayList<String> matches = new ArrayList<>();
                for(Record r: result){
                    matches.add(String.valueOf(r.get(REFEREE_MATCHES.MATCHID)));
                }

                objDetails.put("matches",matches);
                objDetails.put("training",new ArrayList<>());
                objDetails.get("training").add(training);
            }
            return objDetails;
        }
        return null;
    }

    /**
     * demo function to remove a subscriber from DB
     * @param objectName
     * @return
     */
    @Override
    public boolean removeFromDB(String objectName) {
        if(containInDB(objectName)){
            DSLContext create = DSL.using(connection, SQLDialect.MARIADB);
            create.delete(SUBSCRIBERS)
                    .where(SUBSCRIBERS.SUBSCRIBERID.eq(objectName)).execute();
            return true;
        }
        return false;
    }

    /**
     *function to add a subscriber to DB
     * @param username subscriber username
     * @param password subscriber password
     * @param name subscriber name
     * @param type subscriber type
     * @param objDetails userType details (player,coach etc...)
     * @return added successfully or not
     */
    @Override
    public boolean addToDb(String username,String password,String name,String type, Map<String,ArrayList<String>> objDetails) {
        //check if user in db already
        if(!containInDB(username)){
            //get subscriber from db
            DSLContext create = DSL.using(connection, SQLDialect.MARIADB);
            create.insertInto(SUBSCRIBERS
                    ,SUBSCRIBERS.SUBSCRIBERID
                    ,SUBSCRIBERS.PASSWORD
                    ,SUBSCRIBERS.NAME
                    ,SUBSCRIBERS.TYPE)
                    .values(username
                            ,String.valueOf(password.hashCode())
                            ,name
                            ,type)
                    .execute();
            //get player from db
            if (type.equalsIgnoreCase("player")) {

                create.insertInto(PLAYERS
                        ,PLAYERS.PLAYERID
                        ,PLAYERS.TEAMID
                        ,PLAYERS.FIELDJOB
                        ,PLAYERS.BIRTHDATE
                        ,PLAYERS.SALARY
                        ,PLAYERS.TEAMOWNERID_FICTIVE)
                        .values(username
                                ,objDetails.get("teamID").get(0)
                                ,PlayersFieldjob.valueOf(objDetails.get("fieldJob").get(0))
                                ,convertToDate(objDetails.get("birthDay").get(0))
                                ,Integer.parseInt(objDetails.get("salary").get(0))
                                ,objDetails.get("ownerFictive").get(0))
                        .execute();
                return true;
            }
            if (type.equalsIgnoreCase("coach")) {
                create.insertInto(COACHES
                        ,COACHES.COACHID
                        ,COACHES.TEAMID
                        ,COACHES.TRAINING
                        ,COACHES.SALARY
                        ,COACHES.TEAMOWNERID_FICTIVE)
                        .values(username
                                ,objDetails.get("teamID").get(0) //todo check if necessary
                                ,CoachesTraining.valueOf(objDetails.get("training").get(0))
                                ,Integer.parseInt(objDetails.get("salary").get(0))
                                ,objDetails.get("ownerFictive").get(0))
                        .execute();

                for (String str : objDetails.get("teams")) {
                    create.insertInto(COACH_TEAM
                                    ,COACH_TEAM.COACHID
                                    ,COACH_TEAM.TEAMID)
                    .values(username,str)
                    .execute();
                }
                return true;
            }
            if (type.equalsIgnoreCase("teammanger")) {
                create.insertInto(TEAMMANAGERS
                        ,TEAMMANAGERS.MANAGERID
                        ,TEAMMANAGERS.TEAMID
                        ,TEAMMANAGERS.PERMISSIONS
                        ,TEAMMANAGERS.SALARY
                        ,TEAMMANAGERS.TEAMOWNERID_FICTIVE)
                        .values(username
                                ,objDetails.get("teamID").get(0)
                                ,TeammanagersPermissions.valueOf(objDetails.get("permissions").get(0))
                                ,Integer.parseInt(objDetails.get("salary").get(0))
                                ,objDetails.get("ownerFictive").get(0))
                        .execute();
                return true;
            }
            if (type.equalsIgnoreCase("teamowner")) {
                create.insertInto(TEAMOWNER_OWNERELIGIBLE
                        ,TEAMOWNER_OWNERELIGIBLE.OWNERID
                        ,COACHES.TEAMID
                        ,COACHES.TRAINING
                        ,COACHES.SALARY
                        ,COACHES.TEAMOWNERID_FICTIVE)
                        .values(username
                                ,objDetails.get("teamID").get(0) //todo check if necessary
                                ,CoachesTraining.valueOf(objDetails.get("training").get(0))
                                ,Integer.parseInt(objDetails.get("salary").get(0))
                                ,objDetails.get("ownerFictive").get(0))
                        .execute();

                for (String str : objDetails.get("teams")) {
                    create.insertInto(OWNER_TEAMS
                            ,OWNER_TEAMS.OWNERID
                            ,OWNER_TEAMS.TEAMID)
                            .values(username,str)
                    .execute();
                }
                for (String str : objDetails.get("ownersAssigned")) {
                    create.insertInto(OWNER_OWNER_ASSIGNINGS
                            ,OWNER_OWNER_ASSIGNINGS.OWNERID
                            ,OWNER_OWNER_ASSIGNINGS.ASSIGNEEID)
                            .values(username,str)
                    .execute();
                    //TODO should we delete teamID from this table?
                }
                for (String str : objDetails.get("managersAssigned")) {
                    create.insertInto(OWNER_MANAGER_ASSIGNINGS
                            ,OWNER_MANAGER_ASSIGNINGS.OWNERID
                            ,OWNER_MANAGER_ASSIGNINGS.TEAMMANAGERID)
                            .values(username,str)
                    .execute();
                    //TODO should we delete teamID from this table?
                }
            }
            if (type.equalsIgnoreCase("admin")) {
                create.insertInto(ADMINS
                        ,ADMINS.ADMINID
                        ,ADMINS.APPROVED)
                        .values(username,
                                Boolean.valueOf(objDetails.get("approved").get(0)))
                .execute();
            }
            if (type.equalsIgnoreCase("ar")) {
                create.insertInto(ARS
                        ,ARS.AR_ID
                        ,ARS.APPROVED)
                        .values(username,
                                Boolean.valueOf(objDetails.get("approved").get(0)))
                        .execute();

            }
            if (type.equalsIgnoreCase("referee")) {
                create.insertInto(REFEREES
                        ,REFEREES.REFEREEID
                        ,REFEREES.TRAINING).
                        values(username, RefereesTraining.valueOf(objDetails.get("training").get(0)));

                for(String str: objDetails.get("matches")){
                    create.insertInto(REFEREE_MATCHES
                            ,REFEREE_MATCHES.REFEREEID
                            ,REFEREE_MATCHES.MATCHID).
                            values(username, Integer.parseInt(str));
                }
            }
            return true;
        }
        return false;
    }

    public boolean TerminateDB(String objectName) {
        try {
            connection.close();
        } catch (SQLException e) {
            System.out.println("error closing connection of DB");
            return false;
        }

        return true;
    }

    private LocalDate convertToDate(String date){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        //convert String to LocalDate
        LocalDate localDate = LocalDate.parse(date, formatter);
        return localDate;
    }
}
