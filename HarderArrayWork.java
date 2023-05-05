import java.util.Random;
/**
 * Write a description of class HarderArrayWork here.
 *
 * @author (Oliver Cochrane)
 * @version (4/6/23)
 */
public class HarderArrayWork
{
    private int[] values = new int[10];

    public HarderArrayWork() {
        for (int k = 0; k < values.length; k++)
        {
            Random rand = new Random();
            values[k] = rand.nextInt(31);
        }
    }

    public void evenToFront() {
        int[] secondary = new int[10];
        int newIndex = 0;
        
        for (int k = 0; k < values.length; k++)
        {
            if (values[k] % 2 == 0)
            {
                secondary[newIndex] = values[k];
                newIndex++;
            }
        }
        
        for (int i = 0; i < values.length; i++)
        {
            if (values[i] % 2 != 0)
            {
                secondary[newIndex] = values[i];
                newIndex++;
            }
        }
        
        values = secondary;
    }
    
    public int secondLargest() {
        int largest = 0;
        int secondLargest = 0;
        
        if (values[0] > values[1])
        {
            largest = values[0];
            secondLargest = values[1];
        }
        else
        {
            largest = values[1];
            secondLargest = values[0];
        }
        
        for (int k = 2; k < values.length; k++)
        {
            if (values[k] > largest)
            {
                secondLargest = largest;
                largest = values[k];
            }
            else if (values[k] > secondLargest && values[k] < largest)
            {
                secondLargest = values[k];
            }
        }
        
        return secondLargest;
    }

    public void printArray() {
        for (int k = 0; k < values.length; k++)
        {
            if (k < values.length-1)
            {
                System.out.print(values[k] + ", ");
            }
            if (k == values.length-1)
            {
                System.out.print(values[k]);
            }
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {
        HarderArrayWork myArray = new HarderArrayWork();

        System.out.println("Starting Array:");
        myArray.printArray();

        myArray.evenToFront();
        System.out.println("After evenToFront:");
        myArray.printArray();
        
        System.out.print("Second Largest Value: " + myArray.secondLargest());

    }
}
