import java.util.Scanner;
/**
 * Write a description of class E617 here.
 *
 * @author (Oliver Cochrane)
 * @version (3/19/23)
 */
public class E617
{
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int size = in.nextInt();
        int line = 1;

        while (line <= size) //ITERATES THROUGH EACH LINE
        {
            for(int n = 0; n < size; n++) //PRINTS SOLID BLOCK
            {
                System.out.print("*");
            }

            System.out.print(" "); //SPACE BETWEEN BLOCKS

            if (line == 1 || line == size) //CONDITION FOR PRINTING HOLLOW BLOCK
                {
                    for (int i = 1; i <= size; i++) {System.out.print("*");}
                }
                else
                {
                    System.out.print("*");
                    for (int w = 1; w <= size-2; w++) {System.out.print(" ");}
                    System.out.print("*");
                }
            System.out.println();
            line++;
        }
    }
}
