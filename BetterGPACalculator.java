import java.util.Scanner;
/**
 * Write a description of class BetterGPACalculator here.
 *
 * @author (Oliver Cochrane)
 * @version (1/25/23)
 */
public class BetterGPACalculator
{
    public static void main(String[] args) {

        //INITIALIZES SCANNER OBJECT TO READ INPUT FROM THE TERMINAL
        Scanner in = new Scanner(System.in);

        //CLASS ONE
        System.out.print("Enter the number of credits for class one: " );
        int creditsOne = in.nextInt();
        System.out.print("Enter the grade-point for class one: " );
        double gradePoint1 = in.nextDouble();

        //CLASS TWO
        System.out.print("Enter the number of credits for class two: " );
        int creditsTwo = in.nextInt();
        System.out.print("Enter the grade-point for class two: " );
        double gradePoint2 = in.nextDouble();

        //CLASS THREE
        System.out.print("Enter the number of credits for class three: " );
        int creditsThree = in.nextInt();
        System.out.print("Enter the grade-point for class three: " );
        double gradePoint3 = in.nextDouble();

        //CLASS FOUR
        System.out.print("Enter the number of credits for class four: " );
        int creditsFour = in.nextInt();
        System.out.print("Enter the grade-point for class four: " );
        double gradePoint4 = in.nextDouble();

        //CLASS FIVE
        System.out.print("Enter the number of credits for class five: " );
        int creditsFive = in.nextInt();
        System.out.print("Enter the grade-point for class five: " );
        double gradePoint5 = in.nextDouble();

        //SUM UP TOTAL CREDITS
        int totalCredits = (creditsOne + creditsTwo + creditsThree + creditsFour + creditsFive);

        //GPA CALCULATOR
        double gpa = ((creditsOne*gradePoint1)+(creditsTwo*gradePoint2)+(creditsThree*gradePoint3)+(creditsFour*gradePoint4)+(creditsFive*gradePoint5))/totalCredits;

        //FORMATTED AND PRINTED RESULT
        System.out.println();
        System.out.println("Your GPA is: " + gpa);

    }
}
