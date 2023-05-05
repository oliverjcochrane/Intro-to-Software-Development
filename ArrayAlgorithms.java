import java.util.Arrays;
/**
 * Write a description of class ArrayAlgorithms here.
 *
 * @author (Oliver Cochrane)
 * @version (4/26/23)
 */
public class ArrayAlgorithms
{
    private String[] values;
    private int currentSize;

    public ArrayAlgorithms() {
        values = new String[10];
        values[0] = "This";
        values[1] = "is";
        values[2] = "the";
        values[3] = "very";
        values[4] = "last";
        values[5] = "lab";
        values[6] = ".";
        
        currentSize = 7;
    }

    public void insertItem(String toInsert, int index) {
        if (values.length == currentSize)
        {
            values = Arrays.copyOf(values, 2*values.length);
        }
        currentSize++;
        for (int k = currentSize - 1; k > index; k--)
        {
            values[k] = values[k - 1];
        }
        values[index] = toInsert;
    }
    
    public void removeItem(int index) {
        for (int k = index + 1; k < currentSize; k++)
        {
            values[k - 1] = values[k];
        }
        currentSize--;
    }

    public void printArray() {
        for (int k = 0; k < currentSize; k++)
        {
            System.out.print(values[k] + " ");
        }
        System.out.println("\n");
    }
    
    public int linearSearch(String findItem) {
        for (int k = 0; k < currentSize; k++)
        {
            if (findItem.equals(values[k]))
            {
                return k;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        ArrayAlgorithms aa = new ArrayAlgorithms();
        System.out.print("Original Array: ");
        aa.printArray();
        
        aa.insertItem("darn",5);
        System.out.print("After inserting darn: ");
        aa.printArray();
        
        aa.removeItem(7);
        System.out.print("After removing the period: ");
        aa.printArray();
        
        aa.removeItem(3);
        System.out.print("After removing very: ");
        aa.printArray();
        
        aa.insertItem("!",6);
        System.out.print("After inserting !: ");
        aa.printArray();
        
        System.out.println("first is at index: " + aa.linearSearch("first"));
        System.out.println("last is at index: " + aa.linearSearch("last"));
        
        
    }
}
