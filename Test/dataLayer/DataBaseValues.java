package dataLayer;

import businessLayer.Team.Team;
import businessLayer.Tournament.*;
import businessLayer.Tournament.Match.Match;
import businessLayer.Tournament.Match.MatchController;
import businessLayer.Tournament.Match.Stadium;
import businessLayer.userTypes.Administration.*;
import businessLayer.userTypes.SystemController;
import dataLayer.DemoDB;

import java.util.Date;
import java.util.HashMap;

public class DataBaseValues {

    //static public DemoDB db;

    static DemoDB DB;

    static Team ManchesterUnited;
    static Team ManchersterCity;
    static Team NewCastle;
    static Team Tottenham;
    static Team AstonVilla;
    static Team Liverpool;
    static Team Wolves;
    static Team Everton;
    static Team Watford;
    static Team Southhampton;
    static Team Arsenal;
    static Team Chelsea;
    static Team BeerSheva;
    static Team Natanya;
    static Team Bnei_Yehuda;
    static Team LeedsUnited;
    static Team Sunderland;
    static Team MacabiHaifa;


    static TeamOwner teamOwner;
    static TeamOwner Barkat;
    static TeamOwner Shimon;
    static TeamOwner Glazers;
    static TeamOwner Nissanov;


    static TeamManager itay;

    static Referee Alon;

    static Player Buzaglo;

    static Coach tomer;
    static Coach Ido;


    static League primerLeague;
    static Season currSeason;
    static SystemController systemController;
    static Date startDate;
    static Date endDate;
    static HashMap <Integer,Team> teams;
    static SingleMatchPolicy singleMatchPolicy;
    static ClassicMatchPolicy classicMatchPolicy;
    static LeagueController leagueController;

    static Stadium s1;
    static Stadium s2;
    static Stadium s3;
    static Stadium s4;
    static Stadium s5;
    static Stadium s6;
    static Stadium s7;
    static Stadium s8;
    static Stadium s9;
    static Stadium samiOfer;

    static HashMap <Integer, Match> singleMatchTable;
    static HashMap <Integer, Match> classicTable;
    static MatchController matchController;
    private TeamOwner Jacob;


    public DataBaseValues(){
        DB = new DemoDB();

        systemController = SystemController.SystemController();
        leagueController = new LeagueController();
        matchController = new MatchController(systemController);


        s1 = new Stadium("s1",200);
        s2 = new Stadium("s2",300);
        s3 = new Stadium("s3",400);
        s4 = new Stadium("s4",600);
        s5 = new Stadium("s5",700);
        s6 = new Stadium("s6",800);
        s7 = new Stadium("s7",900);
        s8 = new Stadium("s8",1000);
        s9 = new Stadium("Default",500);
        samiOfer = new Stadium("samiOfer",null,null,30000,null);


        DB.addStadiumToDB("samiOfer",samiOfer);
        DB.addStadiumToDB("s1",s1);
        DB.addStadiumToDB("s2",s2);
        DB.addStadiumToDB("s3",s3);
        DB.addStadiumToDB("s4",s4);
        DB.addStadiumToDB("s5",s5);
        DB.addStadiumToDB("s6",s6);
        DB.addStadiumToDB("s7",s7);
        DB.addStadiumToDB("s8",s8);
        DB.addStadiumToDB("Default",s9);



        //add team owners
        teamOwner = new TeamOwner("Tomer","helloWorld","tomer",systemController);
        Barkat = new TeamOwner("AlonaBarkat", "beerSheva","alona",systemController);
        Shimon = new TeamOwner("Shimon", "beerSheva", "alona", systemController);
        Glazers = new TeamOwner("Glazers", "manchesterU", "glazer", systemController);
        Nissanov = new TeamOwner("Nissanov", "telAviv", "nissanov", systemController);
        Jacob = new TeamOwner("JacobS", "JacobS123", "Jacob", systemController);



        DB.addSubscriberToDB("Tomer",teamOwner);
        DB.addSubscriberToDB("AlonaBarkat",Barkat);
        DB.addSubscriberToDB("Shimon",Shimon);
        DB.addSubscriberToDB("Glazers",Glazers);
        DB.addSubscriberToDB("Nissanov",Nissanov);
        DB.addSubscriberToDB("JacobS",Jacob);

        //add player
        Buzaglo = new Player("Buzaglo", "Buzaglo123", "Buzaglo", "1900", "midfield",0, null, systemController);

        DB.addSubscriberToDB("Buzaglo",Buzaglo);

        //add referee
        Alon = new Referee("Alon","Alon123456","Alon","main",null,systemController,matchController);
        DB.addSubscriberToDB("Alon",Alon);

        //add coach
        //6.1
        Ido = new Coach("efronio", "111", "ido", "attack", "mainCoach",0, systemController);
        tomer = new Coach("TomerZ", "111", "tomer", "defence", "subCoach",0, systemController);
        DB.addSubscriberToDB("efronio",Ido);
        DB.addSubscriberToDB("TomerZ",Ido);

        //add team manager
        itay = new TeamManager("itayK", "111", "itay",BeerSheva ,100, systemController);
        DB.addSubscriberToDB("itayK",itay);





        //add teams
        ManchesterUnited = new Team("ManchesterUnited",teamOwner,1888);
        ManchesterUnited.setStadium(s8);
        ManchersterCity = new Team("ManchesterCity",teamOwner,1888);
        NewCastle = new Team ("NewCastle", teamOwner,1888);
        NewCastle.setStadium(s2);
        Tottenham = new Team ("Tottenham", teamOwner,1888);
        Tottenham.setStadium(s3);
        AstonVilla = new Team ("AstonVilla", teamOwner,1888);
        AstonVilla.setStadium(s4);
        Liverpool = new Team ("Liverpool", teamOwner,1888);
        Liverpool.setStadium(s5);
        Wolves = new Team ("Wolves", teamOwner,1888);
        Wolves.setStadium(s6);
        Everton = new Team ("Everton", teamOwner,1888);
        Everton.setStadium(s7);
        Watford = new Team ("Watford", teamOwner,1888);
        Southhampton = new Team ("Southhampton", teamOwner,1888);
        Arsenal = new Team ("Arsenal", teamOwner,1888);
        Chelsea = new Team ("Chelsea", teamOwner,1888);
        Chelsea.setStadium(s1);
        BeerSheva = new Team("Beer Sheva", Barkat,1973);
        Natanya = new Team("Natanya", Shimon, 1973);
        Bnei_Yehuda = new Team("Bnei Yehuda", Shimon, 1899);
        MacabiHaifa = new Team("McabiHaifa", Jacob, 1913);

        //setters for teams
        BeerSheva.setTeamId(123); //todo delete and change this fields
        ManchesterUnited.setTeamId(456);
        MacabiHaifa.setTeamId(789);

        //setter team-owners and teams
        Jacob.getTeams().add(MacabiHaifa);
        MacabiHaifa.getTeamOwners().add(Jacob);
        Barkat.getTeams().add(BeerSheva);
        Barkat.getTeams().add(ManchesterUnited);
        Glazers.getTeams().add(ManchesterUnited);
        ManchesterUnited.getTeamOwners().add(Barkat);
        ManchesterUnited.getTeamOwners().add(Glazers);
        BeerSheva.getTeamOwners().add(Barkat);
        BeerSheva.getTeamOwners().add(Nissanov);

        //teams
        DB.addTeamToDB("ManchesterUnited",ManchesterUnited);
        DB.addTeamToDB("ManchesterCity",ManchersterCity);
        DB.addTeamToDB("NewCastle",NewCastle);
        DB.addTeamToDB("Tottenham",Tottenham);
        DB.addTeamToDB("AstonVilla",AstonVilla);
        DB.addTeamToDB("Liverpool",Liverpool);
        DB.addTeamToDB("Wolves",Wolves);
        DB.addTeamToDB("Everton",Everton);
        DB.addTeamToDB("Watford",Watford);
        DB.addTeamToDB("Southhampton",Southhampton);
        DB.addTeamToDB("Arsenal",Arsenal);
        DB.addTeamToDB("Chelsea",Chelsea);
        DB.addTeamToDB("Natanya",Natanya);
        DB.addTeamToDB("Bnei Yehuda",Bnei_Yehuda);
        DB.addTeamToDB("McabiHaifa",MacabiHaifa);

        systemController.connectToDB(DB);
    }

    /**
     * getter for a ready DB
     * @return
     */
    public DemoDB getDB (){
        return DB;
    }

}
