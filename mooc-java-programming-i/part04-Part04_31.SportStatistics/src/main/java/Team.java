public class Team {

    private String name;
    private int games;
    private int wins;
    private int losses;

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int getGames() {
        return this.games;
    }

    public int getWins() {
        return this.wins;
    }

    public int getLosses() {
        return this.losses;
    }

    public void addGame() {
        this.games++;
    }

    public void addWin() {
        this.wins++;
    }

    public void addLoss() {
        this.losses++;
    }
}