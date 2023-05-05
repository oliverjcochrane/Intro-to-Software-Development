
/**
 * Write a description of class ArrayDuplicates here.
 *
 * @author (Oliver Cochrane)
 * @version (4/13/23)
 */
public class ArrayDuplicateWork
{
    public boolean adjacentDups(int[] arr1) {
        for (int k = 0; k < arr1.length-2; k++)
        {
            if (arr1[k] == arr1[k+1])
            {
                return true;
            }
        }
        return false;
    }

    public boolean nonAdjacentDups(int[] arr1) {
        for (int i = 0; i < arr1.length; i++) {
            for (int k = i + 2; k < arr1.length; k++) {
                if (arr1[i] == arr1[k]) {
                    return true;
                }
            }
        }
        return false;
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
    
    public void testIt() {
        int[] testCase1 = {1,2,3,4};
        int[] testCase2 = {1,2,2,4};
        int[] testCase3 = {1,2,3,2};
        int[] testCase4 = {4,2,3,4};
        //TEST FOR ADJ DUPS
        System.out.print("Testing the array: ");
        printArray(testCase1);
        System.out.println("Expected: false");
        System.out.println("Are there Adj dups?: " + adjacentDups(testCase1));
        System.out.println();
        
        //TEST FOR NON-ADJ DUPS
        System.out.print("Testing the array: ");
        printArray(testCase1);
        System.out.println("Expected: false");
        System.out.println("Are there non-adj dups?: " + nonAdjacentDups(testCase1));
        System.out.println();
        
        //CASE 2 TESTING
        System.out.print("Testing the array: ");
        printArray(testCase2);
        System.out.println("Expected: true");
        System.out.println("Are there Adj dups?: " + adjacentDups(testCase2));
        System.out.println();
        
        System.out.print("Testing the array: ");
        printArray(testCase2);
        System.out.println("Expected: false");
        System.out.println("Are there non-adj dups?: " + nonAdjacentDups(testCase2));
        System.out.println();
        
        //CASE 3 TESTING
        System.out.print("Testing the array: ");
        printArray(testCase3);
        System.out.println("Expected: false");
        System.out.println("Are there Adj dups?: " + adjacentDups(testCase3));
        System.out.println();
        
        System.out.print("Testing the array: ");
        printArray(testCase3);
        System.out.println("Expected: true");
        System.out.println("Are there non-adj dups?: " + nonAdjacentDups(testCase3));
        System.out.println();
        
        //CASE 4 TESTING
        System.out.print("Testing the array: ");
        printArray(testCase4);
        System.out.println("Expected: false");
        System.out.println("Are there Adj dups?: " + adjacentDups(testCase4));
        System.out.println();
        
        System.out.print("Testing the array: ");
        printArray(testCase4);
        System.out.println("Expected: true");
        System.out.println("Are there non-adj dups?: " + nonAdjacentDups(testCase4));
        System.out.println();
    }
    
    public static void main(String[] args) {
        ArrayDuplicateWork adw = new ArrayDuplicateWork();
        adw.testIt();
    }
}
