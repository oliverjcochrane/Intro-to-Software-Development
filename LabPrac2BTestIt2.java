    //DO NOT EDIT THIS CLASS
    //DO NOT EDIT THIS CLASS
    //DO NOT EDIT THIS CLASS
    //DO NOT EDIT THIS CLASS
/**
 * Write a description of class LabPrac2bTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LabPrac2BTestIt2
{
    private int totalScore = 0;
    //private LabPrac2b lp2;
    private LabPrac2b2 lp2;

    public LabPrac2BTestIt2(){
        //lp2 = new LabPrac2b();
        lp2 = new LabPrac2b2();
    }

    public void testDecreasingOrder(){
        System.out.println( "Testing checkDecreasing" );
        int[] values1 = {4,3,2,1};
        int[] values2 = {4,4,3,1};
        int[] values3 = {1,2,3,4};

        int score = 0;
        try {
            System.out.print("Testing with: ");
            printArray(values1);
            System.out.println();           
            boolean ans = lp2.checkDecreasing(values1);
            if (ans) {
                score+=8; 
                System.out.println("Your code Returned true: CORRECT +8 points");
            } else System.out.println("Your code Returned false: INCORRECT");
            System.out.println();

            System.out.print("Testing with: ");
            printArray(values2);
            System.out.println();           
            ans = lp2.checkDecreasing(values2);
            if (!ans) {
                score+=8; 
                System.out.println("Your code Returned false: CORRECT +8 points");
            }else System.out.println("Your code Returned true: INCORRECT");
            System.out.println();

            System.out.print("Testing with: ");
            printArray(values3);
            System.out.println();
            ans = lp2.checkDecreasing(values3);
            if (!ans) {
                score+=8; 
                System.out.println("Your code Returned false: CORRECT +8 points");
            }else System.out.println("Your code Returned true: INCORRECT");

            totalScore = totalScore+score;
            System.out.println();
            System.out.println( "      checkIncreasing Score: " + score + "/24" );
            System.out.println( "      TotalScore: " + totalScore + "/24" );
        }
        catch (Exception e) {
            totalScore = totalScore+score;
            System.out.println( "      The following exception was thrown.");
            System.out.println( "      " + e.toString() );  
            System.out.println();
            System.out.println( "      checkIncreasing Score: " + score + "/24" );
            System.out.println( "      TotalScore: " + totalScore + "/24" );
        }

    }

    public void testFindAdjacentSum(){
        System.out.println("-----------------------------------------------------");
        System.out.println( "Testing findAdjacentSum" );
        int[] values1 = {1,2,3,4};
        int[] values2 = {1,1,1,4};
        int[] values3 = {4,3,2,1,6};

        int score = 0;
        try {
            System.out.print("Testing with: ");
            printArray(values1);
            System.out.println();
            int ans = lp2.findAdjacentSum(values1);
            if (ans==2) {
                score+=8; 
                System.out.println("Your code Returned 2: CORRECT +8 points");
            } else System.out.println("Your code Returned " + ans +" INCORRECT, the correct answer is 2");
            System.out.println();

            System.out.print("Testing with: ");
            printArray(values2);
            System.out.println();
            ans = lp2.findAdjacentSum(values2);
            if (ans == -1) {
                score+=8; 
                System.out.println("Your code Returned -1: CORRECT +8 points");
            }else System.out.println("Your code Returned " + ans +" INCORRECT,the correct answer is -1");
            System.out.println();

            System.out.print("Testing with: ");
            printArray(values3);
            System.out.println();
            ans = lp2.findAdjacentSum(values3);
            if (ans==0) {
                score+=8; 
                System.out.println("Your code Returned 0: CORRECT +8 points");
            }else System.out.println("Your code Returned " + ans +" INCORRECT, the correct answer is 0");

            totalScore = totalScore+score;
            System.out.println();
            System.out.println( "      findAdjacentSum Score: " + score + "/24" );
            System.out.println( "      TotalScore: " + totalScore + "/48" );
        }
        catch (Exception e) {
            totalScore = totalScore+score;
            System.out.println( "      The following exception was thrown.");
            System.out.println( "      " + e.toString() ); 
            System.out.println();
            System.out.println( "      findAdjacentSum Score: " + score + "/24" );
            System.out.println( "      TotalScore: " + totalScore + "/48" );
        }

    }

    public boolean compareArrays(int[] arrayToCheck, int[] arrayToMatch){
        if (arrayToCheck.length != arrayToMatch.length) return false;

        for (int i =0; i<arrayToCheck.length;i++){
            if (arrayToCheck[i] != arrayToMatch[i]){
                return false;
            }
        }
        return true;
    }

    public void printArray(int[] arrayToPrint)
    {
        System.out.print("[");
        for (int i=0; i<arrayToPrint.length-1;i++)
        {
            System.out.print(arrayToPrint[i] +", ");
        }
        System.out.print(arrayToPrint[arrayToPrint.length-1]);
        System.out.print("]");
    }

    public void testExceptFourTwo(){
        System.out.println("-----------------------------------------------------");
        System.out.println( "Testing beforeFortyTwo" );
        int[] values1 = {4,2,0,0};
        int[] values2 = {1,4,2,3,4,2};
        int[] values3 = {4,2};
        int[] values4 = {1,3};

        int score = 0;
        try {
            System.out.print("Testing with: ");
            printArray(values1);
            System.out.println();
            int[] ans = lp2.exceptFourTwo(values1);
            int[] correct = {0,0};
            if (compareArrays(ans,correct)) {
                score+=7; 
                System.out.println("Your code Returned [0,0]: CORRECT +7 points");
            } else {
                System.out.print("Your code Returned ");
                printArray(ans);
                System.out.println(" INCORRECT.  Answer is [0,0]");
            }
            System.out.println();

            System.out.print("Testing with: ");
            printArray(values2);
            System.out.println();
            ans = lp2.exceptFourTwo(values2);
            int[] correct2 = {1,3};
            if (compareArrays(ans,correct2)) {
                score+=7; 
                System.out.println("Your code Returned [1,3]: CORRECT +7 points");
            }else {
                System.out.print("Your code Returned ");
                printArray(ans);
                System.out.println(" INCORRECT. Answer is [1,3]");
            }
            System.out.println();

            System.out.print("Testing with: ");
            printArray(values3);
            System.out.println();
            ans = lp2.exceptFourTwo(values3);

            if (ans.length==0) {
                score+=7; 
                System.out.println("Your code Returned []: CORRECT +7 points");
            }else  {
                System.out.print("Your code Returned ");
                printArray(ans);
                System.out.println(" INCORRECT, Answer is []");
            }

            System.out.print("Testing with: ");
            printArray(values4);
            System.out.println();
            ans = lp2.exceptFourTwo(values4);

            int[] correct4 = {1,3};
            if (compareArrays(ans,correct4)){
                score+=7; 
                System.out.println("Your code Returned [1,3]: CORRECT +7 points");
            }else  {
                System.out.print("Your code Returned ");
                printArray(ans);
                System.out.println(" INCORRECT, Answer is [1,3]");
            }

            totalScore = totalScore+score;
            System.out.println();
            System.out.println( "      beforeFortyTwo Score: " + score + "/28" );
            System.out.println( "      TotalScore: " + totalScore + "/76" );
        }
        catch (Exception e) {
            totalScore = totalScore+score;
            System.out.println( "      The following exception was thrown.");
            System.out.println( "      " + e.toString() ); 
            System.out.println();
            System.out.println( "      beforeFortyTwo Score: " + score + "/28" );
            System.out.println( "      TotalScore: " + totalScore + "/76" );
        }

    }

    public void testFindTheSeven(){
        System.out.println("-----------------------------------------------------");
        System.out.println( "Testing findTheSeven" );
        int[] values1 = {1,7,7,7};
        int[] values3 = {1,1,7,2,7,3,3,7,4};
        int[] values4 = {1,1,7,2,7,3,3,4};

        int score = 0;
        try {
            System.out.print("Testing with: ");
            printArray(values1);
            System.out.println();
            int ans = lp2.findTheSeven(values1);
            if (ans==14) {
                score+=8; 
                System.out.println("Your code Returned 14: CORRECT +8 points");
            } else System.out.println("Your code Returned " + ans +" INCORRECT. The correct ans is 14");
            System.out.println();

            System.out.print("Testing with: ");
            printArray(values3);
            System.out.println();
            ans = lp2.findTheSeven(values3);
            if (ans == 10) {
                score+=8; 
                System.out.println("Your code Returned 10: CORRECT +8 points");
            }else System.out.println("Your code Returned " + ans +" INCORRECT. The correct ans is 10");
            System.out.println();

            System.out.print("Testing with: ");
            printArray(values4);
            System.out.println();
            ans = lp2.findTheSeven(values4);
            if (ans==-1) {
                score+=8; 
                System.out.println("Your code Returned -1: CORRECT +8 points");
            }else System.out.println("Your code Returned " + ans +" INCORRECT. The correct ans is -1");

            totalScore = totalScore+score;
            System.out.println();
            System.out.println( "      findTheSeven Score: " + score + "/24" );
            System.out.println( "      TotalScore: " + totalScore + "/100" );
        }
        catch (Exception e) {
            totalScore = totalScore+score;
            System.out.println( "      The following exception was thrown.");
            System.out.println( "      " + e.toString() ); 
            System.out.println();
            System.out.println( "      findTheSeven Score: " + score + "/24" );
            System.out.println( "      TotalScore: " + totalScore + "/100" );
        }

    }

    public static void main(String[] args){
        LabPrac2BTestIt2 lpt = new LabPrac2BTestIt2();
        System.out.println("------------------All Test Results-------------------");
        lpt.testDecreasingOrder();
        lpt.testFindAdjacentSum();
        lpt.testExceptFourTwo();
        lpt.testFindTheSeven();
        System.out.println("-----------------------------------------------------");
        System.out.println("**NOTE THIS IS NOT NECESSARILY YOUR FINAL SCORE**");
        System.out.println("**DR. SMALL WILL REVIEW YOUR CODE**");
    }

}
