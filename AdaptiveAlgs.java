import java.util.Random;
/**
 * Write a description of class AdaptiveAlgs here.
 *
 * @author (Oliver Cochrane)
 * @version (4/14/23)
 */
public class AdaptiveAlgs
{
    public boolean checkArrays(int[] a, int[] b) {
        boolean check = false;
        for (int i = 0; i < a.length; i++)
        {
            for (int k = 0; k < b.length; k++)
            {
                check = false;
                if (a[i] == b[k])
                {
                    check = true;
                    break;
                }
            }
            if (check == false)
            {
                return false;
            }
        }
        
        for (int i = 0; i < b.length; i++)
        {
            for (int k = 0; k < a.length; k++)
            {
                check = false;
                if (a[k] == b[i])
                {
                    check = true;
                    break;
                }
            }
            if (check == false)
            {
                return false;
            }
        }
        return true;
    }

    public void printArray(int[] arrayToPrint) {
        for (int k = 0; k < arrayToPrint.length; k++)
        {
            if (k < arrayToPrint.length-1)
            {
                System.out.print(arrayToPrint[k] + ", ");
            }
            if (k == arrayToPrint.length-1)
            {
                System.out.print(arrayToPrint[k]);
            }
        }
        System.out.println();
    }

    public void runTest() {
        //NEW RANDOM OBJECT
        Random rand = new Random();

        //CREATE ARRAYS
        int[] arr1 = new int[6];
        int[] arr2 = new int[4];

        //FILL ARRAY 1
        for (int k = 0; k < arr1.length; k++)
        {
            arr1[k] = rand.nextInt(4);
        }

        //FILL ARRAY 2
        for (int k = 0; k < arr2.length; k++)
        {
            arr2[k] = rand.nextInt(4);
        }

        //PRINT BOTH ARRAYS
        System.out.print("Array 1: ");
        printArray(arr1);

        System.out.print("Array 2: ");
        printArray(arr2);

        //CHECK ARRAYS
        System.out.print("Do arrays contain same unique values?: ");
        System.out.println(checkArrays(arr1,arr2) + "\n");
    }

    public static void main(String[] args) {
        AdaptiveAlgs adapt = new AdaptiveAlgs();

        for (int k = 1; k <= 10; k++)
        {
            adapt.runTest();
        }
    }
}
