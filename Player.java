
/**
 * Write a description of class Player here.
 *
 * @author (Oliver Cochrane)
 * @version (4/28/23)
 */
public class Player
{
    private String uniqueID;
    private int jerseyNum;
    private int height;
    private int weight;
    private boolean starter;
    
    //CONSTRUCTOR
    public Player(int jerseyNum,int height,int weight,boolean starter,String uniqueID) {
        this.jerseyNum = jerseyNum;
        this.height = height;
        this.weight = weight;
        this.starter = starter;
        this.uniqueID = uniqueID;
    }
    
    //GETTERS
    public String getUniqueID() {
        return uniqueID;
    }
    
    public int getJerseyNum() {
        return jerseyNum;
    }
    
    public int getHeight() {
        return height;
    }
    
    public int getWeight() {
        return weight;
    }
    
    public boolean isStarter() {
        return starter;
    }
    
    //SETTERS
    public void changeUniqueID(String newID) {
        uniqueID = newID;
    }
    
    public void setJerseyNum(int newNum) {
        jerseyNum = newNum;
    }
    
    public void setHeight(int newHeight) {
        height = newHeight;
    }
    
    public void setWeight(int newWeight) {
        weight = newWeight;
    }
    
    public void setStarter(boolean isStarter) {
        starter = isStarter;
    }
    
    public String toString() {
        String toReturn = "Jersey Number: " + jerseyNum + "\n";
        toReturn = toReturn + "Height (inches): " + height + "\n";
        toReturn = toReturn + "Weight (pounds): " + weight + "\n";
        toReturn = toReturn + "Starter?: " + starter + "\n";
        toReturn = toReturn + "Player ID: " + uniqueID + "\n";
        return toReturn;
    }
}
