
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("File:");
        String file = scan.nextLine();
        
        ArrayList<Game> games = readFromFile(file);
        System.out.println("Team:");
        String team = scan.nextLine();
        
        //count only the matches of specified team
        ArrayList<Game> gamesOfATeam = new ArrayList<>();
 
        for (Game game : games) {           
            if (team.equals(game.getHomeTeam()) || team.equals(game.getVisitTeam())) {
                gamesOfATeam.add(game);
            }
        }
        
        // Print number of games
        System.out.println("Games: " + gamesOfATeam.size());
        
        
        // Count the number of wins
        int wins = 0;
        for (Game game : gamesOfATeam) {
            if (game.winnerIs(team)) {
                wins++;
            }
        }
        System.out.println("Wins: " + wins);   
        System.out.println("Losses: " + (gamesOfATeam.size() - wins));  
    }
    
    public static ArrayList<Game> readFromFile(String file) {
        ArrayList<Game> games = new ArrayList<>();
        
        try (Scanner scanFile = new Scanner(Paths.get(file))) {
            while (scanFile.hasNextLine()) {
                String line = scanFile.nextLine();
                
                String[] parts = line.split(",");
                String homeTeam = parts[0];
                int homeScore = Integer.valueOf(parts[2]);
                String visitTeam = parts[1];
                int visitScore = Integer.valueOf(parts[3]);
                
                games.add(new Game(homeTeam, homeScore, visitTeam, visitScore));
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return games;
    }
}
