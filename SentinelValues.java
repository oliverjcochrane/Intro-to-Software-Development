import java.util.Scanner;
/**
 * Accepts user-inputted doubles, then returns the smallest, largest, range, and average of the nums.
 *
 * @author (Oliver Cochrane)
 * @version (3/16/23)
 */
public class SentinelValues
{
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter a value, or Q to quit: ");
        double input = in.nextDouble();
        double total = input;
        int n = 1;
        double average = 0;
        double smallest = input;
        double largest = input;
        
        while(in.hasNextDouble())
        {
            input = in.nextDouble();
            
            //AVERAGE
            total = total + input;
            n++;
            
            //SMALLEST NUM
            if (input < smallest) {smallest = input;}
            
            //LARGEST NUM
            if (input > largest) {largest = input;}
        }
        //COMPUTE RANGE AND AVERAGE
        double range = largest - smallest;
        average = total/n;
        
        //PRINT RESULTS
        System.out.println("Smallest value: " + smallest);
        System.out.println("Largest value: " + largest);
        System.out.println("Range: " + range);
        System.out.println("Average: " + average);
    }
}
