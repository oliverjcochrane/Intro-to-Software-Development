import java.util.Random;
import java.util.ArrayList;
/**
 * Write a description of class ArrayListMethods here.
 *
 * @author (Oliver Cochrane)
 * @version (4/25/23)
 */
public class ArrayListWork
{
    private ArrayList<Integer> arrList;

    Random rand = new Random();

    public ArrayListWork() {
        for (int k = 0; k < 10; k++)
        {
            arrList.add(k,rand.nextInt(21));
        }
    }
    
    public void printFullArray() {
        System.out.println("Full Array:");
        System.out.println(arrList);
        System.out.println();
    }

    public void printEvenIndex() {
        System.out.println("All elements at even index positions:");
        for (int k = 0; k < arrList.size(); k = k + 2)
        {
            System.out.println(arrList.get(k));
        }
        System.out.println();
    }

    public void printEvenElements() {
        System.out.println("All even elements:");
        for (int k = 0; k < arrList.size(); k++)
        {
            if (arrList.get(k) % 2 == 0)
            {
                System.out.println(arrList.get(k));
            }
        }
        System.out.println();
    }
    
    public void printReverse() {
        System.out.println("All elements in reverse order:");
        for (int k = arrList.size() - 1; k >= 0; k--)
        {
            System.out.println(arrList.get(k));
        }
        System.out.println();
    }
    
    public void printFirstLast() {
        System.out.println("First and last elements:");
        for (int k = 0; k < arrList.size(); k++)
        {
            if (k == 0 || k == arrList.size()-1)
            {
                System.out.println(arrList.get(k));
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        //NEW RANDOM ARRAY OBJECT
        ArrayListWork myArray = new ArrayListWork();
        
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
