package files;
import java.util.ArrayList;

public class Coach extends Person {

    private String accreditation;
    private int yearsOfExperience;
    private ArrayList<Team> teams = new ArrayList<Team>();

 
    public Coach(String name) {
        super(name);
    }

    public Coach(String name,Team team) {
        super(name);
        this.teams.add(team);
    }

    public Coach(String name, String accreditation, int yearsOfExperience) {
        super(name);
        this.accreditation = accreditation;
        this.yearsOfExperience = yearsOfExperience;
    }

    public ArrayList<Team> getTeams() {
        return teams;
    }

    
    public void addTeam(Team team) {
        this.teams.add(team);
    }

    public void removeTeam(Team team) {
        if (this.teams.contains(team) == true) {
            teams.remove(team);
        }
        else {
            System.out.println("Team not in list!");
        }
    }

    public String getAccreditation() {
        return accreditation;
    }

    public void setAccreditation(String accreditation) {
        this.accreditation = accreditation;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int years) {
        this.yearsOfExperience = years;
    }


    //TODO

    // Coach[Person[],accreditation=?,years of experience=?,currently coached teams=?]
    public String toString() {
        String teamLister = " ";
        for(Team t : teams) {
          teamLister += t.getName() + ", "; 
        }
        return "Coach[" + super.toString() + " accreditation=" + accreditation + " years of experience=" + yearsOfExperience + " currently coached teams=" + teamLister + "]";
    } 
    
}
