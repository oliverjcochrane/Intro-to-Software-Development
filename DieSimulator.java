//IMPORT RANDOM PACKAGE
import java.util.Random;
/**
 * Write a description of class E213 here.
 *
 * @author (Oliver Cochrane)
 * @version (1/20/23)
 */
public class DieSimulator
{
    public static void main(String[] args) {

        //CREATE NEW RANDOM OBJECT CALLED GENERATOR
        Random generator = new Random();
        
        //STORE RANDOM INT FROM 0-5 AS A VARIABLE
        int randomInt = generator.nextInt(6);
        
        //PRINT OUT THE RESULT WITH 1 ADDED SO NUMBER FALLS BETWEEN 1-6
        System.out.println("The dice rolls and lands on: " + (randomInt + 1));
        
        
    }
}
