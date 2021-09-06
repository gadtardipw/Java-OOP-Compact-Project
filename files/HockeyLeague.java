package files;
import java.util.ArrayList;

public class HockeyLeague {

    private String name;
    private ArrayList<Team> teams = new ArrayList<Team>();


    public HockeyLeague(String name, Team team1, Team team2, Team team3, Team team4) {
        this.name = name;
        this.teams.add(team1);
        this.teams.add(team2);
        this.teams.add(team3);
        this.teams.add(team4);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Team> getTeams() {
        return teams;
    }

    public void addTeam(Team team) {
        this.teams.add(team);
    }

    public void removeTeam(Team team) {
        int size = teams.size();
        if (size > 4) {
            if (this.teams.contains(team) == true) {
                teams.remove(team);
            }
            else {
                System.out.println("Team not in list!");
            }
        }
        else {
            System.out.println("There must be at least 4 teams in a league.");
        }
    }


    // HockeyLeague[name=?,teams=?]
    public String toString() {
        String teamLister = " ";
        for(Team t : teams) {
          teamLister += t.getName() + ", "; 
        }
        return "HockeyLeague[name=" + name + " teams=" + teamLister + "]";
    }

}
