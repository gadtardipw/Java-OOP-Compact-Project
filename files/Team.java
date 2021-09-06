package files;
import java.util.ArrayList;

public class Team {
    
    private String name;
    private ArrayList<Player> players = new ArrayList<Player>();
    private Player captain;
    private ArrayList<Game> record = new ArrayList<Game>();
    private Coach coach;
    private int totalGamesPlayed;
    private int wins = 0;

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void addPlayer(Player player) {
        this.players.add(player);
    }

    public void removePlayer(Player player) {
        if (this.players.contains(player) == true) {
            players.remove(player);
        }
        else {
            System.out.println("Player not in list!");
        }
    }

    public Player getCaptain() {
        return captain;
    }

    public void setCaptain(Player player) {
        if (this.players.contains(player) == true) {
            this.captain = player;
        }
        else {
            System.out.println("Player not in team!");
        }
    }

    public Coach getCoach() {
        return coach;
    }

    public void setCoach(Coach coach) {
        this.coach = coach;
    }

    public ArrayList<Game> getRecord() {
        return record;
    }

    public void addToRecord(Game game) {
        this.record.add(game);
        if (game.getWinner() == this) {
            this.wins += 1;
        }
        this.totalGamesPlayed += 1;
    }

    public int getTotalGamesPlayed() {
        return totalGamesPlayed;
    }

    public int getWins() {
        return this.wins;
    }

    // Team[name=?,players=?,captain=?,coach=?]
    public String toString() {
        String playerLister = " ";
        for(Player p : players) {
          playerLister += p.getName() + ", "; 
        }
        return "Team[name=" + name + " players=" + playerLister + " captain=" + captain.getName() + " coach=" + coach.getName() + " games played=" + totalGamesPlayed + " wins=" + wins + "]";
    }

}
