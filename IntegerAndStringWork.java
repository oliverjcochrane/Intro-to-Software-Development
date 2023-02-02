//IMPORT THE INTEGER AND STRING CLASS
import java.lang.Integer;
/**
 * Write a description of class IntegerWork here.
 *
 * @author (Oliver Cochrane)
 * @version (1/24/23)
 */
public class IntegerAndStringWork
{
    public static void main(String[] args) {

        //CREATE NEW INTEGER OBJECTS FOR BIRTH AND CURRENT YEARS
        Integer yearBirth = new Integer("2004");
        Integer yearCurrent = new Integer(2023);

        //COMPARE THE TWO NUMBERS AND STORE RETURN VALUE AS VARIABLE
        int objectComparison = yearBirth.compareTo(yearCurrent);

        //PRINT OUT THE FORMATTED RESULT WITH BLANK LINE FOR CLARITY AFTER
        System.out.println("Should be less than 0: " + objectComparison);
        System.out.println();

        //BEGIN WORK WITH STRING CLASS BY STORING NAME
        String myName = "Oliver Cochrane";

        //DEFINE INDEX OF SPACE SEPARATING FIRST AND LAST NAMES
        int firstSpace = myName.indexOf(" ");

        //ISOLATE FIRST NAME
        String firstName = myName.substring(0, firstSpace);

        //STORE FULL NAME LENGTH TO ISOLATE LAST NAME
        int nameLength = myName.length();
        String lastName = myName.substring((firstSpace + 1), nameLength);

        //PRINT RESULTS
        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);
        System.out.println();

    }
}
