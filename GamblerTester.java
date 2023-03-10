
/**
 * Write a description of class GamblerTester here.
 *
 * @author (Oliver Cochrane)
 * @version (3/8/23)
 */
public class GamblerTester
{
    public static void main(String[] args) {
        
        //CONSTRUCT GAMBLER
        Gambler gambler = new Gambler(100);
        System.out.println("Your starting balance is $" + gambler.getBalance() + " – Good Luck!\n");
        
        //SPIN 5 TIMES
        gambler.spin();
        System.out.println(gambler.printSpin());
        System.out.println(gambler.winOrLose());
        
        gambler.spin();
        System.out.println(gambler.printSpin());
        System.out.println(gambler.winOrLose());
        
        gambler.spin();
        System.out.println(gambler.printSpin());
        System.out.println(gambler.winOrLose());
        
        gambler.spin();
        System.out.println(gambler.printSpin());
        System.out.println(gambler.winOrLose());
        
        gambler.spin();
        System.out.println(gambler.printSpin());
        System.out.println(gambler.winOrLose());
    }
}
