
/**
 * Write a description of class ArrayMethods here.
 *
 * @author (Oliver Cochrane)
 * @version (3/30/23)
 */
public class ArrayMethods
{
    private int[] array;
    
    public ArrayMethods() {
        this.array = new int[10];
        int i = 1;
        for (int k = 0; k < array.length; k++)
        {
            array[k] = i;
            i++;
        }
    }
    
    public void swapFirstLast() {
        System.out.println("After swapFirstLast:");
        
        int first = array[0];
        int last = array[array.length-1];
        array[0] = last;
        array[array.length-1] = first;
        
        for (int k = 0; k < array.length; k++)
        {
            System.out.print(array[k] + ", ");
        }
        
        System.out.println("\n");
    }
    
    public void replaceEven() {
        System.out.println("After replaceEven:");
        
        for (int k = 0; k < array.length; k++)
        {
            if (array[k] % 2 == 0)
            {
                array[k] = 0;
            }
            System.out.print(array[k] + ", ");
        }
        System.out.println("\n");
    }
    
    public void replaceNeighbor() {
        System.out.println("After replaceNeighbor:");
        
        System.out.print(array[0] + ", ");
        for (int k = 1; k < array.length-1; k++)
        {
            if (array[k+1] > array[k-1])
            {
                array[k] = array[k+1];
            }
            else
            {
                array[k] = array[k-1];
            }
            System.out.print(array[k] + ", ");
        }
        System.out.print(array[array.length-1] + ", ");
        
        System.out.println("\n");
    }
    
    public void shiftRight() {
        System.out.println("After shiftRight:");
        
        int last = array[array.length-1];
        for (int k = array.length-1; k > 0; k--)
        {
            array[k] = array[k-1];
        }
        array[0] = last;
        for (int k = 0; k < array.length; k++)
        {
            System.out.print(array[k] + ", ");
        }
        
        System.out.println("\n");
    }
    
    public void printArray() {
        System.out.println("Full Array:");
        
        for (int k = 0; k < array.length; k++)
        {
            System.out.print(array[k] + ", ");
        }
        System.out.println("\n");
    }
    
    public static void main(String[] args) {
        //CONSTRUCT
        ArrayMethods myArray = new ArrayMethods();
        
        //CALL SWAP-FIRST-LAST
        myArray.swapFirstLast();
        
        //CALL REPLACE-EVEN
        myArray.replaceEven();
        
        //CALL REPLACE-NEIGHBOR
        myArray.replaceNeighbor();
        
        //CALL SHIFT RIGHT
        myArray.shiftRight();
        
        //CALL FULL ARRAY
        myArray.printArray();
    }
}
