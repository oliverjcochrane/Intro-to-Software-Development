
/**
 * Write a description of class CharityTester here.
 *
 * @author (Oliver Cochrane)
 * @version (2/1/23)
 */
public class CharityTester
{
    public static void main(String[] args) {
        
        //CONSTRUCT TWO NEW CHARITIES
        Charity charity1 = new Charity("Charity One",1289327.22,348933.13,true);
        
        Charity charity2 = new Charity("Charity Two",4123820.91,110765.45,false);
        
        //CALL TOSTRING() FOR BOTH CHARITIES AND PRINT
        System.out.println(charity1.toString());
        System.out.println(charity2.toString());
        
        //COMPUTE VALUE FOR BOTH CHARITIES AND PRINT
        System.out.println("Charity One value: $" + charity1.computeValue()); 
        System.out.println("Charity Two value: $" + charity2.computeValue());
        
    }
}
