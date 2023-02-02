
/**
 * Write a description of class FootBallStats here.
 * 
 * @author Oliver Cochrane 
 * @version 1/25/23
 */

import java.util.Scanner;

public class QuaterbackStats
{   

    public static void main(String[] args){

        //INITIALIZES SCANNER OBJECT TO READ INPUT FROM THE TERMINAL
        Scanner in = new Scanner(System.in);

        //PROMPT FOR THE ATTEMPTED
        System.out.print("Enter the number of passes attempted: " );
        int attempts = in.nextInt();

        //ADD THE NECESSARY CODE TO PROMPT FOR AND 
        //SAVE THE NEEDED STATISTICS IN THE PROPER DATA TYPE
        //YOU SHOULD BE DOING TWO LINES FOR EVERY PIECE OF DATA
        //THE PROMPT AND THEN READING IN AND SAVING THE DATA

        //PROMPT FOR  COMPLETED
        System.out.print("Enter the number of passes completed: ");
        int passesCompleted = in.nextInt();

        //PROMPT FOR  YARDS
        System.out.print("Enter the number of passing yards: ");
        int passingYards = in.nextInt();

        //PROMPT FOR  TD PASSES
        System.out.print("Enter the number of passing touchdowns: ");
        int passingTouchdowns = in.nextInt();

        //PROMPT FOR THE INTERCEPTIONS
        System.out.print("Enter the number of interceptions: ");
        int interceptions = in.nextInt();

        //COMPUTE THE NCAA FORMULA
        double ncaaPasserRating = ((8.4*passingYards) + (330*passingTouchdowns) - (200*interceptions) + (100*passesCompleted))/attempts;

        //OUTPUT THE RESULTS WITH A NICE LINE LABEL
        System.out.println();
        System.out.println("The NCAA Passer Rating for this given \nperformance is: " + ncaaPasserRating);
    }
}
