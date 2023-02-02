import java.util.Scanner;
/**
 * Write a description of class CreditPlanner here.
 *
 * @author (Oliver Cochrane)
 * @version (1/25/23)
 */
public class CreditPlanner
{
    public static void main(String[] args) {

        //INITIALIZES SCANNER OBJECT TO READ INPUT FROM THE TERMINAL
        Scanner in = new Scanner(System.in);

        //STORE ACCUMULATED CREDITS
        System.out.print("Enter your total earned credits: ");
        int creditsAccumulated = in.nextInt();

        //STORE CREDITS NEEDED TO GRADUATE
        System.out.print("Enter your total credits needed to graduate: ");
        int creditsToGrad = in.nextInt();

        //STORE NUMBER OF REMAINING SEMESTERS TO GRADUATE ON TIME
        System.out.print("Enter how many semester you have left \nto graduate on-time: ");
        int semestersRemaining = in.nextInt();

        //FIND CREDITS REMAINING
        int creditsRemaining = creditsToGrad - creditsAccumulated;

        //SPREAD OUT REMAINING CREDITS EVENLY OVER REMAINING SEMESTERS
        double creditsPerSemester = (double) creditsRemaining/semestersRemaining;

        //FORMATTED PRINT STATEMENT
        System.out.println();
        System.out.println("You must take " + creditsPerSemester + " credits to graduate on-time.");

    }
}
