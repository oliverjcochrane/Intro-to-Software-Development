
/**
 * Acts to resemble a car and some of its properties.
 *
 * @author (Oliver Cochrane)
 * @version (2/4/23)
 */
public class Car
{
    private double milesPerGallon;
    private double gasRemaining = 0;
    private int modelYear;
    private int purchasePrice;

    /**
     * Constructs a new car object with a given fuel efficiency, model year, and purchase price.
     * @param milesPerGallon the fuel efficiency of the car in miles per gallon.
     * @param modelYear the model year of the car.
     * @param purchasePrice the amount that the car was purchased for.
     */
    public Car(double milesPerGallon, int modelYear, int purchasePrice) {
        this.milesPerGallon = milesPerGallon;
        this.modelYear = modelYear;
        this.purchasePrice = purchasePrice;
    }

    /**
     * Gets the fuel efficiency of the car.
     * @return the fuel efficiency of the car.
     */
    public double getMPG() {
        return milesPerGallon;
    }
    
    /**
     * Gets the gas remaining in the car.
     * @return the gas remaining in the car in gallons.
     */
    public double getGasRemaining() {
        return gasRemaining;
    }
    
    /**
     * Gets the model year of the car.
     * @return the model year of the car.
     */
    public int getModelYear() {
        return modelYear;
    }
    
    /**
     * Gets the purchase price of the car.
     * @return the purchase price of the car.
     */
    public int getPurchasePrice() {
        return purchasePrice;
    }
    
    /**
     * Sets the fuel efficiency of the car.
     * @param mpg the fuel efficiency of the car in miles per gallon.
     */
    public void setMPG(int mpg) {
         milesPerGallon = mpg;
    }
    
    /**
     * Sets the gas remaining in the car.
     * @param gas gas remaining in the car in miles.
     */
    public void setGasRemaining(double gas) {
         gasRemaining = gas;
    }
    
    /**
     * Sets the model year of the car.
     * @param year the model year of the car.
     */
    public void setModelYear(int year) {
         modelYear = year;
    }
    
    /**
     * Sets the purchase price of the car.
     * @param price the purchase price of the car.
     */
    public void setPurchasePrice(int price) {
         purchasePrice = price;
    }
    
    /**
     * Outputs all information about a given Car object.
     * @return the fuel efficiency, model year, and purchase price of the car.
     */
    public String toString() {
        String toReturn = "The fuel efficiency of the car is: " + milesPerGallon + "\n";
        toReturn = toReturn + "The model year of the car is: " + modelYear + "\n";
        toReturn = toReturn + "The purchase price of the car was: " + purchasePrice + "\n";
        return toReturn;
    }
    
    /**
     * Adds a given amount of gas to the tank.
     * @param gasIn the amount of gas being added to the tank in gallons.
     */
    public void addGas(double gasIn) {
        gasRemaining = gasRemaining + gasIn;
    }
    
    /**
     * Calculates the remaining gallons of gas in the car after a drive of a given distance.
     * @param distance the distance of the drive.
     */
    public void drive(double distance) {
        double distanceDriven = distance;
        double gasUsed = distanceDriven/milesPerGallon;
        double gasLeft = gasRemaining - gasUsed;
        gasRemaining = gasLeft;
    }
    
    /**
     * Calculates the current value of the car.
     * @param currentYear the current year.
     */
    public double computeValue(int currentYear) {
        int yearsAccrued = currentYear - modelYear;
        double totalDepreciation = (0.1*yearsAccrued);
        double currentValue = purchasePrice - (totalDepreciation*purchasePrice);
        return currentValue;
    }
    
}
