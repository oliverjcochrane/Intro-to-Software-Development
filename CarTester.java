
/**
 * Testing my Car class.
 *
 * @author (Oliver Cochrane)
 * @version (2/4/23)
 */
public class CarTester
{
    public static void main(String[] args) {
        
        //CREATE NEW CAR OBJECT
        Car car1 = new Car(50, 2018, 34000);
        
        //ADD 20 GALLONS TO THE TANK AND PRINT EXPECTED VS ACTUAL
        car1.addGas(20);
        System.out.println("Expected: 20");
        System.out.println("Actual: " + car1.getGasRemaining());
        System.out.println();
        
        //DRIVE 100 MILES AND PRINT EXPECTED VS ACTUAL
        car1.drive(100);
        System.out.println("Expected: 18");
        System.out.println("Actual: " + car1.getGasRemaining());
        System.out.println();
        
        //PRINT THE EXPECTED VS ACTUAL VALUE OF THE CAR
        System.out.println("Expected: $17000");
        System.out.println("Actual: $" + car1.computeValue(2023));
        
        
    }
}
