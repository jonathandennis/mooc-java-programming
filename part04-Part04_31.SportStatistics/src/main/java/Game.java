/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jonathandennis
 */
public class Game {
    private String homeTeam;
    private int homeScore;
    private String visitTeam;
    private int visitScore;
    
    public Game(String homeTeam, int homeScore, String visitTeam, int visitScore) {
        this.homeTeam = homeTeam;
        this.homeScore = homeScore;
        this.visitTeam = visitTeam;
        this.visitScore = visitScore;
    }

    public String getHomeTeam() {
        return homeTeam;
    }
    
    public int getHomeScore() {
        return homeScore;
    }
    
    public String getVisitTeam() {
        return visitTeam;
    }
    
    public int getVisitScore() {
        return visitScore;
    }
    
    public boolean winnerIs(String team) {
        if (team.equals(homeTeam) && homeScore > visitScore) {
            return true;
        }
        
        if (team.equals(visitTeam) && visitScore > homeScore) {
            return true;
        }
        
        return false;
    }
    
    @Override
    public String toString() {
        return this.homeTeam + " " + this.homeScore + ", " + this.visitTeam + " " + this.visitScore;
    }
    
}
