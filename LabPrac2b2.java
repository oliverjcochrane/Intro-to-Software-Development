
/**
 * Write a description of class LabPrac2b here.
 *
 * @author (Oliver Cochrane)
 * @version (4/19/23)
 */
public class LabPrac2b2 {
    //return true if array is strictly decreasing
    //{4,4,3,2} should return false
    //{14,3,2,1} should return true
    //you do not need to worry about empty array
    //CHANGE THE RETURN VALUE AS YOU NEED
    public boolean checkDecreasing(int[] arrayToCheck){
        boolean check = true;
        for (int k = 1; k < arrayToCheck.length; k++)
        {
            if (arrayToCheck[k-1] > arrayToCheck[k])
            {
                check = true;
            }
            else
            {
                return false;
            }
        }
        return true;
    }

    //Find the first two adjacent numbers that when added together return 7
    //return the index of the first number
    //if there is no two adjacent that sum to 7 return -1
    //{1,3,4} should return 1 because the index of 3 is 1 and 3+4=7
    //{1,1,5,1,6} should return 3 because the index of the third 1 is 3 and 1+6=7
    //{1,1} should return -1
    //CHANGE THE RETURN VALUE AS YOU NEED
    public int findAdjacentSum(int[] arrayToCheck){
        int sum = 0;
        for (int k = 1; k < arrayToCheck.length; k++)
        {
            sum = arrayToCheck[k-1] + arrayToCheck[k];
            if (sum == 7)
            {
                return k-1;
            }
        }
        return -1;
    }

    //return new array consisting of all elements that are not a four or a two
    //retain order
    //if only 4s and 2s in the original array then return the empty array
    //{4,2,0,0} should return {0,0]
    //{1,4,2,3,4,2} should return {1,3}
    //{4,2} should return {}
    //CHANGE THE RETURN VALUE AS YOU NEED
    public int[] exceptFourTwo(int[] arrayToCheck){
        int count = 0;
        for (int k = 0; k < arrayToCheck.length; k++)
        {
            if (arrayToCheck[k] != 4 && arrayToCheck[k] != 2)
            {
                count++;
            }
        }
        int[] toReturn = new int[count];
        int p = 0;
        for (int k = 0; k < arrayToCheck.length; k++)
        {
            if (arrayToCheck[k] != 4 && arrayToCheck[k] != 2)
            {
                toReturn[p] = arrayToCheck[k];
                p++;
            }
        }
        return toReturn;
    }

    //Return the sum of the third number 7 and the number just before it
    //if there are not three 7s in the array, return -1
    //{1,7,7,7} should return 14
    //{1,3,7,2,7,1,7} should return 8
    //{1,7,7} should return -1
    //CHANGE THE RETURN VALUE AS YOU NEED
    public int findTheSeven(int[] arrayToCheck){
        int count = 0;
        for (int k = 0; k < arrayToCheck.length; k++)
        {
            if (arrayToCheck[k] == 7)
            {
                count++;
            }
            if (count == 3)
            {
                return 7 + arrayToCheck[k-1];
            }
        }    
        return -1;
    }
}
