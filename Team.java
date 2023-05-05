import java.util.Arrays;
/**
 * Write a description of class Team here.
 *
 * @author (Oliver Cochrane)
 * @version (4/28/23)
 */
public class Team
{
    private Player[] team;
    private String headCoach;
    private String generalManager;
    private int numPlayers;
    
    public Team(String headCoach,String generalManager) {
        team = new Player[5];
        this.headCoach = headCoach;
        this.generalManager = generalManager;
        numPlayers = 0;
    }
    
    public void addPlayer(Player newPlayer) {
        for (int k = 0; k < numPlayers; k++)
        {
            if (team[k].getUniqueID().equals(newPlayer.getUniqueID()))
            {
                return;
            }
        }
        if (numPlayers == team.length)
        {
            team = Arrays.copyOf(team,team.length+5);
        }
        team[numPlayers] = newPlayer;
        numPlayers++;
    }
    
    public String printDetails() {
        String toReturn = "Head Coach: " + headCoach + "\n";
        toReturn = toReturn + "General Manager: " + generalManager + "\n";
        toReturn = toReturn + "Number of players: " + numPlayers + "\n";
        toReturn = toReturn + "----------------------------------" + "\n";
        
        for (int k = 0; k < numPlayers; k++)
        {
            System.out.println(team[k].toString());
        }
        return toReturn;
    }
}
