
/**
 * Resembles the function of a wallet.
 *
 * @author (Oliver Cochrane)
 * @version (2/14/23)
 */
public class Wallet
{
    private String owner;
    private int billsValue;
    private double coinsValue;
    private int numOfCards;
    private int numOfPockets;
    private int totalCredit;

    /**
     * Constructs a new Wallet object.
     * @param owner the owner of the wallet
     * @param billsValueIn the total value of bills in the wallet.
     * @param coinsValueIn the total value of coins in the wallet.
     * @param numOfCardsIn the total number of debit/credit cards in the wallet.
     * @param numOfPocketsIn the total number of card pockets in the wallet.
     * @param totalCreditIn the combined credit of all the credit cards in the wallet.
     */
    public Wallet(String ownerIn, int billsValueIn, double coinsValueIn, int numOfCardsIn, int numOfPocketsIn, int totalCreditIn) {
        owner = ownerIn;
        billsValue = billsValueIn;
        coinsValue = coinsValueIn;
        numOfCards = numOfCardsIn;
        numOfPockets = numOfPocketsIn;
        totalCredit = totalCreditIn;
    }

    //GETTER METHODS
    /**
     * Gets the name of the owner of the wallet.
     * @return the name of the owner of the wallet.
     */
    public String getOwner() {
        return owner;
    }
    
    /**
     * Gets the total value of bills in the wallet.
     * @return the total value of bills in the wallet.
     */
    public int getBillsValue() {
        return billsValue;
    }

    /**
     * Gets the total value of coins in the wallet.
     * @return the total value of coins in the wallet.
     */
    public double getCoinsValue() {
        return coinsValue;
    }

    /**
     * Gets the number of cards in the wallet.
     * @return the number of cards in the wallet.
     */
    public int getNumOfCards() {
        return numOfCards;
    }

    /**
     * Gets the number of card pockets in the wallet.
     * @return the number of card pockets in the wallet.
     */
    public int getNumOfPockets() {
        return numOfPockets;
    }

    /**
     * Gets the combined credit of all the credit cards in the wallet.
     * @return the combined credit of all the credit cards in the wallet
     */
    public int getTotalCredit() {
        return totalCredit;
    }

    //SETTER METHODS
    /**
     * Sets the name of the owner of the wallet.
     * @param ownerIn the name of the owner of the wallet.
     */
    public void setOwner(String ownerIn) {
        owner = ownerIn;
    }
    
    /**
     * Sets the total value of bills in the wallet.
     * @param billsValueIn the total value of bills in the wallet.
     */
    public void setBillsValue(int billsValueIn) {
        billsValue = billsValueIn;
    }

    /**
     * Sets the total value of coins in the wallet.
     * @param coinsValueIn the total value of coins in the wallet.
     */
    public void setCoinsValue(double coinsValueIn) {
        coinsValue = coinsValueIn;
    }

    /**
     * Sets the number of cards in the wallet.
     * @param numOfCardsIn the number of cards in the wallet.
     */
    public void setNumOfCards(int numOfCardsIn) {
        numOfCards = numOfCardsIn;
    }

    /**
     * Sets the number of pockets in the wallet.
     * @param numOfCardsIn the number of pockets in the wallet.
     */
    public void setNumOfPockets(int numOfPocketsIn) {
        numOfPockets = numOfPocketsIn;
    }

    /**
     * Sets the total credit of credit cards in the wallet.
     * @param numOfCardsIn the total credit of credit cards in the wallet.
     */
    public void setTotalCredit(int totalCreditIn) {
        totalCredit = totalCreditIn;
    }

    //HELPER METHODS
    /**
     * Adds a card to the wallet.
     * @param cardType the type of card being added to the wallet.
     */
    public void addCard(String cardType, int creditLimit) {
        if ((cardType == "Credit") & (numOfCards < numOfPockets))
        {
            numOfCards ++;
            totalCredit = totalCredit + creditLimit;
        }
        else if ((cardType != "Credit") & (numOfCards < numOfPockets))
        {
            numOfCards ++;
        }
        else
        {
            System.out.println("Error: unable to add card because the pockets are full.\n");
        }
    }
    
    /**
     * Removes a card from the wallet.
     * @param cardType the type of card being removed from the wallet.
     */
    public void removeCard(String cardType, int creditLimit) {
        if ((cardType == "Credit") & (numOfCards != 0))
        {
            numOfCards --;
            totalCredit = totalCredit - creditLimit;
        }
        else if ((cardType != "Credit") & (numOfCards != 0))
        {
            numOfCards --;
        }
        else
        {
            System.out.println("Error: unable to remove card because the pockets are empty.\n");
        }
    }
    
    /**
     * Returns the total purchasing power of the wallet.
     * @return the total purchasing power of the wallet.
     */
    public double totalPurchasePower(double creditUsed) {
        double availableCredit = totalCredit - creditUsed;
        double purchasePower = billsValue + coinsValue + availableCredit;
        return purchasePower;
    }

    /**
     * Returns the current values of all instance variables in a string.
     * @return toReturn the current values of all instance variables in a string.
     */
    public String toString() {
        String toReturn = "Owner: " + owner + "\n";
        
        toReturn = toReturn + "Total value in bills: $" + billsValue + "\n";

        toReturn = toReturn + "Total value in coins: $" + coinsValue + "\n";

        toReturn = toReturn + "Number of cards: " + numOfCards + "\n";

        toReturn = toReturn + "Number of pockets: " + numOfPockets + "\n";

        toReturn = toReturn + "Total credit: $" + totalCredit + "\n";

        return toReturn;

    }

}
