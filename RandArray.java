import java.util.Random;
/**
 * Write a description of class E71 here.
 *
 * @author (Oliver Cochrane)
 * @version (3/30/23)
 */
public class RandArray
{
    private int[] array = new int[10];

    Random rand = new Random();

    public RandArray() {
        for (int k = 0; k < array.length; k++)
        {
            array[k] = rand.nextInt(10); 
        }
    }
    
    public void printFullArray() {
        System.out.println("Full Array:");
        for (int k = 0; k < array.length; k++)
        {
            System.out.println(array[k]);
        }
        System.out.println();
    }

    public void printEvenIndex() {
        System.out.println("All elements at even index positions:");
        for (int k = 0; k < array.length; k = k + 2)
        {
            System.out.println(array[k]);
        }
        System.out.println();
    }

    public void printEvenElements() {
        System.out.println("All even elements:");
        for (int k = 0; k < array.length; k++)
        {
            if (array[k] % 2 == 0)
            {
                System.out.println(array[k]);
            }
        }
        System.out.println();
    }
    
    public void printReverse() {
        System.out.println("All elements in reverse order:");
        for (int k = array.length - 1; k >= 0; k--)
        {
            System.out.println(array[k]);
        }
        System.out.println();
    }
    
    public void printFirstLast() {
        System.out.println("First and last elements:");
        for (int k = 0; k < array.length; k++)
        {
            if (k == 0 || k == array.length-1)
            {
                System.out.println(array[k]);
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        //NEW RANDOM ARRAY OBJECT
        RandArray myArray = new RandArray();
        
        //PRINT FULL ARRAY
        myArray.printFullArray();

        //PRINT EVERY ELEMENT AT AN EVEN INDEX
        myArray.printEvenIndex();

        //PRINT EVERY EVEN ELEMENT
        myArray.printEvenElements();
        
        //PRINT ALL ELEMENTS IN REVERSE ORDER
        myArray.printReverse();
        
        //PRINT ONLY THE FIRST AND LAST ELEMENTS
        myArray.printFirstLast();
    }
}
