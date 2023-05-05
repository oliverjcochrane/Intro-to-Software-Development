
/**
 * Write a description of class TeamTester here.
 *
 * @author (Oliver Cochrane)
 * @version (4/28/23)
 */
public class TeamTester
{
    public static void main(String[] args) {
        //CREATE TEAM AND ADD PLAYER
        Team teamOne = new Team("John Doe","Mike Jackson");
        Player player1 = new Player(24,72,160,true,"abc");
        teamOne.addPlayer(player1);
        
        System.out.println(teamOne.printDetails());
        
        //TRY ADDING ANOTHER PLAYER OF SAME ID
        Player player2 = new Player(11,65,155,true,"abc");
        teamOne.addPlayer(player2);
        
        System.out.println(teamOne.printDetails());
        
        //ADD 5 MORE
        Player player3 = new Player(20,70,180,true,"abcd");
        teamOne.addPlayer(player3);
        
        Player player4 = new Player(18,66,165,false,"abcde");
        teamOne.addPlayer(player4);
        
        Player player5 = new Player(5,78,225,true,"abcdef");
        teamOne.addPlayer(player5);
        
        Player player6 = new Player(57,74,213,true,"abcdefg");
        teamOne.addPlayer(player6);
        
        Player player7 = new Player(10,62,150,false,"abcdefgh");
        teamOne.addPlayer(player7);
        
        //FINAL PRINT
        System.out.println(teamOne.printDetails());
    }
}
