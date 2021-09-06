package files;

public class Tester {
    public static void main(String[] args) {

        
        //new team t1
        //new player p1
        //new player p2
        //new coach c1

        Team t1 = new Team("binusian 2023");
        Player p1 = new Player("Gadtardi");
        Player p2 = new Player("David", 2, "goalie");
        Coach c1 = new Coach("Bambang");

        //asign p1 to t1
        t1.addPlayer(p1);
        //assign p2 to t1
        t1.addPlayer(p2);

        //assign c1 to t1
        t1.setCoach(c1);
        //assign t1 to c1
        c1.addTeam(t1);
        //assign p1 captain of t1
        t1.setCaptain(p2);
        //tostring p1
        System.out.println("toString p1=" + p1.toString());
        //tostring t1
        System.out.println("toString t1=" + t1.toString());
        //tostring c1
        System.out.println("toString c1=" + c1.toString());
        

        //new team t2
        Team t2 = new Team("Gladiators");
        //new player p3
        Player p3 = new Player("Mika");
        //new player p4
        Player p4 = new Player("Adrian");
        //new coach c2
        Coach c2 = new Coach("Totok", "NHL", 7);

        //attempt to delete nonexistent player p4 from t1
        t1.removePlayer(p4);

        //assign p3 to t2
        t2.addPlayer(p3);
        //assign p4 to t2
        t2.addPlayer(p4);
        //assign t2 to c2
        c2.addTeam(t2);

        //new team t3
        Team t3 = new Team("Rangers");
        //new player p5
        Player p5 = new Player("Christo");
        //new player p6
        Player p6 = new Player("Arvin");
        //ad t3 to c2 (1 coach many teams)
        c2.addTeam(t3);
        //toString c2
        System.out.println("toString c2=" + c2.toString());


        //new team t4
        Team t4 = new Team("Terminators");
      

        //new hockeyleague h1 with t1,t2,t3,t4
        HockeyLeague h1 = new HockeyLeague("Jakarta Hockey League", t1, t2, t3, t4);

        //tostring h1
        System.out.println("tostring h1=" + h1.toString());
        //attempt to remove a team from h1 so less than 4 teams
        h1.removeTeam(t1);

        //new game g1 t1 vs t2. t1 win constructor pregame
        Game g1 = new Game("bintaro01", "2021", "09", "01", "12", "30", "Bintaro", t1, t2);
        // set t1 as winner of g1
        g1.setWinner(t1);

        //new game g2 t1 vs t3, t1 win constructor post game
        Game g2 = new Game("bintaro02", "2021", "10", "01", "12", "30", "Bintaro", t1, t3, t1, 20, 10);
        //tostring g2
        System.out.println("toString g1=" + g2.toString());

        //add g1 to t1 record
        t1.addToRecord(g1);
        //add g2 to t1 record
        t1.addToRecord(g2);

        //tostring t1
        System.out.println("toString t1=" + t1.toString());




    }
    
}
