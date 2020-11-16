
package ohtu;

public class Player {
    private String name;
    private String team;
    private String nationality;
    private int assists;
    private int goals;
    private String penalties;
    private String games;

    public void setName(String name) { this.name = name; }
    public void setTeam(String team) { this.team = team; }
    public void setNationality(String nationality) {this.nationality = nationality; }
    public void setAssists(int assists) { this.assists = assists; }
    public void setGoals(int goals) { this.goals = goals; }
    public void setPenalties(String penalties) { this.penalties = penalties; }
    public void setGames(String games) { this.games = games; }

    public String getName() { return name; }
    public String getTeam() { return team; }
    public String getNationality() { return  nationality; }
    public int getAssists() { return assists; }
    public int getGoals() { return goals; }
    public String getPenalties() { return penalties; }
    public String getGames() { return games; }


    @Override
    public String toString() {
        return name + "  " + team + "  " + goals + " + " + assists + " = " + (getAssists()+getGoals());
    }

}
