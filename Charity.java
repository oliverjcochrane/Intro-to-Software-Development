
/**
 * Resembles the accounting and operation of a charity.
 *
 * @author (Oliver Cochrane)
 * @version (2/1/23)
 */
public class Charity
{
    //DECLARE INSTANCE VARIABLES
    private String charityName;
    private double totalDonations;
    private double totalExpenses;
    private boolean active;

    //CONSTRUCTORS
    /**
     * Constructs a new Charity object
     * @param charityNameIn the name of the charity.
     * @param totalDonationsIn the total donations received by the charity
     * @param totalExpensesIn the total expenses of the charity
     * @param active whether or not the charity is still active
     */
    public Charity(String charityNameIn, double totalDonationsIn, double totalExpensesIn, boolean activeIn) {
        charityName = charityNameIn;
        totalDonations = totalDonationsIn;
        totalExpenses = totalExpensesIn;
        active = activeIn;
    }

    //GETTER METHODS
    /**
     * Gets the name of the charity.
     * @return the charity name
     */
    public String getName() {
        return charityName;
    }
    
    /**
     * Gets the total donations to the charity.
     * @return total donations to the charity
     */
    public double getTotalDonations() {
        return totalDonations;
    }
    
    /**
     * Gets the total expenses of the charity.
     * @return the total expenses of the charity
     */
    public double getTotalExpense() {
        return totalExpenses;
    }
    
    /**
     * Gets the active status of whether the charity is still operating or not.
     * @return whether or not the charity is active
     */
    public boolean getActiveStatus() {
        return active;
    }

    //TOSTRING() METHOD
    /**
     * Formats and concatenates all charity info into a string to be printed.
     * @return charity name, total donations, total expenses, and activity status
     */
    public String toString() {
        String toReturn = "Charity name: " + charityName + "\n";
        toReturn = toReturn + "Total donations: " + totalDonations + "\n";
        toReturn = toReturn + "Total expenses: " + totalExpenses + "\n";
        toReturn = toReturn + "Active?: " + active + "\n";
        return toReturn;

    }
    
    //MUTATOR METHODS
    /**
     * Replaces the existing charity name.
     * @param charityNameIn the inputted charity name
     */
    public void setCharityName(String charityNameIn) {
        charityName = charityNameIn;
    }
    
    /**
     * Replaces the existing total donations.
     * @param totalDonationsIn the inputted total donations amount
     */
    public void setTotalDonations(double totalDonationsIn) {
        totalDonations = totalDonationsIn;
    }
    
    /**
     * Replaces the existing total expenses.
     * @param totalExpensesIn the inputted total expenses amount
     */
    public void setTotalExpenses(double totalExpensesIn) {
        totalExpenses = totalExpensesIn;
    }
    
    /**
     * Replaces the existing activity status.
     * @param activeStatusIn the inputted activity status
     */
    public void setActiveStatus(boolean activeStatusIn) {
        active = activeStatusIn;
    }
    
    //HELPER METHOD
    /**
     * Computes the total value of the charity.
     * @return the total value of the charity
     */
    public double computeValue() {
        double baseValue = 40000;
        double totalValue = ((2*totalDonations)+baseValue) - (1.5*totalExpenses);
        return totalValue;
        
    }
}   
