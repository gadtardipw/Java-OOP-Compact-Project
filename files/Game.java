package files;
import java.util.ArrayList;
import java.time.*;

public class Game {

    private String id;
    private LocalDateTime gameDateTime;
    private String location;
    private ArrayList<Team> teams = new ArrayList<Team>();
    private Team winner;
    private int winnerScore;
    private int loserScore;


    public Game(String id, String year, String month, String day, String hour, String minute, String location, Team team1, Team team2) {
        this.id = id;
        String dateString = year + "-" + month + "-" + day;
        LocalDate datePart = LocalDate.parse(dateString);
        String timeString = hour + ":" + minute;
        LocalTime timePart = LocalTime.parse(timeString);
        LocalDateTime dt = LocalDateTime.of(datePart, timePart);
        this.gameDateTime = dt;
        this.location = location;
        this.teams.add(team1);
        this.teams.add(team2);
    }

    public Game(String id, String year, String month, String day, String hour, String minute, String location, Team team1, Team team2, Team winner, int winnerScore, int loserScore) {
        this.id = id;
        String dateString = year + "-" + month + "-" + day;
        LocalDate datePart = LocalDate.parse(dateString);
        String timeString = hour + ":" + minute;
        LocalTime timePart = LocalTime.parse(timeString);
        LocalDateTime dt = LocalDateTime.of(datePart, timePart);
        this.gameDateTime = dt;
        this.location = location;
        this.teams.add(team1);
        this.teams.add(team2);
        this.winner = winner;
        this.winnerScore = winnerScore;
        this.loserScore = loserScore;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDateTime getGameDateTime() {
        return gameDateTime;
    }

    public void setGameDateTime(String id, String year, String month, String day, String hour, String minute) {
        String dateString = year + "-" + month + "-" + day;
        LocalDate datePart = LocalDate.parse(dateString);
        String timeString = hour + ":" + minute;
        LocalTime timePart = LocalTime.parse(timeString);
        LocalDateTime dt = LocalDateTime.of(datePart, timePart);
        this.gameDateTime = dt;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public ArrayList<Team> getTeams() {
        return teams;
    }

    public void setTeams(Team team1, Team team2) {
        teams.clear();
        this.teams.add(team1);
        this.teams.add(team2);
    }

    public Team getWinner() {
        return winner;
    }

    public void setWinner(Team winner) {
        if (this.teams.contains(winner) == true) {
            this.winner = winner;
        }
        else {
            System.out.println("Team not in list!");
        }
    }
    
    public int getWinnerScore() {
        return winnerScore;
    }

    public void setWinnerScore(int score) {
        this.winnerScore = score;
    }

    public int getLoserScore() {
        return loserScore;
    }

    public void setLoserScore(int score) {
        this.loserScore = score;
    }

    // Game[id=?,date and time=?, location=?, teams=?, winner=?, winner score=?, loser score=?]
    public String toString() {
        String teamLister = " ";
            for(Team t : teams) {
              teamLister += t.getName() + ", "; 
            }
        return "Game[id=" + id + " date and time=" + gameDateTime.toString() + " location=" + location + "  teams=" + teamLister + "  winner=" + winner.getName() + " winner score=" + winnerScore + " loser score=" + loserScore + "]";
    }





}