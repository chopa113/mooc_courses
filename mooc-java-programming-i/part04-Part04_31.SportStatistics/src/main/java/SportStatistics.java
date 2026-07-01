import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Team> teams = new ArrayList<>();

        System.out.println("File:");
        String file = scan.nextLine();

        try (Scanner scanner = new Scanner(Paths.get(file))) {

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(",");

                String teamAName = parts[0];
                String teamBName = parts[1];
                int scoreA = Integer.parseInt(parts[2]);
                int scoreB = Integer.parseInt(parts[3]);

                Team teamA = findOrCreate(teams, teamAName);
                Team teamB = findOrCreate(teams, teamBName);

                teamA.addGame();
                teamB.addGame();

                if (scoreA > scoreB) {
                    teamA.addWin();
                    teamB.addLoss();
                } else {
                    teamB.addWin();
                    teamA.addLoss();
                }
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Name:");
        String name = scan.nextLine();

        int games = 0;
        int wins = 0;
        int losses = 0;

        for (Team t : teams) {
            if (t.getName().equals(name)) {
                games += t.getGames();
                wins += t.getWins();
                losses += t.getLosses();
            }
        }

        System.out.println("Games: " + games);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
    }

    // 🔥 helper method – klucz do poprawnego działania
    public static Team findOrCreate(ArrayList<Team> teams, String name) {
        for (Team t : teams) {
            if (t.getName().equals(name)) {
                return t;
            }
        }

        Team newTeam = new Team(name);
        teams.add(newTeam);
        return newTeam;
    }
}