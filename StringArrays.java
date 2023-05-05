
/**
 * Write a description of class StringArrays here.
 *
 * @author (Oliver Cochrane)
 * @version (4/20/23)
 */
public class StringArrays
{
    public void printArray(String[] arrayToPrint) {
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

    public boolean alphabetical(String[] arrayToCheck) {
        for (int k = 0; k < arrayToCheck.length - 1; k++) {
            if (arrayToCheck[k].compareTo(arrayToCheck[k+1]) > 0) {
                return false; //I USED compareTo FROM THE JAVA API STRING CLASS
            }
        }
        return true;
    }

    public boolean containsDups(String[] arrayToCheck) {
        for (int i = 0; i < arrayToCheck.length; i++) {
            for (int k = i + 1; k < arrayToCheck.length; k++) {
                if (arrayToCheck[i].equals(arrayToCheck[k])) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public String[] evenToFront(String[] arrayToMove) {
        String[] toReturn = new String[arrayToMove.length];
        int i = 0;
        for (int k = 0; k < arrayToMove.length; k++)
        {
            if (arrayToMove[k].length() % 2 == 0)
            {
                toReturn[i] = arrayToMove[k];
                i++;
            }
        }
        
        for (int p = 0; p < arrayToMove.length; p++)
        {
            if (arrayToMove[p].length() % 2 != 0)
            {
                toReturn[i] = arrayToMove[p];
                i++;
            }
        }
        return toReturn;
    }
    
    public void testIt() {
        String[] testCase1 = {"ape","gibbon","gorilla","orangutan"};
        String[] testCase2 = {"swiss","cheddar","gouda","curds"};
        String[] testCase3 = {"four","pour","door","floor"};
        String[] testCase4 = {"cabinet","drawer","garbage","microwave"};
        String[] testCase5 = {"one","one","seven"};
        String[] testCase6 = {"one","seven","one"};
        
        //TEST printArray
        System.out.print("Printing Test Case 1:\n");
        printArray(testCase1);
        System.out.println();
        
        System.out.print("Printing Test Case 2:\n");
        printArray(testCase2);
        System.out.println();
        
        System.out.print("Printing Test Case 3:\n");
        printArray(testCase3);
        System.out.println();
        
        System.out.print("Printing Test Case 4:\n");
        printArray(testCase4);
        System.out.println();
        
        System.out.print("Printing Test Case 5:\n");
        printArray(testCase5);
        System.out.println();
        
        System.out.print("Printing Test Case 6:\n");
        printArray(testCase6);
        System.out.println();
        System.out.println("----------------------------------------");
        
        //TEST alphabetical
        System.out.print("Testing the array: ");
        printArray(testCase1);
        System.out.println("Expected: true");
        System.out.println("In alphabetical order?: " + alphabetical(testCase1));
        System.out.println();
        
        System.out.print("Testing the array: ");
        printArray(testCase2);
        System.out.println("Expected: false");
        System.out.println("In alphabetical order?: " + alphabetical(testCase2));
        System.out.println();
        
        System.out.print("Testing the array: ");
        printArray(testCase3);
        System.out.println("Expected: false");
        System.out.println("In alphabetical order?: " + alphabetical(testCase3));
        System.out.println();
        
        System.out.print("Testing the array: ");
        printArray(testCase4);
        System.out.println("Expected: true");
        System.out.println("In alphabetical order?: " + alphabetical(testCase4));
        System.out.println();
        
        System.out.print("Testing the array: ");
        printArray(testCase5);
        System.out.println("Expected: true");
        System.out.println("In alphabetical order?: " + alphabetical(testCase5));
        System.out.println();
        
        System.out.print("Testing the array: ");
        printArray(testCase6);
        System.out.println("Expected: false");
        System.out.println("In alphabetical order?: " + alphabetical(testCase6));
        System.out.println("----------------------------------------");
        
        //TESTING containsDups
        System.out.print("Testing the array: ");
        printArray(testCase1);
        System.out.println("Expected: false");
        System.out.println("Contains dups?: " + containsDups(testCase1));
        System.out.println();
        
        System.out.print("Testing the array: ");
        printArray(testCase5);
        System.out.println("Expected: true");
        System.out.println("Contains dups?: " + containsDups(testCase5));
        System.out.println();
        
        System.out.print("Testing the array: ");
        printArray(testCase6);
        System.out.println("Expected: true");
        System.out.println("Contains dups?: " + containsDups(testCase6));
        System.out.println("----------------------------------------");
        
        //TESTING evenToFront
        System.out.print("Testing the array: ");
        printArray(testCase1);
        System.out.println("Expected: gibbon, ape, gorilla, orangutan");
        System.out.print("Actual: ");
        printArray(evenToFront(testCase1));
        System.out.println();
        
        System.out.print("Testing the array: ");
        printArray(testCase2);
        System.out.println("Expected: swiss, cheddar, gouda, curds");
        System.out.print("Actual: ");
        printArray(evenToFront(testCase2));
        System.out.println();
        
        System.out.print("Testing the array: ");
        printArray(testCase3);
        System.out.println("Expected: four, pour, door, floor");
        System.out.print("Actual: ");
        printArray(evenToFront(testCase3));
        System.out.println();
        
        System.out.print("Testing the array: ");
        printArray(testCase4);
        System.out.println("Expected: drawer, cabinet, garbage, microwave");
        System.out.print("Actual: ");
        printArray(evenToFront(testCase4));
        System.out.println("----------------------------------------");
    }
    
    public static void main(String[] args) {
        StringArrays run = new StringArrays();
        
        run.testIt();
    }
}
