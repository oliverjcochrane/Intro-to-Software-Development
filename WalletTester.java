
/**
 * Testing my Wallet Class
 *
 * @author (Oliver Cochrane)
 * @version (2/14/23)
 */
public class WalletTester
{
    public static void main(String[] args) {
        
        //CREATE THREE WALLET OBJECTS, CALL TOSTRING() ON EACH ONE
        Wallet wallet1 = new Wallet("John",125,2.55,2,4,1500);
        System.out.println(wallet1.toString());
        
        Wallet wallet2 = new Wallet("Jamie",400,0.12,4,5,100000);
        System.out.println(wallet2.toString());
        
        Wallet wallet3 = new Wallet("James",181,0.99,2,3,22000);
        System.out.println(wallet3.toString());
        
        //CALL TWO SETTERS TO CHANGE TWO INSTANCE VARIABLES FOR ONE OBJECT
        wallet1.setBillsValue(185);
        wallet1.setCoinsValue(1.36);
        
        //PRINT NEW VALUES BY CALLING THEIR GETTER METHODS
        System.out.println("The value of the bills in " + wallet1.getOwner() + "'s wallet is: $" + wallet1.getBillsValue());
        System.out.println("The value of the coins in " + wallet1.getOwner() + "'s wallet is: $" + wallet1.getCoinsValue());
        System.out.println();
        
        //CALL ALL COMPLEX METHODS ON ALL THREE OBJECTS, PRINT RESULTS
        wallet1.addCard("Debit",0);
        wallet1.removeCard("Credit",500);
        System.out.println(wallet1.getOwner() + "'s purchasing power is: $" + wallet1.totalPurchasePower(150) + "\n");

        wallet2.addCard("Credit",2000);
        wallet2.removeCard("Credit",5000);
        System.out.println(wallet2.getOwner() + "'s purchasing power is: $" + wallet2.totalPurchasePower(3500) + "\n");
        
        wallet3.addCard("Credit",3000);
        wallet3.removeCard("Debit",0);
        System.out.println(wallet3.getOwner() + "'s purchasing power is: $" + wallet3.totalPurchasePower(150) + "\n");
        
        
        
        
        
        
    
        
    }
}
