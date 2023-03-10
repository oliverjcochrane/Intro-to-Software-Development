import java.util.Random;
/**
 * Write a description of class Gambler here.
 *
 * @author (Oliver Cochrane)
 * @version (3/8/23)
 */
public class Gambler
{
    private int wheel1;
    private int wheel2;
    private int wheel3;
    private int wheel4;
    private int balance;
    private String message;
    private int playNum;
    
    Random spin = new Random();
    
    public void spin() {
         balance = balance - 2;
         wheel1 = spin.nextInt(0,4);
         wheel2 = spin.nextInt(0,4);
         wheel3 = spin.nextInt(0,4);
         wheel4 = spin.nextInt(0,4);
         playNum++;
    }
    
    public String winOrLose() {
        if (wheel1 == wheel2 && wheel2 == wheel3 && wheel3 == wheel4) 
        {
            message = "\t  Four of a kind.\t You win $498!\n\t";
            balance = balance + 498;
            message = message + "  Your balance went up to $" + getBalance() + "\n--------------------------------------------------";
        }
        else if (wheel1 == wheel2 && wheel2 == wheel3 || wheel1 == wheel2 && wheel2 == wheel4 || wheel1 == wheel3 && wheel3 == wheel4 || wheel2 == wheel3 && wheel3 == wheel4)
        {
            message = "\t  Three of a kind.\tYou win $8.\n\t";
            balance = balance + 8;
            message = message + "  Your balance went up to $" + getBalance() + "\n--------------------------------------------------";
        }
        else if (wheel1 == wheel2 && wheel3 == wheel4 || wheel1 == wheel3 && wheel2 == wheel4 || wheel1 == wheel4 && wheel2 == wheel3)
        {
            message = "\t  Two pairs.\t        You win $3.\n\t";
            balance = balance + 3;
            message = message + "  Your balance went up to $" + getBalance() + "\n--------------------------------------------------";
        }
        else if (wheel1 == wheel2 || wheel1 == wheel3 || wheel1 == wheel4 || wheel2 == wheel3 || wheel2 == wheel4 || wheel3 == wheel4)
        {
            message = "\t  Two of a kind.\tYou break even.\n\t";
            balance = balance + 2;
            message = message + "  Your balance stays at $" + getBalance() + "\n--------------------------------------------------";
        }
        else
        {
            message = "\t  None of a kind.\tYou lose $2.\n\t";
            message = message + "  Your balance went down to $" + getBalance() + "\n--------------------------------------------------";
        }
        return message;
    }
    
    public String printSpin() {
        return "Play " + playNum + ":   " + "Your wheels:\t" + "\t" + wheel1 + "    " + wheel2 + "    " + wheel3 + "    " + wheel4;
    }
    
    public int getBalance() {
        return balance;
    }
    
    //CONSTRUCTOR
    public Gambler(int balance) {
        this.balance = spin.nextInt(100,201);
    }
}
