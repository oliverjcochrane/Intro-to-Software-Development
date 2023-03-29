import java.util.Scanner;
import java.util.StringTokenizer;
import java.lang.Double;
/**
 * Write a description of class MathTeacher here.
 *
 * @author (Oliver Cochrane)
 * @version (3/29/23)
 */
public class MathTeacher
{
    private double correctAnswer;
    private String problem;
    private double userAnswer;
    private boolean redo = false;

    Scanner in = new Scanner(System.in);

    public void getProblem() {
        System.out.print("Please enter a problem (use spaces between nums and operator): ");
        problem = in.nextLine();
        
        getUserAnswer();

        computeAnswer(problem);
        
        System.out.println(displayResponse());
    }

    public double computeAnswer(String prob) {
        StringTokenizer st = new StringTokenizer(prob, " ");
        
        String token1 = st.nextToken();
        String token2 = st.nextToken();
        String token3 = st.nextToken();
        
        double num1 = Double.parseDouble(token1);
        double num2 = Double.parseDouble(token3);
        
        if (token2.equals("+"))
        {
            correctAnswer = num1 + num2;
        }
        else if (token2.equals("-"))
        {
            correctAnswer = num1 - num2;
        }
        else if (token2.equals("*"))
        {
            correctAnswer = num1 * num2;
        }
        else if (token2.equals("/"))
        {
            correctAnswer = num1 / num2;
        }
        else if (token2.equals("%"))
        {
            correctAnswer = num1 % num2;
        }
        
        return correctAnswer;
    }
    
    public void runCalculator() {
        getProblem(); 
        while (redo == true)
        {
           getUserAnswer();
           System.out.println(displayResponse());
        }
    }
    
    public void getUserAnswer() {
        System.out.print("Please enter your answer: "); 
        userAnswer = in.nextDouble();
    }
    
    public String displayResponse() {
        String message = "";
        if (userAnswer == correctAnswer)
        {
            message = "Excellent!";
            redo = false;
        }
        else
        {
            message = "Incorrect. Please try again.\n";
            redo = true;
        }
        
        return message;
    }
    
    public static void main(String[] args) {
        MathTeacher test = new MathTeacher();
        System.out.println("Welcome to the Arithmetic Quizzer!");
        test.runCalculator();
    }

}
