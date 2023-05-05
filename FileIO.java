import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Write a description of class FILEIO here.
 *
 * @author (Oliver Cochrane)
 * @version (4/26/23)
 */
public class FileIO
{
    private ArrayList<String> inputLines;
    public static final String INPUTFILE = "input.txt";
    
    public FileIO() {
        inputLines = new ArrayList<String>();
    }

    public void readLines() throws FileNotFoundException { 
        File inputFile = new File(INPUTFILE); //INPUT FILE NAME
        Scanner in = new Scanner(inputFile); //SCANNING INPUT FILE
        
        while (in.hasNextLine()) //ADDS EACH LINE TO ARRLIST
        {
            inputLines.add(in.nextLine());
        } 
    }
    
    public void writeReverse(String outFile) {
        try
        {
            //TRY GETTING EACH LINE FROM INPUT FILE AND PRINTING THEM TO OUTPUT FILE
            PrintWriter out = new PrintWriter(outFile);
            for (int k = inputLines.size()-1; k >= 0; k--)
            {
                out.println(inputLines.get(k));
            }
            out.close();
        }
        catch (IOException ioe)//IF TRY BLOCK HAS AN ERROR, THIS WILL RUN INSTEAD
        {
            System.out.println("Output file could not be opened: " + ioe);
        }
    }
    
    public void printToTerminal() {
        System.out.println(inputLines);
    }
    //THROWS MUST FOLLOW CHAIN OF ACTION FOR METHODS, SO IN METHOD HEADER AND MAIN
    public static void main(String[] args) throws FileNotFoundException {
        FileIO fio = new FileIO(); //NEW FILEIO OBJECT
        fio.readLines(); //READS EACH LINE INTO ARRLIST
        System.out.println("The contents of the file:");
        fio.printToTerminal(); //PRINT THE ARRLIST WITH LINES IN IT
        
        fio.writeReverse(args[0]); //ACCESSES THE FIRST STRING OF ARRAY
    }
}
