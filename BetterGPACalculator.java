import java.util.Scanner;
/**
 * Improved version of a GPA calculator that converts user-input letter grades to numeric doubles.
 *
 * @author (Oliver Cochrane)
 * @version (2/25/23)
 */
public class BetterGPACalculator
{
    private double creditsOne;
    private double creditsTwo;
    private double creditsThree;
    private double creditsFour;
    private double creditsFive;
    
    private double gradeValueOne;
    private double gradeValueTwo;
    private double gradeValueThree;
    private double gradeValueFour;
    private double gradeValueFive;
    
    Scanner in = new Scanner(System.in);
    
    public void getData() {
        System.out.print("Enter the number of credits for Class 1: ");
        creditsOne = in.nextDouble();
        System.out.print("Enter the letter grade for Class 1: ");
        String letter1 = in.next();
        gradeValueOne = convertLetter(letter1);
        System.out.println();
        
        System.out.print("Enter the number of credits for Class 2: ");
        creditsTwo = in.nextDouble();
        System.out.print("Enter the letter grade for Class 2: ");
        String letter2 = in.next();
        gradeValueTwo = convertLetter(letter2);
        System.out.println();
        
        System.out.print("Enter the number of credits for Class 3: ");
        creditsThree = in.nextDouble();
        System.out.print("Enter the letter grade for Class 3: ");
        String letter3 = in.next();
        gradeValueThree = convertLetter(letter3);
        System.out.println();
        
        System.out.print("Enter the number of credits for Class 4: ");
        creditsFour = in.nextDouble();
        System.out.print("Enter the letter grade for Class 4: ");
        String letter4 = in.next();
        gradeValueFour = convertLetter(letter4);
        System.out.println();
        
        System.out.print("Enter the number of credits for Class 5: ");
        creditsFive = in.nextDouble();
        System.out.print("Enter the letter grade for Class 5: ");
        String letter5 = in.next();
        gradeValueFive = convertLetter(letter5);
        System.out.println();
    }
    
    public double convertLetter(String letterGrade) {
        double gradeValue = 0.0;
        if (letterGrade.equals("A"))
        {
            gradeValue = 4.0;
        }
        else if (letterGrade.equals("A-"))
        {
            gradeValue = 3.7;
        }
        else if (letterGrade.equals("B+"))
        {
            gradeValue = 3.3;
        }
        else if (letterGrade.equals("B"))
        {
            gradeValue = 3.0;
        }
        else if (letterGrade.equals("B-"))
        {
            gradeValue = 2.7;
        }
        else if (letterGrade.equals("C+"))
        {
            gradeValue = 2.3;
        }
        else if (letterGrade.equals("C"))
        {
            gradeValue = 2.0;
        }
        else if (letterGrade.equals("C-"))
        {
            gradeValue = 1.7;
        }
        else if (letterGrade.equals("D+"))
        {
            gradeValue = 1.3;
        }
        else if (letterGrade.equals("D"))
        {
            gradeValue = 1.0;
        }
        else if (letterGrade.equals("D-"))
        {
            gradeValue = 0.7;
        }
        else if (letterGrade.equals("F"))
        {
            gradeValue = 0.0;
        }
        else 
        {
            System.out.println("Error: invalid letter grade");
        }
        return gradeValue;
    }
    
    public double computeGPA() {
        double totalCredits = creditsOne+creditsTwo+creditsThree+creditsFour+creditsFive;
        double gpa = ((creditsOne*gradeValueOne)+(creditsTwo*gradeValueTwo)+(creditsThree*gradeValueThree)+(creditsFour*gradeValueFour)+(creditsFive*gradeValueFive))/totalCredits;
        return gpa;
    }
    
    public static void main(String[] args) {
        //CREATE NEW GPA CALCULATOR OBJECT
        BetterGPACalculator student = new BetterGPACalculator();
        
        //GET CLASS DATA FOR COMPUTATIONS
        student.getData();
        
        //COMPUTE GPA
        double studentGPA = student.computeGPA();
        
        //PRINT RESULTS WITH LABEL
        System.out.print("Your GPA is: ");
        System.out.printf("%.2f",studentGPA);
    }
}
